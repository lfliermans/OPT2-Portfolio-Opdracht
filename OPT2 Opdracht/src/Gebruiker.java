public class Gebruiker {
    private String naam;
    private String gebruikersNaam;
    private String wachtwoord;
    private String gebruikertype;



    public Gebruiker(String naam, String gebruikersNaam, String wachtwoord) {
        this.naam = naam;
        this.gebruikersNaam = gebruikersNaam.toLowerCase();
        this.wachtwoord = wachtwoord.toLowerCase();
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setGebruikersNaam(String gebruikersNaam) {
        this.gebruikersNaam = gebruikersNaam;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }


    public String getNaam() {
        return naam;
    }

    public String getGebruikersNaam() {
        return gebruikersNaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public String getGebruikertype() {
        return gebruikertype;
    }

    public void setGebruikertype(String gebruikertype) {
        this.gebruikertype = gebruikertype;
    }

    @Override
    public String toString() {
        return "Gebruiker{" +
                "naam='" + naam + '\'' +
                ", gebruikersNaam='" + gebruikersNaam + '\'' +
                ", wachtwoord='" + wachtwoord + '\'' +
                '}';
    }
}
