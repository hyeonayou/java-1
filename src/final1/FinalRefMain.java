package final1;

import memory.Data;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(5);
        //data = new ConstructInit();

        Data data1 = new Data(5);
        data1 = new Data(2);

    }
}
