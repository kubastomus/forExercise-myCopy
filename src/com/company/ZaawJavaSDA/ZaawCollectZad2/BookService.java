package com.company.ZaawJavaSDA.ZaawCollectZad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookService {

    private List<Book> books = new ArrayList<>();

    public void add(Book book){
        books.add(book);
    }

    public void delete(Book book){
        books.remove(book);
    }

    public List<Book> getAll (){
        return books;
    }

    public List<Book> FindBeGenre (Genre genre){
        List<Book> result = new ArrayList<>();
        for(Book book: books){
            if(book.getGenre() == genre){
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findByYear (int yearOfRelease){
        List<Book> result = new ArrayList<>();
        for (Book book: books){
            if (book.getYearOfRelease() < yearOfRelease){
                result.add(book);
            }
        }
        return result;
    }

    public Book findMostExpensiveBook(){
        Book result = null;
        for (Book book: books){
            if (result == null || result.getPrice() < book.getPrice()){
                result = book;
            }
        }
        return result;
    }

    public Book findCheapestBook(){
        Book result = null;
        for (Book book: books){
            if (result == null || result.getPrice() > book.getPrice()){
                result = book;
            }
        }
        return result;
    }

    public List<Book> findByNumberOfAuthors (int numberOfAuthors) {
        List<Book> result = new ArrayList<>();
        for (Book book: books){
            if (book.getAuthors().size() == numberOfAuthors){
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> sortByTitleAsc (){
        Collections.sort(books);
        return books;
    }

    public List<Book> sortByTitleDsc (){
        Collections.reverse(books);
        return books;
    }

    public boolean isBookInRepo (Book book){
        return books.contains(book);
    }

    public List<Book> findByAuthor (Author author){
        List<Book> result = new ArrayList<>();
        for (Book book: books){
            if (book.getAuthors().contains(author)){
                result.add(book);
            }
        }
        return result;
    }

}
