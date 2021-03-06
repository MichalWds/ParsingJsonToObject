package repository;


import booksapi.Books;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.IOException;

@Repository
public class BookRepository {

    public Object getBooks() {
        ClassPathResource resource = new ClassPathResource("static/books.json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(resource.getInputStream(), Books.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }




}