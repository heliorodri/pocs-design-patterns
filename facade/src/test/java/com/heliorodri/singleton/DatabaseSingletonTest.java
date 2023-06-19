package com.heliorodri.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DatabaseSingletonTest {

    @Test
    void itShouldCreateDatabase() {
        DatabaseSingleton db = DatabaseSingleton.getDatabaseInstance();
        assertNotNull(db);
    }

    @Test
    void itShouldGetAlreadyCreatedDatabaseInstance() {
        DatabaseSingleton db = DatabaseSingleton.getDatabaseInstance();
        DatabaseSingleton secondDb = DatabaseSingleton.getDatabaseInstance();

        assertEquals(db.getConnectionId(), secondDb.getConnectionId());
    }

    @Test
    void getConnectionId() {
        final int connectionId = DatabaseSingleton.getDatabaseInstance().getConnectionId();
        assertTrue(connectionId >= 1 && connectionId <= 10);
    }
}