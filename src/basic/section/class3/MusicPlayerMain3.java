package basic.section.class3;

public class MusicPlayerMain3 {

    /**
     * 절차 지향 프로그래밍
     * 점진적으로 변화시키기
     * 1. 메서드 추출
     */
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        startPlayer(data);

        // 볼륨 증가
        volumeUp(data);
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태 확인
        playetStatus(data);

        // 음악 플레이어 끄기
        offPlayer(data);

    }

    static void startPlayer(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어 시작");
    }

    static void offPlayer(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void playetStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
