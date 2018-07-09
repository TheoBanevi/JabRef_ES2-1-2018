package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testHierarchicalGeographicDefinition { //TESTCLASSE
	
	/*
	protected List<JAXBElement<? extends StringPlusLanguage>> extraTerrestrialAreaOrContinentOrCountry;
    public List<JAXBElement<? extends StringPlusLanguage>> getExtraTerrestrialAreaOrContinentOrCountry() {
        if (extraTerrestrialAreaOrContinentOrCountry == null) {
            extraTerrestrialAreaOrContinentOrCountry = new ArrayList<JAXBElement<? extends StringPlusLanguage>>();
        }
        return this.extraTerrestrialAreaOrContinentOrCountry;
    }
	*/
	
	@Test
	public void validateSetAuthority() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		HierarchicalGeographicDefinition hgd = new HierarchicalGeographicDefinition(); //INSTANCIA OBJ DA CLASSE
		hgd.setAuthority("Nome"); //SET METODO
		final Field field = hgd.getClass().getDeclaredField("authority"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(hgd), "Nome"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetAuthority() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		HierarchicalGeographicDefinition hgd = new HierarchicalGeographicDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = hgd.getClass().getDeclaredField("authority"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		hgd.setAuthority("Nome"); //SET METODO
		String resultado = hgd.getAuthority(); //GET DO METODO
		assertEquals(resultado, "Nome"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetAuthorityURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		HierarchicalGeographicDefinition hgd = new HierarchicalGeographicDefinition(); //INSTANCIA OBJ DA CLASSE
		hgd.setAuthorityURI("Nome"); //SET METODO
		final Field field = hgd.getClass().getDeclaredField("authorityURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(hgd), "Nome"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetAuthorityURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		HierarchicalGeographicDefinition hgd = new HierarchicalGeographicDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = hgd.getClass().getDeclaredField("authorityURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		hgd.setAuthorityURI("Nome"); //SET METODO
		String resultado = hgd.getAuthorityURI(); //GET DO METODO
		assertEquals(resultado, "Nome"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		HierarchicalGeographicDefinition hgd = new HierarchicalGeographicDefinition(); //INSTANCIA OBJ DA CLASSE
		hgd.setValueURI("Valor"); //SET METODO
		final Field field = hgd.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(hgd), "Valor"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		HierarchicalGeographicDefinition hgd = new HierarchicalGeographicDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = hgd.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		hgd.setValueURI("Valor"); //SET METODO
		String resultado = hgd.getValueURI(); //GET DO METODO
		assertEquals(resultado, "Valor"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}