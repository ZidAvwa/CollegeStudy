<?php
require_once __DIR__ . '/../Database.php';
class Dosen {
    private $conn;
    public function __construct() {
        $this->conn = Database::getConnection();
    }
    public function getAll() {
        $res = pg_query($this->conn, "SELECT * FROM dosen ORDER BY dosen_id ASC");
        return pg_fetch_all($res) ?: [];
    }
    public function find($id) {
        $res = pg_query_params($this->conn, "SELECT * FROM dosen WHERE dosen_id=$1", [$id]);
        return pg_fetch_assoc($res);
    }
    public function create($data) {
        $sql = "INSERT INTO dosen (nama, nip, nidn, nomor_ponsel, status, kode_prodi) VALUES ($1, $2, $3, $4, $5, $6)";
        return pg_query_params($this->conn, $sql, $data);
    }
    public function update($id, $data) {
        $sql = "UPDATE dosen SET nama=$1, nip=$2, nidn=$3, nomor_ponsel=$4, status=$5, kode_prodi=$6 WHERE dosen_id=$7";
        $data[] = $id;
        return pg_query_params($this->conn, $sql, $data);
    }
    public function delete($id) {
        return pg_query_params($this->conn, "DELETE FROM dosen WHERE dosen_id=$1", [$id]);
    }
}