/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BP2_1821221018_Halis_FurkanAkgulOdev1;

public class CansizCicek extends Cicek {

    String malzeme;

    public CansizCicek(String tür, String renk, int fiyat, String kategori) {
        super(tür, renk, fiyat, kategori);
    }

    public CansizCicek(String tür, String renk, int fiyat, String kategori, String malzeme) {
        super(tür, renk, fiyat, kategori);
        this.malzeme = malzeme;

    }

    public CansizCicek() {
    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }
}
