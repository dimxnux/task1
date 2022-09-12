import java.util.ArrayList;
import java.util.List;

public enum Operations {
    CONCATENATE {
        @Override
        public void doStuff() {

        }
    },
    SUM,
    ADD_TO_LIST,
    CHARACTER {
        @Override
        public void doStuff() {

        }
    };

    Class<?>[] sumClasses = {Long.class, Integer.class};
    Class<?>[] concatenateClasses = {Character.class, String.class};
    Class<?>[] addToListClasses = {Person.class};



    private static StringBuilder builder = new StringBuilder();
    private static long sum = 0;
    private static List<Object> list = new ArrayList<>();

    // getters

    public abstract void doStuff();

    // cum sa transform clasele necesare (adica, Character, String, Long ...) ca constante dintr-un enum

}
