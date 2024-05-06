import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<AZC> azcs = new ArrayList<>();
        ArrayList<Vluchteling> vluchtelings = new ArrayList<>();
        AZC denHaagNoord = new AZC("Wilhelminastraat", 12, "1015CS", "Den Haag");
        AZC zoetermeer = new AZC("Willem-Alexanderplantsoen", 44, "2715WT", "Zoetermeer");
        AZC leidschendam = new AZC("Maximalaan", 3, "1012KL", "Leidschendam");
        azcs.add(denHaagNoord);
        azcs.add(zoetermeer);
        azcs.add(leidschendam);

        Beheerder beheerder1 = new Beheerder("Bob Dylan", "bobdylan", "123");
        COA coa1 = new COA("Gandalf", "gandalf", "456");
        Vluchteling vluchteling1 = new Vluchteling("Borat", "borat", "789", "Angola", false, true, "PingPongstraat 2");
        vluchtelings.add(vluchteling1);

        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            int ingelogd = 0;
            boolean login = false;
            while (!login) {
                System.out.println("Welkom bij asielhelper9000");
                System.out.println("Voer uw gebruikersnaam en wachtwoord in");
                System.out.println("Gebruikersnaam: ");
                String gebruiker = scanner.nextLine();
                System.out.println("Wachtwoord: ");
                String wachtwoord = scanner.nextLine();
                if (gebruiker.matches(beheerder1.getGebruikersNaam()) && wachtwoord.matches(beheerder1.getWachtwoord())) {
                    System.out.println("Welkom, " + beheerder1.getNaam());
                    ingelogd = 1;
                    login = true;
                } else if (gebruiker.matches(coa1.getGebruikersNaam()) && wachtwoord.matches(coa1.getWachtwoord())) {
                    System.out.println("Welkom, " + coa1.getNaam());
                    ingelogd = 2;
                    login = true;
                } else if (gebruiker.matches(vluchteling1.getGebruikersNaam()) && wachtwoord.matches(vluchteling1.getWachtwoord())) {
                    System.out.println("Welkom, " + vluchteling1.getNaam());
                    ingelogd = 3;
                    login = true;
                } else {
                    System.out.println("gebruikersnaam of wachtwoord klopt niet");
                }
            }
            //Opties voor beheerders
            while (ingelogd == 1) {

                System.out.println("Maak een keuze: ");
                System.out.println("1: ACZ Toevoegen ");
                System.out.println("2: ACZ Wijzigen ");
                System.out.println("3: ACZ Verwijderen: ");
                int keuze = scanner.nextInt();
                scanner.nextLine();
                switch (keuze) {
                    case 1:
                        System.out.println("Straatnaam");
                        String azcStraat = scanner.nextLine();
                        System.out.println("Huisnr: ");
                        int azcHuisnr = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Postcode: ");
                        String azcPostcode = scanner.nextLine();
                        System.out.println("Gemeente: ");
                        String azcGemeente = scanner.nextLine();
                        AZC a = new AZC(azcStraat, azcHuisnr, azcPostcode, azcGemeente);
                        azcs.add(a);
                        System.out.println("AZC Toegevoegd");
                        break;
                    case 2:
                        for (AZC azc : azcs) {
                            System.out.println(azc.toString());
                        }
                        System.out.println("Voer de postcode in van het te wijzigen AZC");
                        String azcKeuze = scanner.nextLine();

                        for (AZC azc : azcs) {
                            if (azc.getPostcode().matches(azcKeuze)) {
                                System.out.println("Wat wilt u doen?");
                                System.out.println("1: Straatnaam wijzigen");
                                System.out.println("2: Huisnr wijzigen");
                                System.out.println("3: Postcode wijzigen");
                                System.out.println("4: Gemeente wijzigen");
                                int wijzingKeuze = scanner.nextInt();
                                scanner.nextLine();
                                switch (wijzingKeuze) {
                                    case 1:
                                        System.out.println("Voer de nieuwe straatnaam in: ");
                                        String nieuweStraat = scanner.nextLine();
                                        azc.setStraat(nieuweStraat);
                                        break;
                                    case 2:
                                        System.out.println("Voer het nieuwe huisnummer in: ");
                                        int nieuwNr = scanner.nextInt();
                                        azc.setHuisnr(nieuwNr);
                                        break;
                                    case 3:
                                        System.out.println("Voer de nieuwe postcode in: ");
                                        String nieuweCode = scanner.nextLine();
                                        azc.setPostcode(nieuweCode);
                                        break;
                                    case 4:
                                        System.out.println("Voer de nieuwe gemeente in: ");
                                        String nieuweGemeente = scanner.nextLine();
                                        azc.setGemeente(nieuweGemeente);
                                        break;
                                }
                            }
                        }
                        System.out.println("Voer een geldige keuze in");
                        break;
                    case 3:
                        for (AZC azc : azcs) {
                            System.out.println(azc.toString());
                        }
                        System.out.println("Voer de postcode van het te verwijderen azc in");
                        String aczkeuze2 = scanner.nextLine();
                        for (AZC azc : azcs) {
                            if (azc.getPostcode().matches(aczkeuze2)){
                                azcs.remove(azc);
                                break;
                            }
                        }
                        System.out.println("Voer een geldige keuze in");
                }
            }
            //Opties voor COA
            while (ingelogd == 2){
                System.out.println("Maak een keuze: ");
                System.out.println("1: Vluchteling registreren");
                int keuze = scanner.nextInt();
                scanner.nextLine();
                switch (keuze){
                    case 1:
                        System.out.println("Naam: ");
                        String vNaam = scanner.nextLine();
                        String vGebruiker = "123";
                        String vWachtwoord = "123";
                        System.out.println("Land van herkomst: ");
                        String vHerkomst = scanner.nextLine();
                        System.out.println("Asiel aangevraagd? 1 voor ja, 2 voor nee");
                        boolean vAangevraagd = false;
                        boolean vGoedgekeurd = false;
                        int vAanvraag = scanner.nextInt();
                        scanner.nextLine();
                        if (vAanvraag == 1){
                            vAangevraagd = true;
                            System.out.println("Asiel goedgekeurd? 1 voor ja, 2 voor nee");
                            int vGoedkeuring = scanner.nextInt();
                            scanner.nextLine();
                            if (vGoedkeuring == 1){
                                vGoedgekeurd = true;
                            }
                        }
                        String vAdres = "Huppelepup";

                        Vluchteling b = new Vluchteling(vNaam, vGebruiker, vWachtwoord, vHerkomst, vAangevraagd, vGoedgekeurd, vAdres);
                        System.out.println("Vluchteling geregistreerd");
                }


            }
            //Opties voor Vluchtelingen
            while (ingelogd == 3){
                System.out.println("Maak een keuze:");
                System.out.println("1. Nieuw adres registreren");
                int keuze = scanner.nextInt();
                scanner.nextLine();
                switch (keuze){
                    case 1:
                        System.out.println("Voer uw naam in");
                        String naamkeuze = scanner.nextLine();
                        for (Vluchteling vluchteling : vluchtelings){
                            if (vluchteling.getNaam().matches( naamkeuze)){
                                System.out.println("Voer nieuwe adres in: ");
                                String nieuwAdres = scanner.nextLine();
                                vluchteling.setAdres(nieuwAdres);
                                System.out.println("Adres gewijzigd");
                                break;
                            }

                        }

                }
            }

        }




        }
    }







