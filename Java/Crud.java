// import library
import java.util.ArrayList;
import java.util.Scanner;

// deklarasi kelas crud
public class Crud {

    // atribute private
    private ArrayList<DewanPerwakilan> list; // list of objek dpr

    // konstruksi
    public Crud() {
        list = new ArrayList<>();
    }

    // create untuk membuat objek dpr
    public void create(String id, String nama, String bidang, String partai) {
        // instansiasi objek dpr
        DewanPerwakilan dpr = new DewanPerwakilan(id, nama, bidang, partai);
        // masukkan objek ke dalam list
        list.add(dpr);
    }

    // read untuk menampilkan isi list
    public void read() {
        // menampilkan isi list of objek dpr
        System.out.println("\nList Anggota DPR : \n");
        int i;
        // tambah garis pemisah sesuai jumlah data
        for (i = 0; i < list.size(); i++) {
            System.out
                    .println(Integer.toString(i + 1) + ".| " + list.get(i).getId() + " | "
                            + list.get(i).getNama() + " | " + list.get(i).getBidang() + " | "
                            + list.get(i).getPartai());
        }
    }

    // update untuk edit objek berdasarkan id
    public void update(String id) {
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel untuk nama, bidang, partai
        String nama, bidang, partai;

        // mencari objek yang akan di edit berdasarkan input id
        for (int i = 0; i < list.size(); i++) {
            // jika id pada objek sama dengan inputan
            if (id.equals(list.get(i).getId())) {
                // input data untuk di edit
                System.out.println('\n' + "Masukan data yang ingin diubah !");
                System.out.println("Nama: ");
                nama = sc.next();
                System.out.println("Bidang: ");
                bidang = sc.next();
                System.out.println("Partai: ");
                partai = sc.next();

                // update data dengan setter
                list.get(i).setNama(nama);
                list.get(i).setBidang(bidang);
                list.get(i).setPartai(partai);
                break;
            }
        }
    }

    // delete untuk hapus objek
    public void delete(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                list.remove(list.get(i)); // hapus objek pada list
                break;
            }
        }
    }
}
