package BC03.P2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import BC03.P2.Triangulo.ErrorException;

/**
 * Unit test for simple App.
 */
public class AppTest {



	/***************************************Casos de prueba para each use*********************************************/
	@Test(expected = ErrorException.class)
	public void eachUseTest1() throws ErrorException {
	 Triangulo t0 = new Triangulo(100,70,100,-5,60,90); // C0
	}
	@Test(expected = ErrorException.class)
	public void eachUseTest2() throws ErrorException {
	 Triangulo t0 = new Triangulo(100,0,70,0,60,120); // C1
	}
	
	@Test()
	public void eachUseTest3() throws ErrorException {
		Triangulo t1 = new Triangulo(100, 100, 100, 60, 60, 60); // C2
		String actual = t1.tipoTriangulo();
		String expected = "Triángulo equilatero y acutángulo";
		assertEquals(expected, actual);
	}
	
	@Test(expected = ErrorException.class)
	public void eachUseTest4() throws ErrorException {
	 Triangulo t0 = new Triangulo(-4,-4,0,90,120,180); // C3
	}
	@Test(expected = ErrorException.class)
	public void eachUseTest5() throws ErrorException {
	 Triangulo t0 = new Triangulo(70,70,0,120,180,180); // C4
	}
	@Test()
	public void eachUseTest6() throws ErrorException {
		Triangulo t1 = new Triangulo(100, 100, 100, 180, 180, 120); // C5
		String actual = t1.tipoTriangulo();
		String expected = "No es un triángulo";
		assertEquals(expected, actual);
	}

	/*****************************************************************************************/
	
	/***************************************Casos de prueba para pair wise*********************************************/
	
	@Test(expected = ErrorException.class)
	public void pairWiseTest1() throws ErrorException {
	 Triangulo t0 = new Triangulo(-4,-4,-4,60,-5,-5); // C0
	}
	@Test(expected = ErrorException.class)
	public void pairWiseTest2() throws ErrorException {
	 Triangulo t0 = new Triangulo(0,0,0,60,0,0); // C1
	}
	
	@Test()
	public void pairWiseTest3() throws ErrorException {
		Triangulo t = new Triangulo(100, 70, 100, 60, 60, 60); // C2
		String actual = t.tipoTriangulo();
		String expected = "No es un triángulo";
		assertEquals(expected, actual);
	}
	@Test()
	public void pairWiseTest4() throws ErrorException {
		Triangulo t = new Triangulo(100, 70, 70, 60, 90, 90); // C3
		String actual = t.tipoTriangulo();
		String expected = "No es un triángulo";
		assertEquals(expected, actual);
	}
	@Test(expected = ErrorException.class)
	public void pairWiseTest5() throws ErrorException {
	 Triangulo t0 = new Triangulo(0,-4,-4,60,120,120); // C4
	}
	@Test(expected = ErrorException.class)
	public void pairWiseTest6() throws ErrorException {
	 Triangulo t0 = new Triangulo(0,0,0,60,180,180); // C5
	}
	
	
	/*****************************************************************************************/

	/*************************************Casos de prueba para el decision coverage test********************/

	@Test()
	public void decisionCoverageTest1() throws ErrorException{
		/* Para true... */
		Triangulo t = new Triangulo(100, 100, 100, 20, 30, 70); // C0
		String actual = t.tipoTriangulo();
		String expected = "No es un triángulo";
		assertEquals(expected, actual);

		/* Para false... */
		Triangulo t2 = new Triangulo(100, 70, 70, 90, 45, 45); // C1
		actual = t2.tipoTriangulo();
		expected = "Isosceles Rectangulo";
		assertEquals(expected, actual);
	}
	@Test()
	public void decisionCoverageTest2() throws ErrorException{

		/* Para true... */
		Triangulo t3 = new Triangulo(100, 20, 20, 90, 45, 45); // C2
		String actual = t3.tipoTriangulo();
		String expected = "No es un triángulo";
		assertEquals(expected, actual);

		/* Para false... */
		Triangulo t4 = new Triangulo(30, 30, 30, 90, 45, 45); // C3
		actual = t4.tipoTriangulo();
		expected = "No es un triángulo";
		assertEquals(expected, actual);
	}
	@Test()
	public void decisionCoverageTest3() throws ErrorException{


		/* Para true... */
		Triangulo t15 = new Triangulo(12, 22, 12, 60, 60, 60); // C4
		String actual = t15.tipoTriangulo();
		String expected = "No es un triángulo";
		assertEquals(expected, actual);

		/* Para false... */
		Triangulo t16 = new Triangulo(10, 10, 12, 30, 60, 90); // C5
		actual = t16.tipoTriangulo();
		expected = "Isosceles Rectangulo";
		assertEquals(expected, actual);
	}
	
