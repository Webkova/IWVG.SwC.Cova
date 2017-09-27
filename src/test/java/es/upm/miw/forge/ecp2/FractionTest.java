package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.forge.ecp2.Fraction;

public class FractionTest {
	private Fraction f, f1;
	
    @Before
    public void before() {
        f = new Fraction(1, 2);
        f1 = new Fraction(1, 1);
    }
    
    @Test
    public void testMenor() {
        assert(f.menor(f1));
    }
    
    @Test
    public void testMayor() {
        assert(f.mayor(f1));
    }
    
    @Test
    public void testMultiplicar() {
    	Fraction aux = new Fraction(5,7);
    	this.f.multiplicar(aux);
    	
    	assertEquals(this.f.getNumerator(),5);
    	assertEquals(this.f.getDenominator(),14);
    	
    }
	
}
