public class Beheerder extends Gebruiker{
    public Beheerder(String naam, String gebruikersNaam, String wachtwoord) {
        super(naam, gebruikersNaam, wachtwoord);
        setGebruikertype("Beheerder");
    }



}
