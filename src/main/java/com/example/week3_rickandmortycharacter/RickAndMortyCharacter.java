package com.example.week3_rickandmortycharacter;

public record RickAndMortyCharacter(
        String id,
        String name,
        String status,
        String species,
        RickAndMortyLocation location,
        RickAndMortyEpisode episode


) {
}
