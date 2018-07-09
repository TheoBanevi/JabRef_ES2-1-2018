package org.jabref.logic.importer.fileformat.mods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class LanguageTermDefinitionTest {
    @Test
    public void validateSetAuthorityURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
        LanguageTermDefinition ltd = new LanguageTermDefinition(); //INSTANCIA OBJ DA CLASSE
        ltd.setAuthorityURI("ValorURITest"); //SET METODO
        final Field field = ltd.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        assertEquals(field.get(ltd), "ValorURITest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
    }


    @Test
    public void validateGetAuthorityURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
        LanguageTermDefinition ltd = new LanguageTermDefinition(); //INSTANCIA OBJ DA CLASSE
        final Field field = ltd.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        ltd.setAuthorityURI("ValorURITest"); //SET METODO
        String resultado = ltd.getAuthorityURI(); //GET DO METODO
        assertEquals(resultado, "ValorURITest"); //COMPARAR COM O NOME OBTIDO NO GET
    }

}

