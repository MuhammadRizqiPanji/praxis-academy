package kampus;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializeXML {
    public static void main(String[] args){
        Student st1 = new Student();
        st1.setNisn(101);
        st1.setNameSiswa("Rizqi");

        Student st2 = new Student();
        st2.setNisn(102);
        st2.setNameSiswa("Chia");

        List<Student> s = new ArrayList<>();
        s.add(st1);
        s.add(st2);

        College c = new College();
        c.setStudents(s);


        //cara serialize
        try (XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")))) {
        x.writeObject(c);
        x.close();
        }catch (FileNotFoundException ex) {
            Logger.getLogger(SerializeXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}



