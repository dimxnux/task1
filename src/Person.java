public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private PersonGender gender;

    public Person(String firstName, String lastName, int age, PersonGender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = Math.max(0, age);
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public PersonGender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
