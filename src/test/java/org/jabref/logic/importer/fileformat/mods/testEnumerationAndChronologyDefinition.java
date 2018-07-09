package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testEnumerationAndChronologyDefinition { //TESTCLASSE
	
	@Test
	public void validateSetUnitType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		EnumerationAndChronologyDefinition eacd = new EnumerationAndChronologyDefinition(); //INSTANCIA OBJ DA CLASSE
		eacd.setUnitType("Unit"); //SET METODO
		final Field field = eacd.getClass().getDeclaredField("unitType"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(eacd), "Unit"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetUnitType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		EnumerationAndChronologyDefinition eacd = new EnumerationAndChronologyDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = eacd.getClass().getDeclaredField("unitType"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		eacd.setUnitType("Unit"); //SET METODO
		String resultado = eacd.getUnitType(); //GET DO METODO
		assertEquals(resultado, "Unit"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}