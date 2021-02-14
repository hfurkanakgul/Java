/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BP2_1821221018_Halis_FurkanAkgulOdev1;

import java.io.Serializable;
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
@Table(name = "EGUVENLIK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eguvenlik.findAll", query = "SELECT e FROM Eguvenlik e")
    , @NamedQuery(name = "Eguvenlik.findById", query = "SELECT e FROM Eguvenlik e WHERE e.id = :id")
    , @NamedQuery(name = "Eguvenlik.findByAdi", query = "SELECT e FROM Eguvenlik e WHERE e.adi = :adi")
    , @NamedQuery(name = "Eguvenlik.findBySoyadi", query = "SELECT e FROM Eguvenlik e WHERE e.soyadi = :soyadi")
    , @NamedQuery(name = "Eguvenlik.findByMeslek", query = "SELECT e FROM Eguvenlik e WHERE e.meslek = :meslek")
    , @NamedQuery(name = "Eguvenlik.findBy\u00d6\u011fretmen", query = "SELECT e FROM Eguvenlik e WHERE e.\u00f6\u011fretmen = :\u00f6\u011fretmen")
    , @NamedQuery(name = "Eguvenlik.findByHayvan", query = "SELECT e FROM Eguvenlik e WHERE e.hayvan = :hayvan")})
public class Eguvenlik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "MESLEK")
    private String meslek;
    @Column(name = "\u00d6\u011eRETMEN")
    private String öğretmen;
    @Column(name = "HAYVAN")
    private String hayvan;

    public Eguvenlik() {
    }

    public Eguvenlik(Integer id) {
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

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public String getÖğretmen() {
        return öğretmen;
    }

    public void setÖğretmen(String öğretmen) {
        this.öğretmen = öğretmen;
    }

    public String getHayvan() {
        return hayvan;
    }

    public void setHayvan(String hayvan) {
        this.hayvan = hayvan;
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
        if (!(object instanceof Eguvenlik)) {
            return false;
        }
        Eguvenlik other = (Eguvenlik) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BP2_1821221018_Halis_FurkanAkgulOdev1.Eguvenlik[ id=" + id + " ]";
    }
    
}
