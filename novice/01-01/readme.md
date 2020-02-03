https://github.com/praxis-academy/akademik/blob/master/kurikulum/enterprise-full-stack/isi/01.md

1. Bahasa Pemograman, compiler, dan interpreter
    * Bahasa Pemograman

    - Bahasa pemrograman adalah bahasa formal, yang terdiri dari sekumpulan instruksi yang menghasilkan berbagai jenis output. Bahasa pemrograman digunakan dalam pemrograman komputer untuk mengimplementasikan algoritma.

    * Compiler

    - Compiler adalah suatu program yang menerjemahkan bahasa program ( source code) kedalam bahasa objek (obyek code). Compiler menggabungkan keseluruhan bahasa program, mengumpulkannya dan kemudian menyusunnya kembali.

    Komplier memerlukan waktu untuk membuat suatu program dapat di eksekusi oleh computer, program yang dieksekusi oleh compiler dapat berjalan lebih cepat dibanding program yang diproduksi oleh interpreter, disamping itu juga bersifat independen.

    Contoh program yang menggunakan compiler adalah Pascal, C++, BASIC, FORTRAN, Visual Basic, Visual C#, Java, xBase, atau COBOL .

    Tahap kompilasi:

    Menerima kode sumber dan menghasilkan bahasa tingkat rendah (assembly)
    Source code tersebut diubah menjadi objek kode (bahasa assembly).
    Objek kode di hubungkan dengan library yang dibutuhkan untuk membentuk file yang bisa dieksekusi komputer.
    Compiler yang menggunakan arsitektur ini misalnya GCC, Clang dan FreeBASIC,

    * Interpreter

    - Sedangkan Interpreter adalah perangkat lunak yang mampu mengeksekusi code program (yang ditulis oleh programmer) lalu menterjemahkannya ke dalam bahasa mesin, sehingga mesin melakukan instruksi yang diminta oleh programmer tersebut. Perintah-perintah yang dibuat oleh programmer tersebut dieksekusi baris demi baris, sambil mengikuti logika yang terdapat di dalam kode tersebut.

    Proses ini sangat berbeda dengan compiler, dimana pada compiler, hasilnya sudah langsung berupa satu kesatuan perintah dalam bentuk bahasa mesin, dimana proses penterjemahan dilaksanakan sebelum program tersebut dieksekusi.

2. Developments tool

    - Adalah alat-alat yang  digunakan untuk membantu pengembangan software, contoh jika kita ingin membuat sutu software atau aplikasi menggunakan bahasa pemogramana java maka development tools yang dibutuhkan adalah : bahasa pemgoraman itu sendiri (java), jdk (java development kit), text editor, browser dll.

3. Java (Bahasa Pemograman)
    
    - Write once run anywhere (buat 1x dapat dijalankan dimana saja)
    secara syntax, sytax pada java mempunyai beberapa kemiripan dengan bahasa C dan C++
    Java adalah bahasa pemrograman tujuan umum yang berbasis kelas, berorientasi objek, dan dirancang untuk memiliki dependensi (ketergantungan) implementasi sesedikit mungkin.

    JVM (Java Virtual Machine)

    - 817/5000
    Java virtual machine (JVM) adalah mesin virtual yang memungkinkan komputer menjalankan program Java serta program yang ditulis dalam bahasa lain yang juga dikompilasi ke Java bytecode. JVM dirinci dengan spesifikasi yang secara formal menjelaskan apa yang diperlukan dalam implementasi JVM. Memiliki spesifikasi memastikan interoperabilitas program Java di seluruh implementasi yang berbeda sehingga penulis program yang menggunakan Java Development Kit (JDK) tidak perlu khawatir tentang kekhasan platform perangkat keras yang mendasarinya.

