package laboratorio5;

public class Tanque 
{
	protected String id;
	protected Valvulas valvulas[];
	
	public Tanque(String id)
	{
		this.id = id;
		valvulas = new Valvulas[10];
	}
}
