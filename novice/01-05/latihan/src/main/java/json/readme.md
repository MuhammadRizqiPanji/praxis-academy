1. JSON (Javascript Object Notation)
   https://medium.com/nusanet/from-zero-to-hero-in-json-with-java-1b7095b4f0ea

    -   JSON merupakan singkatan dari JavaScript Object Notation dimana, 
        ini adalah suatu format data yang berfungsi untuk melakukan komunikasi pertukaran data. 
        
        
            fungsinya untuk penggunaan json, taro ini di gradle build
         // https://mvnrepository.com/artifact/org.json/json
            compile group: 'org.json', name: 'json', version: '20190722'
            
            jangan lupa tambahkan 
            dependencies {
                // This dependency is used by the application.
                implementation 'com.google.guava:guava:28.1-jre'
                // https://mvnrepository.com/artifact/com.google.code.gson/gson
                compile group: 'com.google.code.gson', name: 'gson', version: '2.8.6'
                
                di build gradle