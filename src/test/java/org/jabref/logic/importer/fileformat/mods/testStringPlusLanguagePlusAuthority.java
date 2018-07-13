package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;


class testStringPlusLanguagePlusAuthority { //TESTCLASSE

	@Test
	public void validateSetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		StringPlusLanguagePlusAuthority splpa = new StringPlusLanguagePlusAuthority(); //INSTANCIA OBJ DA CLASSE
		splpa.setValueURI("ValueURITest"); //SET METODO
		final Field field = splpa.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(splpa), "ValueURITest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		StringPlusLanguagePlusAuthority spl = new StringPlusLanguagePlusAuthority(); //INSTANCIA OBJ DA CLASSE
		final Field field = spl.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		spl.setValueURI("ValueURITest"); //SET METODO
		String resultado = spl.getValueURI(); //GET DO METODO
		assertEquals(resultado, "ValueURITest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}