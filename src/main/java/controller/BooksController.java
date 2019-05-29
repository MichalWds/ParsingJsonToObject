package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BooksController {

    @ResponseBody
    @GetMapping("/api")
    private String String (){
        return "ass";
    }
}
