package guru.springframework.springjokesapp.springjokesapp.controller;

import guru.springframework.springjokesapp.springjokesapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(final JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/", ""})
    public String getJoke(final Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }

}
