1. Annotations
    - Annotasi atau yang lebih dikenal dengan metadata adalah fitur pada java yang memungkinkan untuk memasukan informasi tambahan ke dokumen program. Informasi atau data tersebut tidak memengaruhi suatu aksi dari program tersebut. Biasanya informasi tersebut digunakan untuk mengembangkan program tersebut. Annotasi biasanya terdapat pada kelas-kelas persistence yang terhubung ke basis data.
    Pada dasarnya, mekanisme annotasi berasal dari pendeklarasian interface. 

    Pada KBBI(Kamus Besar Bahasa Indonesia), Anotasi adalah: catatan yang dibuat oleh pengarang atau orang lain untuk menerangkan, mengomentari, atau mengkritik teks karya sastra atau bahan tertulis lain.

    contoh annotasi

    1. @Retention
    2. @Documented
        - Ini adalah antarmuka penanda yang memberi tahu aparatur bahwa penjelasannya adalah arsip. Java Annotations dikecualikan oleh komentar Javadoc. Penggunaan komentar @Documented dalam kode memberdayakan perangkat seperti Javadoc untuk memprosesnya dan menggabungkan penjelasan menulis data dalam arsip yang diproduksi.
    3. @Target
    4. @Inherited
    5. @Repeatable  
    6. @Override
        - Anotasi ini memeriksa bahwa metode yang dijelaskan adalah metode yang diganti. Ini menyebabkan "kesalahan" waktu kompilasi jika metode beranotasi tidak ditemukan di salah satu kelas induk atau antarmuka yang diimplementasikan. Anotasi yang sangat berguna dan saya akan merekomendasikan untuk sering menggunakannya.
    7. @Deprecated
        - Digunakan untuk menandai bahwa elemen yang ditandai sudah tidak digunakan lagi, mungkin karena suatu alasan dari developer. Kita menggunakan tag @deprecated untuk mendocumentasikannya.
    8. @SuppressWarnings
    9. @SafeVarargs
    10. @FunctionalInterface
    
    untuk definisinya bisa dipelajari dari link ini https://howtodoinjava.com/java/annotations/complete-java-annotations-tutorial/#over_other_annotations

    intinya Annotasi itu adalah yang digunakan untuk membuat komentar pada kode, serta meta-anotasi yang dapat digunakan untuk membuat anotasi dalam deklarasi tipe anotasi.
    Definisi tipe anotasi dicatat oleh tanda at (@), diikuti oleh antarmuka dan nama penjelasan. Anotasi sendiri ditampilkan sebagai @ bersama dengan jenis anotasi.


    2. Javadoc
        - contoh javadoc

        /**
        * CrcDokter
        */

        fungsinya untuk membuat catatan pada document.
    
    3. Generic
    
    Jadi pada java terdapat object non-generic dan generic.

    contoh object non-generic:

    ArrayList al = new ArrayList(); 
    
    artinya kalau yang non-generic, dimana kita tidak ga menyebutkan tipe datanya secara spesifik langsung.

    contoh object generic:

    ArrayList<String> al2 = new ArrayList<String>();  

    pada contoh diatas dimana kita menyebutkan tipe datanya secara langsung, dengan <> tanda kurung seperti ini.

    satu lagi kalau kita memeakai library dari java yaitu ArrayList jangan lupa untuk menambahakan syntax import.java.util.ArrayList; paling atas diatas workspace.


        
