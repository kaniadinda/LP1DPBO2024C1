// import library & file
#include <bits/stdc++.h>
#include "DPR.cpp"

using namespace std;

int main() {
    // welcome!
    cout << "\n===== Database DPR =====\n" << endl;

    // banyaknya data. variabel n untuk maksimalnya. variabel m untuk yang diinginkan
    int n = 0, m = 0;
    cout << "Masukkan maksimal data DPR : ";
    cin >> n;
    cout << "Masukkan banyak data yang diinginkan : ";
    cin >> m;

    // membuat array of objects dan variabel lainnya
    DPR data[n];
    string nama, bidang, partai;
    int id;

    // masukkan data dpr
    for(int i = 0; i < m; i++) {
        // memasukkan nilai id, nama, bidang, partai
        cout << "\nIsi Data !\n";
        cout << "\n#Data ke-" << i+1 << "." << endl;
        cout << "Nomor ID : "; cin >> id;
        cout << "Nama     : "; cin >> nama;
        cout << "Bidang   : "; cin >> bidang;
        cout << "Partai   : "; cin >> partai;
       
        // memasukkannya ke dalam atribut nama kelas Mahasiswa
        data[i].setId(id);
        data[i].setNama(nama);
        data[i].setBidang(bidang);
        data[i].setPartai(partai);

        // baris baru
        cout << endl;
    }

    // menu
    int pilih1 = 0;
    // menu akan terus muncul sampai masukkan pilih1 atau keluar program
    do{
        // pilih menu yg diinginkan
        cout << "\n== Menu ==" << endl;
        cout << "(1) Tambah Data\n(2) Edit Data\n(3) Hapus Data\n(4) Tampilkan Data\n(5) Keluar Program\n\n=> ";
        cin >> pilih1;
        
        // menambahkan data
        if(pilih1 == 1) {
            cout << "\n== Tambah Data ==" << endl;
            
            // jumlah data bertambah satu
            m = m + 1;
            
            // ambil nilai semua atribut
            cout << "Nomor ID  : "; cin >> id;
            cout << "Nama      : "; cin >> nama;
            cout << "Bidang    : "; cin >> bidang;
            cout << "Partai    : "; cin >> partai;
            
            // set nilai semua atribut
            data[m].setId(id);
            data[m].setNama(nama);
            data[m].setBidang(bidang);
            data[m].setPartai(partai);
        } 
        
        // mengedit data
        else if(pilih1 == 2) {
            cout << "\n== Edit Data ==" << endl;

            // pilih baris yg akan diedit
            int baris;
            cout << "Edit data baris ke : ";
            cin >> baris;

            // ambil nilai semua atribut yang baru, kemudian set nilainya
            cout << "\nNomor ID  : "; cin >> id;
            data[baris-1].setId(id);
            cout << "\nNama      : "; cin >> nama;
            data[baris-1].setNama(nama);
            cout << "\nBidang    : "; cin >> bidang;
            data[baris-1].setBidang(bidang);
            cout << "\nPartai    : "; cin >> partai;
            data[baris-1].setPartai(partai);
        } 
        
        // menghapus data
        else if(pilih1 == 3) {
            cout << "\n== Hapus Data ==" << endl;

            // pilih baris yang akan dihapus
            int baris;
            cout << "Hapus data baris ke : ";
            cin >> baris;

            // hapus data dengan memainkan indeks
            for(int j = baris - 1; j < baris - 1; j++) {
                data[j] = data[j + 1];
            }
        } 

        //menampilkan data
        else if(pilih1 == 4) {
            cout << "\n== Isi Data ==" << endl;

             // tampilkan data
            for(int j = 0; j < m; j++) {
                cout << "Data ke-" << j + 1 << "." << endl;
                data[j].tampilkan();
                if(j != m - 1)
                {
                    cout << endl;
                }
            }
        }
    }while (pilih1 != 5); // condition

    return 0;
}
