package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testHoldingSimpleDefinition { //TESTCLASSE
	
	@Test
	public void validateGetCopyInformation() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		HoldingSimpleDefinition hsd = new HoldingSimpleDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = hsd.getClass().getDeclaredField("NAMEATRIBUTO"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		List<CopyInformationDefinition> resultado = hsd.getCopyInformation(); //GET DO METODO
		List<CopyInformationDefinition> esperado = new ArrayList<CopyInformationDefinition>();
		assertEquals(resultado, esperado); //COMPARAR COM A LISTA OBTIDA NO GET
	}

}