package org.jabref.logic.integrity;

import org.jabref.model.entry.BibEntry;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class BibtexKeyCheckerTest {


    @Test
    public void ValidateBibKeyChecker01() {
    }

    @Test
    public void ValidateBibKeyChecker02() {
        BibtexKeyChecker year = new BibtexKeyChecker();
        boolean obtido;
        obtido = year.BibtexKeyChecker("");
        assertEquals(false, obtido);
    }

    @Test
    public void ValidateBibKeyChecker02() {
        BibtexKeyChecker title = new BibtexKeyChecker();
        boolean obtido;
        obtido = title.BibtexKeyChecker("");
        assertEquals(false, obtido);
    }
}
