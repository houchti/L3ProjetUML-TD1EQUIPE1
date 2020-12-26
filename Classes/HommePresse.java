public class HommePresse extends Personnage
{
    private boolean mort;

    public HommePresse(String nom)
    {
        super(nom);
        mort = false;
    }

    public void mort()
    {
        this.mort=true;
        System.out.println("You died.");


    }

    public boolean deplacer(Case verif)
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
        vie = 100;
        hyd = 75;
        sat = 75;
        mor = 50;
    }
}