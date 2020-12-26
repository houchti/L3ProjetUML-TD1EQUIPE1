public class HommeNormal extends Personnage
{
	private boolean mort;
	public HommeNormal(String nom)
	{
		super(nom);
		mort = false;
	}

	public void mort()
	{		this.mort=true;
		System.out.println("Vous etes mort");
	}

	public boolean deplacer (Case verif)
	{
		switch (verif.getType())
		{
			case TypeCase.EAU:
				return false;
			case TypeCase.NORMAL:
				return true;
			case TypeCase.FORET:
				return true;
			default:
				return false;
		}
	}

	public Personnage()
	{
		vie, hyd, mor, sat = 75;
	}
}