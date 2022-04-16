package com.example.pocketmonsterpersonalproject.Pokemon;

public enum PokemonType {
    NORMAL,
    FIRE,
    WATER,
    ELECTRIC,
    GRASS,
    ICE,
    FIGHTING,
    POISON,
    GROUND,
    FLYING,
    PSYCHIC,
    BUG,
    ROCK,
    GHOST,
    DRAGON,
    DARK,
    STEEL,
    FAIRY;

    // normal defends, .this attacks
    double compare_NORMAL() {
        switch(this) {
            // 0.0 output - no effect
            case GHOST: return 0.0;

            // 0.5 output - not very effective

            // 2.0 output - super effective
            case FIGHTING: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // fire defends, .this attacks
    double compare_FIRE() {
        switch(this) {
            // 0.0 output - no effect

            // 0.5 output - not very effective
            case FIRE: case GRASS: case ICE: case BUG: case STEEL: case FAIRY: return 0.5;

            // 2.0 output - super effective
            case WATER: case GROUND: case ROCK: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // water defends, .this attacks
    double compare_WATER() {
        switch(this) {
            // 0.0 output - no effect

            // 0.5 output - not very effective
            case FIRE: case WATER: case ICE: case STEEL: return 0.5;

            // 2.0 output - super effective
            case ELECTRIC: case GRASS: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // electric defends, .this attacks
    double compare_ELECTRIC() {
        switch(this) {
            // 0.0 output - no effect

            // 0.5 output - not very effective
            case ELECTRIC: case FLYING: case STEEL: return 0.5;

            // 2.0 output - super effective
            case GROUND: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // grass defends, .this attacks
    double compare_GRASS() {
        switch(this) {
            // 0.0 output - no effect

            // 0.5 output - not very effective
            case WATER: case ELECTRIC: case GRASS: case GROUND: return 0.5;

            // 2.0 output - super effective
            case FIRE: case ICE: case POISON: case FLYING: case BUG: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // ice defends, .this attacks
    double compare_ICE() {
        switch(this) {
            // 0.0 output - no effect

            // 0.5 output - not very effective
            case ICE: return 0.5;

            // 2.0 output - super effective
            case FIRE: case FIGHTING: case ROCK: case STEEL: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // fighting defends, .this attacks
    double compare_FIGHTING() {
        switch(this) {
            // 0.0 output - no effect

            // 0.5 output - not very effective
            case BUG: case ROCK: case DARK: return 0.5;

            // 2.0 output - super effective
            case FLYING: case PSYCHIC: case FAIRY: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // poison defends, .this attacks
    double compare_POISON() {
        switch(this) {
            // 0.0 output - no effect

            // 0.5 output - not very effective
            case GRASS: case FIGHTING: case POISON: case BUG: case FAIRY: return 0.5;

            // 2.0 output - super effective
            case GROUND: case PSYCHIC: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // ground defends, .this attacks
    double compare_GROUND() {
        switch(this) {
            // 0.0 output - no effect
            case ELECTRIC: return 0.0;

            // 0.5 output - not very effective
            case POISON: case ROCK: return 0.5;

            // 2.0 output - super effective
            case WATER: case GRASS: case ICE: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // flying defends, .this attacks
    double compare_FLYING() {
        switch(this) {
            // 0.0 output - no effect
            case GROUND: return 0.0;

            // 0.5 output - not very effective
            case GRASS: case FIGHTING: case BUG: return 0.5;

            // 2.0 output - super effective
            case ELECTRIC: case ICE: case ROCK: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // psychic defends, .this attacks
    double compare_PSYCHIC() {
        switch(this) {
            // 0.0 output - no effect

            // 0.5 output - not very effective
            case FIGHTING: case PSYCHIC: return 0.5;

            // 2.0 output - super effective
            case BUG: case GHOST: case DARK: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // bug defends, .this attacks
    double compare_BUG() {
        switch(this) {
            // 0.0 output - no effect

            // 0.5 output - not very effective
            case GRASS: case FIGHTING: case GROUND: return 0.5;

            // 2.0 output - super effective
            case FIRE: case FLYING: case ROCK: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // rock defends, .this attacks
    double compare_ROCK() {
        switch(this) {
            // 0.0 output - no effect

            // 0.5 output - not very effective
            case NORMAL: case FIRE: case POISON: case FLYING: return 0.5;

            // 2.0 output - super effective
            case WATER: case GRASS: case FIGHTING: case GROUND: case STEEL: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // ghost defends, .this attacks
    double compare_GHOST() {
        switch(this) {
            // 0.0 output - no effect
            case NORMAL: case FIGHTING: return 0.0;

            // 0.5 output - not very effective
            case POISON: case BUG: return 0.5;

            // 2.0 output - super effective
            case GHOST: case DARK: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // dragon defends, .this attacks
    double compare_DRAGON() {
        switch(this) {
            // 0.0 output - no effect

            // 0.5 output - not very effective
            case FIRE: case WATER: case ELECTRIC: case GRASS: return 0.5;

            // 2.0 output - super effective
            case ICE: case DRAGON: case FAIRY: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // dark defends, .this attacks
    double compare_DARK() {
        switch(this) {
            // 0.0 output - no effect
            case PSYCHIC: return 0.0;

            // 0.5 output - not very effective
            case GHOST: case DARK: return 0.5;

            // 2.0 output - super effective
            case FIGHTING: case BUG: case FAIRY: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // steel defends, .this attacks
    double compare_STEEL() {
        switch(this) {
            // 0.0 output - no effect
            case POISON: return 0.0;

            // 0.5 output - not very effective
            case NORMAL: case GRASS: case ICE: case FLYING: case PSYCHIC: case BUG: case ROCK: case DRAGON: case STEEL: case FAIRY: return 0.5;

            // 2.0 output - super effective
            case FIRE: case FIGHTING: case GROUND: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }

    // fairy defends, .this attacks
    double compare_FAIRY() {
        switch(this) {
            // 0.0 output - no effect
            case DRAGON: return 0.0;

            // 0.5 output - not very effective
            case FIGHTING: case BUG: case DARK: return 0.5;

            // 2.0 output - super effective
            case POISON: case STEEL: return 2.0;

            // 1.0 output - normal
            default: return 1.0;
        }
    }
}