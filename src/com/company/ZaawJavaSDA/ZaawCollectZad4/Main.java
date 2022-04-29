package com.company.ZaawJavaSDA.ZaawCollectZad4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Tomek", "Ku", 'M');
        Author author2 = new Author("Monia", "Gr", 'F');
        Author author3 = new Author("Krzysztof", "Dol", 'M');

        Book book1 = new Book("Wypociny Java",30, 2022, Arrays.asList(author1), Genre.FANTASY);
        Book book2 = new Book("Wypociny AllJava", 90, 2023, Arrays.asList(author1, author2, author3), Genre.ACTION);

        BookService2 bookService2 = new BookService2();
        bookService2.add(book1);
        bookService2.add(book2);

        System.out.println(bookService2.mapBooks());

    }
}
