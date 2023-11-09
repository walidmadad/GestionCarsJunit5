import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * 
 */

class Mestests {

	/**
	 * Test method for {@link Car#Car(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testCar() {
		Car c1 = new Car("Peugeot", "208");
		
	}

	/**
	 * Test method for {@link Car#getMarque()}.
	 */
	@Test
	void testGetMarque() {
		//fail("Not yet implemented");
		Car c1 = new Car("Porshe", "911");
		
		assertSame("Porshe",c1.getMarque());
	}

	/**
	 * Test method for {@link Car#getModele()}.
	 */
	@Test
	void testGetModele() {
		//fail("Not yet implemented");
		Car c1 = new Car("Porshe", "911");
		
		assertSame("911",c1.getModele());
	}

	/**
	 * Test method for {@link Car#getPrixAchat()}.
	 */
	@Test
	void testGetPrixAchat() {
		
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		assertEquals(8000,c1.getPrixAchat());
	}

	/**
	 * Test method for {@link Car#getPrixVente()}.
	 */
	@Test
	void testGetPrixVente() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		assertEquals(10000,c1.getPrixVente());
	}

	/**
	 * Test method for {@link Car#getNbportes()}.
	 */
	@Test
	void testGetNbportes() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "408");
		assertEquals(3,c1.getNbportes());
	}

	/**
	 * Test method for {@link Car#getQteStock()}.
	 */
	@Test
	void testGetQteStock() {
		//fail("Not yet implemented");
		
		Car c1 = new Car("Peugeot", "408");
		assertEquals(10,c1.getQteStock());
	}

	/**
	 * Test method for {@link Car#getPuissanceCv()}.
	 */
	@Test
	void testGetPuissanceCv() {
		//fail("Not yet implemented");
		Car c2 = new Car("Porshe", "911");
		
		assertSame(20,c2.getPuissanceCv());
	}

	/**
	 * Test method for {@link Car#getKilometrage()}.
	 */
	@Test
	void testGetKilometrage() {
		//fail("Not yet implemented");
		Car c2 = new Car("Porshe", "911");
		
		assertEquals(260,c2.getKilometrage());
	}

	/**
	 * Test method for {@link Car#getNeuve()}.
	 */
	@Test
	void testGetNeuve() {
		//fail("Not yet implemented");
		
		Car c3 = new Car("Dacia","Duster");
		assertTrue(c3.getNeuve());
	}

	/**
	 * Test method for {@link Car#setMarque(java.lang.String)}.
	 */
	@Test
	void testSetMarque() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.setMarque("Peugeot");
	}

	/**
	 * Test method for {@link Car#setModele(java.lang.String)}.
	 */
	@Test
	void testSetModele() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.setModele("208");
	}

	/**
	 * Test method for {@link Car#setPrixAchat(float)}.
	 */
	@Test
	void testSetPrixAchat() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.setPrixAchat(8000);
	}

	/**
	 * Test method for {@link Car#setPrixVente(float)}.
	 */
	@Test
	void testSetPrixVente() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.setPrixVente(10000);
	}

	/**
	 * Test method for {@link Car#setNbportes(int)}.
	 */
	@Test
	void testSetNbportes() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.setNbportes(3);
	}

	/**
	 * Test method for {@link Car#setQteStock(int)}.
	 */
	@Test
	void testSetQteStock() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.setQteStock(10);
	}

	/**
	 * Test method for {@link Car#setPuissanceCv(int)}.
	 */
	@Test
	void testSetPuissanceCv() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.setPuissanceCv(20);
	}

	/**
	 * Test method for {@link Car#setKilometrage(int)}.
	 */
	@Test
	void testSetKilometrage() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.setKilometrage(260);
	}

	/**
	 * Test method for {@link Car#setNeuve(java.lang.Boolean)}.
	 */
	@Test
	void testSetNeuve() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.setNeuve(true);
	}

	/**
	 * Test method for {@link Car#setQteStockplus(int)}.
	 */
	@Test
	void testSetQteStockplus() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.setQteStockplus(11);
	}

	/**
	 * Test method for {@link Car#verifStocksuffisant(int)}.
	 */
	@Test
	void testVerifStocksuffisant() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.verifStocksuffisant(9);
	}

	/**
	 * Test method for {@link Car#setQteStockMoins(int)}.
	 */
	@Test
	void testSetQteStockMoins() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.setQteStockMoins(8);
	}

	/**
	 * Test method for {@link Car#CarEnChaine()}.
	 */
	@Test
	void testCarEnChaine() {
		//fail("Not yet implemented");
		Car c1 = new Car("Peugeot", "208");
		c1.CarEnChaine();
	}

	
}
