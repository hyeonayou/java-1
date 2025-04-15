package access.ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    private boolean maxCount() {
        return count < max;
    }

    public void increment() {
        if(maxCount()) {
            count++;
        }
        else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }
}
