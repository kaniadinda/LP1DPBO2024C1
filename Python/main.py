# Saya Kania Dinda Fasya 2102421 mengerjakan soal Latihan 1
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
# untuk keberkahanNya maka saya tidak melakukan kecurangan
# seperti yang telah dispesifikasikan. Aamiin. 

# import file
from Crud import Crud

# instansiasi
crud = Crud()

# deklarasi variabel untuk string input
id = ""
nama = ""
bidang = ""
partai = ""

# variabel untuk menu crud
n = 5
while n != 0:
    print("\nMenu: ")
    print("0. Keluar")
    print("1. Tambah Data")
    print("2. Tampilkan Data")
    print("3. Edit Data")
    print("4. Hapus Data")
    print("\nPilih menu: ")
    # input pilihan
    n = int(input())
    # jika 1
    if (n == 1):
        # minta input data
        print("\nMasukkan data:")
        print("Nomor ID: ")
        id = str(input())
        print("Nama: ")
        nama = str(input())
        print("Bidang: ")
        bidang = str(input())
        print("Partai: ")
        partai = str(input())
        # panggil create
        crud.create(id, nama, bidang, partai)
    # jika 2
    elif (n == 2):
        crud.read()  # panggil read untuk ditampilkan
    # jika 3
    elif (n == 3):
        # input id anggota yang ingin diedit
        print("\nMasukan Nomor ID yang akan diedit : ")
        id = str(input())
        # panggil update
        crud.update(id)
    # jika 4
    elif (n == 4):
        # input id anggota yang ingin dihapus
        print("\nMasukan Nomor ID yang akan dihapus : ")
        id = str(input())
        # panggil delete
        crud.delete(id)
    # jika 0
    elif (n == 0):
        # keluar program
        print("\n")
