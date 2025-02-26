package com.steve.bookstore.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
@Tag(name = "Books")
public class BookController {


    @GetMapping("/all")
    public ResponseEntity<List<BookResponse>> getAllBooks() {
        return ResponseEntity.ok(Arrays.asList(BookResponse.builder().title("First Book").build()));
    }
}
