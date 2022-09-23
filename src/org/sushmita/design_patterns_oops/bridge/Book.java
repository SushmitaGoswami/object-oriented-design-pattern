package org.sushmita.design_patterns_oops.bridge;

public class Book {
    private String title;
    private String previewText;
    private String text;

    public Book(String title, String previewText, String text) {
        this.title = title;
        this.previewText = previewText;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPreviewText() {
        return previewText;
    }

    public void setPreviewText(String previewText) {
        this.previewText = previewText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
