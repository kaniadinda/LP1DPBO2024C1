# import file
from DewanPerwakilan import DewanPerwakilan

# deklarasi crud

class Crud:
    # atribut private
    __list = []  # list of objek

    # konstruktor
    def __init__(self):
        self.__list = []

    # create untuk membuat objek
    def create(self, id, nama, bidang, partai):
        # instansiasi lalu masukkan ke dalam list
        self.__list.append(
            DewanPerwakilan(id, nama, bidang, partai))

    # read untuk menampilkan isi list
    def read(self):
        print("\nList Anggota DPR : \n")
        i = 0
        for dpr in self.__list:
            print(str(i+1)+".| ", dpr.get_id(), " | ", dpr.get_nama(),
                  " | ", dpr.get_bidang(), " | ", dpr.get_partai(), " | ")
            i += 1

    # update untuk edit objek
    def update(self, id):
        # cari data yang sama dari input
        for dpr in self.__list:
            # jika sama
            if (dpr.get_id() == id):
                # input data
                print("\nMasukan data yang ingin diedit:")
                print("Nama: ")
                nama = str(input())
                print("Bidang: ")
                bidang = str(input())
                print("Partai: ")
                partai = str(input())
                # update data
                dpr.set_nama(nama)
                dpr.set_bidang(bidang)
                dpr.set_partai(partai)
                break

    # delete untuk menghapus objek
    def delete(self, id):
        # mencari objek dari input
        for dpr in self.__list:
            # jika sama
            if (dpr.get_id() == id):
                # hapus
                self.__list.remove(dpr)
                break
