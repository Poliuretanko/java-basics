package com.curiositas.java.basics.session4.examples.polymorphism;

import com.curiositas.java.basics.session4.examples.polymorphism.formatters.Formatter;

public abstract class Manuscript {
    private final String title;
    private final String content;
    protected final Formatter formatter;

    public Manuscript(String title, String content, Formatter formatter) {
        this.title = title;
        this.content = content;
        this.formatter = formatter;
    }

    public String getPrintedView() {
        return "Title: " + formatter.format(title) + "\nContent: " + formatter.format(content);
    }
}
