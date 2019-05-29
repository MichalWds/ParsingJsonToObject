package controller;

import booksapi.ItemsItem;
import booksapi.RunBooks;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@RequestMapping("/api")
@Controller
public class BooksController {

//    ItemsItem itemsItem;
//    RunBooks runBooks;
//
//    @ResponseBody
//    @GetMapping("/id/")
//    public String book (@PathVariable String id){
//        itemsItem.getId(id);
//        return id;
//    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Object getBeers() {
        ClassPathResource resource = new ClassPathResource("static/books.json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(resource.getInputStream(), Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "static/books.json";
    }

}



