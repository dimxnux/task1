import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum ConcatenateOperations {

    CHARACTER {
        @Override
        public void consume(Object value) {
            concatenatedStrings.append(value).append(" ");
        }
    },
    STRING {
        @Override
        public void consume(Object value) {
            concatenatedStrings.append(value).append(" ");
        }
    },
    INTEGER {
        @Override
        public void consume(Object value) {
            sum += Integer.parseInt(value.toString());
        }
    },
    LONG {
        @Override
        public void consume(Object value) {
            sum += Long.parseLong(value.toString());
        }
    },
    PERSON {
        @Override
        public void consume(Object value) {
            persons.add((Person) value);
        }
    };

    private static long sum = 0;
    private static final StringBuilder concatenatedStrings = new StringBuilder();
    private static final List<Person> persons = new ArrayList<>();

    public abstract void consume(Object value);

    public static ConcatenateOperations valueOf(Object o) {
        String className = o.getClass().getSimpleName().toUpperCase();
        return valueOf(className);
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
