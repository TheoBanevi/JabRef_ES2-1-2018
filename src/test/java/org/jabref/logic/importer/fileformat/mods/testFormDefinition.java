package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testFormDefinition { //TESTCLASSE
	
	@Test
	public void validateSetType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		FormDefinition fd = new FormDefinition(); //INSTANCIA OBJ DA CLASSE
		fd.setType("Tipo"); //SET METODO
		final Field field = fd.getClass().getDeclaredField("type"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(fd), "Tipo"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		FormDefinition fd = new FormDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = fd.getClass().getDeclaredField("type"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		fd.setType("Tipo"); //SET METODO
		String resultado = fd.getType(); //GET DO METODO
		assertEquals(resultado, "Tipo"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}