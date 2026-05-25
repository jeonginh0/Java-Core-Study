package basic.section.class4.ex;

public class Book {
    String title;
    String author;
    int page;

    //TODO
    Book() { // 기본 생성자
        this("", "", 0); // 이렇게 공백 처리.
    }

    Book(String title, String author) { // Title, Author 생성자
        this.title = title;
        this.author = author;
        this.page = 0;
    }

    Book(String title, String author, int page) { // All Parameter 생성자
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void displayInfo() {
        System.out.println("제목: " + this.title + ", 저자: " + this.author + ", 페이지 수: " + this.page);
    }
}
