import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum ConcatenateOperations {

    CHARACTER(Character.class) {
        @Override
        public void consume(Object value) {
            concatenatedStrings.append(value).append(" ");
        }
    },
    STRING(String.class) {
        @Override
        public void consume(Object value) {
            concatenatedStrings.append(value).append(" ");
        }
    },
    INTEGER(Integer.class) {
        @Override
        public void consume(Object value) {
            sum += Integer.parseInt(value.toString());
        }
    },
    LONG(Long.class) {
        @Override
        public void consume(Object value) {
            sum += Long.parseLong(value.toString());
        }
    },
    PERSON(Person.class) {
        @Override
        public void consume(Object value) {
            persons.add((Person) value);
        }
    };

    private final Class<?> clazz;

    private static long sum = 0;
    private static final StringBuilder concatenatedStrings = new StringBuilder();
    private static final List<Person> persons = new ArrayList<>();

    ConcatenateOperations(Class<?> clazz) {
        this.clazz = clazz;
    }

    public abstract void consume(Object value);

    public static ConcatenateOperations valueOf(Class<?> o) {
        for (ConcatenateOperations op : ConcatenateOperations.values()) {
            if (op.clazz == o) return op;
        }
        throw new IllegalArgumentException("The provided class '" + o +
                "' isn't a ConcatenateOperations constant.");
    }

    public static long getSum() {
        return sum;
    }

    public static String getConcatenatedStrings() {
        return concatenatedStrings.toString();
    }

    public static List<Person> getPersons() {
        return Collections.unmodifiableList(persons);
    }

}
