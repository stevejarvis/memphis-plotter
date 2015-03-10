package org.nerdster.memphisplotter;

import org.junit.*;
import static org.junit.Assert.*;

public class MainTest {

    protected void setUp() {
    }

    @Test
    public void testFail() {
        System.out.println("Here running tests");
        assertFalse(false);
    }

}
