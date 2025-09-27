package Modul_7;

public class Mahasiswa {
    // Atribut NIM
    protected String NIM;

    // Atribut Nama
    protected String Nama;

    // Atribut tglLahir
    protected String tglLahir;

    // Atribut UTS1
    protected double UTS1;

    // Atribut UTS2
    protected double UTS2;

    // Atribut UAS
    protected double UAS;

    // Konstruktor Mahasiswa yang menerima parameter NIM, Nama, tglLahir, UTS1,
    // UTS2, dan UAS
    public Mahasiswa(String NIM, String Nama, String tglLahir, double UTS1, double UTS2, double UAS) {
        // Inisialisasi atribut NIM, Nama, tglLahir, UTS1, UTS2, dan UAS dengan nilai
        // parameter yang diberikan
        this.NIM = NIM;
        this.Nama = Nama;
        this.tglLahir = tglLahir;
        this.UTS1 = UTS1;
        this.UTS2 = UTS2;
        this.UAS = UAS;
    }

    // Getter untuk atribut NIM
    public String getNim() {
        return NIM;
    }

    // Getter untuk atribut Nama
    public String getNama() {
        return Nama;
    }

    // Getter untuk atribut tglLahir
    public String getTglLahir() {
        return tglLahir;
    }

    // Getter untuk atribut UTS1
    public double getUts1() {
        return UTS1;
    }

    // Getter untuk atribut UTS2
    public double getUts2() {
        return UTS2;
    }

    // Getter untuk atribut UAS
    public double getUas() {
        return UAS;
    }

    // Metode hitungNilaiFinal yang menghitung nilai akhir mahasiswa berdasarkan
    // nilai-nilai UTS dan UAS
    // Metode ini mengembalikan nilai akhir yang dihitung dengan rumus.
    public double hitungNilaiFinal() {
        return 30 * UTS1 / 100 + 30 * UTS2 / 100 + 40 * UAS / 100;
    }
}
