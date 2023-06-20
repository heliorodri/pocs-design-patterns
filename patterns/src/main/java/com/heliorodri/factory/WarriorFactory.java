package com.heliorodri.factory;

import lombok.NonNull;

import static com.heliorodri.factory.WarriorEnum.ARCHER;
import static com.heliorodri.factory.WarriorEnum.HUMAN;
import static com.heliorodri.factory.WarriorEnum.WIZARD;

public class WarriorFactory {

    public Warrior of(@NonNull String category) {
        final String upperCategory = category.toUpperCase();

        if (ARCHER.toString().equals(upperCategory))
            return new Archer();

        if (HUMAN.toString().equals(upperCategory))
            return new Human();

        if (WIZARD.toString().equals(upperCategory))
            return new Wizard();

        throw new IllegalArgumentException("Could not find warrior for the given category: " + category);
    }

}
