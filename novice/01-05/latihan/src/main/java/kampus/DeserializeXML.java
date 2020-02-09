package kampus;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeserializeXML {
    public static void main(String[] args) {
        try (XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("myCollege.xml")))) {
            College c = (College) x.readObject();

            List<Student> s = c.getStudents();

            for(Student value : s){
                System.out.println(value);
            }

        } catch (FileNotFoundException ex){
            Logger.getLogger(DeserializeXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
