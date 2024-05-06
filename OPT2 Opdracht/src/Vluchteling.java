public class Vluchteling extends Gebruiker{
    private String landHerkomst;
    private boolean asielAangevraagd;
    private boolean asielGoedgekeurd;
    private String adres;


    public Vluchteling(String naam, String gebruikersNaam, String wachtwoord, String landHerkomst, boolean asielAangevraagd, boolean asielGoedgekeurd, String adres) {
        super(naam, gebruikersNaam, wachtwoord);
        this.landHerkomst = landHerkomst;
        this.asielAangevraagd = asielAangevraagd;
        this.asielGoedgekeurd = asielGoedgekeurd;
        this.adres = adres;
        setGebruikertype("Vluchteling");
    }

    public void registreren(String adres){
        setAdres(adres);
    }
    public void goedkeuren(){

    }

    public void setLandHerkomst(String landHerkomst) {
        this.landHerkomst = landHerkomst;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Vluchteling{" +
                "landHerkomst='" + landHerkomst + '\'' +
                ", asielAangevraagd=" + asielAangevraagd +
                ", asielGoedgekeurd=" + asielGoedgekeurd +
                ", adres='" + adres + '\'' +
                '}';
    }

    public String getLandHerkomst() {
        return landHerkomst;
    }

    public boolean isAsielAangevraagd() {
        return asielAangevraagd;
    }

    public boolean isAsielGoedgekeurd() {
        return asielGoedgekeurd;
    }

    public String getAdres() {
        return adres;
    }

}
