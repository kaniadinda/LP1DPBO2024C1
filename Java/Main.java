/* Saya Kania Dinda Fasya NIM 2102421 mengerjakan soal Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin. */

// Import library
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // deklarasi variabel
        Crud crud = new Crud(); // instansiasi
        String id, nama, bidang, partai; // variabel untuk menampung string input
        int choice; // variabel untuk memilih menu crud
        Scanner sc = new Scanner(System.in);
        do {
            // menampilkan menu
            System.out.println('\n' + "Menu: ");
            System.out.println("0. Keluar");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");

            System.out.println('\n' + "Pilih menu : ");

            choice = sc.nextInt(); // input pilihan

            if (choice == 1) { // jika pilih 1
                // input data
                System.out.println('\n' + "Masukkan data: ");
                System.out.println("Nomor ID: ");
                id = sc.next();
                System.out.println("Nama: ");
                nama = sc.next();
                System.out.println("Bidang: ");
                bidang = sc.next();
                System.out.println("Partai: ");
                partai = sc.next();

                crud.create(id, nama, bidang, partai); // buat data
            } else if (choice == 2) { // jika 2

                crud.read(); // menampilkan data
            } else if (choice == 3) { // jika 3
                // input id
                System.out.println('\n' + "Nomor ID yang akan di update : ");
                id = sc.next();
                
                crud.update(id); // edit data
            } else if (choice == 4) { // jika 4
                System.out.println('\n' + "Nomor ID yang akan di delete : ");
                id = sc.next();
                crud.delete(id); // delete data
            } else if (choice == 0) { // jika menu yang dipilih adalah 0
                System.out.println('\n');
            }
        } while (choice != 0); // perulangan selama user tidak input 0

        sc.close();
    }
}