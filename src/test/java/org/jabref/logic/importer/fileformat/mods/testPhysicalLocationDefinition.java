package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class testPhysicalLocationDefinition { //TESTCLASSE
	
	@Test
	public void validateSetType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		PhysicalLocationDefinition id = new PhysicalLocationDefinition(); //INSTANCIA OBJ DA CLASSE
		id.setType("Teste"); //SET METODO
		final Field field = id.getClass().getDeclaredField("type");
		String resultado = id.getType(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	@Test
	public void validateGetType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		PhysicalLocationDefinition id = new PhysicalLocationDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = id.getClass().getDeclaredField("type");
		field.setAccessible(true);
		id.setType("Teste"); //SET METODO
		String resultado = id.getType(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	@Test
	public void validateGetType2() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		PhysicalLocationDefinition id = new PhysicalLocationDefinition(); //INSTANCIA OBJ DA CLASSE
		String valorAnterior = id.getType();
		id.setType(null); //SET METODO
		String resultado = id.getType(); //GET DO METODO
		assertEquals(resultado, "simple"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}