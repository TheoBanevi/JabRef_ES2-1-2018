package org.jabref.logic.importer.fileformat.mods;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class TitleInfoDefinitionTest { //TESTCLASSE

	@Test
	public void validateSetSupplied() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		TitleInfoDefinition tid = new TitleInfoDefinition(); //INSTANCIA OBJ DA CLASSE
		tid.setSupplied("SuppliedTest"); //SET METODO
		final Field field = tid.getClass().getDeclaredField("supplied"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(tid), "SuppliedTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetSupplied() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		TitleInfoDefinition tid = new TitleInfoDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = tid.getClass().getDeclaredField("supplied"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		tid.setSupplied("SuppliedTest"); //SET METODO
		String resultado = tid.getSupplied(); //GET DO METODO
		assertEquals(resultado, "SuppliedTest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}