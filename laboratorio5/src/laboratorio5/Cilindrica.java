package laboratorio5;

public class Cilindrica extends Tanque {
	
	protected double altura;
	protected double radio;
	
	public Cilindrica(String id, double altura, double radio) 
	{
		super(id);
		this.altura = altura;
		this.radio = radio;
	}
	
	public double Dimensiones()
	{
		double resultado;
		resultado = (3.14)*radio*altura;
		return resultado;
	}
}
