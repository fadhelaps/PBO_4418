package kasus1;

public class daftar_run {
    public static void main(String[] args) {       
        Mahasiswa mhs = new Mahasiswa("Fadhel","12216");
        mhs.ambil_matkul("Pemrograman Web Lanjut");
        mhs.ambil_matkul("Interaksi Manusia dan Komputer");
        mhs.ambil_matkul("Bahasa Inggris");
        mhs.get_info();

    }


}