	@Test()
	public void decisionCoverageTest4() throws ErrorException{

		/* Para true... */
		Triangulo t17 = new Triangulo(10, 10, 10, 30, 60, 90); // C6
		String actual = t17.tipoTriangulo();
		String expected = "No es un triángulo";
		assertEquals(expected, actual);

		/* Para false... */
		Triangulo t18 = new Triangulo(12, 12, 14, 40, 60, 80); // C7
		actual = t18.tipoTriangulo();
		expected = "Isosceles Acutangulo";
		assertEquals(expected, actual);
	}
	
	@Test()
	public void decisionCoverageTest5() throws ErrorException{

		/* Para true */
		Triangulo t5 = new Triangulo(10, 10, 10, 60, 60, 60); // C8
		String actual = t5.tipoTriangulo();
		String expected = "Triángulo equilatero y acutángulo";
		assertEquals(expected, actual);

		/* Para false... */
		Triangulo t6 = new Triangulo(30, 40, 20, 50, 50, 80); // C9
		actual = t6.tipoTriangulo();
		expected = "Escaleno Acutangulo";
		assertEquals(expected, actual);
	}
	
	@Test()
	public void decisionCoverageTest6() throws ErrorException{

		/* Para true... */
		Triangulo t7 = new Triangulo(15, 15, 20, 30, 50, 100); // C10
		String actual = t7.tipoTriangulo();
		String expected = "Isosceles Obtusangulo";
		assertEquals(expected, actual);

		/* Para false... */
		Triangulo t8 = new Triangulo(15, 24, 22, 30, 50, 100); // C11
		actual = t8.tipoTriangulo();
		expected = "Escaleno Obtusangulo";
		assertEquals(expected, actual);
	}
	@Test()
	public void decisionCoverageTest7() throws ErrorException{

		/* Para true */
		Triangulo t19 = new Triangulo(12, 13, 14, 100, 40, 40); // C12
		String actual = t19.tipoTriangulo();
		String expected = "Escaleno Obtusangulo";
		assertEquals(expected, actual);

		/* Para false... */
		Triangulo t20 = new Triangulo(10, 10, 12, 40, 60, 80); // C13
		actual = t20.tipoTriangulo();
		expected = "Isosceles Acutangulo";
		assertEquals(expected, actual);
	}
	@Test()
	public void decisionCoverageTest8() throws ErrorException{


		/* Para true... */
		Triangulo t9 = new Triangulo(15, 24, 22, 30, 61, 89); // C14
		String actual = t9.tipoTriangulo();
		String expected = "Escaleno Acutangulo";
		assertEquals(expected, actual);

		/* Para false... */
		Triangulo t10 = new Triangulo(15, 24, 22, 90, 45, 45); // C15
		actual = t10.tipoTriangulo();
		expected = "Escaleno Rectangulo";
		assertEquals(expected, actual);
	}
	@Test()
	public void decisionCoverageTest9() throws ErrorException{

		/* Para true... */
		Triangulo t11 = new Triangulo(15, 33, 28, 90, 70, 20); // C16
		String actual = t11.tipoTriangulo();
		String expected = "Escaleno Rectangulo";
		assertEquals(expected, actual);

		/* Para false... */
		Triangulo t12 = new Triangulo(15, 33, 28, 50, 60, 70); // C17
		actual = t12.tipoTriangulo();
		expected = "Escaleno Acutangulo";
		assertEquals(expected, actual);
	}
	@Test()
	public void decisionCoverageTest10() throws ErrorException{

		/* Para true... */
		Triangulo t13 = new Triangulo(20, 33, 20, 100, 40, 40); // C18
		String actual = t13.tipoTriangulo();
		String expected = "Isosceles Obtusangulo";
		assertEquals(expected, actual);

		/* Para false... */
		Triangulo t14 = new Triangulo(20, 33, 20, 80, 50, 50); // C19
		actual = t14.tipoTriangulo();
		expected = "Isosceles Acutangulo";
		assertEquals(expected, actual);
	}
	
	/*****************************************************************************************/

	/************************************************MC/DC Tests***************************************************/
	
	@Test()
	public void mc_dcTest1() throws ErrorException{
/*Para false y condición dominante a,b,c*/
		
		Triangulo t = new Triangulo(30,20,40,100,40,40);
		String actual = t.tipoTriangulo();
		String expected = "Escaleno Obtusangulo";
		assertEquals(expected,actual);
		
		/*Para true con condición dominante a*/
		
		Triangulo t1 = new Triangulo(100,20,30,30,30,120	);
		actual = t1.tipoTriangulo();
		expected = "No es un triángulo";
		assertEquals(expected,actual);
		
		/*Para true con condición dominante b*/
		
		Triangulo t2 = new Triangulo(30,20,100,30,30,120);
		actual = t2.tipoTriangulo();
		expected = "No es un triángulo";
		assertEquals(expected,actual);
		
		/*Para true con condición dominante c*/
		
		Triangulo t3 = new Triangulo(30,100,20,30,30,120);
		actual = t3.tipoTriangulo();
		expected = "No es un triángulo";
		assertEquals(expected,actual);
	}
	
