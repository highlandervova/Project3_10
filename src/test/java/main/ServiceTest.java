package main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {
    Service s;

    @Before
    public void before() {
        s = new Service();
    }

    @Test
    public void toUpperCaseTest () {
        assertEquals("ALEX", s.toUpperCase("Alex"));
        assertNull(s.toUpperCase(null));
        System.out.println("upperSuccess");
    }

    @Test
    public void toLowerCaseTest () {
        assertEquals("alex", s.toLowerCase("Alex"));
        assertEquals("", s.toLowerCase(""));
        assertNull(s.toLowerCase(null));
        System.out.println("lowerSuccess");
    }
}
