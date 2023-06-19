package com.heliorodri.singleton;

import java.util.Objects;
import java.util.Random;

public class DatabaseSingleton {

    private static DatabaseSingleton instance;
    private static int connectionId;

    private DatabaseSingleton() {
        connect();
    }

    public static DatabaseSingleton getDatabaseInstance() {
        return Objects.nonNull(instance) ? instance : new DatabaseSingleton();
    }

    public int getConnectionId() {
        return connectionId;
    }

    private void connect() {
        connectionId = new Random().nextInt(10) + 1;
    }

}
