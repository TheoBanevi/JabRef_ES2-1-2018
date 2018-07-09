package org.jabref.logic.importer.fileformat.mods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class LanguageDefinitionTest {
    @Test
    public void validateSetUsage() throws NoSuchFieldException, IllegalAccessException{
        LanguageDefinition ld = new LanguageDefinition();
        ld.setUsage("UsageTest");
        final Field field = ld.getClass().getDeclaredField("usage");
        field.setAccessible(true);
        assertEquals(field.get(ld), "UsageTest");
    }


    @Test
    public void validateGetUsage() throws NoSuchFieldException, IllegalAccessException{
        LanguageDefinition ld = new LanguageDefinition();
        final Field field = ld.getClass().getDeclaredField("usage");
        field.setAccessible(true);
        ld.setUsage("UsageTest");
        String resultado = ld.getUsage();
        assertEquals(resultado, "UsageTest");
    }

}
