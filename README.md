**Tugas Individu6 - News Reader App**

Aplikasi pembaca berita sederhanayang dibangun menggunakan Compose Multiplatform (KMP). Proyek ini mendemonstrasikan integrasi REST API menggunakan Ktor Client, penerapan Repository Pattern, dan manajemen UI State

**Detail Mahasiswa**
Nama: Fanisa Aulia Safitri
NIM: 123140121
Kelas: RB

**Fitur Utama**
Aplikasi ini telah memenuhi seluruh indikator penilaian Praktikum 6 yaitu::
1. Fetch Data API: Mengambil data artkel secara real-time dari internet
2. Repository Pattern: Pemisah logika data dan tampilan
3. UI State Management: Fungsi Loading merupakan indikator loading saat mengambil  data, success yang menampilkan notifikasi berhasil yang uncul selama 2 detik, Error pesan saat ada kegagalan koneksi internet.
4. Interaksi Pengguna: Klik artikel untuk melihat detail secara langsung, dan fitur refresh untuk memperbarui daftar berita.

**API Reference**
Aplikasi ini menggunakan JSONPlaceholder API sebagai sumber data publik:
Endpoint: 'https://jsonplaceholder.typicode.com/posts'
Metode: 'GET'
Format: JSON

**Tech Stack dan Arsitektur**
Aplikasi ini menggunakan struktur folder **Clean Architecture** sederhana:
1. UI Layer (Screen): Menggunakan 'NewsViewModel' dan 'NewsScreen' untuk mengatur tampilan layar
2. Data Layer: Konfigurasi 'HttpClientFactory'
3. Repository: 'NewsRepository' sebagai abstraksi pengambilan data

**Library yang Digunakan**
- ktor Client: Sebagai Networking
- Kotllin Serilization: Untuk parsing data JSON ke objek kotlin
- Compose MultiPlatform: Framework UI deklaratif

**Dokumentasi**
video: https://youtube.com/shorts/g_r2Jvrtcvo 

**Cara Menjalankan Aplikasi**
1. Clone repositori ini
2. Buka di Android Studio
3. Lakukan **Sync Project with Gradle Files**
4. Run pada **Android Emulator**
