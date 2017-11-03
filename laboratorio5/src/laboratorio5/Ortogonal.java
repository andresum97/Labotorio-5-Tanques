package laboratorio5;

public class Ortogonal extends Tanque 
{

	protected double largo;
	protected double ancho;
	protected double altura;
	
	public Ortogonal(String id, double largo, double ancho, double altura) {
		super(id);
		this.largo = largo;
		this.ancho = ancho;
		this.altura = altura;
	}

}
