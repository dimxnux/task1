import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void concatenateValues(Object[] values) {
        StringBuilder concatenatedStrings = new StringBuilder();
        long sum = 0;
        List<Person> persons = new ArrayList<>();

        for (Object o : values) {
            if (o instanceof Character || o instanceof String) {
                concatenatedStrings.append(o).append(" ");
            } else if (o instanceof Integer || o instanceof Long) {
                sum += Long.parseLong(o.toString());
            } else if (o instanceof Person) {
                Person person = (Person) o;
                persons.add(person);
            }
        }
        int lastCharIndex = concatenatedStrings.length() - 1;
        concatenatedStrings.deleteCharAt(lastCharIndex);

        System.out.println(concatenatedStrings);
        System.out.println(sum);
        System.out.println(persons);
    }

    public static void main(String[] args) {
        Object[] values = {"Today", new Person("alex", "brown", 21, PersonGender.MALE),
                32344234234L, "is", 23, 652, 'a',
                new Person("emma", "adams", 40, PersonGender.FEMALE),
                "big", "day"};
        concatenateValues(values);
    }

}
