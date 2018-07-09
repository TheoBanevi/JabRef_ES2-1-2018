package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testRoleTermDefinition { //TESTCLASSE
	
	@Test
	public void validateSetType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		RoleTermDefinition id = new RoleTermDefinition(); //INSTANCIA OBJ DA CLASSE
		CodeOrText valorAnterior = id.getType();
		id.setType("Teste"); //SET METODO
		CodeOrText resultado = id.getType(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	@Test
	public void validateGetType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		RoleTermDefinition id = new RoleTermDefinition(); //INSTANCIA OBJ DA CLASSE
		CodeOrText valorAnterior = id.getType();
		id.setType("Teste"); //SET METODO
		CodeOrText resultado = id.getType(); //GET DO METODO
		assertEquals(resultado, "Teste"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	

}