package org.example.p1_single_responsability.good;

import lombok.Data;

@Data
public class Book {
    private String bookName;

    private String authorName;

    private String content;

    public Book(String bookName, String authorName, String content) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.content = content;
    }

}
