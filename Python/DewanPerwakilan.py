# deklarasi kelas
class DewanPerwakilan:

    # atribut private
    __id = ""
    __nama = ""
    __bidang = ""
    __partai = ""

   # konstruktor
    def __init__(self, id="", nama="", bidang="", partai=""):
        self.__id = id
        self.__nama = nama
        self.__bidang = bidang
        self.__partai = partai

    # get & set

    def get_id(self):
        return self.__id

    def set_id(self, id):
        self.__id = id

    def get_nama(self):
        return self.__nama

    def set_nama(self, nama):
        self.__nama = nama

    def get_bidang(self):
        return self.__bidang

    def set_bidang(self, bidang):
        self.__bidang = bidang

    def get_partai(self):
        return self.__partai

    def set_partai(self, partai):
        self.__partai = partai
