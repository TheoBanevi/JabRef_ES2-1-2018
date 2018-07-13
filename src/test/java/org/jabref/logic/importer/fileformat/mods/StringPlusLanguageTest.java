
package org.jabref.logic.importer.fileformat.mods;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

public class StringPlusLanguageTest { //TESTCLASSE

	@Test
	public void validateSetValue() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		StringPlusLanguage spl = new StringPlusLanguage(); //INSTANCIA OBJ DA CLASSE
		spl.setValue("ValueTest"); //SET METODO
		final Field field = spl.getClass().getDeclaredField("value"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(spl), "ValueTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetValue() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		StringPlusLanguage spl = new StringPlusLanguage(); //INSTANCIA OBJ DA CLASSE
		final Field field = spl.getClass().getDeclaredField("value"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		spl.setValue("ValueTest"); //SET METODO
		String resultado = spl.getValue(); //GET DO METODO
		assertEquals(resultado, "ValueTest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}