// deklarasi kelas mahasiswa
public class DewanPerwakilan {
    // atribut private
    private String id, nama, bidang, partai;

    // konstruktor tanpa parameter
    public DewanPerwakilan() {
        // set isi atribut secara default
        this.id = "";
        this.nama = "";
        this.bidang = "";
        this.partai = "";
    }

    // konstruktor dengan parameter
    public DewanPerwakilan(String id, String nama, String bidang, String partai) {
        // set isi atribut sesuai isi parameter
        this.id = id;
        this.nama = nama;
        this.bidang = bidang;
        this.partai = partai;
    }

    // get id
    public String getId() {
        return this.id;
    }

    // set id
    public void setId(String id) {
        this.id = id;
    }

    // get nama
    public String getNama() {
        return this.nama;
    }

    // set nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // get bidang
    public String getBidang() {
        return this.bidang;
    }

    // set bidang
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    // get partai
    public String getPartai() {
        return this.partai;
    }

    // set partai
    public void setPartai(String partai) {
        this.partai = partai;
    }
}
