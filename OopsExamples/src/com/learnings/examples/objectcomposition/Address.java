package com.learnings.examples.objectcomposition;

public class Address {

    private String line1;
    private String line2;
    private String zip;

    public Address(String line1, String line2, String zip) {
        this.line1 = line1;
        this.line2 = line2;
        this.zip = zip;
    }

    public String toString() {
        return String.format("line 1: %s, line 2: %s, zip: %s", line1, line2, zip);
    }
}
