package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testRecordIdentifierDefinition { //TESTCLASSE
	
	@Test
	public void validateSetSource() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		RecordIdentifierDefinition id = new RecordIdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		String valorAnterior = id.getSource();
		id.setSource("Teste"); //SET METODO
		String resultado = id.getSource(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	@Test
	public void validateGetSource() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		RecordIdentifierDefinition id = new RecordIdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		id.setSource("Teste"); //SET METODO
		String resultado = id.getSource(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	

}