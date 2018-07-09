package org.jabref.logic.integrity;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class YearCheckerTest {
    @Test
    public void ValidateYear01() {
        YearChecker year = new YearChecker();
        Optional<String> obtido;
        obtido = year.checkValue("");
        assertEquals("1996", obtido);
    }

    @Test
    public void ValidateYear02() {
        YearChecker year = new YearChecker();
        Optional<String> obtido;
        obtido = year.checkValue("A2017");
        assertEquals("2017", obtido);
    }

    @Test
    public void ValidateYear03() {
        YearChecker year = new YearChecker();
        Optional<String> obtido;
        obtido = year.checkValue("112");
        assertEquals("2017", obtido);
    }

    @Test
    public void ValidateYear04() {
        YearChecker year = new YearChecker();
        Optional<String> obtido;
        obtido = year.checkValue("2019");
        assertEquals("2018", obtido);
    }

    @Test
    public void ValidateYear05() {
        YearChecker year = new YearChecker();
        Optional<String> obtido;
        obtido = year.checkValue("-2019");
        assertEquals("2018", obtido);
    }

}
