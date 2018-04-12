package org.jabref.gui;

import java.util.Optional;

import org.jabref.Globals;
import org.jabref.gui.undo.NamedCompound;
import org.jabref.model.entry.BibEntry;
import org.jabref.model.entry.FieldName;
import org.jabref.preferences.JabRefPreferences;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EntryMarkerTest {
    private NamedCompound dummyCompound;

    @BeforeEach
    public void init() {
        Globals.prefs = mock(JabRefPreferences.class);
        when(Globals.prefs.getWrappedUsername()).thenReturn("stfn");
        dummyCompound = mock(NamedCompound.class);
    }

    @Test
    void markEntry() {
        BibEntry unmarked = new BibEntry();
        EntryMarker.markEntry(unmarked, EntryMarker.IMPORT_MARK_LEVEL, false, dummyCompound);
        assertEquals(Optional.of("[stfn:6]"), unmarked.getField(FieldName.MARKED_INTERNAL));
    }

    @Test
    void markUser() {
        BibEntry marked = new BibEntry();
        marked.setField(FieldName.MARKED_INTERNAL, "[simon:6]");
        EntryMarker.markEntry(marked, EntryMarker.IMPORT_MARK_LEVEL, false, dummyCompound);
        assertEquals(Optional.of("[stfn:6,simon:6]"), marked.getField(FieldName.MARKED_INTERNAL));
    }

    @Test
    void unmarkEntry() {
        BibEntry marked = new BibEntry();
        marked.setField(FieldName.MARKED_INTERNAL, "[stfn:6]");
        EntryMarker.unmarkEntry(marked, false, null, dummyCompound);
        assertEquals(Optional.empty(), marked.getField(FieldName.MARKED_INTERNAL));
    }

    @Test
    void unmarkUser() {
        BibEntry marked = new BibEntry();
        marked.setField(FieldName.MARKED_INTERNAL, "[stfn:6;simon:6]");
        EntryMarker.unmarkEntry(marked, false, null, dummyCompound);
        assertEquals(Optional.of("[simon:6]"), marked.getField(FieldName.MARKED_INTERNAL));
    }

    @Test
    void isMarked() {
        BibEntry marked = new BibEntry();
        marked.setField(FieldName.MARKED_INTERNAL, "[stfn:6]");
        assertEquals(1, EntryMarker.isMarked(marked));
    }

    @Test
    void isNotMarked() {
        BibEntry marked = new BibEntry();
        marked.setField(FieldName.MARKED_INTERNAL, "[stfn:6]");
        assertEquals(1, EntryMarker.isMarked(marked));
    }
}
