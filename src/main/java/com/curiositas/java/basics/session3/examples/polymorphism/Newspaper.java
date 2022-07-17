package com.curiositas.java.basics.session3.examples.polymorphism;

import com.curiositas.java.basics.session3.examples.polymorphism.formatters.Formatter;

public class Newspaper extends Manuscript {

    private final String source;

    public Newspaper(String title, String content, Formatter formatter, String source) {
        super(title, content, formatter);
        this.source = source;
    }

    @Override
    public String getPrintedView() {
        return "\n\tNewspaper\nSource: " + formatter.format(source) + "\n" + super.getPrintedView();
    }
}