4. Perbedaan JRE (Java Runtime Environment) dan JDK (Java Development Kit)
    - JRE adalah Java Runtime Environment. Ini adalah paket dari segala yang diperlukan untuk menjalankan program Java yang dikompilasi, termasuk Java Virtual Machine (JVM), Java Class Library, perintah java, dan infrastruktur lainnya. Namun, itu tidak dapat digunakan untuk membuat program baru.

    JDK adalah Java Development Kit, SDK berfitur lengkap untuk Java. Ia memiliki semua yang dimiliki JRE, tetapi juga kompiler (javac) dan alat-alat (seperti javadoc dan jdb). Ia mampu membuat dan menyusun program.

    Biasanya, jika Anda hanya peduli menjalankan program Java di komputer, Anda hanya akan menginstal JRE. Itu yang kamu butuhkan. Di sisi lain, jika Anda berencana untuk melakukan pemrograman Java, Anda perlu menginstal JDK sebagai gantinya.

    Terkadang, bahkan jika Anda tidak berencana untuk melakukan pengembangan Java di komputer, Anda masih perlu menginstal JDK. Misalnya, jika Anda menggunakan aplikasi web dengan JSP, secara teknis Anda hanya menjalankan program Java di dalam server aplikasi. Mengapa Anda membutuhkan JDK? Karena server aplikasi akan mengubah JSP menjadi servlets Java dan perlu menggunakan JDK untuk mengkompilasi servlet. Saya yakin ada lebih banyak contoh

    JSP (Java Server Pages)
    - JSP adalah sebuah bahasa pemrograman berbasis Java yang diperuntukkan untuk membuat sebuah website. JSP sangat sesuai dan tangguh untuk menangani kebutuhan akan sebuah website. Sama seperti PHP, bahasa yang satu ini dikhususkan untuk berkutat di bagian backend.

5. Java Platform, Standard Edition (Java SE)

    - Platform Java, Edisi Standar (Java SE)

    Java SE memungkinkan penggunanya mengembangkan dan menggunakan aplikasi Java di desktop dan server, serta lingkungan yang tertanam. Java SE berisi inti dari perpustakaan bahasa pemrograman Java.
    Komponen Java SE adalah Java Development Kit (JDK), Java Runtime Environment (JRE) dan Java SE application programming interface (API). JDK berisi JRE dan kompiler dan debugger yang diperlukan untuk mengembangkan applet dan aplikasi. JRE menyediakan perpustakaan, Java Virtual Machine (JVM) dan komponen yang diperlukan untuk menjalankan applet dan aplikasi Java. (Lihat grafik di bawah)

    Java Platform, Enterprise Edition (Java EE)

    - Java Platform, Enterprise Edition (Java EE) adalah standar industri untuk membangun aplikasi web dan perusahaan. Java EE 7 menawarkan fitur-fitur baru yang meningkatkan dukungan HTML5, meningkatkan produktivitas pengembang, dan lebih lanjut meningkatkan bagaimana tuntutan perusahaan dapat dipenuhi. Pengembang Java EE 7 akan menulis lebih sedikit kode boilerplate, memiliki dukungan yang lebih baik untuk aplikasi dan kerangka kerja Web terbaru, dan mendapatkan akses ke skalabilitas yang ditingkatkan dan fungsionalitas yang lebih kaya dan lebih sederhana. Perusahaan akan mendapat manfaat dari fitur-fitur baru yang memungkinkan pemrosesan batch portabel dan peningkatan skalabilitas.

    JavaFX, Java User Interface Platform

    JavaFX, Platform Antarmuka Pengguna Java
    JavaFX adalah platform antarmuka pengguna Java canggih untuk aplikasi bisnis perusahaan. Pengembang yang menggunakan Java untuk sisi server dan klien dapat membangun aplikasi yang lebih kuat dan andal.

    Antarmuka Pengguna dengan alat desainer Pembuat Scene
    Gunakan JavaFX Scene Builder, alat tata letak visual untuk merancang antarmuka pengguna dengan cepat tanpa coding. Pengguna dapat menarik dan melepas komponen UI ke area kerja, memodifikasi propertinya, dan menerapkan style sheet. Tutorial Memulai ini mengajarkan pemula cara membuat antarmuka pengguna yang kompleks (mis. Daftar, tampilan tabel, bilah alat) dan terhubung ke logika aplikasi

    Java Embedded and Java ME

    Java Tertanam dan Java ME
    Dari printer dan mesin bank hingga pembaca e-book dan mobil, teknologi Java dominan dalam sistem yang tertanam saat ini. Ada dalam 5 miliar SIM dan Kartu Cerdas, 3 miliar ponsel, 80 juta perangkat TV, termasuk setiap pemutar Blu-ray yang dikirimkan, dan banyak solusi tertanam lainnya. Tiga teknologi dirancang untuk sistem tertanam: Java SE Tertanam untuk perangkat dengan 32MB; Java ME Embedded untuk perangkat dengan 8MB dan Java Embedded Suite untuk perangkat yang terhubung ke database. Java ME adalah lingkungan untuk aplikasi yang berjalan pada sistem seluler dan tertanam.