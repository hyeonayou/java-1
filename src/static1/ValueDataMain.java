package static1;

public class ValueDataMain {
    public static void main(String[] args) {

        ValueData valueData = new ValueData();
        add(valueData);
    }

    static void add (ValueData valueData) {
        valueData.value++;
        System.out.println(ValueData.value);
    }
}