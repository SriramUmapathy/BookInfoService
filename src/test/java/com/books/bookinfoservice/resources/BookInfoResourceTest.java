package com.books.bookinfoservice.resources;

import com.books.bookinfoservice.models.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookInfoResourceTest {

    @Test
    void getBookInfo() {

        BookInfoResource bookInfoResource = new BookInfoResource();
        Book book = bookInfoResource.getBookInfo();

        assertEquals(book.getBookId(),"123bookId");
        assertEquals(book.getName(),"java development");
    }
}