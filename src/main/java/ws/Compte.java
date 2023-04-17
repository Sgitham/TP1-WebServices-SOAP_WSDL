package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name = "compte")
//pour montrer l'usage de @xmltranscient
@XmlAccessorType(XmlAccessType.FIELD)
//un objet compte lors de conversion xml va nous donner un element xml


public class Compte {

    private int code;
    private double solde;
    // ne pas serialiser cet attribut lors de la serialisation de compte
    //dateCrreation n'apparaitra pas en fichier xml
    @XmlTransient
    private Date dateCreation;

    public Compte() {

    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
