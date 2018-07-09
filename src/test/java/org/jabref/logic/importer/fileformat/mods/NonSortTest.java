package org.jabref.logic.importer.fileformat.mods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import org.jabref.logic.importer.fileformat.mods.NonSort;

import static org.junit.jupiter.api.Assertions.*;

class NonSortTest {
    @Test
    public void validateSetSpace() throws NoSuchFieldException, IllegalAccessException { //VALIDATEMETODO (SET)
        NonSort nst = new NonSort(); //INSTANCIA OBJ DA CLASSE
        nst.setSpace("Teste"); //SET METODO
        final Field field = nst.getClass().getDeclaredField("space"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        assertEquals(field.get(nst), "Teste"); //COMPARAR COM O NOME SETINICIAISCLASSEO
    }

    @Test
    public void validateGetSpace() throws NoSuchFieldException, IllegalAccessException { //VALIDATEMETODO (GET)
        NonSort gs = new NonSort(); //INSTANCIA OBJ DA CLASSE
        final Field field = gs.getClass().getDeclaredField("space"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        gs.setSpace("Teste"); //SET METODO
        String resultado = gs.getSpace(); //GET DO METODO
        assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
    }

}

