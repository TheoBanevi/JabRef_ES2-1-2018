package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testPublisherDefinition { //TESTCLASSE
	
	@Test
	public void validateSetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		PublisherDefinition id = new PublisherDefinition(); //INSTANCIA OBJ DA CLASSE
		String valorAnterior = id.getValueURI();
		id.setValueURI("Teste"); //SET METODO
		String resultado = id.getValueURI(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	@Test
	public void validateGetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		PublisherDefinition id = new PublisherDefinition(); //INSTANCIA OBJ DA CLASSE
		id.setValueURI("Teste"); //SET METODO
		String resultado = id.getValueURI(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	

}