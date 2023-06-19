package com.heliorodri.singleton;

import java.util.Random;

public class Database {

    private int connectionId;

    public Database() {
        connect();
    }

    private void connect() {
        this.connectionId = new Random().nextInt(10) + 1;
    }

    public int getConnectionId() {
        return connectionId;
    }
}
