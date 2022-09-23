package org.sushmita.design_patterns_oops.bridge;

public class BookResource implements Resource{
    private Book book;

    public BookResource(Book book){
        this.book = book;
    }
    @Override
    public String title() {
        return this.book.getTitle();
    }

    @Override
    public String description() {
        return this.book.getPreviewText();
    }
}
