package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testExtent { //TESTCLASSE
	
	@Test
	public void validateSetUnit() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		Extent ext = new Extent(); //INSTANCIA OBJ DA CLASSE
		ext.setUnit("Unidexte"); //SET METODO
		final Field field = ext.getClass().getDeclaredField("unit"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(ext), "Unidexte"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetUnit() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		Extent ext = new Extent(); //INSTANCIA OBJ DA CLASSE
		final Field field = ext.getClass().getDeclaredField("unit"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		ext.setUnit("Unidexte"); //SET METODO
		String resultado = ext.getUnit(); //GET DO METODO
		assertEquals(resultado, "Unidexte"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}