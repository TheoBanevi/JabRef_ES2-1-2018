package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testRecordInfoDefinition { //TESTCLASSE
	
	@Test
	public void validateSetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		RecordInfoDefinition id = new RecordInfoDefinition(); //INSTANCIA OBJ DA CLASSE
		String valorAnterior = id.getDisplayLabel();
		id.setDisplayLabel("Teste"); //SET METODO
		String resultado = id.getDisplayLabel(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	@Test
	public void validateGetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		RecordInfoDefinition id = new RecordInfoDefinition(); //INSTANCIA OBJ DA CLASSE
		id.setDisplayLabel("Teste"); //SET METODO
		String resultado = id.getDisplayLabel(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	

}