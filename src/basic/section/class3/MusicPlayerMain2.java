package basic.section.class3;

public class MusicPlayerMain2 {

    /**
     * 절차 지향 프로그래밍
     * 점진적으로 변화시키기
     * 1. MusicPlayer 클래스 선언
     * 2. 음악 플레이어와 관련된 데이터 묶기
     */
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어 시작");

        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        // 볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        // 음악 플레이어 상태 확인
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어 종료");

    }
}
