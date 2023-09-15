package queueexamples;

public class Patient implements Comparable {
    String name;
    int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Patient patient = (Patient) o;
        return Integer.compare(this.priority, patient.priority);
    }
}
