package com.company.ZaawJavaSDA.ZaawCollectZad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookService2 {

    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book){
        books.remove(book);
    }

    public List<Book> getAll(){
        return books;
    }

    public Map<Genre, String> mapBooks(){
        Map<Genre, String> booksMap = new HashMap<>();
        for(Book book: books){
            booksMap.put(book.getGenre(), book.getTitle());
        }
        return booksMap;
    }
}
