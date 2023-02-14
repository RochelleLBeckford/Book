package com.rochelle.books.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

// to make this a controller need the @Controller anotation
@Controller
public class MainController {
    //CRUD -> create, read, update, delete

    //& CREATE &
    /* 
    ? want to create a book -> need 2 routes 
    -> one for the submission 
    -> one for the redirect  
    */
    @RequestMapping("/books/new") 
    public String newBook(){
        return "new.jsp";
    } 

    // @RequestMapping(value = "/books", method=RequestMethod.POST)
    // public String createBook() {
    //     return "redirect:/";
    // }
    //? Can change from RequestMapping to PostMapping which is a shorter method -> less to rememeber
    // it is the same as the above
    @PostMapping(value = "/books")
    public String createBook(
        //~ when go to form and fill out book, how to access data
        // -> now have access to this data coming into my form
        @RequestParam("title") String title,
        @RequestParam("author") String author,
        @RequestParam("pages") Integer pages,
        @RequestParam("description") String description,
        HttpSession session
    ) {
        System.out.println(title);
        //~ now want to add session 
            // -> import HttpSession
            // -> then set session to all attributes -> session.setAttributes
        session.setAttribute("title", title);
        session.setAttribute("author", author);
        session.setAttribute("pages", pages);
        session.setAttribute("description", description);
        return "redirect:/";
    }


    
    //? For read -> read one and read all 
    //& READ ALL & 
    // -> usually root of app is the read all 
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }


    //& READ ONE & 
    
    
    //& UPDATE & 
    
    
    //& DELETE & 

}