	@Test()
	public void mc_dcTest2() throws ErrorException {
		/*Para true con condición dominante a,b */
		Triangulo t4 = new Triangulo(10,10,10,60,60,60);
		String actual = t4.tipoTriangulo();
		String expected = "Triángulo equilatero y acutángulo";
		assertEquals(expected,actual);
		
		/*Para false con condición dominante a*/
		Triangulo t5 = new Triangulo(10,12,10,60,60,60);
		actual = t5.tipoTriangulo();
		expected = "No es un triángulo";
		assertEquals(expected,actual);
		
		/*Para false con condición dominante b*/
		Triangulo t6 = new Triangulo(10,10,12,60,30,90);
		actual = t6.tipoTriangulo();
		expected = "Isosceles Rectangulo";
		assertEquals(expected,actual);
		
		
	}
	
	@Test()
	public void mc_dcTest3() throws ErrorException{
		/*Para false y condición dominante a,b,c*/
		
		Triangulo t = new Triangulo(30,20,40,100,40,40);
		String actual = t.tipoTriangulo();
		String expected = "Escaleno Obtusangulo";
		assertEquals(expected,actual);
		
		/*Para true con condición dominante a*/
		
		Triangulo t1 = new Triangulo(100,100,20,60,40,80);
		actual = t1.tipoTriangulo();
		expected = "Isosceles Acutangulo";
		assertEquals(expected,actual);
		
		/*Para true con condición dominante b*/
		
		Triangulo t2 = new Triangulo(100,20,100,30,30,120);
		actual = t2.tipoTriangulo();
		expected = "Isosceles Obtusangulo";
		assertEquals(expected,actual);
		
		
		/*Para true con condición dominante c*/
		
		Triangulo t3 = new Triangulo(30,20,20,50,30,100);
		actual = t3.tipoTriangulo();
		expected = "Isosceles Obtusangulo";
		assertEquals(expected,actual);
		
	}
	
	@Test()
	public void mc_dcTest4() throws ErrorException{
		/*Para true y condición dominante a,b,c*/
		
		Triangulo t = new Triangulo(24,20,21,30,60,90);
		String actual = t.tipoTriangulo();
		String expected = "Escaleno Rectangulo";
		assertEquals(expected,actual);
		
		/*Para false  con condición dominante a*/
		
		Triangulo t1 = new Triangulo(12,12,10,60,59,61);
		actual = t1.tipoTriangulo();
		expected = "Isosceles Acutangulo";
		assertEquals(expected,actual);
		
		/*Para false con condición dominante b*/
		
		Triangulo t2 = new Triangulo(10,100,100,30,30,120);
		actual = t2.tipoTriangulo();
		expected = "Isosceles Obtusangulo";
		assertEquals(expected,actual);
		
		
		/*Para false con condición dominante c*/
		
		Triangulo t3 = new Triangulo(20,12,20,50,30,100);
		actual = t3.tipoTriangulo();
		expected = "Isosceles Obtusangulo";
		assertEquals(expected,actual);
		
	}
	
	@Test()
	public void mc_dcTest5() throws ErrorException{
		/*Para true y condición dominante a,b,c*/
		
		Triangulo t = new Triangulo(24,20,21,30,70,80);
		String actual = t.tipoTriangulo();
		String expected = "Escaleno Acutangulo";
		assertEquals(expected,actual);
		
		/*Para false  con condición dominante a*/
		
		Triangulo t1 = new Triangulo(12,12,10,100,40,40);
		actual = t1.tipoTriangulo();
		expected = "Isosceles Obtusangulo";
		assertEquals(expected,actual);
		
		/*Para false con condición dominante b*/
		
		Triangulo t2 = new Triangulo(10,100,100,40,100,40);
		actual = t2.tipoTriangulo();
		expected = "Isosceles Obtusangulo";
		assertEquals(expected,actual);
		
		
		/*Para false con condición dominante c*/
		
		Triangulo t3 = new Triangulo(20,12,20,50,30,100);
		actual = t3.tipoTriangulo();
		expected = "Isosceles Obtusangulo";
		assertEquals(expected,actual);
		
	}
	
