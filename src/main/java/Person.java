public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double income;

    public Person(String firstName, String lastName, int age, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.income = income;
    }

    public int getAge() {
        return age;
    }

    public double getIncome() {
        return income;
    }
}