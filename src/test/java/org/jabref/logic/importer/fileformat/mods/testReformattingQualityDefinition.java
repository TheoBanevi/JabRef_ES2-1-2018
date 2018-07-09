package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testReformattingQualityDefinition {

	@Test
	public void validateValue() throws NoSuchFieldException, IllegalAccessException{
		assertEquals("code", ReformattingQualityDefinition.TEXT.value());
	}
	

}