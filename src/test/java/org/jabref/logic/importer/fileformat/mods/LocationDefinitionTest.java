package org.jabref.logic.importer.fileformat.mods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class LocationDefinitionTest {

    @Test
    public void validateSetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
        LocationDefinition ld = new LocationDefinition(); //INSTANCIA OBJ DA CLASSE
        ld.setDisplayLabel("DisplayTest"); //SET METODO
        final Field field = ld.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        assertEquals(field.get(ld), "DisplayTest");
    }


    @Test
    public void validateGetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
        LocationDefinition ld = new LocationDefinition(); //INSTANCIA OBJ DA CLASSE
        final Field field = ld.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        ld.setDisplayLabel("NOMETESTAR"); //SET METODO
        String resultado = ld.getDisplayLabel(); //GET DO METODO
        assertEquals(resultado, "NOMETESTAR");
    }

}

