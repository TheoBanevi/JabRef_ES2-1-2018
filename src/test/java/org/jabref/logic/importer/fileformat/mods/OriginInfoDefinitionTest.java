package org.jabref.logic.importer.fileformat.mods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class OriginInfoDefinitionTest {
    @Test
    public void validateSETMETODO() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
        OriginInfoDefinition oid = new OriginInfoDefinition(); //INSTANCIA OBJ DA CLASSE
        oid.setEventType("eventTypeTest"); //SET METODO
        final Field field = oid.getClass().getDeclaredField("eventType"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        assertEquals(field.get(oid), "eventTypeTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
    }


    @Test
    public void validateGETMETODO() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
        OriginInfoDefinition oid = new OriginInfoDefinition(); //INSTANCIA OBJ DA CLASSE
        final Field field = oid.getClass().getDeclaredField("eventType"); //NOME DO ATRIBUTO
        field.setAccessible(true);
        oid.setEventType("eventTypeTest"); //SET METODO
        String resultado = oid.getEventType(); //GET DO METODO
        assertEquals(resultado, "eventTypeTest"); //COMPARAR COM O NOME OBTIDO NO GET
    }

}


