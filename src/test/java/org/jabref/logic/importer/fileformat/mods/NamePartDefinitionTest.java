package org.jabref.logic.importer.fileformat.mods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class NamePartDefinitionTest {
    @Test
    public void validateSetAtType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
        NamePartDefinition npd = new NamePartDefinition(); //INSTANCIA OBJ DA CLASSE
        npd.setAtType("NOMETESTAR"); //SET METODO
        final Field field = npd.getClass().getDeclaredField("atType"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        assertEquals(field.get(npd), "NOMETESTAR"); //COMPARAR COM O NOME SETINICIAISCLASSEO
    }


    @Test
    public void validateGetAtType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
        NamePartDefinition npd = new NamePartDefinition(); //INSTANCIA OBJ DA CLASSE
        final Field field = npd.getClass().getDeclaredField("atType"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        npd.setAtType("NOMETESTAR"); //SET METODO
        String resultado = npd.getAtType(); //GET DO METODO
        assertEquals(resultado, "NOMETESTAR"); //COMPARAR COM O NOME OBTIDO NO GET
    }

}


