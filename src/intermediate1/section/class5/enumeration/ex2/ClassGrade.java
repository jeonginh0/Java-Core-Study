package intermediate1.section.class5.enumeration.ex2;

public class ClassGrade {

    //외부에서 ClassGrade 인스턴스 생성 불가
    private ClassGrade() {
    }

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();
}
