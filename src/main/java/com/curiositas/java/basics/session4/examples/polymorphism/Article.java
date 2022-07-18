package com.curiositas.java.basics.session4.examples.polymorphism;

import com.curiositas.java.basics.session4.examples.polymorphism.formatters.Formatter;

import java.util.Arrays;
import java.util.Collection;

public class Article extends Manuscript {

    private final Collection<String> magazines;

    public Article(String title, String content, Formatter formatter, Collection<String> magazines) {
        super(title, content, formatter);
        this.magazines = magazines;
    }

    @Override
    public String getPrintedView() {
        return "\n\tArticle\nPrinted in: " + formatter.format(Arrays.toString(magazines.toArray())) + "\n" + super.getPrintedView();
    }
}
