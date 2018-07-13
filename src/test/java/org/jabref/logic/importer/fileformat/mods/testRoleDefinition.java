package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;





class testRoleDefinition { //TESTCLASSE
	
	@Test
	public void validateGetRoleTerm() throws NoSuchFieldException, IllegalAccessException{ 
		RoleDefinition id = new RoleDefinition(); //INSTANCIA OBJ DA CLASSE
		java.util.List<RoleTermDefinition> resultado = id.getRoleTerm(); //GET DO METODO
		assertNotEquals(resultado, null); //COMPARAR COM O NOME OBTIDO NO GET
	}
	

}