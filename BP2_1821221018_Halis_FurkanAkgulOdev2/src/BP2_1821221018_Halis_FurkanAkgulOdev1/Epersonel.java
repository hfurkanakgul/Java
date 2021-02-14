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
@Table(name = "EPERSONEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Epersonel.findAll", query = "SELECT e FROM Epersonel e")
    , @NamedQuery(name = "Epersonel.findById", query = "SELECT e FROM Epersonel e WHERE e.id = :id")
    , @NamedQuery(name = "Epersonel.findByAdi", query = "SELECT e FROM Epersonel e WHERE e.adi = :adi")
    , @NamedQuery(name = "Epersonel.findBySoyadi", query = "SELECT e FROM Epersonel e WHERE e.soyadi = :soyadi")
    , @NamedQuery(name = "Epersonel.findByMaas", query = "SELECT e FROM Epersonel e WHERE e.maas = :maas")
    , @NamedQuery(name = "Epersonel.findByUnvanAdi", query = "SELECT e FROM Epersonel e WHERE e.unvanAdi = :unvanAdi")})
public class Epersonel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "MAAS")
    private Integer maas;
    @Column(name = "UNVAN_ADI")
    private String unvanAdi;

    public Epersonel() {
    }

    public Epersonel(Integer id) {
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

    public Integer getMaas() {
        return maas;
    }

    public void setMaas(Integer maas) {
        this.maas = maas;
    }

    public String getUnvanAdi() {
        return unvanAdi;
    }

    public void setUnvanAdi(String unvanAdi) {
        this.unvanAdi = unvanAdi;
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
        if (!(object instanceof Epersonel)) {
            return false;
        }
        Epersonel other = (Epersonel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BP2_1821221018_Halis_FurkanAkgulOdev1.Epersonel[ id=" + id + " ]";
    }
    
}
