 1. What is Serialization & Deserialization
 
    - Serialization adalah suatu proses mengubah objek menjadi byte stream, 
      agar bisa disimpan dalam file, memori ataupun berguna dalam proses transmisi jaringan.
    - Serialization mengubah objek dari penyimpanan dimemori menjadi format lain biasanya(txt) yang bisa dikirim/disimpan
      
    - Sedangkan Deserialization adalah kebalikan dari proses Serialization.
      Dalam proses serialization dan deserialization di Java, ada dua kelas yang sangat berperan penting yaitu :     
         kelas ObjectOutputStream.
         kelas ObjectInputStream.
     Selain itu, kelas yang mau di-serialization kan harus mengimplement interface java.io.Serializable.
     Program Java Serialization
     Untuk membuat program Java Serialization, hal pertama yang harus dilakukan adalah membuat kelas di Java yang mau di-serialization kan.
     Di bawah ini adalah kelas Karyawan yang mau di-serialization kan.
     Ingat !. Kelas yang mau di-serialisasi haru mengimplements java.io.Serializable.
     
    2. XML
        - XML (Extensible Markup Language) adalah bahasa berbasis teks sederhana
         yang sangat populer yang dapat digunakan sebagai mode komunikasi antara berbagai aplikasi.
         
        - Apa itu XML?
          
          https://www.tutorialspoint.com/java_xml/java_xml_overview.htm
          XML adalah bahasa berbasis teks sederhana yang dirancang untuk menyimpan dan mengangkut data dalam
          format teks biasa. Itu adalah singkatan dari Extensible Markup Language. Berikut ini adalah beberapa fitur penting XML.
          
         https://www.petanikode.com/xml-untuk-pemula/
         XML (eXtensible Markup Language) adalah sebuah bahasa markup seperti HTML yang didesain untuk menyimpan dan mengantarkan data.

               XML adalah bahasa markup.
          
               XML adalah bahasa berbasis tag seperti HTML.
          
               Tag XML tidak ditentukan sebelumnya seperti HTML.
          
               Anda dapat mendefinisikan tag Anda sendiri dan oleh karena itu disebut tag bahasa yang dapat dikembangkan.
          
               Tag XML dirancang untuk bersifat deskriptif sendiri.
          
               XML adalah W3C Recommendation untuk penyimpanan data dan transfer data.
               
          Keuntungan
          
          Berikut ini adalah keuntungan yang disediakan XML -
          
               Teknologi agnostik - Menjadi teks biasa, XML adalah teknologi yang independen. Dapat digunakan oleh teknologi apa pun untuk penyimpanan data dan tujuan transfer data.
          
               Dapat dibaca manusia - XML menggunakan format teks sederhana. Itu bisa dibaca dan dimengerti manusia.
          
               Extensible - Dalam XML, tag khusus dapat dibuat dan digunakan dengan sangat mudah.
          
               Izinkan Validasi - Menggunakan struktur XSD, DTD dan XML dapat divalidasi dengan mudah.
          
          Kekurangan
          
          Berikut ini adalah kerugian menggunakan XML -
            
               Redundant Syntax - Biasanya file XML mengandung banyak istilah berulang.
          
               Verbose - Menjadi bahasa verbose, ukuran file XML meningkatkan biaya transmisi dan penyimpanan.
        
        link belajar XML dan serialization 
        https://www.youtube.com/watch?v=MG5BlkfecdU
        
        llink belajar XML dan deserialization
        https://www.youtube.com/watch?v=V6iY-kan_6E