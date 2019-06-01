package controller;

import booksapi.Books;
import booksapi.IndustryIdentifiersItem;
import booksapi.ItemsItem;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.appengine.repackaged.com.google.gson.JsonObject;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RequestMapping("/api")
@RestController
public class BooksController {

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
    public String getIdentifier (@PathVariable Long identifier) {
        ItemsItem itemsItem = new ItemsItem();
        IndustryIdentifiersItem industryIdentifiersItem = new IndustryIdentifiersItem();
        if (industryIdentifiersItem.getIdentifier().equals(identifier)) {

            return industryIdentifiersItem.getIdentifier();
        }
        return "user ID =  " + identifier;
    }

    @GetMapping(value = "/categories/{category}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> idCategories(@PathVariable String category, ModelMap modelMap){
        ItemsItem itemsItem = new ItemsItem();
        modelMap.put(category, itemsItem.getVolumeInfo().getCategories());
        if (itemsItem.getVolumeInfo().getIndustryIdentifiers().equals(null)){
            return null;
        }
        return itemsItem.getVolumeInfo().getCategories();
    }
}



