package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testRegionDefinition { //TESTCLASSE
	
	@Test
	public void validateSetRegionType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		RegionDefinition id = new RegionDefinition(); //INSTANCIA OBJ DA CLASSE
		String valorAnterior = id.getRegionType();
		id.setRegionType("Teste"); //SET METODO
		String resultado = id.getRegionType(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	@Test
	public void validateGetRegionType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		RegionDefinition id = new RegionDefinition(); //INSTANCIA OBJ DA CLASSE
		id.setRegionType("Teste"); //SET METODO
		String resultado = id.getRegionType(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	

}