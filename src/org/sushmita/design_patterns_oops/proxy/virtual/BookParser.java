package org.sushmita.design_patterns_oops.proxy.virtual;

public class BookParser implements IBookParser{
    private Book book;

    public BookParser(String text){
        book = new Book(text);
        // perform some operation to calculate number of pages and words
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int numPages = 100;
        int numWords = 10000;
        book.setNumOfPages(numPages);
        book.setNumOfWords(numWords);
    }

    @Override
    public int getNumberOfPages() {
        return book.getNumOfPages();
    }

    @Override
    public int getNumberOfWords() {
        return book.getNumOfWords();
    }
}
