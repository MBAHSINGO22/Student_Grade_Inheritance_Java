package Modul_7;

public class MainMahasiswa {
    public static void main(String[] args) {
        // Membuat objek mahasiswaS1 dari kelas Mahasiswa1
        // Parameter konstruktor: NIM, Nama, tglLahir, UTS1, UTS2, UAS
        Mahasiswa1 mahasiswaS1 = new Mahasiswa1("235314099", "Eugenius Kriswinar", "22-05-2005", 85, 90, 95);
        
        // Menampilkan data Mahasiswa S1
        System.out.println("Data Mahasiswa S1:");
        // Menampilkan NIM
        System.out.println("NIM: " + mahasiswaS1.getNim());
        // Menampilkan Nama
        System.out.println("Nama: " + mahasiswaS1.getNama());
        // Menampilkan Tanggal Lahir
        System.out.println("Tanggal Lahir: " + mahasiswaS1.getTglLahir());
        // Menampilkan Nilai Final
        System.out.println("Nilai Final: " + mahasiswaS1.konversiNilaiFinal());

        // Membuat objek mahasiswaS2 dari kelas Mahasiswa2
        // Parameter konstruktor: NIM, Nama, tglLahir, UTS1, UTS2, UAS
        Mahasiswa2 mahasiswaS2 = new Mahasiswa2("235314098", "Petrus Dennis", "11-05-2004", 88, 92, 96);
        
        // Menampilkan data Mahasiswa S2
        System.out.println("\nData Mahasiswa S2:");
        // Menampilkan NIM
        System.out.println("NIM: " + mahasiswaS2.getNim());
        // Menampilkan Nama
        System.out.println("Nama: " + mahasiswaS2.getNama());
        // Menampilkan Tanggal Lahir
        System.out.println("Tanggal Lahir: " + mahasiswaS2.getTglLahir());
        // Menampilkan Nilai Final
        System.out.println("Nilai Final: " + mahasiswaS2.konversiNilaiFinal());
    }
}
