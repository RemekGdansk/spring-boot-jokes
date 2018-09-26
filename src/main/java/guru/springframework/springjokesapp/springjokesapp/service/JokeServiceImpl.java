package guru.springframework.springjokesapp.springjokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes repository;

    public JokeServiceImpl() {
        this.repository = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return repository.getRandomQuote();
    }

}
