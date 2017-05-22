package fr.pe.jvi.cdi.rest;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MonPojo implements Serializable{
	
	/** Serial	 */
	private static final long serialVersionUID = -2988076847892267241L;

	@NotNull
	private String m_nom;
	
	private String m_prenom;

	public String getNom() {
		return m_nom;
	}

	public void setNom(String p_nom) {
		m_nom = p_nom;
	}

	public String getPrenom() {
		return m_prenom;
	}

	public void setPrenom(String p_prenom) {
		m_prenom = p_prenom;
	}

	@Override
	public String toString() {
		return "MonPojo [m_nom=" + m_nom + ", m_prenom=" + m_prenom + "]";
	}

}
