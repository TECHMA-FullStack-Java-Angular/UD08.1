/*Has una clase llamada Persona que siga las siguiente condiciones:
 * - Sus atributos son: nombre, edad, DNI, sexo (H hombre, Mmujer), peso y altura. 
 * No queremos que se accedan directamente a ellos. Piensa que modificador de 
 * acceso es más adecuado, también su tipo. Si quieres añadir algún atributo 
 * puedes hacerlo.
 * - Por defecto, todos los atributos menos el DNI serán valores por defecto según
 *  su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por 
 *  defecto, usa una constante para ello.
 *  - Se implantaran varios constructores:
 *  	- Un constructor por defecto.
 *  	- Un constructor con el nombre, edad y sexo, el resto por defecto.
 *  	- Un constructor con todos atributos como parámetro.*/

public class Persona {

	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	private static final char SEXO_POR_DEFECTO = 'H';

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = null;
		this.sexo = SEXO_POR_DEFECTO;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = null;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;

	}

	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	// Como son atributos private, creamos gettes y setters para acceder a ellos

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
