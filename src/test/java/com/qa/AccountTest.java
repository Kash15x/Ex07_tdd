package com.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account act;

    @BeforeEach
    void setUp() {
        act = new Account(new String[]{"Link","Visa"},
                                      "10-10-22","15081995","1234");
    }

    @DisplayName("Match Accounts")
    @Test
    void compareTo() {

        Account inputObject = new Account(new String[]{"Link"},
                                              "10-10-22","15081995","1234");
        assertEquals(0, act.compareTo(inputObject), "Login Failed");
    }
}