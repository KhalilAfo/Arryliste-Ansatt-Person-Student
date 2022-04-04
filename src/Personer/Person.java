package Personer;

 public class Person {
    private String navn;
    private String adresse;
    private String telefonnr;

    public Person(String navn, String adresse, String telefonnr) {
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;

    }

    @Override
    public String toString() {
        return "Navn=" + navn +
                ", Adresse=" + adresse +
                ", Telefonnr=" + telefonnr;

    }
}

class Student extends Person {
    private String studentnr;
    private String studienavn;


    public Student(String navn, String adresse, String telefonnr, String studentnr, String studienavn) {
        super(navn, adresse, telefonnr);
        this.studentnr = studentnr;
        this.studienavn = studienavn;

    }
    @Override
    public String toString() {
        return super.toString() + ", Studentnavn=" + studienavn +
                ", Studienavn=" + studienavn;

    }
}
class Ansatt extends Person {
    private String intituttnavn;
    private double lonn;

    public Ansatt(String navn, String adresse, String telefonnr, String intituttnavn, double lonn) {

        super(navn, adresse, telefonnr);
        this.intituttnavn = intituttnavn;
        this.lonn = lonn;

    }
    @Override
    public String toString() {
        return super.toString() + ", Intituttnavn=" + intituttnavn +
                ", Lonn=" + lonn;

    }

}
