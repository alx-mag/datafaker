package net.datafaker.providers.movie;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class PrincessBride extends AbstractProvider<MovieProviders> {

    protected PrincessBride(MovieProviders faker) {
        super(faker);
    }

    public String character() {
        return resolve("princess_bride.characters");
    }

    public String quote() {
        return resolve("princess_bride.quotes");
    }
}
