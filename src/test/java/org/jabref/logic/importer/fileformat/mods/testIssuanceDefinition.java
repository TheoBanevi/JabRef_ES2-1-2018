package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testIssuanceDefinition { //TESTCLASSE
	
	@Test
	public void validateValue() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		IssuanceDefinition id = new IssuanceDefinition("Definicao"); //INSTANCIA OBJ DA CLASSE
		final Field field = id.getClass().getDeclaredField("value"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		String resultado = id.value(); //GET DO METODO
		assertEquals(resultado, "Definicao"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}