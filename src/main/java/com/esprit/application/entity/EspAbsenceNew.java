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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
 

@Entity(name="ESP_ABSENCE_NEW")
@IdClass(EspAbsenceNew.EspAbsenceNewId.class)
public class EspAbsenceNew implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public static class EspAbsenceNewId implements Serializable {
        EspEtudiant espEtudiant;
        java.lang.String codeModule;
        java.lang.String codeCl;
        java.lang.String anneeDeb;
        java.time.LocalDateTime dateSeance;
        java.math.BigDecimal numSeance;
		
        
       
        
    }
   
    /** Primary key. */
    protected static final String PK = "1L";

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

    @Id
    @Column(name="CODE_MODULE",  length=10)
    private String codeModule;
    @Id
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Id
    @Column(name="ANNEE_DEB", length=4)
    private String anneeDeb;
    @Id
    @Column(name="NUM_SEANCE" )
    private BigDecimal numSeance;
    @Id
    @Column(name="DATE_SEANCE")
    private LocalDateTime dateSeance;
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Column(name="SEMESTRE", precision=1)
    private BigDecimal semestre;
    @Column(name="JUSTIFICATION", length=1)
    private String justification;
    @Column(name="CODE_JUSTIF", length=2)
    private String codeJustif;
    @Column(name="LIB_JUSTIF", length=50)
    private String libJustif;
    @Column(name="A_CONVOQUER", length=1)
    private String aConvoquer;
    @Column(name="OBSERVATION", length=1000)
    private String observation;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ID_ET")
    private EspEtudiant espEtudiant;

    /** Default constructor. */
    public EspAbsenceNew() {
        super();
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
     * Access method for codeCl.
     *
     * @return the current value of codeCl
     */
    public String getCodeCl() {
        return codeCl;
    }

    /**
     * Setter method for codeCl.
     *
     * @param aCodeCl the new value for codeCl
     */
    public void setCodeCl(String aCodeCl) {
        codeCl = aCodeCl;
    }

    /**
     * Access method for anneeDeb.
     *
     * @return the current value of anneeDeb
     */
    public String getAnneeDeb() {
        return anneeDeb;
    }

    /**
     * Setter method for anneeDeb.
     *
     * @param aAnneeDeb the new value for anneeDeb
     */
    public void setAnneeDeb(String aAnneeDeb) {
        anneeDeb = aAnneeDeb;
    }

    /**
     * Access method for numSeance.
     *
     * @return the current value of numSeance
     */
    public BigDecimal getNumSeance() {
        return numSeance;
    }

    /**
     * Setter method for numSeance.
     *
     * @param aNumSeance the new value for numSeance
     */
    public void setNumSeance(BigDecimal aNumSeance) {
        numSeance = aNumSeance;
    }

    /**
     * Access method for dateSeance.
     *
     * @return the current value of dateSeance
     */
    public LocalDateTime getDateSeance() {
        return dateSeance;
    }

    /**
     * Setter method for dateSeance.
     *
     * @param aDateSeance the new value for dateSeance
     */
    public void setDateSeance(LocalDateTime aDateSeance) {
        dateSeance = aDateSeance;
    }

    /**
     * Access method for idEns.
     *
     * @return the current value of idEns
     */
    public String getIdEns() {
        return idEns;
    }

    /**
     * Setter method for idEns.
     *
     * @param aIdEns the new value for idEns
     */
    public void setIdEns(String aIdEns) {
        idEns = aIdEns;
    }

    /**
     * Access method for dateSaisie.
     *
     * @return the current value of dateSaisie
     */
    public LocalDateTime getDateSaisie() {
        return dateSaisie;
    }

    /**
     * Setter method for dateSaisie.
     *
     * @param aDateSaisie the new value for dateSaisie
     */
    public void setDateSaisie(LocalDateTime aDateSaisie) {
        dateSaisie = aDateSaisie;
    }

    /**
     * Access method for utilisateur.
     *
     * @return the current value of utilisateur
     */
    public String getUtilisateur() {
        return utilisateur;
    }

    /**
     * Setter method for utilisateur.
     *
     * @param aUtilisateur the new value for utilisateur
     */
    public void setUtilisateur(String aUtilisateur) {
        utilisateur = aUtilisateur;
    }

    /**
     * Access method for semestre.
     *
     * @return the current value of semestre
     */
    public BigDecimal getSemestre() {
        return semestre;
    }

    /**
     * Setter method for semestre.
     *
     * @param aSemestre the new value for semestre
     */
    public void setSemestre(BigDecimal aSemestre) {
        semestre = aSemestre;
    }

    /**
     * Access method for justification.
     *
     * @return the current value of justification
     */
    public String getJustification() {
        return justification;
    }

    /**
     * Setter method for justification.
     *
     * @param aJustification the new value for justification
     */
    public void setJustification(String aJustification) {
        justification = aJustification;
    }

    /**
     * Access method for codeJustif.
     *
     * @return the current value of codeJustif
     */
    public String getCodeJustif() {
        return codeJustif;
    }

    /**
     * Setter method for codeJustif.
     *
     * @param aCodeJustif the new value for codeJustif
     */
    public void setCodeJustif(String aCodeJustif) {
        codeJustif = aCodeJustif;
    }

    /**
     * Access method for libJustif.
     *
     * @return the current value of libJustif
     */
    public String getLibJustif() {
        return libJustif;
    }

    /**
     * Setter method for libJustif.
     *
     * @param aLibJustif the new value for libJustif
     */
    public void setLibJustif(String aLibJustif) {
        libJustif = aLibJustif;
    }

    /**
     * Access method for aConvoquer.
     *
     * @return the current value of aConvoquer
     */
    public String getAConvoquer() {
        return aConvoquer;
    }

    /**
     * Setter method for aConvoquer.
     *
     * @param aAConvoquer the new value for aConvoquer
     */
    public void setAConvoquer(String aAConvoquer) {
        aConvoquer = aAConvoquer;
    }

    /**
     * Access method for observation.
     *
     * @return the current value of observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * Setter method for observation.
     *
     * @param aObservation the new value for observation
     */
    public void setObservation(String aObservation) {
        observation = aObservation;
    }

    /**
     * Access method for espEtudiant.
     *
     * @return the current value of espEtudiant
     */
    public EspEtudiant getEspEtudiant() {
        return espEtudiant;
    }

    /**
     * Setter method for espEtudiant.
     *
     * @param aEspEtudiant the new value for espEtudiant
     */
    public void setEspEtudiant(EspEtudiant aEspEtudiant) {
        espEtudiant = aEspEtudiant;
    }

    /** Temporary value holder for group key fragment espEtudiantIdEt */
    private transient String tempEspEtudiantIdEt;

    /**
     * Gets the key fragment idEt for member espEtudiant.
     * If this.espEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspEtudiantIdEt.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspEtudiant
     */
    public String getEspEtudiantIdEt() {
        return (getEspEtudiant() == null ? tempEspEtudiantIdEt : getEspEtudiant().getIdEt());
    }

    /**
     * Sets the key fragment idEt from member espEtudiant.
     * If this.espEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspEtudiantIdEt.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdEt New value for the key fragment
     * @see EspEtudiant
     */
    public void setEspEtudiantIdEt(String aIdEt) {
        if (getEspEtudiant() == null) {
            tempEspEtudiantIdEt = aIdEt;
        } else {
            getEspEtudiant().setIdEt(aIdEt);
        }
    }

    /**
     * Compares the key for this instance with another EspAbsenceNew.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspAbsenceNew and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspAbsenceNew)) {
            return false;
        }
        EspAbsenceNew that = (EspAbsenceNew) other;
        Object myEspEtudiantIdEt = this.getEspEtudiantIdEt();
        Object yourEspEtudiantIdEt = that.getEspEtudiantIdEt();
        if (myEspEtudiantIdEt==null ? yourEspEtudiantIdEt!=null : !myEspEtudiantIdEt.equals(yourEspEtudiantIdEt)) {
            return false;
        }
        Object myCodeModule = this.getCodeModule();
        Object yourCodeModule = that.getCodeModule();
        if (myCodeModule==null ? yourCodeModule!=null : !myCodeModule.equals(yourCodeModule)) {
            return false;
        }
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myDateSeance = this.getDateSeance();
        Object yourDateSeance = that.getDateSeance();
        if (myDateSeance==null ? yourDateSeance!=null : !myDateSeance.equals(yourDateSeance)) {
            return false;
        }
        Object myNumSeance = this.getNumSeance();
        Object yourNumSeance = that.getNumSeance();
        if (myNumSeance==null ? yourNumSeance!=null : !myNumSeance.equals(yourNumSeance)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspAbsenceNew.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspAbsenceNew)) return false;
        return this.equalKeys(other) && ((EspAbsenceNew)other).equalKeys(this);
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
        if (getEspEtudiantIdEt() == null) {
            i = 0;
        } else {
            i = getEspEtudiantIdEt().hashCode();
        }
        result = 37*result + i;
        if (getCodeModule() == null) {
            i = 0;
        } else {
            i = getCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getDateSeance() == null) {
            i = 0;
        } else {
            i = getDateSeance().hashCode();
        }
        result = 37*result + i;
        if (getNumSeance() == null) {
            i = 0;
        } else {
            i = getNumSeance().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspAbsenceNew |");
        sb.append(" espEtudiantIdEt=").append(getEspEtudiantIdEt());
        sb.append(" codeModule=").append(getCodeModule());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" dateSeance=").append(getDateSeance());
        sb.append(" numSeance=").append(getNumSeance());
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
        ret.put("espEtudiantIdEt", getEspEtudiantIdEt());
        ret.put("codeModule", getCodeModule());
        ret.put("codeCl", getCodeCl());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("dateSeance", getDateSeance());
        ret.put("numSeance", getNumSeance());
        return ret;
    }
    
	

}
