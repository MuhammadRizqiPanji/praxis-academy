package kampus;

public class Student {
    private int Nisn;
    private String NameSiswa;

    public int getNisn() {
        return Nisn;
    }

    public void setNisn(int nisn) {
        Nisn = nisn;
    }

    public String getNameSiswa() {
        return NameSiswa;
    }

    public void setNameSiswa(String nameSiswa) {
        NameSiswa = nameSiswa;
    }

    @Override
    public String toString() {
        return "Student{" + "Nisn=" + Nisn + ", NameSiswa='" + NameSiswa + '\'' + '}';
    }
}
