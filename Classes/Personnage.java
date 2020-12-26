public abstract class Personnage
{
    private String nom;
    private int vie;
    private int Hydratation;
    private int Satiete;
    private int Moral;

    public Personnage(String nom)
    {
        this.nom = nom;
    }

    public Personnage()
    {
        vie, Hydratation, Satiete, Moral = 100;
    }


    public int getVie()
    {
        return vie;
    }
    public int getHydratation()
    {
        return Hydratation;
    }
    public int getSatiete()
    {
        return Satiete;
    }
    public int getMoral()
    {
        return Moral;
    }



    public void seDeplacer(int deplacement)
    {

    }

    public void setRepos(int reposMaison) // Repos Maison = +10 points
    {
        Moral, Satiete, Hydratation += 10;
        if (Moral > 100)
        {
            Moral = 100;
        }
        if (Satiete > 100)
        {
            Satiete = 100;
        }
        if (Hydratation > 100)
        {
            Hydratation = 100;
        }
    }
}