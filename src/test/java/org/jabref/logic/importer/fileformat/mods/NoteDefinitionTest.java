package org.jabref.logic.importer.fileformat.mods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class NoteDefinitionTest {
    @Test
    public void validateSetAtType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
        NoteDefinition sat = new NoteDefinition(); //INSTANCIA OBJ DA CLASSE
        sat.setAtType("Teste"); //SET METODO
        final Field field = sat.getClass().getDeclaredField("atType"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        assertEquals(field.get(sat), "Teste"); //COMPARAR COM O NOME SETINICIAISCLASSEO
    }


    @Test
    public void validateGETMETODO() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
        NoteDefinition sat = new NoteDefinition(); //INSTANCIA OBJ DA CLASSE
        final Field field = sat.getClass().getDeclaredField("atType"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        sat.setAtType("Teste"); //SET METODO
        String resultado = sat.getAtType(); //GET DO METODO
        assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
    }

}

