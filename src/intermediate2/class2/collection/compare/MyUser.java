package intermediate2.class2.collection.compare;

public class MyUser implements Comparable<MyUser>{

    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MyUser{" +
            "id='" + id + '\'' +
            ", age=" + age +
            '}';
    }

    @Override
    public int compareTo(MyUser o) {
        System.out.println(this + " vs " + o);
        // 내 나이가 넘어온 나이보다 작으면 -1, 둘이 같으면 0, 그게 아니면(크기 떄문에) 1
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }
}
