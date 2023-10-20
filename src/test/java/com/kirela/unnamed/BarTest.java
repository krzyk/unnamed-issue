package com.kirela.unnamed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BarTest {
    @Test
    void returnsFive() {
        Assertions.assertEquals(123, Bar.parse("123"));
    }
}
