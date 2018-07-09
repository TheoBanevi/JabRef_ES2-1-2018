package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testItemIdentifierDefinition { //TESTCLASSE
	
	@Test
	public void validateSetType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		ItemIdentifierDefinition iid = new ItemIdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		iid.setType("Tipo"); //SET METODO
		final Field field = iid.getClass().getDeclaredField("type"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(iid), "Tipo"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		ItemIdentifierDefinition iid = new ItemIdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = iid.getClass().getDeclaredField("type"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		iid.setType("Tipo"); //SET METODO
		String resultado = iid.getType(); //GET DO METODO
		assertEquals(resultado, "Tipo"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}