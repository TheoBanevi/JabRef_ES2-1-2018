package org.jabref.logic.importer.fileformat.mods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class LanguageDefinitionTest {
    @Test
    public void validateSetUsage() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
        LanguageDefinition ld = new LanguageDefinition(); //INSTANCIA OBJ DA CLASSE
        ld.setUsage("UsageTest"); //SET METODO
        final Field field = ld.getClass().getDeclaredField("usage"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        assertEquals(field.get(ld), "UsageTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
    }


    @Test
    public void validateGetUsage() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
        LanguageDefinition ld = new LanguageDefinition(); //INSTANCIA OBJ DA CLASSE
        final Field field = ld.getClass().getDeclaredField("usage"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        ld.setUsage("UsageTest"); //SET METODO
        String resultado = ld.getUsage(); //GET DO METODO
        assertEquals(resultado, "UsageTest"); //COMPARAR COM O NOME OBTIDO NO GET
    }

}
