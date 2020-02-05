Object-Oriented Programming Concepts (OOP)
https://docs.oracle.com/javase/tutorial/java/concepts/index.html

Apa itu object ?
    - Objek adalah kunci untuk memahami teknologi berorientasi objek. Lihatlah ke sekeliling sekarang dan Anda akan menemukan banyak contoh benda dunia nyata: anjing Anda, meja Anda, televisi Anda, sepeda Anda.

    Objek dunia nyata memiliki dua karakteristik: Mereka semua memiliki keadaan dan perilaku. Anjing memiliki status (nama, warna, jenis, lapar) dan perilaku (menggonggong, mengambil, mengibaskan ekor). Sepeda juga memiliki status (gigi saat ini, irama pedal saat ini, kecepatan saat ini) dan perilaku (mengganti gigi, mengganti irama pedal, mengerem). Mengidentifikasi keadaan dan perilaku untuk objek dunia nyata adalah cara yang bagus untuk mulai berpikir dalam hal pemrograman berorientasi objek.

    contoh OOP

    package programku;

    //membuat class sebagai template
        class Mahasiswa{
            String nama;
        }
        public class Main1 {
            public static void main(String[] args) {
                Mahasiswa mahasiswa1 = new Mahasiswa(); //mahasiswa yang diujung warna kuning berasal dari classnya
                mahasiswa1.nama = "Muhammad Rizqi";

                System.out.println(mahasiswa1.nama);
            }
        }

Apa itu class ?
    - Class dan Object pada Pemrograman Java. ... – Class merupakan suatu “Blueprint” atau “Cetakan” untuk menciptakan suatu instant dari object. Class juga merupakan grup suatu object dengan kemiripan attributes/properties, behavior dan relasi ke object lain.


Cara membuat executable jar pada java.
1. kita siapkan dulu aplikasi atau projectnya
2. kita setting dlu manifestnya, contohnya seperti dibawah ini

    jar {
    manifest {
        // attributes 'Main-Class': 'InterfaceLat.BukuBagus'
      attributes 'Main-Class': 'Latihanclass.Selselcheesetea'
     }
    }

    perlu teman-teman ketahui kalau pada text (LatihanClass) yang diambil dari 'Latihanclass.Selselcheesetea' adalah package dari file kita dan untuk (Selselcheesetea) diambil dari class atau nama file kita.
3. ketik di console (gradle build). tunggu beberapa saat sampai BUILD SUCCESSFULL
4. setelah itu ketik java -jar build/libs/object.jar
5. selesai.


cara install gradle di linux.
1. kunjungin link ini untuk instalasi https://gradle.org/install/
2. cari Installing with a package manager.
3. sebelum di download temen-temen harus download dlu SDKMAN, dengan cara klik text SDKMAN
4. instal di terminal temen-temen sdk install gradle 6.1.1.
5. tunggu sampai selesai.


    

