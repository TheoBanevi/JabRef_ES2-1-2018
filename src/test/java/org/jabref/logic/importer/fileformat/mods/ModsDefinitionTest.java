package org.jabref.logic.importer.fileformat.mods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class ModsDefinitionTest {
    @Test
    public void validateSetVersion() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
        ModsDefinition md = new ModsDefinition(); //INSTANCIA OBJ DA CLASSE
        md.setVersion("VersionTest"); //SET METODO
        final Field field = md.getClass().getDeclaredField("version"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        assertEquals(field.get(md), "VersionTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
    }


    @Test
    public void validateGetVersion() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
        ModsDefinition md = new ModsDefinition(); //INSTANCIA OBJ DA CLASSE
        final Field field = md.getClass().getDeclaredField("version"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        md.setVersion("VersionTest"); //SET METODO
        String resultado = md.getVersion(); //GET DO METODO
        assertEquals(resultado, "VersionTest"); //COMPARAR COM O NOME OBTIDO NO GET
    }

}

