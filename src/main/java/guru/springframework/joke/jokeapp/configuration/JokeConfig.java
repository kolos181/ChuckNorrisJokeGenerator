package guru.springframework.joke.jokeapp.configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JokeConfig {

    @Bean
    ChuckNorrisQuotes quote(){
        return new ChuckNorrisQuotes();
    }
}
