package com.zuehlke.learningspringboot.Controllers;

import com.zuehlke.learningspringboot.Services.QuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private final QuotesService quotesService;

    public JokesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @GetMapping("")
    public String getJokes(Model model){
        model.addAttribute("joke", this.quotesService.getRandomQuote());
        return "jokes/index";
    }

}
