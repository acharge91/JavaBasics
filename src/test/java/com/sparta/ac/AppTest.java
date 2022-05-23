package com.sparta.ac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("Check that we can return good morning")
    void checkWeCanReturnGoodMorning() {
        Assertions.assertEquals("Good Morning!", App.greeting(11));
        Assertions.assertEquals("Good Morning!", App.greeting(0));
    }

    @Test
    @DisplayName("Check that we can return good afternoon")
    void checkWeCanReturnGoodAfternoon() {
        Assertions.assertEquals("Good Afternoon!", App.greeting(12));
        Assertions.assertEquals("Good Afternoon!", App.greeting(18));
    }

    @Test
    @DisplayName("Check that we can return good evening")
    void checkWeCanReturnGoodEvening() {
        Assertions.assertEquals("Good Evening", App.greeting(23));
        Assertions.assertEquals("Good Evening", App.greeting(19));
    }

    @Test
    @DisplayName("Check that a time outside of 24hr returns invalid time")
    void checkWeReturnInvalidTime() {
        Assertions.assertEquals("Invalid time", App.greeting(-1));
        Assertions.assertEquals("Invalid time", App.greeting(25));
    }
}
