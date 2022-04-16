package com.example.pocketmonsterpersonalproject.Pokemon;

public enum PokemonGender {
    MALE,
    FEMALE
    ;

    private int compare_male() {
        switch(this) {
            // not breed-able
            case MALE: return 1;

            // breed-able pair
            case FEMALE: return 0;

            // invalid comparison
            default: return -1;
        }
    }

    private int compare_female() {
        switch(this) {
            // breed-able pair
            case MALE: return 0;

            // not breed-able
            case FEMALE: return 1;

            // invalid comparison
            default: return -1;
        }
    }
}