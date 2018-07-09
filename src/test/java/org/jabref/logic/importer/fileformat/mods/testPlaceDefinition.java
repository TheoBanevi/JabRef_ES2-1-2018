package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testPlaceDefinition { //TESTCLASSE
	
	@Test
	public void validateSetSupplied() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		PlaceDefinition id = new PlaceDefinition(); //INSTANCIA OBJ DA CLASSE
		String valorAnterior = id.getSupplied();
		id.setSupplied("Teste"); //SET METODO
		String resultado = id.getSupplied(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	@Test
	public void validateGetSupplied() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		PlaceDefinition id = new PlaceDefinition(); //INSTANCIA OBJ DA CLASSE		String valorAnterior = id.getSupplied();
		id.setSupplied("Teste"); //SET METODO
		String resultado = id.getSupplied(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	@Test
	public void validateGetSupplied2() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		PlaceDefinition id = new PlaceDefinition(); //INSTANCIA OBJ DA CLASSE		String valorAnterior = id.getSupplied();
		id.setSupplied(Null); //SET METODO
		String resultado = id.getSupplied(); //GET DO METODO
		assertEquals(resultado, "yes"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}