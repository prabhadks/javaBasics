package com.learnings.examples.objectcomposition;
import java.util.ArrayList;

public class Book {

    private String name;
    private int id;
    private String author;
    private ArrayList<Review> reviews = new ArrayList<Review>();

    public Book(String name, int id, String author) {
        this.name = name;
        this.id = id;
        this.author = author;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public String toString() {
       return String.format("Name of the book: [%s], Author: [%s], Reviews: [%s]",
                name, author, reviews);
    }
}
