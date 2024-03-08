package ru.hse.restaurant_kpo.controllers;

import lombok.extern.slf4j.Slf4j;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;
import ru.hse.restaurant_kpo.dto.Book;

import java.util.List;
import java.util.UUID;
@Slf4j
@RestController
@RequestMapping(path = "/books")
public class RestaurantController
{
//    @GetMapping(path = "/{id}")
//    @ResponseBody
//    public Book getBook(@PathVariable("id") UUID id) {
//        return Book.builder()
//                .id(id)
//                .name("Foo")
//                .summary("Bar")
//                .build();
//    }
    @GetMapping
    @ResponseBody
    public List<Book> getBooks() {
        return null;
    }
}
