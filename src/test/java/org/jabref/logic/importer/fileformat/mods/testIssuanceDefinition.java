package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;


class testIssuanceDefinition { //TESTCLASSE
	
	@Test
	public void validateValue() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		assertEquals("serial",IssuanceDefinition.SERIAL.value());
	}

}