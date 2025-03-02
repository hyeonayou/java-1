package method;

public class MethodEx2 {
    public static void main(String[] args) {

        setText("Hello, world", 3);
        setText("Hello, world", 5);

    }

    public static void setText(String text, int time)
    {
        for(int i = 0; i<time; i++)
        {
            System.out.println(text);
        }
    }
}
