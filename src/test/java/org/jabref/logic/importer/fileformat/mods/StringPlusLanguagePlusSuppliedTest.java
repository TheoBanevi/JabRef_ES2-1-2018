package org.jabref.logic.importer.fileformat.mods;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class StringPlusLanguagePlusSuppliedTest { //TESTCLASSE

	@Test
	public void validateSetSupplied() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		StringPlusLanguagePlusSupplied splst = new StringPlusLanguagePlusSupplied(); //INSTANCIA OBJ DA CLASSE
		splst.setSupplied("SuppliedTest"); //SET METODO
		final Field field = splst.getClass().getDeclaredField("supplied"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(splst), "SuppliedTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetSupplied() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		StringPlusLanguagePlusSupplied splst = new StringPlusLanguagePlusSupplied(); //INSTANCIA OBJ DA CLASSE
		final Field field = splst.getClass().getDeclaredField("supplied"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		splst.setSupplied("SuppliedTest"); //SET METODO
		String resultado = splst.getSupplied(); //GET DO METODO
		assertEquals(resultado, "SuppliedTest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}