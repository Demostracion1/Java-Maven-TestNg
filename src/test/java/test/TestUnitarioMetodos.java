
	package test;

	import java.util.logging.Level;

	import operaciones.Adicion;
	import operaciones.Division;
	import operaciones.Extraccion;
	import operaciones.Multiplicacion;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import org.testng.log4testng.Logger;

	public class TestUnitarioMetodos {

		// Objeto de tipo Logger con el cual se escribira en la consola
		private final static Logger LOGGER = Logger.getLogger(Thread.currentThread().getClass());

		/**
		 * La anotacion @BeforeClass indica que este metodo se ejecutara una sola vez
		 * antes que todas las pruebas @Test
		 */
		@BeforeClass
		public void beforeClass() {
			LOGGER.info("El beforeClass se ejecuta una vez antes de todas las pruebas");
		}
		
		

		/**
		 * La anotacion @BeforeTest indica que este metodo se ejecutara antes de que un
		 * metodo @Test se ejecute
		 */
		@BeforeTest
		public void beforeTest() {
			LOGGER.info("El beforeTest se ejecuta antes de cada prueba");
		}
		
		
		
		/**
		 * Este metodo realiza la prueba sobre el metodo suma, que se encuentra en la clase Adicion.java
		 * Primero instancia un objeto de tipo Adicion y usa este objeto para hacer uso del metodo suma
		 * La anotacion @Test indica que este metodo es un metodo para pruebas
		 */
		@Test
		public void adicionTest() {
			LOGGER.info("prueba adicion");
			Adicion adicion = new Adicion();
			Assert.assertEquals(3, adicion.suma(1, 2));
		}

		
		
		/**
		 * Este metodo realiza la prueba sobre el metodo resta, que se encuentra en la clase Extraccion.java
		 * Primero instancia un objeto de tipo Extraccion y usa este objeto para hacer uso del metodo resta
		 * La anotacion @Test indica que este metodo es un metodo para pruebas
		 */
		@Test
		public void extraccionTest() {
			LOGGER.info("prueba extraccion");
			Extraccion extraccion = new Extraccion();
			Assert.assertEquals(0, extraccion.resta(2, 2));
		}

		
		
		/**
		 * Este metodo realiza la prueba sobre el metodo multiplicacion, que se encuentra en la clase Multiplicacion.java
		 * Primero instancia un objeto de tipo Multiplicacion y usa este objeto para hacer uso del metodo multiplicacion
		 * La anotacion @Test indica que este metodo es un metodo para pruebas
		 */
		@Test
		public void multiplicacionTest() {
			LOGGER.info("prueba multiplicacion");
			Multiplicacion multiplicacion = new Multiplicacion();
			Assert.assertEquals(9, multiplicacion.multiplicacion(2, 2));
		}

		
		
		/**
		 * Este metodo realiza la prueba sobre el metodo division con valores validos, 
		 * este metodo se encuentra en la clase Division.java
		 * Primero instancia un objeto de tipo Division y usa este objeto para hacer uso del 
		 * metodo division
		 * La anotacion @Test indica que este metodo es un metodo para pruebas
		 */
		@Test
		public void divisionValoresValidosTest() {
			LOGGER.info("prueba division valores validos");
			Division division = new Division();
			Assert.assertEquals(2, division.division(4, 2));

		}

		
		
		/**
		 * Este metodo realiza la prueba sobre el metodo division con un divisior 0, 
		 * este metodo se encuentra en la clase Division.java
		 * Primero instancia un objeto de tipo Division y usa este objeto para hacer uso del 
		 * metodo division
		 * 
		 * La anotacion @Test(expectedExceptions = {
		 * IllegalArgumentException.class }, expectedExceptionsMessageRegExp = "Argumento 'divisor' es 0")
		 *	
		 * Indica que este metodo es para pruebas y espera un error con mensaje
		 * 
		 */
		@Test(expectedExceptions = {
				IllegalArgumentException.class }, expectedExceptionsMessageRegExp = "Argumento 'divisor' es 0")
		public void divisionParaZero() {
			LOGGER.info("prueba division valor divisor cero revisando excepcion");
			Division division = new Division();
			division.division(1, 0);
		}

		
		/**
		 * La anotacion @AfterTest indica que este metodo se ejecutara despues de que un
		 * metodo @Test se ejecute
		 */
		@AfterTest
		public void afterTest() {
			LOGGER.info("El afterTest se ejecuta despues de la ejecución de cada prueba");
		}
		
		
		
	   /**
		* La anotacion @BeforeClass indica que este metodo se ejecutara una sola vez
		* despues que todas las pruebas @Test
		*/
		@AfterClass
		public void afterClass() {
			LOGGER.info("El afterClass se ejecuta una vez despues de todas las pruebas");

		}

	}

	
	
	

