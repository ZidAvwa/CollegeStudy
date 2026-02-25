<?php 
include('Model.php');

class BukuModel extends Model{
    private $db;
    private $table = 'm_buku'; 

    public function __construct(){
        include_once('../lib/Connection.php');
        $this->db = $db;
        $this->db->set_charset('utf8');
    }

    public function insertData($data){
        $query = $this->db->prepare("insert into {$this->table} (buku_kode, buku_nama, jumlah, deskripsi) values(?,?,?,?)");
        $query->bind_param('ssis', $data['buku_kode'], $data['buku_nama'], $data['jumlah'], $data['deskripsi']);
        $query->execute();
    }

    public function getData(){
        return $this->db->query("select * from {$this->table}");
    }

    public function getDataById($id){
        $query = $this->db->prepare("select * from {$this->table} where buku_id = ?");
        $query->bind_param('i', $id);
        $query->execute();
        return $query->get_result()->fetch_assoc();
    }

    public function updateData($id, $data){
        $query = $this->db->prepare("update {$this->table} set buku_kode = ?, buku_nama = ?, jumlah = ?, deskripsi = ? where buku_id = ?");
        $query->bind_param('ssisi', $data['buku_kode'], $data['buku_nama'], $data['jumlah'], $data['deskripsi'], $id);
        $query->execute();
    }

    public function deleteData($id){
        $query = $this->db->prepare("delete from {$this->table} where buku_id = ?");
        $query->bind_param('i', $id);
        $query->execute();
    }
}
?>