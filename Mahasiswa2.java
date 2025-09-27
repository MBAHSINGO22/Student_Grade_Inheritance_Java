package Modul_7;

// Kelas Mahasiswa2 yang merupakan subclass dari kelas Mahasiswa
public class Mahasiswa2 extends Mahasiswa {
    // Konstruktor Mahasiswa2 yang menerima parameter NIM, Nama, tglLahir, UTS1, UTS2, dan UAS
    // Konstruktor ini menggunakan 'super' untuk memanggil konstruktor dari kelas induk 
    public Mahasiswa2(String NIM, String Nama, String tglLahir, double UTS1, double UTS2, double UAS) {
        // Memanggil konstruktor dari kelas induk  dengan parameter yang diberikan
        super(NIM, Nama, tglLahir, UTS1, UTS2, UAS);
    }

    // Metode konversiNilaiFinal yang mengkonversi nilai akhir mahasiswa menjadi huruf
    public String konversiNilaiFinal() {
        // Menghitung nilai akhir mahasiswa menggunakan metode hitungNilaiFinal dari kelas induk
        double nilaiFinal = hitungNilaiFinal();
        
        // Menggunakan if-else untuk mengkonversi nilai akhir menjadi huruf 
        if (nilaiFinal >= 85) { // Nilai A jika nilai akhir >= 85
            return "A";
        } else if (nilaiFinal >= 70) { // Nilai B jika nilai akhir >= 70 dan < 85
            return "B";
        } else if (nilaiFinal >= 56) { // Nilai C jika nilai akhir >= 56 dan < 70
            return "C";
        } else if (nilaiFinal >= 45) { // Nilai D jika nilai akhir >= 45 dan < 56
            return "D";
        } else { // Nilai E jika nilai akhir < 45
            return "E";
        }
    }
}
