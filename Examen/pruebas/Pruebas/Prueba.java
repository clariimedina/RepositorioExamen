/**
 * 
 */
package Pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import workflow.POST;

import Domain.Store;

/**
 * @author CLARISSA
 *
 */
public class Prueba {
	Store tienda;
	POST post;
	
	@Before
	public void setUp() throws Exception {
		tienda = new Store();
		post = tienda.getPOST();
	}

	@Test
	public void calculaPago() {
		post.EnterItem(1,1);
		post.EnterItem(2,2);
		post.EnterItem(1,1);
		post.endSale();
		double pago = post.getSale().total();
		assert(pago == 600);
	}
	
	@Test
	public void calculaFeria() {
		post.EnterItem(1,1);
		post.EnterItem(2,2);
		post.EnterItem(1,1);
		post.endSale();
		post.getSale().total();
		post.makePayment(700);
		double feria = post.getSale().getBalance();
		assertTrue(feria==100);
	}

}
