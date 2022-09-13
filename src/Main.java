public class Main {

    public static void concatenateValues(Object[] values) {
        for (Object o : values) {
            String enumMapping = o.getClass().getSimpleName().toUpperCase();
            ConcatenateOperations operation = ConcatenateOperations.valueOf(enumMapping);
            operation.consume(o);
        }

        System.out.println(ConcatenateOperations.getConcatenatedStrings());
        System.out.println(ConcatenateOperations.getSum());
        System.out.println(ConcatenateOperations.getPersons());
    }

    public static void main(String[] args) {
        Object[] values = {"Today", new Person("alex", "brown", 21, PersonGender.MALE),
                32344234234L, "is", 23, 652, 'a',
                new Person("emma", "adams", 40, PersonGender.FEMALE),
                "big", "day"};
        concatenateValues(values);
    }

}
