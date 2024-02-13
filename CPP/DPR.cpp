// import library
#include <iostream>
#include <string>

// using standard namespace
using namespace std;

// class declaration
class DPR
{
    // atribut private
    private:
    int id;
    string nama;
    string bidang;
    string partai;

    //atribut publik
    public:

    // konstruktor
    DPR()
    {
        // set nama & gender menjadi default value
        this->id = '-';
        this->nama = "";
        this->bidang = "";
        this->partai = "";
    }

    DPR(int id, string nama, string bidang, string partai)
    {
        this->id = id;
        this->nama = nama;
        this->bidang = bidang;
        this->partai = partai;
    }

    int getId()
    {
        return this->id;
    }

    void setId(int id)
    {
        this->id = id;
    }

    string getNama()
    {
        return this->nama;
    }

    void setNama(string nama)
    {
        this->nama = nama;
    }

    string getBidang()
    {
        return this->bidang;
    }

    void setBidang(string bidang)
    {
        this->bidang = bidang;
    }

    string getPartai()
    {
        return this->partai;
    }

    void setPartai(string partai)
    {
        this->partai = partai;
    }

// menampilkan data
    void tampilkan()
    {
        cout << "Nomor ID  : " << id << endl;
        cout << "Nama      : " << nama << endl;
        cout << "Bidang    : " << bidang << endl;
        cout << "Partai    : " << partai << endl;
    }

    ~DPR()
    {
        
    }
};