package queueexamples;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.receivePatient(new Patient("Ana",5));
        hospital.receivePatient(new Patient("Mihai",9));
        hospital.receivePatient(new Patient("Costel",2));

        hospital.treatAllPatients();

        // in loc de int prioritate (la pacient) sa avem un enum Prority (operation, pneumonia)
        //fiecare sa aibe un int priority
    }
}
