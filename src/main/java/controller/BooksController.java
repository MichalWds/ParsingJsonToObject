package controller;

import booksapi.Books;
import booksapi.IndustryIdentifiersItem;
import booksapi.ItemsItem;
import booksapi.RunBooksDemo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import repository.BookRepository;

import java.io.IOException;
import java.util.List;

@RequestMapping("/api")
@RestController
public class BooksController extends RunBooksDemo {

    BookRepository bookRepository = new BookRepository();

    @GetMapping(path = ("/books"), produces = MediaType.APPLICATION_JSON_VALUE)
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

    @GetMapping(path=("/books/{identifier}"), produces = MediaType.APPLICATION_JSON_VALUE)
    public Long  getIdentifier (@PathVariable Long identifier) {

        //toDO DOESN'T WORK YET

        ItemsItem itemsItem = new ItemsItem();
        IndustryIdentifiersItem industryIdentifiersItem = new IndustryIdentifiersItem();
        if (identifier== industryIdentifiersItem.getIdentifier()) {
            return industryIdentifiersItem.getIdentifier();
        }
        return  identifier;
    }

    //toDO DOESN'T WORK YET

    @GetMapping(value = "/categories/{category}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> idCategories(@PathVariable String category, ModelMap modelMap){
        ItemsItem itemsItem = new ItemsItem();
        modelMap.put(category, itemsItem.getVolumeInfo().getCategories());

        return itemsItem.getVolumeInfo().getCategories();
    }






    }



