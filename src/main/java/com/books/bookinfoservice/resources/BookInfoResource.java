package com.books.bookinfoservice.resources;

import com.books.bookinfoservice.models.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("info")
public class BookInfoResource {
    @RequestMapping("/")
    public Book getBookInfo() {
        return Book.builder().bookId("123bookId").name("java development").build();
    }
}
