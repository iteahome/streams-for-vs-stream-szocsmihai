import java.util.ArrayList;

public class ForVsStream {

    public static double averageAgeViaFor(ArrayList<Person> persons) {
        int cumulativeAge = 0;
        for (Person person : persons) {
            cumulativeAge += person.getAge();
        }
        return (double) cumulativeAge / persons.size();
    }

    public static double averageIncomeViaStream(ArrayList<Person> persons) {
        return persons.stream().mapToDouble(Person::getIncome).average().orElse(0);
    }

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        System.out.println("PLEASE DESCRIBE 3 PEOPLE, FILLING IN THE REQUESTED INFO:");
        int count = 0;
        do {
            System.out.println("\nPERSON #" + (count + 1) + ":\n");
            persons.add(new Person(PersonUtil.askForFirstName(), PersonUtil.askForLastName(), PersonUtil.askForAge(), PersonUtil.askForIncome()));
            count++;
        } while (count < 3);

        System.out.println("\nA COUPLE OF FUN FACTS:\n");
        System.out.println("THEIR AVERAGE AGE IS: " + averageAgeViaFor(persons) + ".");
        System.out.println("THEIR AVERAGE MONTHLY INCOME IS: " + averageIncomeViaStream(persons) + " USD.");
    }
}