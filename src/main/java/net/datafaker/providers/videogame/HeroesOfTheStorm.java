package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.7.0
 */
public class HeroesOfTheStorm extends AbstractProvider<VideoGameProviders> {

    protected HeroesOfTheStorm(VideoGameProviders faker) {
        super(faker);
    }

    public String battleground() {
        return resolve("heroes_of_the_storm.battlegrounds");
    }

    public String heroClass() {
        return resolve("heroes_of_the_storm.classes");
    }

    public String hero() {
        return resolve("heroes_of_the_storm.heroes");
    }

    public String quote() {
        return resolve("heroes_of_the_storm.quotes");
    }

}
