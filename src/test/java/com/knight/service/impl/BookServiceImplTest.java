package com.knight.service.impl;

import com.knight.BaseTest;
import com.knight.dto.AppointExecution;
import com.knight.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImplTest extends BaseTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() throws Exception {
        long bookId = 1001;
        long studentId = 12345678910L;
        AppointExecution execution = bookService.appoint(bookId,studentId);
        System.out.println(execution);
    }
}