package org.jabref.logic.importer.fileformat.mods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModsCollectionDefinitionTest {

    @Test
    public void validateGetMods() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
        ModsCollectionDefinition mcd = new ModsCollectionDefinition(); //INSTANCIA OBJ DA CLASSE
        final Field field = mcd.getClass().getDeclaredField("mods"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        List<ModsDefinition> resultado = mcd.getMods(); //GET DO METODO
        assertEquals(resultado, "TestMods"); //COMPARAR COM O NOME OBTIDO NO GET
    }

}

