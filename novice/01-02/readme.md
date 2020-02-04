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


    

