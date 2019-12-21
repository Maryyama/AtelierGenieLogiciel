package mayaagl.enset.calcul;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculMetierTest  extends TestCase{
	private CalculMetier metier;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		metier= new CalculMetier();
	}

	@Test
	public void testSomme() {
		assertTrue(metier.somme(9, 10)==19);
		
	}
	public void testProduit() {
		assertTrue(metier.produit(9, 10)==90);
	}

}
