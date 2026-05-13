# Praktikum Pra UTS (2) - Java OOP
**Nama :** Bintang Akbar Sutjipto
**NIM:** I.2510507

---

## Daftar File

| File | Tugas |
|------|-------|
| `Matematika.java` | G2 - Class Matematika dengan parameter |
| `MatematikaBeraksi.java` | G2 - Main class untuk menjalankan Matematika |
| `MobilLengkap.java` | G3 - Class MobilLengkap dengan tiga metode |
| `MobilLengkapBeraksi.java` | G3 - Main class untuk menjalankan MobilLengkap |
| `HewanPolimor.java` | G4 - Polimorfisme (Hewan, Herbivora, Karnivora, Kelinci) |
| `BentukBeraksi.java` | H1 - Overriding (Bentuk, Segitiga, Persegi) |
| `HitungBeraksi.java` | H2 - Overloading (method tambah) |
| `MakhlukHidupBeraksi.java` | I1 - Abstract class MakhlukHidup |
| `KendaraanBeraksi.java` | I2 - Abstract class Kendaraan |

---

## Cara Menjalankan

Compile dan jalankan masing-masing tugas dengan perintah berikut di terminal.

### G2 - Class Matematika
```bash
javac Matematika.java MatematikaBeraksi.java
java MatematikaBeraksi
```
**Output:**
```
Pertambahan: 40
Pengurangan: 5
Perkalian: 200
Pembagian: 10.5
```

---

### G3 - Class MobilLengkap
```bash
javac MobilLengkap.java MobilLengkapBeraksi.java
java MobilLengkapBeraksi
```
**Output:**
```
Mobil dihidupkan
Gigi mobil diubah
Mobil dimatikan
```

---

### G4 - Polimorfisme
```bash
javac HewanPolimor.java
java HewanPolimor
```
**Output:**
```
Suara hewan
Suara herbivora
Suara karnivora
Suara kelinci
```

---

### H1 - Overriding
```bash
javac BentukBeraksi.java
java BentukBeraksi
```
**Output:**
```
Menggambar bentuk
Menggambar segitiga
Menggambar persegi
```

---

### H2 - Overloading
```bash
javac HitungBeraksi.java
java HitungBeraksi
```
**Output:**
```
Pertambahan 2 angka (int): 8
Pertambahan 2 angka (double): 8.8
Pertambahan 3 angka (int): 6
```

---

### I1 - Abstract Class MakhlukHidup
```bash
javac MakhlukHidupBeraksi.java
java MakhlukHidupBeraksi
```
**Output:**
```
Manusia bernapas dengan paru-paru
Hewan bernapas dengan berbagai cara
```

---

### I2 - Abstract Class Kendaraan
```bash
javac KendaraanBeraksi.java
java KendaraanBeraksi
```
**Output:**
```
Mobil bergerak dengan roda
Sepeda bergerak dengan pedal
```

---

## Konsep yang Dipelajari

- **Polimorfisme** — satu tipe referensi dapat menunjuk ke object dari subclass yang berbeda-beda
- **Overriding** — subclass mendefinisikan ulang method yang sudah ada di superclass
- **Overloading** — satu nama method dengan parameter berbeda dalam satu class
- **Abstract Class** — class yang tidak bisa diinstansiasi langsung dan memiliki method abstrak yang wajib diimplementasikan oleh subclass
