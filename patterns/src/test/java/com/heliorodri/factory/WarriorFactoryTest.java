package com.heliorodri.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WarriorFactoryTest {

    @Test
    void itShouldCreateHumanWarriorSuccessfully() {
        final String expected = "Sword attack";

        final WarriorFactory factory = new WarriorFactory();
        final Warrior warrior = factory.of("Human");

        assertNotNull(warrior);
        assertEquals(Human.class, warrior.getClass());
        assertEquals(expected, warrior.attack());
    }

    @Test
    void itShouldCreateArcherWarriorSuccessfully() {
        final String expected = "shooting arrow";

        final WarriorFactory factory = new WarriorFactory();
        final Warrior warrior = factory.of("Archer");

        assertNotNull(warrior);
        assertEquals(Archer.class, warrior.getClass());
        assertEquals(expected, warrior.attack());
    }

    @Test
    void itShouldCreateArcherWizardSuccessfully() {
        final String expected = "casting spell";

        final WarriorFactory factory = new WarriorFactory();
        final Warrior warrior = factory.of("Wizard");

        assertNotNull(warrior);
        assertEquals(Wizard.class, warrior.getClass());
        assertEquals(expected, warrior.attack());
    }

    @Test
    void itShouldThrowIllegalArgumentExceptionWhenCategoryDoesNotExist() {
        final String category = "invalid_category";
        final String expectedMessage = "Could not find warrior for the given category: " + category;

        final WarriorFactory factory = new WarriorFactory();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> factory.of(category));

        assertEquals(expectedMessage, exception.getMessage());

    }

    @Test
    void itShouldThrowIllegalArgumentExceptionWhenCategoryIsNull() {
        final WarriorFactory factory = new WarriorFactory();

        assertThrows(IllegalArgumentException.class, () -> factory.of(null));
    }
}