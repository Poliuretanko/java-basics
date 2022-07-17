package com.curiositas.java.basics.session3.examples.polymorphism;

import com.curiositas.java.basics.session3.examples.polymorphism.formatters.Formatter;

public class Book extends Manuscript {

    private final String author;

    public Book(String title, String content, Formatter formatter, String author) {
        super(title, content, formatter);
        this.author = author;
    }

    @Override
    public String getPrintedView() {
        return "\n\tBook\nAuthor: " + formatter.format(author) + "\n" + super.getPrintedView();
    }
}
