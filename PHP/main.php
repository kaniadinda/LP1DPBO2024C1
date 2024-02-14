<!-- Saya Kania Dinda Fasya NIM 2102421 mengerjakan soal Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin.  -->

<?php
// import file
require ('Crud.php');

$Crud = new Crud(); // instansiasi
// membuat 4 objek untuk dimasukan ke list dengan create
$Crud->create('111', 'Diana', 'Keuangan', 'Partai 1', 'foto\3.jpg');
$Crud->create('222', 'Candra', 'Keamanan', 'Partai 2', 'foto\2.jpg');
$Crud->create('333', 'Adri', 'Kemanusiaan', 'Partai 3', 'foto\1.jpg');
$Crud->create('444', 'Hana', 'Industri', 'Partai 4', 'foto\4.jpg');

// menampilkan isi list menggunakan method read pada kelas crud
$Crud->read();
echo '<center><br> List Anggota DPR setelah di update dan delete <br> </center>';

// mengupdate objek nomor id '111' dengan update
$Crud->update('111', 'Diana', 'Kesehatan', 'Partai 5', 'foto\5.jpg');

// menghapus objek nomor id '222' dengan delete
$Crud->delete('222');

// menampilkan listt
$Crud->read();

?>