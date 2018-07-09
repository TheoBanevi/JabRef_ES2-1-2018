package org.jabref.logic.importer.fileformat.mods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class NameDefinitionTest {
    @Test
    public void validateSetNameTitleGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
        NameDefinition nd = new NameDefinition(); //INSTANCIA OBJ DA CLASSE
        nd.setNameTitleGroup("NOMEGROUPTESTAR"); //SET METODO
        final Field field = nd.getClass().getDeclaredField("nameTitleGroup"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        assertEquals(field.get(nd), "NOMEGROUPTESTAR"); //COMPARAR COM O NOME SETINICIAISCLASSEO
    }


    @Test
    public void validateGetNameTitleGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
        NameDefinition nd = new NameDefinition(); //INSTANCIA OBJ DA CLASSE
        final Field field = nd.getClass().getDeclaredField("nameTitleGroup"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        nd.setNameTitleGroup("NOMEGROUPTESTAR"); //SET METODO
        String resultado = nd.getNameTitleGroup(); //GET DO METODO
        assertEquals(resultado, "NOMEGROUPTESTAR"); //COMPARAR COM O NOME OBTIDO NO GET
    }

}

