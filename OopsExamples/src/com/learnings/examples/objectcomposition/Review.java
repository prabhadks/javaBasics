package com.learnings.examples.objectcomposition;

public class Review {

    private int id;
    private String description;
    private int rating;

    public Review(int id, int rating) {
        this.id = id;
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return String.format("Rating: [%s], Comments: [%s]", rating, description);
    }
}
