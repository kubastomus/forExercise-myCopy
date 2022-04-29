package com.company.ZaawJavaSDA.ZaawExcZad2;

import java.util.ArrayList;
import java.util.List;

class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void add (Book book){
        this.books.add(book);
    }

//    public void delete (Book book) throws NoBookFoundException{
//        this.books.remove(book);
//        throw new NoBookFoundException("Can't delete book: " + book);
//    }

    public void delete (String isbn) throws NoBookFoundException {
        for (Book book: books){
            if(book.getId().equals(isbn)){
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Can't delete book with isbn: " + isbn);
    }

    public Book findByIsbn (String isbn) throws NoBookFoundException{
        for (Book book: books){
            if (book.getId().equals(isbn)){
                return book;
            }
        }
        throw new NoBookFoundException("Can't find book with isbn: " + isbn);
    }

    public List<Book> findByName (String name) throws NoBookFoundException{
        List<Book> bookByName = new ArrayList<>();
        for (Book book: books){
            if(book.getTitle().equals(name)){
                bookByName.add(book);
            }
        }
        if (bookByName.isEmpty()){
            throw new NoBookFoundException("Can't find book with name: " + name);
        }
        return bookByName;
    }

}