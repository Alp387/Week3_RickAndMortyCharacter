package com.example.week3_rickandmortycharacter;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@Service
public class RickAndMortyService {
    public RickAndMortyCharacter getRickAndMortyCharacter() {}

    private final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    RickAndMortyCharacter getRickAndMortyCharacter(){
        ResponseEntity<RickAndMortyCharacter> responseEntity = webClient
                .get()
                .uri("/characters")
                .retrieve()
                .toEntity(RickAndMortyCharacter.class)
                .block()
                ;
        return Objects.requireNonNull(responseEntity).getBody();
    }
}
