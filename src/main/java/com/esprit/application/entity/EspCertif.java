// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="ESP_CERTIF")
public class EspCertif implements Serializable {

    /** Primary key. */
    protected static final String PK = "nomJeton";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Column(name="NOM_ET", nullable=false, length=20)
    private String nomEt;
    @Column(name="PRENOM_ET", nullable=false, length=20)
    private String prenomEt;
    @Column(name="ADRESSE_ET", nullable=false, length=20)
    private String adresseEt;
    @Column(name="DATE_MISEJOUR", nullable=false)
    private LocalDateTime dateMisejour;
    @Column(name="DATE_INS", nullable=false)
    private LocalDateTime dateIns;
    @Column(name="HEURE_INS", nullable=false, length=20)
    private String heureIns;
    @Id
    @Column(name="NOM_JETON", unique=true, nullable=false, length=20)
    private String nomJeton;
    @Column(name="ID_ET", nullable=false, length=20)
    private String idEt;
    @Column(name="CLASSE", length=20)
    private String classe;
    @Column(name="CODE_MODULE", length=20)
    private String codeModule;
    @Column(name="NOTE_EXAM", precision=5, scale=2)
    private BigDecimal noteExam;

    /** Default constructor. */
    public EspCertif() {
        super();
    }

    /**
     * Access method for nomEt.
     *
     * @return the current value of nomEt
     */
    public String getNomEt() {
        return nomEt;
    }

    /**
     * Setter method for nomEt.
     *
     * @param aNomEt the new value for nomEt
     */
    public void setNomEt(String aNomEt) {
        nomEt = aNomEt;
    }

    /**
     * Access method for prenomEt.
     *
     * @return the current value of prenomEt
     */
    public String getPrenomEt() {
        return prenomEt;
    }

    /**
     * Setter method for prenomEt.
     *
     * @param aPrenomEt the new value for prenomEt
     */
    public void setPrenomEt(String aPrenomEt) {
        prenomEt = aPrenomEt;
    }

    /**
     * Access method for adresseEt.
     *
     * @return the current value of adresseEt
     */
    public String getAdresseEt() {
        return adresseEt;
    }

    /**
     * Setter method for adresseEt.
     *
     * @param aAdresseEt the new value for adresseEt
     */
    public void setAdresseEt(String aAdresseEt) {
        adresseEt = aAdresseEt;
    }

    /**
     * Access method for dateMisejour.
     *
     * @return the current value of dateMisejour
     */
    public LocalDateTime getDateMisejour() {
        return dateMisejour;
    }

    /**
     * Setter method for dateMisejour.
     *
     * @param aDateMisejour the new value for dateMisejour
     */
    public void setDateMisejour(LocalDateTime aDateMisejour) {
        dateMisejour = aDateMisejour;
    }

    /**
     * Access method for dateIns.
     *
     * @return the current value of dateIns
     */
    public LocalDateTime getDateIns() {
        return dateIns;
    }

    /**
     * Setter method for dateIns.
     *
     * @param aDateIns the new value for dateIns
     */
    public void setDateIns(LocalDateTime aDateIns) {
        dateIns = aDateIns;
    }

    /**
     * Access method for heureIns.
     *
     * @return the current value of heureIns
     */
    public String getHeureIns() {
        return heureIns;
    }

    /**
     * Setter method for heureIns.
     *
     * @param aHeureIns the new value for heureIns
     */
    public void setHeureIns(String aHeureIns) {
        heureIns = aHeureIns;
    }

    /**
     * Access method for nomJeton.
     *
     * @return the current value of nomJeton
     */
    public String getNomJeton() {
        return nomJeton;
    }

    /**
     * Setter method for nomJeton.
     *
     * @param aNomJeton the new value for nomJeton
     */
    public void setNomJeton(String aNomJeton) {
        nomJeton = aNomJeton;
    }

    /**
     * Access method for idEt.
     *
     * @return the current value of idEt
     */
    public String getIdEt() {
        return idEt;
    }

    /**
     * Setter method for idEt.
     *
     * @param aIdEt the new value for idEt
     */
    public void setIdEt(String aIdEt) {
        idEt = aIdEt;
    }

    /**
     * Access method for classe.
     *
     * @return the current value of classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * Setter method for classe.
     *
     * @param aClasse the new value for classe
     */
    public void setClasse(String aClasse) {
        classe = aClasse;
    }

    /**
     * Access method for codeModule.
     *
     * @return the current value of codeModule
     */
    public String getCodeModule() {
        return codeModule;
    }

    /**
     * Setter method for codeModule.
     *
     * @param aCodeModule the new value for codeModule
     */
    public void setCodeModule(String aCodeModule) {
        codeModule = aCodeModule;
    }

    /**
     * Access method for noteExam.
     *
     * @return the current value of noteExam
     */
    public BigDecimal getNoteExam() {
        return noteExam;
    }

    /**
     * Setter method for noteExam.
     *
     * @param aNoteExam the new value for noteExam
     */
    public void setNoteExam(BigDecimal aNoteExam) {
        noteExam = aNoteExam;
    }

    /**
     * Compares the key for this instance with another EspCertif.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspCertif and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspCertif)) {
            return false;
        }
        EspCertif that = (EspCertif) other;
        Object myNomJeton = this.getNomJeton();
        Object yourNomJeton = that.getNomJeton();
        if (myNomJeton==null ? yourNomJeton!=null : !myNomJeton.equals(yourNomJeton)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspCertif.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspCertif)) return false;
        return this.equalKeys(other) && ((EspCertif)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getNomJeton() == null) {
            i = 0;
        } else {
            i = getNomJeton().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EspCertif |");
        sb.append(" nomJeton=").append(getNomJeton());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("nomJeton", getNomJeton());
        return ret;
    }

}
