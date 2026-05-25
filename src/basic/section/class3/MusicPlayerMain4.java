package basic.section.class3;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        // 뮤직 플레이어 작동 시작
        musicPlayer.on();

        // 뮤직 플레이어 볼륨 증가
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();

        // 뮤직 플레이어 볼륨 감소
        musicPlayer.volumeDown();

        // 뮤직 플레이어 작동 상태 확인
        musicPlayer.status();

        // 뮤직 플레이어 종료
        musicPlayer.off();
    }

}
