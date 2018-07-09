package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

class ObjectFactoryTest {

    public void validateSETMETODO() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
        NOMEDACLASSE INICIAISCLASSE = new NOMEDACLASSE(); //INSTANCIA OBJ DA CLASSE
        INICIAISCLASSE.SETMETODO("NOMETESTAR"); //SET METODO
        final Field field = INICIAISCLASSE.getClass().getDeclaredField("NAMEATRIBUTO"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        assertEquals(field.get(INICIAISCLASSE), "NOMETESTAR"); //COMPARAR COM O NOME SETINICIAISCLASSEO
    }


    @Test
    public void validateGETMETODO() throws NoSuchFieldException, IllegalAccessException { //VALIDATEMETODO (GET)
        NOMEDACLASSE INICIAISCLASSE = new NOMEDACLASSE(); //INSTANCIA OBJ DA CLASSE
        final Field field = INICIAISCLASSE.getClass().getDeclaredField("NAMEATRIBUTO"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        INICIAISCLASSE.SETMETODO("NOMETESTAR"); //SET METODO
        String resultado = INICIAISCLASSE.GETMETODO(); //GET DO METODO
        assertEquals(resultado, "NOMETESTAR"); //COMPARAR COM O NOME OBTIDO NO GET
    }
}
