package oop;

/**
 * 절차 지향
 */
public class MusicPlayerMain {
    public static void main(String[] args) {

        MusucPlayerData data = new MusucPlayerData();

        data.inOn = true;
        System.out.println("음악 플레이어를 시작합니다. " );
        data.volume++;

        System.out.println("음악 볼륨 " + data.volume);
    }
}
