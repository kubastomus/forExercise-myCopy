package com.company.ZaawJavaSDA.ZaawExcZad2;

public class Main {
    public static void main(String[] args) throws NoBookFoundException {

        BookRepository bookRepository = new BookRepository();
        bookRepository.add(new Book("Prus", "Placówka", "1111"));
        Book book1 = bookRepository.findByIsbn("1111");
        System.out.println(book1);


//        List<Book> book = bookRepository.findByName("??");
//        Book book1 = bookRepository.findByIsbn("??");
//        bookRepository.delete("43");


    }
}
