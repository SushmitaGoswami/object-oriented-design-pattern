package org.sushmita.design_patterns_oops.proxy.virtual;

public class LazyBookParser implements IBookParser{

    private  BookParser iBookParser;
    private String text;

    public LazyBookParser(String text){
        this.text = text;
    }

    @Override
    public int getNumberOfPages() {
        if(iBookParser == null){
            iBookParser = new BookParser(text);
        }
        return iBookParser.getNumberOfPages();
    }

    @Override
    public int getNumberOfWords() {
        if(iBookParser == null){
            iBookParser = new BookParser(text);
        }
        return iBookParser.getNumberOfWords();
    }
}
