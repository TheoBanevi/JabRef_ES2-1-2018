package org.jabref.logic.importer.fileformat.mods;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class TextTest { //TESTCLASSE

	@Test
	public void validateSetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		Text t = new Text(); //INSTANCIA OBJ DA CLASSE
		t.setDisplayLabel("DisplayLabelTest"); //SET METODO
		final Field field = t.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(t), "DisplayLabelTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		Text t = new Text(); //INSTANCIA OBJ DA CLASSE
		final Field field = t.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		t.setDisplayLabel("DisplayLabelTest"); //SET METODO
		String resultado = t.getDisplayLabel(); //GET DO METODO
		assertEquals(resultado, "DisplayLabelTest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}