<h1 align="center">📝 Student Grade Inheritance Java</h1>
<p align="center">
  <b>Demo Pewarisan untuk Pengelolaan Nilai Mahasiswa di Java</b><br>
  <sub>Proyek Java yang mengimplementasikan aplikasi untuk menunjukkan konsep pewarisan dalam mengelola data mahasiswa S1 dan S2 dengan perhitungan nilai akhir dan konversi ke huruf.</sub>
</p>

<div align="center">

[![Java](https://img.shields.io/badge/Java-17-red?logo=oracle)](https://www.oracle.com/java/)
[![OOP](https://img.shields.io/badge/Concept-Inheritance-blue)]()
[![Educational](https://img.shields.io/badge/Type-OOP%20Project-green)]()
[![Author](https://img.shields.io/badge/Author-MBAHSINGO22-brightgreen)](https://github.com/MBAHSINGO22)

</div>

---

## 📖 Deskripsi Proyek

Proyek pembelajaran Java yang mendemonstrasikan konsep **pewarisan (inheritance)** dalam pemrograman berorientasi objek untuk mengelola data mahasiswa S1 dan S2.  

Proyek ini berfokus pada:
- 📊 **Mahasiswa.java** – Kelas induk yang merepresentasikan mahasiswa dengan atribut NIM, nama, tanggal lahir, nilai UTS1, UTS2, UAS, dan metode untuk menghitung nilai akhir berdasarkan bobot (30% UTS1, 30% UTS2, 40% UAS).
- 🔍 **Mahasiswa1.java** – Kelas turunan untuk mahasiswa S1 yang mengonversi nilai akhir ke huruf berdasarkan skala (A: ≥80, B: ≥70, C: ≥56, D: ≥45, E: <45).
- 🔍 **Mahasiswa2.java** – Kelas turunan untuk mahasiswa S2 dengan skala konversi berbeda (A: ≥85, B: ≥70, C: ≥56, D: ≥45, E: <45).
- 🛠️ **MainMahasiswa.java** – Kelas utama untuk membuat objek mahasiswa S1 dan S2 serta menampilkan data dan nilai akhir dalam huruf.


---

## 📂 Struktur File

```
Student_Grade_Inheritance_Java/
├── src/Modul_7/
├── MainMahasiswa.java      # 🛠️ Kelas utama untuk pengujian
├── Mahasiswa.java          # 📊 Kelas induk untuk data mahasiswa
├── Mahasiswa1.java         # 🔍 Kelas turunan untuk mahasiswa S1
├── Mahasiswa2.java         # 🔍 Kelas turunan untuk mahasiswa S2
```

---

## 🧰 Teknologi

- ☕ Java 17+
- 🧪 IDE: IntelliJ IDEA / NetBeans / Eclipse / Terminal (javac)
  
---

## 🧪 Catatan

- Program menggunakan data statis untuk:
  - 🎓 Mahasiswa S1:  
    - NIM: 235314099  
    - Nama: Eugenius Kriswinar  
    - Tanggal Lahir: 22-05-2005  
    - UTS1: 85, UTS2: 90, UAS: 95  
  - 🎓 Mahasiswa S2:  
    - NIM: 235314098  
    - Nama: Petrus Dennis  
    - Tanggal Lahir: 11-05-2004  
    - UTS1: 88, UTS2: 92, UAS: 96

- Bobot nilai: `30% UTS1 + 30% UTS2 + 40% UAS`
- Konversi nilai akhir ke huruf berbeda antara S1 dan S2

---

## 📈 Contoh Output

```
Data Mahasiswa S1:
NIM: 235314099
Nama: Eugenius Kriswinar
Tanggal Lahir: 22-05-2005
Nilai Final: A

Data Mahasiswa S2:
NIM: 235314098
Nama: Petrus Dennis
Tanggal Lahir: 11-05-2004
Nilai Final: A
```

---

## 👨‍💻 Pengembang

**MBAHSINGO22**  
🔗 [GitHub](https://github.com/MBAHSINGO22)

---

## 📄 Lisensi

Proyek ini dibuat untuk tujuan edukatif dan pembelajaran konsep pewarisan dalam pemrograman Java.
