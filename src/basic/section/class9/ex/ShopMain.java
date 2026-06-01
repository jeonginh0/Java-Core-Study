package basic.section.class9.ex;

import basic.section.class9.ex.item.album.Album;
import basic.section.class9.ex.item.book.Book;
import basic.section.class9.ex.item.movie.Movie;

public class ShopMain {

    public static void main(String[] args) {
        Book book = new Book("Java", 10000, "Han", "12345");
        Album album = new Album("앨범1", 15000, "Seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }

}
