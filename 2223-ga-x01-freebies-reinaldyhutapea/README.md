# X01 X01 Freebies (Paired Exam)

**Juraga Buku**, aplikasi penjualan buku besutan Ucok dan Butet kian diminati pengguna sebagai alternative media pembelian buku. Menyambut akhir tahun, dimulai dari bulan November yang akan datang, direncanakan untuk diselenggarakan event bertajuk “End Year Give Away”.

Salah satu program yang akan dilaksanakan pada event tersebut adalah Freebies, yang akan mengratiskan pembelian terhadap buku yang paling murah pada transaksi minimum USD ```100```. Selain itu, transaksi juga harus melibatkan paling sedikit ```2``` buah buku. Sebagai contoh, pada sebuah transaksi melibatkan ```4``` buah buku masing – masing senilai ```24.99```, ```31.99```, ```58.15```, dan ```27.55```. Dengan demikian, total nilai transaksi adalah USD ```142.68``` sehingga memenuhi syarat untuk digratiskan pada item yang nilainya paling murah, pada contoh ini item pertama adalah yang paling murah dan nilai transaksi menjadi ```143.68 – 24.99 = 117.69```.
Untuk mengimplementasikan program Freebies, Ucok selanjutnya merancang skematik input – output sebagai berikut:
1. Aplikasi membaca masukan harga dari buku secara terus menerus hingga diperintahkan untuk berhenti. Perintah berhenti ditandai dengan memasukkan nilai ```0```.
2. Aplikasi selanjutnya menghitung nilai total transaksi. Untuk transaksi yang melibatkan paling sedikit ```2``` buah buku dengan nilai minimum 100.00 USD digratiskan untuk item yang paling murah.
3. Aplikasi menampilkan nilai transaksi dalam satu baris keluaran dalam dua digit presisi (gunakan fungsi ToFixed).

Note: semua skema ppengujian akan memasukkan telah dirancang untuk memberikan paling sedikit ```2``` buah masukkan.

### Example 1

**Input**:
```bash
24.99
31.99
58.15
27.55
0

```

**Output**:
```bash
117.69

```

### Example 2

**Input**:
```bash
44.99
11.99
48.15
0

```

**Output**:
```bash
93.14

```

## Code Generation

Pada saat mengekspor Java code, gunakan template yang telah diberikan ```java-program-template.fpgt```.

## Reporting

Presentasikan pekerjaan anda dalam sebuah video.
1. Setiap pair member harus berkontribusi dalam presentasi.
2. Jabarkan solusi anda (Flowgorithm).
3. Jabarkan kesulitan yang anda hadapi dalam rangka pengembangan solusi.

**Note**: Semakin tajam argumen dan penjabaran anda semakin mudah penilaian dilakukan.

**Kriteria Video Presentasi**:
+ 1080p/30fps, min. 10 menit.
+ Suara jernih dan dapat dengan jelas terdengar.
+ Posting video anda di YouTube, di-set "Not For Kids" dengan visibility Unlisted.

## Submissions:

1. X01.java
2. X01.fprg
3. changelog.txt

## How to Submit?

Please see https://youtu.be/cU546lAL9g8