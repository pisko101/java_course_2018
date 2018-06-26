package com.example.demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class BookTest {

    @Test
    public void CreateBookWithCreateionMethod() {
        Book book1 = Book.CreateHarryPotterOne(1);
        Book book2 = Book.CreateHarryPotterTwo(1);
        
    }
    @Test
    public void CreateBookWithConstructor() {
        Book book1 = new Book("H1",8,2); 
        Book book2 = new Book("H1",8,2);
        assertEquals(book1,book2);
    }
    
    @Test
    public void CreateBookWithBuilderPattern() {
        Book book1 = new BookBuilder()
                    .setName("H1")
                    .setPrice(8)
                    .build();
    }
}
