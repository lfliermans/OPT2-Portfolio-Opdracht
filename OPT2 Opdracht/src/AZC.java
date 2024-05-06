import java.util.ArrayList;

public class AZC {

    private String straat;
    private int huisnr;
    private String postcode;
    private String gemeente;
    public ArrayList<Vluchteling> asielzoekers;

    public AZC(String straat, int huisnr, String postcode, String gemeente) {
        this.straat = straat;
        this.huisnr = huisnr;
        this.postcode = postcode;
        this.gemeente = gemeente;
    }

    public void registreerVluchteling(Vluchteling vluchteling){
        asielzoekers.add(vluchteling);
    }

    public String getStraat() {
        return straat;
    }

    public int getHuisnr() {
        return huisnr;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public void setHuisnr(int huisnr) {
        this.huisnr = huisnr;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    @Override
    public String toString() {
        return "AZC{" +
                "straat='" + straat + '\'' +
                ", huisnr=" + huisnr +
                ", postcode='" + postcode + '\'' +
                ", gemeente='" + gemeente + '\'' +
                ", asielzoekers=" + asielzoekers +
                '}';
    }
}