	@Test()
	public void mc_dcTest6() throws ErrorException{
		/*Para false y condición dominante a,b,c*/
		
		Triangulo t = new Triangulo(24,20,21,30,70,80);
		String actual = t.tipoTriangulo();
		String expected = "Escaleno Acutangulo";
		assertEquals(expected,actual);
		
		/*Para true  con condición dominante a*/
		
		Triangulo t1 = new Triangulo(12,12,10,90,50,40);
		actual = t1.tipoTriangulo();
		expected = "Isosceles Rectangulo";
		assertEquals(expected,actual);
		
		/*Para true con condición dominante b*/
		
		Triangulo t2 = new Triangulo(10,100,100,50,90,40);
		actual = t2.tipoTriangulo();
		expected = "Isosceles Rectangulo";
		assertEquals(expected,actual);
		
		/*Para true con condición dominante c*/
		
		Triangulo t3 = new Triangulo(20,12,20,55,35,90);
		actual = t3.tipoTriangulo();
		expected = "Isosceles Rectangulo";
		assertEquals(expected,actual);
		
	}
	
	@Test()
	public void mc_dcTest7() throws ErrorException{
		/*Para true y condición dominante a,b,c,d*/
		
		Triangulo t = new Triangulo(24,20,21,60,60,60);
		String actual = t.tipoTriangulo();
		String expected = "No es un triángulo";
		assertEquals(expected,actual);
		
		/*Para false  con condición dominante a*/
		
		Triangulo t1 = new Triangulo(12,12,10,90,50,40);
		actual = t1.tipoTriangulo();
		expected = "Isosceles Rectangulo";
		assertEquals(expected,actual);
		
		/*Para false con condición dominante b*/
		
		Triangulo t2 = new Triangulo(10,13,10,50,90,40);
		actual = t2.tipoTriangulo();
		expected = "Isosceles Rectangulo";
		assertEquals(expected,actual);
		
		/*Para false con condición dominante c*/
		
		Triangulo t3 = new Triangulo(20,12,20,55,35,90);
		actual = t3.tipoTriangulo();
		expected = "Isosceles Rectangulo";
		assertEquals(expected,actual);
		
		/*Para false con condición dominante d */
		
		Triangulo t4 = new Triangulo(20,12,18,55,36,89);
		actual = t4.tipoTriangulo();
		expected = "Escaleno Acutangulo";
		assertEquals(expected,actual);
		
	}
	
	@Test()
	public void mc_dcTest8() throws ErrorException{
		/*Para true y condición dominante a,b,c,d*/
		
		Triangulo t = new Triangulo(20,20,20,60,20,100);
		String actual = t.tipoTriangulo();
		String expected = "No es un triángulo";
		assertEquals(expected,actual);
		
		/*Para false  con condición dominante a*/
		
		Triangulo t1 = new Triangulo(12,13,12,90,45,45);
		actual = t1.tipoTriangulo();
		expected = "Isosceles Rectangulo";
		assertEquals(expected,actual);
		
		/*Para false con condición dominante b*/
		
		Triangulo t2 = new Triangulo(11,13,10,50,90,40);
		actual = t2.tipoTriangulo();
		expected = "Escaleno Rectangulo";
		assertEquals(expected,actual);
		
		/*Para false con condición dominante c*/
		
		Triangulo t3 = new Triangulo(20,12,20,55,34,91);
		actual = t3.tipoTriangulo();
		expected = "Isosceles Obtusangulo";
		assertEquals(expected,actual);
		
		/*Para false con condición dominante d */
		
		Triangulo t4 = new Triangulo(20,12,18,55,36,89);
		actual = t4.tipoTriangulo();
		expected = "Escaleno Acutangulo";
		assertEquals(expected,actual);
		
	}
	
	@Test()
	public void mc_dcTest9() throws ErrorException{
		/*Para false y condición dominante a,b,c*/
		
		Triangulo t = new Triangulo(24,20,21,91,91,91);
		String actual = t.tipoTriangulo();
		String expected = "No es un triángulo";
		assertEquals(expected,actual);
		
		/*Para true  con condición dominante a*/
		
		Triangulo t1 = new Triangulo(12,13,10,91,49,40);
		actual = t1.tipoTriangulo();
		expected = "Escaleno Obtusangulo";
		assertEquals(expected,actual);
		
		/*Para true con condición dominante b*/
		
		Triangulo t2 = new Triangulo(10,100,100,40,100,40);
		actual = t2.tipoTriangulo();
		expected = "Isosceles Obtusangulo";
		assertEquals(expected,actual);
		
		/*Para true con condición dominante c*/
		
		Triangulo t3 = new Triangulo(20,12,13,20,40,120);
		actual = t3.tipoTriangulo();
		expected = "Escaleno Obtusangulo";
		assertEquals(expected,actual);
		
	}
	
	/*****************************************************************************************/

	
	
	
	
	

	
	

}
