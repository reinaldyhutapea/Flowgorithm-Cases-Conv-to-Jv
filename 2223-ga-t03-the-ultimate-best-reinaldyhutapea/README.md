# T03 The Ultimate Best (Paired Assignment)

Di kampus, aplikasi **Juragan Buku** besutan Ucok dan Butet mulai mendapatkan perhatian. Rekan-rekan mereka sudah mulai menggunakan aplikasi tersebut untuk mendapatkan buku terbaik. Biasanya, rekan-rekan Ucok dan Butet hanya memperhatikan rating dari buku sebagai acuan rekomendasi. Minggu lalu, fitur informasi diskon diluncurkan dan menjadi alternatif dalam memilih buku. Dengan fitur tersebut, semakin banyak mahasiswa tertarik untuk menggunakan aplikasi tersebut.

Siang tadi, pada saat makan siang di kantin, Tiur dan Butet sedang berbincang singkat sambil menunggu jam masuk kuliah. Dalam pembicaraan tersebut Tiur memuji kemanfaatan aplikasi yang Butet telah kembangkan. Secara tidak sengaja Tiur nyeletuk "buku terbaik tuh yang ratingnya tinggi dan diskonnya maksimal." Butet tersentak dan langsung terinpirasi dengan **feature request** Tiur. Dalam waktu singkat, Butet langsung berterima kasih atas celetukan Tiur dan pergi mencari Ucok.

Butet kemudian menceritakan perbincangannya dengan Tiur kepada Ucok. Ucok mengerti bahwa mengkombinasikan antara rating dan nilai diskon dapat semakin menstimulasi terjadinya transaksi buku. Butet selanjutnya menambahkan pendapatnya bahwa sebaiknya aplikasi mulai menerima lebih dari satu data buku. Aplikasi kemudian akan memberikan rekomendasi buku terbaik dengan memperhatikan rating dan nilai diskonnya. Ucok lalu mengusulkan bahwa buku terbaik (the ultimate best -- TUB) untuk direkomendasikan adalah:
1. Rating tergolong **Best Pick** atau minimal 4.7; dan
2. Nilai diskon tergolong **Once in a lifetime** atau lebih dari 40.00%.

## Multidata

Pada pengembangan sebelumnya, aplikasi hanya akan membaca satu rangkaian data buku saja. Pada pengembangan kali ini, aplikasi akan mampu menerima lebih dari satu data buku. Suatu data buku akan diberikan secara lengkap, mulai dari ```isbn``` hingga ```rating```. Aplikasi akan secara terus menerus membaca data buku hingga didapati perintah untuk berhenti. Perintah untuk berhenti ditandai dengan ```---``` pada saat membaca ```isbn```. Perhatikan contoh input pada Example 1 dan Example 2.

## Defining The Ultimate Best (TUB)

Setiap kali selesai membaca satu rangkai data buku, aplikasi akan menentukan apakah buku tersebut tergolong TUB atau tidak berdasarkan karaterisik yang diberikan. Selanjutnya, aplikasi akan menuliskan informasi tersebut dalam sebuah segmen tambahan. Untuk buku yang tergolong TUB akan ditulis ```The ultimate best```, jika tidak maka akan ditulis ```---```.

### Example 1

**Input**:
```bash
979-8700048361
The Science of Self-Control
Menno Henselmans
2021
---
no
35.98
-14.11
41
5.0
978-0439708180
Harry Potter and the Sorcerer's Stone
J.K. Rowling
1998
Scholastic
no
14.15
-9.55
16
4.8
---

```

**Output**:
```bash
979-8700048361|The Science of Self-Control|Menno Henselmans|2021|---|no|35.98|-14.11|41|5.0|Best Pick|Never come twice|---
978-0439708180|Harry Potter and the Sorcerer's Stone|J.K. Rowling|1998|Scholastic|no|14.15|-9.55|16|4.8|Best Pick|Once in a lifetime|The ultimate best

```

### Example 2

**Input**:
```bash
978-0130895929
C: A Reference Manual
Samuel Harbison, Guy Steele Jr.
2002
Pearson
no
50.19
-31.05
21
4.7
978-0593238295
AI 2041: Ten Visions for Our Future
Kai-Fu Lee, Chen Qiufan
2021
Currency
no
25.49
-13.01
11
4.9
---

```

**Output**:
```bash
978-0130895929|C: A Reference Manual|Samuel Harbison, Guy Steele Jr.|2002|Pearson|no|50.19|-31.05|21|4.7|Best Pick|Once in a lifetime|The ultimate best
978-0593238295|AI 2041: Ten Visions for Our Future|Kai-Fu Lee, Chen Qiufan|2021|Currency|no|25.49|-13.01|11|4.9|Best Pick|Once in a lifetime|The ultimate best

```

## Code Generation

Pada saat mengekspor Java code, gunakan template yang telah diberikan ```java-program-template.fpgt```.

## Reporting

Lakukan pertemuan dengan pair anda untuk mendiskusikan persoalan dan pengembangan solusi. Rekaman dari pertemuan tersebut menjadi bagian dari artefak tugas yang harus dikumpulkan. Durasi rekaman minimal 20 menit.

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

1. T03.java
2. T03.fprg
3. changelog.txt

## How to Submit?

Please see https://youtu.be/cU546lAL9g8