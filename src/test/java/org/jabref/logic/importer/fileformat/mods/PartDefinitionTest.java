package org.jabref.logic.importer.fileformat.mods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class PartDefinitionTest {

    public void validateSETMETODO() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
        PartDefinition pd = new PartDefinition(); //INSTANCIA OBJ DA CLASSE
        pd.setID("IDTeste"); //SET METODO
        final Field field = pd.getClass().getDeclaredField("id"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        assertEquals(field.get(pd), "IDTeste"); //COMPARAR COM O NOME SETINICIAISCLASSEO
    }


    @Test
    public void validateGETMETODO() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
        PartDefinition pd = new PartDefinition(); //INSTANCIA OBJ DA CLASSE
        final Field field = pd.getClass().getDeclaredField("id"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        pd.setID("IDTeste"); //SET METODO
        String resultado = pd.getID(); //GET DO METODO
        assertEquals(resultado, "IDTeste"); //COMPARAR COM O NOME OBTIDO NO GET
    }

}

}
