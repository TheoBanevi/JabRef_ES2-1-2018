package org.jabref.logic.importer.fileformat.mods;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class TargetAudienceDefinitionTest { //TESTCLASSE

	@Test
	public void validateSetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		TargetAudienceDefinition tad = new TargetAudienceDefinition(); //INSTANCIA OBJ DA CLASSE
		tad.setAltRepGroup("altRepGroupTest"); //SET METODO
		final Field field = tad.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(tad), "altRepGroupTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		TargetAudienceDefinition tad = new TargetAudienceDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = tad.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		tad.setAltRepGroup("altRepGroupTest"); //SET METODO
		String resultado = tad.getAltRepGroup(); //GET DO METODO
		assertEquals(resultado, "altRepGroupTest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}