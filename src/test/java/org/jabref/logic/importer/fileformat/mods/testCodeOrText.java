package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCodeOrText {

	@Test
	public void validateValue() throws NoSuchFieldException, IllegalAccessException{
		assertEquals("code", CodeOrText.TEXT.value());
	}

}
