package Modul_7;

// Kelas Mahasiswa1 yang merupakan subclass dari kelas Mahasiswa
public class Mahasiswa1 extends Mahasiswa {
    // Konstruktor Mahasiswa1 yang menerima parameter NIM, Nama, tglLahir, UTS1, UTS2, dan UAS
    // Konstruktor ini menggunakan 'super' untuk memanggil konstruktor dari kelas induk 
    public Mahasiswa1(String NIM, String Nama, String tglLahir, double UTS1, double UTS2, double UAS) {
        // Memanggil konstruktor dari kelas induk dengan parameter yang diberikan
        super(NIM, Nama, tglLahir, UTS1, UTS2, UAS);
    }

    // Metode konversiNilaiFinal yang mengkonversi nilai akhir mahasiswa menjadi huruf
    public String konversiNilaiFinal() {
        // Menghitung nilai akhir mahasiswa menggunakan metode hitungNilaiFinal dari kelas induk
        double nilaiFinal = hitungNilaiFinal();
        
        // Menggunakan if-else untuk mengkonversi nilai akhir menjadi huruf 
        if (nilaiFinal >= 80) {
            return "A"; // Nilai A jika nilai akhir >= 80
        } else if (nilaiFinal >= 70) {
            return "B"; // Nilai B jika nilai akhir >= 70 dan < 80
        } else if (nilaiFinal >= 56) {
            return "C"; // Nilai C jika nilai akhir >= 56 dan < 70
        } else if (nilaiFinal >= 45) {
            return "D"; // Nilai D jika nilai akhir >= 45 dan < 56
        } else {
            return "E"; // Nilai E jika nilai akhir < 45
        }
    }
}
