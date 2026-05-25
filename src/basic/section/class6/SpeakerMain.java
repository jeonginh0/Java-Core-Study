package basic.section.class6;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드 직접 접근 (public)
        System.out.println("volume필드에 직접 접근 수정");
        //speaker.volume = 200;
        speaker.showVolume();

        // 필드 직접 접근 불가 (private 접근제어자 사용 시)
        //System.out.println("volume필드에 직접 접근 수정");
        //speaker.volume = 200;
        //speaker.showVolume();
    }

}
