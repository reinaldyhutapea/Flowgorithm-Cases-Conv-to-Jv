# T04 Buy More Pay Less (Paired)

Melihat "start up" besutannya semakin potensial, Ucok sudah mulai bermimpi menjadi unicorn baru di Indonesia. Visi besar yang barang kali tak bisa diraih dalam waktu sebentar. Meski begitu, Ucok selalu berpikir bagaimana caranya memperbanyak dan menaikkan nilai transaksi.

Sabtu lalu, setelah menyelesaikan Ujian Tengah Semester, Butet berkunjung ke sebuah book fair. Sambil tetap mematuhi protokol kesehatan, ia mengunjungi berbagai booth penerbit buku baik dari dalam dan luar negeri. Sembari melihat-lihat buku, Butet berbincang dengan representatif penerbit. Dalam diskusi ringan Butet baru tahu bahwa penerbit bersedia memberikan potongan harga tambahan jika dilakukan pembelian dalam jumlah besar. Istilahnya **buy more pay less** (BMPL). Nilai potongan juga bervariasi sesuai dengan jumlah eksemplar yang dipesan. Berikut adalah rata-rata potongan harga yang diberikan:
1. Pembelian minimal 5 eksemplar diberi potongan 2%.
2. Pembelian minimal 10 eksemplar diberi potongan 5%.
3. Pembelian minimal 20 eksemplar diberi potongan 12%.

Seperti biasa, seusai makan siang di kantin Ucok dan Butet berdiskusi membahas start up mereka. Setelah Butet menceritakan pengalamannya berkunjung ke book fair Ucok merasa mendapatkan jawaban atas keinginannya untuk meningkatkan jumlah dan nilai transaksi di Juragan Buku. Ia yakin dengan mengaplikasikan konsep BMPL dapat mendongkrak setidaknya nilai transaksi melalui peningkatan volume eksemplar.

## Dynamic Addition, Dynamic Removal (DADR)

Dalam rangka mengaplikasikan BMPL, Ucok berpikir bahwa aplikasi perlu untuk mampu secara dinamis menerima permintaan penambahan dan pengurangan eksemplar (dynamic addition, dynamic removal -- DADR). Dengan BMPL, tentu yang diharapkan terjadi adalah penambahan dan bukan sebaliknya. Sebagai ilustrasi dari konsep DADR, misal seorang pelanggan melakukan permintaan pembelian terhadap dua buah buku berbeda (```979-8700048361``` dan ```978-0439708180```) dengan harga yang juga berbeda (```35.98``` dan ```14.15```). Jumlah eksemplar yang ditransaksikan adalah ```1``` buah untuk buku pertama dan ```3``` buah untuk buku kedua. Dengan demikian maka nilai transaksi adalah ```(35.98 x 1) + (14.15 x 3) = 78.43```. Kemudian, dengan adanya insentif potongan harga BMPL calon pelanggan dapat menambah atau mengurangi jumlah eksemplar dari pesanannya. Sebagai contoh, ia mengurangi sejumlah ```1``` eksempar untuk buku pertama dan menambah ```4``` eksemplar untuk buku kedua. Dengan demikian total nilai transaksi adalah ```(35.98 x 0) + (14.15 x 7) = 99.05```. Jika kemudian dilakukan pemotongan harga dengan BMPL maka untuk buku kedua diberikan potongan sebesar ```2%``` karena telah memenuji syarat minimum eksemplar. Dengan demikian, maka total nilai transaksi menjadi ```(35.98 x 0) + ((14.15 - 2%) x 7) = 97.07```.

## Array for Dynamic Addition, Dynamic Removal

Pagi tadi di kelas pemrograman disampaikan materi mengenai array, konsep baru yang memungkinkan lebih dari satu variabel diakses atau diidentifikasi dengan satu identifier. Butet berargumen bahwa konsep array dapat diterapkan pada DADM. Butet kemudian membuat sebuah ilustrasi untuk membantunya mengabstraksi solusi. Menurut Butet, aplikasi akan memiliki tiga buah array yang setiap array memiliki tugas berbeda. Array pertama akan digunakan untuk menyimpan ```isbn```, array kedua akan menyimpan harga buku (```price```) per eksemplar, dan array ketiga akan menyimpan jumlah eksempar yang dipesan. Kombinasi dari ketiga array akan membentuk satu relasi data dengan merujuk pada nilai ```index```-nya. Sebagai contoh, untuk elemen pertama dari setiap array membentuk konteks untuk buku pertama, sementara elemen kedua membentuk konteks buku kedua. Dengan prinsip dasar ini, kemudian dapat dikombinasikan dengan repetition untuk membentuk solusi utuh.

 index | Array ISBN | Array Price | Array Quantity
--: | --- | ---: | ---:
0 | 979-8700048361 | 35.98 | 0
1 | 978-0439708180 | 14.15 | 7
2 |  | 0.00 | 0

## Limitations

1. Buku diidentifikasi dengan International Standard Book Number (```isbn```) yang unik dan dihargai dengan mata uang USD.
2. Minimum pembelian adalah satu eksemplar dari suatu buku.
3. Diperbolehkan membeli lebih dari satu buku masing-masing dapat dengan jumlah eksemplar yang berbeda.
4. Jumlah buku paling banyak 3 ```isbn``` berbeda.
5. Untuk setiap buku terdiri atas tiga baris masukan yaitu ```isbn```, ```price``` per eksemplar, ```quantity``` dari eksemplar.
6. Untuk mengurangi jumlah eksempar, maka ```quantity``` dituliskan dalam nilai negatif.
7. Aplikasi akan membaca masukan buku secara terus menerus hingga diperintahkan untuk berhenti. Perintah berhenti ditandai dengan ```---``` pada saat membaca masukan ```isbn```.

Selanjutnya, Ucok mendefinisikan luaran setelah semua masukan diterima. Aplikasi akan menampilkan total nilai transaksi yang ditulis dalam dua digit nilai presisi.

### Example 1

**Input**:
```bash
979-8700048361
35.98
1
978-0439708180
14.15
3
979-8700048361
35.98
-1
978-0439708180
14.15
4
---

```

**Output**:
```bash
97.07

```

### Example 2

**Input**:
```bash
978-0130895929
50.19
3
978-0593238295
22.11
2
978-0130895929
50.19
10
978-0439708180
14.15
4
978-0593238295
22.11
2
978-0593238295
22.11
3
978-0439708180
14.15
-4
---

```

**Output**:
```bash
771.52

```

HINT: untuk menulis dalam format presisi, silakan melihat fungsi ToFixed(r, i) yang dapat diakses di: http://www.flowgorithm.org/documentation/intrinsic-functions.html 

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

1. T04.java
2. T04.fprg
3. changelog.txt

## How to Submit?

Please see https://youtu.be/cU546lAL9g8