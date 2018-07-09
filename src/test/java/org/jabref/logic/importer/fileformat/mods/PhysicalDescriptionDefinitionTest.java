package org.jabref.logic.importer.fileformat.mods;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class PhysicalDescriptionDefinitionTest {

    @Test
    public void validateSetsetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{
            PhysicalDescriptionDefinition pdd = new PhysicalDescriptionDefinition(); //INSTANCIA OBJ DA CLASSE
            pdd.setAltRepGroup("Valor do atlang");
            final Field field = pdd.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
            field.setAccessible(true);
            assertEquals(field.get(pdd), "Teste");
        }


        @Test
        public void validateGetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
            PhysicalDescriptionDefinition pdd = new PhysicalDescriptionDefinition(); //INSTANCIA OBJ DA CLASSE
            final Field field = pdd.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
            field.setAccessible(true);
            pdd.setAltRepGroup("Teste"); //SET METODO
            String resultado = pdd.getAltRepGroup(); //GET DO METODO
            assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
        }

    }

