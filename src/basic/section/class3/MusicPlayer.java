package basic.section.class3;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    public void on(){
        isOn = true;
        System.out.println("뮤직 플레이어 작동 시작");
    }

    public void off(){
        isOn = false;
        System.out.println("뮤직 플레이어 작동 종료");
    }

    public void volumeUp() {
        volume++;
        System.out.println("뮤직 플레이어 볼륨 : " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("뮤직 플레이어 볼륨 : " + volume);
    }

    public void status() {
        if (isOn) {
            System.out.println("뮤직 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println("뮤직 플레이어 OFF");
        }
    }

}
