package org.multimodule.service;

import java.util.ArrayList;

import org.multimodule.dao.IMedecinDao;
import org.multimodule.domaine.Medecin;
import org.multimodule.domaine.Patient;

/**
 * @author benja M�thode consulter ayant en param�tre Medecin et Patient
 */
public class MedecinService {

	IMedecinDao dao;

	public void consulter(Medecin m1, Patient p1) {
		System.out.println("Le patient " + p1.getNom() + " est malade, il sera soign� par " + m1.getNom());
	}

	public void creerMedecin(Medecin m1) {
		this.dao.creerMedecin(m1);
	}

	public ArrayList<Medecin> lireMedecin(int id) {
		ArrayList<Medecin> ArrayUnMedecin = new ArrayList<Medecin>();
		ArrayUnMedecin = this.dao.getById(id);

		return ArrayUnMedecin;
	}

	public Medecin lireUnMedecin(int id) {
		Medecin medecin = new Medecin();
		medecin = this.dao.getMedecinById(id);
		return medecin;
	}
}
