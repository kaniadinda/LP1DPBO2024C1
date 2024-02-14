<?php
// deklarasi kelas dpr
class DewanPerwakilan {
    // atribut private
    private $id = '';
    private $nama = '';
    private $bidang = '';
    private $partai = '';
    private $foto = '';

    // konstruktor
    public function __construct( $id = '', $nama = '' , $bidang = '', $partai = '', $foto='' ) {
        $this->id = $id;
        $this->nama = $nama;
        $this->bidang = $bidang;
        $this->partai = $partai;
        $this->foto = $foto;
    }
    
    // get & set id
    public function set_id($id){
        $this->id = $id;
    }

    public function get_id(){
        return $this->id;
    }

    // get & set nama
    
    public function set_nama($nama){
        $this->nama = $nama;
    }
    public function get_nama(){
        return $this->nama;
    }

    // get & set bidang

    public function set_bidang($bidang){
        $this->bidang = $bidang;
    }

    public function get_bidang(){
        return $this->bidang;
    }

    // get & set partai
    
    public function set_partai($partai){
        $this->partai = $partai;
    }
    public function get_partai(){
        return $this->partai;
    }

    // get & set partai

    public function set_foto($foto){
        $this->foto = $foto;
    }
    public function get_foto(){
        return $this->foto;
    }

}

?>