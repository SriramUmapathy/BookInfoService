package com.books.bookinfoservice.resources;

import com.books.bookinfoservice.models.Book;
import com.books.bookinfoservice.util.InstanceInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("info")
public class BookInfoResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookInfoResource.class);

    @Autowired
    InstanceInfoService instanceInfoService;

    @RequestMapping("/{bookId}")
    public Book getBookInfo(@PathVariable("bookId") String bookId) {
        LOGGER.info(bookId);
        return Book.builder().bookId(bookId).name(instanceInfoService.retrieveInstanceInfo()).build();
    }
}
