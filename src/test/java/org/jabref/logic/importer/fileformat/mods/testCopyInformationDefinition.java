package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class testCopyInformationDefinition {

	@Test
	public void validateSetForm() throws NoSuchFieldException, IllegalAccessException{
		FormDefinition formTest = new FormDefinition();
		formTest.setType("Testando");
		CopyInformationDefinition cid = new CopyInformationDefinition();
		cid.setForm(formTest);
		final Field field = cid.getClass().getDeclaredField("form");
		field.setAccessible(true);
		assertEquals(field.get(cid), formTest);
	}
	
	@Test
	public void validateGetForm() throws NoSuchFieldException, IllegalAccessException{
		CopyInformationDefinition cid = new CopyInformationDefinition();
		final Field field = cid.getClass().getDeclaredField("form");
		field.setAccessible(true);
		FormDefinition formTest = new FormDefinition();
		formTest.setType("Testando");
		cid.setForm(formTest);
		FormDefinition resultado = cid.getForm();
		assertEquals(resultado, formTest);
	}


}
