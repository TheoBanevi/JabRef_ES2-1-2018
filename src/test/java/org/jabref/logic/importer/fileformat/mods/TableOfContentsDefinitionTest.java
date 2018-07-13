package org.jabref.logic.importer.fileformat.mods;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class TableOfContentsDefinitionTest { //TESTCLASSE

	@Test
	public void validateSetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		TableOfContentsDefinition tocd = new TableOfContentsDefinition(); //INSTANCIA OBJ DA CLASSE
		tocd.setAltRepGroup("altRepGroupTest"); //SET METODO
		final Field field = tocd.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(tocd), "altRepGroupTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		TableOfContentsDefinition tocd = new TableOfContentsDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = tocd.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		tocd.setAltRepGroup("altRepGroupTest"); //SET METODO
		String resultado = tocd.getAltRepGroup(); //GET DO METODO
		assertEquals(resultado, "altRepGroupTest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}