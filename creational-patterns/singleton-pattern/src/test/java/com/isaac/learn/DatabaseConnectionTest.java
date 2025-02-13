package com.isaac.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    @Test
    void testSingleConnection(){
        var connection1 = DatabaseConnection.getInstance();
        var connection2 = DatabaseConnection.getInstance();
        assertEquals(connection1, connection2);
    }

}