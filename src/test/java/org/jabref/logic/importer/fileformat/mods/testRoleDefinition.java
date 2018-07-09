package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testRoleDefinition { //TESTCLASSE
	
	@Test
	public void validateGetRoleTerm() throws NoSuchFieldException, IllegalAccessException{ 
		RoleDefinition id = new RoleDefinition(); //INSTANCIA OBJ DA CLASSE
		List<RoleTermDefinition> resultado = id.getRoleTerm(); //GET DO METODO
		assertNotEquals(resultado, Null); //COMPARAR COM O NOME OBTIDO NO GET
	}
	

}