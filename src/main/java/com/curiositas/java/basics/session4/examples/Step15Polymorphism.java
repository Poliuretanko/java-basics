package com.curiositas.java.basics.session4.examples;

import com.curiositas.java.basics.session4.examples.polymorphism.Article;
import com.curiositas.java.basics.session4.examples.polymorphism.Book;
import com.curiositas.java.basics.session4.examples.polymorphism.Manuscript;
import com.curiositas.java.basics.session4.examples.polymorphism.Newspaper;
import com.curiositas.java.basics.session4.examples.polymorphism.formatters.CuttingFormatter;
import com.curiositas.java.basics.session4.examples.polymorphism.formatters.Formatter;
import com.curiositas.java.basics.session4.examples.polymorphism.formatters.ReverseFormatter;
import com.curiositas.java.basics.session4.examples.polymorphism.formatters.UpperCaseFormatter;

import java.util.*;

public class Step15Polymorphism {
    public static void main(String[] args) {
        Formatter cuttingFormatter = new CuttingFormatter(40, "...");
        Formatter reverseFormatter = new ReverseFormatter();
        Formatter upperCaseFormatter = new UpperCaseFormatter();

        Collection<Manuscript> manuscripts = new ArrayList<>();

        var bookTitle = "Harry Potter";
        var bookContent = "Mr and Mrs Dursley, of number four, Privet Drive, were proud to say that they were perfectly normal, thank you very much.";
        var bookAuthor = "J.K. Rowling";
        Manuscript book = new Book(bookTitle, bookContent, cuttingFormatter, bookAuthor);
        manuscripts.add(book);

        Collection<String> magazines = Arrays.asList("habr.com", "reddit.com");
        var articleTitle = "How to learn English";
        var articleContent = "One one hand I don't want to be the final authority, but on the other hand, I'd like to share my point of view on how to learn English.";
        Manuscript article = new Article(articleTitle, articleContent, reverseFormatter, magazines);
        manuscripts.add(article);

        String newsTitle = "Hot news!";
        String newsContent = "The weather today is about 40 grad! It's really hot!";
        String newsSource = "weather.com";
        Manuscript newspaper = new Newspaper(newsTitle, newsContent, upperCaseFormatter, newsSource);
        manuscripts.add(newspaper);

        Iterator<Manuscript> manuscriptIterator = manuscripts.iterator();

        while(manuscriptIterator.hasNext()) {
            Manuscript manuscript = manuscriptIterator.next();
            System.out.println(manuscript.getPrintedView());
        }
    }
}
