package BP2_1821221018_Halis_FurkanAkgulOdev1;

public class Cicek {

    private String tür;
    private String renk;
    private int fiyat;
    private String kategori;

    public Cicek(String tür, String renk, int fiyat, String kategori) {
        this.tür = tür;
        this.renk = renk;
        this.fiyat = fiyat;
        this.kategori = kategori;
    }

    Cicek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTür() {
        return tür;
    }

    public void setTür(String tür) {
        this.tür = tür;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

}
