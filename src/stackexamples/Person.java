package stackexamples;

public class Person implements Comparable {

    String nume;
    int varsta;

    public Person(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void eatPringles(PringlesTub pringlesTub) {
        int caloryCounter = 0;
        for (int i = 0; i < 150; i++) {
            Pringles chip = pringlesTub.chips.pop();
            caloryCounter += chip.valoareEnergetica;
        }
        System.out.println("You have eaten " + caloryCounter + " calories");
    }

    @Override
    public int compareTo(Object o) {
        Person person=(Person)o;
        return Integer.compare(this.varsta, person.varsta);
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
