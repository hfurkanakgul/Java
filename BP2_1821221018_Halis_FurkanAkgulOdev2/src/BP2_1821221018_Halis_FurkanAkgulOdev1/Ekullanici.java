/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BP2_1821221018_Halis_FurkanAkgulOdev1;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Halis Furkan AKGÜL
 */
@Entity
@Table(name = "EKULLANICI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ekullanici.findAll", query = "SELECT e FROM Ekullanici e")
    , @NamedQuery(name = "Ekullanici.findById", query = "SELECT e FROM Ekullanici e WHERE e.id = :id")
    , @NamedQuery(name = "Ekullanici.findByAdi", query = "SELECT e FROM Ekullanici e WHERE e.adi = :adi")
    , @NamedQuery(name = "Ekullanici.findBySoyadi", query = "SELECT e FROM Ekullanici e WHERE e.soyadi = :soyadi")
    , @NamedQuery(name = "Ekullanici.findByKullaniciAdi", query = "SELECT e FROM Ekullanici e WHERE e.kullaniciAdi = :kullaniciAdi")
    , @NamedQuery(name = "Ekullanici.findBySiFre", query = "SELECT e FROM Ekullanici e WHERE e.siFre = :siFre")
    , @NamedQuery(name = "Ekullanici.findByTelefon", query = "SELECT e FROM Ekullanici e WHERE e.telefon = :telefon")})
public class Ekullanici implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "KULLANICI_ADI")
    private String kullaniciAdi;
    @Column(name = "S\u0130FRE")
    private String siFre;
    @Column(name = "TELEFON")
    private Integer telefon;

    public Ekullanici() {
    }

    public Ekullanici(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSiFre() {
        return siFre;
    }

    public void setSiFre(String siFre) {
        this.siFre = siFre;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ekullanici)) {
            return false;
        }
        Ekullanici other = (Ekullanici) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BP2_1821221018_Halis_FurkanAkgulOdev1.Ekullanici[ id=" + id + " ]";
    }
    
}
