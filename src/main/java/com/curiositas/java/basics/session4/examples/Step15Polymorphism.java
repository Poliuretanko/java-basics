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
        var cuttingFormatter = new CuttingFormatter(40, "...");
        var reverseFormatter = new ReverseFormatter();
        var upperCaseFormatter = new UpperCaseFormatter();

        ArrayList<Manuscript> manuscripts = new ArrayList<Manuscript>();

        var bookTitle = "Harry Potter";
        var bookContent = "Mr and Mrs Dursley, of number four, Privet Drive, were proud to say that they were perfectly normal, thank you very much.";
        var bookAuthor = "J.K. Rowling";
        var book1 = new Book(bookTitle, bookContent, cuttingFormatter, bookAuthor);
        manuscripts.add(book1);
        var book2 = new Book(bookTitle, bookContent, reverseFormatter, bookAuthor);
        manuscripts.add(book2);
        var book3 = new Book(bookTitle, bookContent, upperCaseFormatter, bookAuthor);
        manuscripts.add(book3);

        var manuscriptIterator = manuscripts.iterator();

        while(manuscriptIterator.hasNext()) {
            var manuscript = manuscriptIterator.next();
            System.out.println(manuscript.getPrintedView());
        }
    }
}
