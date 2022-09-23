package org.sushmita.design_patterns_oops.proxy.virtual;

public class Book {
    private String text;
    private int numOfPages;
    private int numOfWords;
    public Book(String text){
        // this is an expensive operation
        this.text = text;
    }

    public void setNumOfPages(int numOfPages){
        this.numOfPages = numOfPages;
    }

    public void setNumOfWords(int numOfWords){
        this.numOfWords = numOfWords;
    }

    public String getText() {
        return text;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public int getNumOfWords() {
        return numOfWords;
    }
}
