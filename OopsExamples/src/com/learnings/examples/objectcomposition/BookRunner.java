package com.learnings.examples.objectcomposition;
import java.util.ArrayList;

public class BookRunner {

    public static void main(String[] args) {
        Book book = new Book("Book 1", 1, "Test1");
        Review review1 = new Review(1, 4);
        book.addReview(review1);
        System.out.println(book);
        review1.setDescription("Has lot of valuable information with examples");
        book.addReview(new Review(1, 5));
        System.out.println(book);
    }
}
