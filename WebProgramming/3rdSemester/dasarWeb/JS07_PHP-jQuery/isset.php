<?php
$data = array("nama" => "Zid", "usia" => 17);
if (isset($data["nama"])){
    echo "Nama: " . $data["nama"] . "<br>";
} else {
    echo "Variabel 'nama' tidak ditemukan dalam array.<br>";
}

$umur;
if (isset($umur) && $umur >= 18) {
    echo "Anda sudah dewasa.<br>";
} else {
    echo "Anda belum dewasa atau variabel 'umur' tidak ditemukan.<br>";
}
?>