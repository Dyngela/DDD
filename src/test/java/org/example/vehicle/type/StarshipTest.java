package org.example.vehicle.type;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class StarshipTest {
    /**
     * Method under test: {@link Starship#fly()}
     */
    @Test
    void testFly() {
        assertFalse((new Starship()).fly());
    }
}

