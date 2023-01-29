package org.example.p1_single_responsability.bad;

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

    public void show(Device device) {
        String text = String.format("Name: %s, author: %s, content: %s", this.bookName, this.authorName, this.content);
        device.display(text);
    }
}
