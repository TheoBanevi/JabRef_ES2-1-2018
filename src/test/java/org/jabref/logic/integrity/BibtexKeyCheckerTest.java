package org.jabref.logic.integrity;

import org.jabref.model.entry.BibEntry;
import org.jabref.model.strings.StringUtil;
import org.junit.jupiter.api.Test;


import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BibtexKeyCheckerTest {
    BibEntry entry = new BibEntry();

    @Test
    public void ValidateBibKeyChecker01() {
        BibtexKeyChecker year = new BibtexKeyChecker();
        BibEntry bentry = new BibEntry();
        List<IntegrityMessage> result = year.check(bentry);
        boolean obtido = (result.equals(Collections.emptyList()));
        assertEquals(false, obtido);
    }

    @Test
    public void ValidateBibKeyChecker02() {
        BibtexKeyChecker author = new BibtexKeyChecker();
        BibEntry bentry = new BibEntry();
        List<IntegrityMessage> result = author.check(bentry);
        boolean obtido = (result.equals(Collections.emptyList()));
        assertEquals(false, obtido);
    }

    @Test
    public void ValidateBibKeyChecker03() {
        BibtexKeyChecker title = new BibtexKeyChecker();
        BibEntry bentry = new BibEntry();
        List<IntegrityMessage> result = title.check(bentry);
        boolean obtido = (result.equals(Collections.emptyList()));
        assertEquals(true, obtido);
    }

    @Test
    public void ValidateBibKeyChecker04() {
        BibtexKeyChecker title = new BibtexKeyChecker();
        BibEntry bentry = new BibEntry();
        List<IntegrityMessage> result = title.check(bentry);
        String bibtexKey;
        boolean obtido = (result.equals(!entry.toString().equals(bibtexKey)));
        assertEquals(false, obtido);
    }

    @Test
    public void ValidateBibKeyChecker05() {
        BibtexKeyChecker title = new BibtexKeyChecker();
        BibEntry bentry = new BibEntry();
        List<IntegrityMessage> result = title.check(bentry);
        boolean obtido = (result.equals(StringUtil.isBlank(entry.getCiteKeyOptional())));
        assertEquals(false, obtido);
    }

    @Test
    public void ValidateBibKeyChecker06() {
        BibtexKeyChecker title = new BibtexKeyChecker();
        BibEntry bentry = new BibEntry();
        List<IntegrityMessage> result = title.check(bentry);
        boolean obtido = (result.equals(StringUtil.isBlank(entry.getCiteKeyOptional())));
        assertEquals(false, obtido);
    }

}
