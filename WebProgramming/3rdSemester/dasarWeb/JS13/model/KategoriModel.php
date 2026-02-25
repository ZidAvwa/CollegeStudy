<?php
include('Model.php');

class KategoriModel extends Model
{
    private $db;
    private $table = 'm_kategori';

    public function __construct()
    {
        include_once('.. /lib/Connection.php');

        $this->db = $db;
        $this->db->set_charset('utf8');
    }

    public function insertData($data)
    {
        // Prepare Statement for Query Insert
        $query = $this->db->prepare("insert into {$this->table} (kategori_kode, kategori_nama) values(?,?)");

        // binding parameter to query, "s" means string, "ss" means two strings
        $query->bind_param('ss', $data['kategori_kode'], $data['kategori_nama']);

        // Execute a query to save to the database
        $query->execute();
    }

    public function getData()
    {
        // query to retrieve data from bank_soal table
        return $this->db->query("select * from {$this->table} ");
    }

    public function getDataById($id)
    {

        // query to retrieve data based on ID
        $query = $this->db->prepare("select * from {$this->table} where kategori_id = ?");

        // Binding parameter to query "i" means integer. Don't let SQL Injection get in the way
        $query->bind_param('i', $id);

        // Query execution
        $query->execute();

        // retrieve query results
        return $query->get_result()->fetch_assoc();
    }

    public function updateData($id, $data)
    {
        // query for data updates
        $query = $this->db->prepare("update {$this->table} set kategori_kode = ?, kategori_nama = ? where kategori_id = ?");

        // binding parameter to query
        $query->bind_param('ssi', $data['kategori_kode'], $data['kategori_nama'], $id);

        // Query execution
        $query->execute();
    }

    public function deleteData($id)
    {
        // query to delete data
        $query = $this->db->prepare("delete from {$this->table} where kategori_id = ?");

        // binding parameter to query
        $query->bind_param('i', $id);

        // Query execution
        $query->execute();
    }
}
