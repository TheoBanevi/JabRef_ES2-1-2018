package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testExtensionDefinition { //TESTCLASSE
	
	
	/*
	@XmlMixed
    @XmlAnyElement(lax = true)
    protected List<Object> content;
	
	public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }
	*/
	
	@Test
	public void validateSetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		ExtensionDefinition ed = new ExtensionDefinition(); //INSTANCIA OBJ DA CLASSE
		ed.setDisplayLabel("Label"); //SET METODO
		final Field field = ed.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(ed), "Label"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		ExtensionDefinition ed = new ExtensionDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = ed.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		ed.setDisplayLabel("Label"); //SET METODO
		String resultado = ed.getDisplayLabel(); //GET DO METODO
		assertEquals(resultado, "Label"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}