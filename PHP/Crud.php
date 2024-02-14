<?php
// import file
require ('DewanPerwakilan.php');

// deklarasi crud
class Crud {
     // atribute private
    private $arraydpr = array(); // list dpr

    // konstruktor
    public function __construct( ) {
    }

    // create untuk membuat objek dpr
    public function create($id, $nama, $bidang, $partai, $foto){
        // instansiasi
        $dpr = new DewanPerwakilan($id, $nama, $bidang, $partai, $foto);
         // masukkan objek ke list
        array_push($this->arraydpr, $dpr);
    }

    // read untuk menampilkan list
    public function read(){
        // dalam bentuk tabel
        echo "<center><table border='3'>";
        echo "<tr>
            <th> Nomor ID </th>
            <th> Nama </th>
            <th> Bidang </th>
            <th> Partai </th>
            <th> Foto </th>
            </tr>";
            for ($i=0; $i < count($this->arraydpr); $i++) { 
                echo "<tr><td>";
                echo $this->arraydpr[$i]->get_id();
                echo "</td><td>";
                echo $this->arraydpr[$i]->get_nama();
                echo "</td><td>";
                echo $this->arraydpr[$i]->get_bidang();
                echo "</td><td>";
                echo $this->arraydpr[$i]->get_partai();
                echo "</td><td>";
                echo "<img src='" . $this->arraydpr[$i]->get_foto(). "'style='width: 150px'>";
                echo "</td>";
                echo "</tr>";
            }
        echo "</table> </center>";
        }

    // update untuk edit objek
    public function update($id, $nama, $bidang, $partai, $foto ){
        // cari yang diubah berdasarkan input
        for ($i=0; $i < count($this->arraydpr); $i++) { 
            // jika sama dengan inputan
            if ($this->arraydpr[$i]->get_id() == $id) {
                // update data
                $this->arraydpr[$i]->set_nama($nama);
                $this->arraydpr[$i]->set_bidang($bidang);
                $this->arraydpr[$i]->set_partai($partai);
                $this->arraydpr[$i]->set_foto($foto);
                break;
            }
        }
    }

    // delete untuk hapus objek
    public function delete($id){
        // cari yang dihapus berdasarkan input
        for ($i=0; $i < count($this->arraydpr); $i++) { 
            // jika sama dengan inputan
            if ($this->arraydpr[$i]->get_id() == $id) {
                array_splice($this->arraydpr, $i,1); // hapus objek
              break;
            }
        }
    }
}

?>