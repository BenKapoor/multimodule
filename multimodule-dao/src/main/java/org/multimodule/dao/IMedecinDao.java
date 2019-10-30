package org.multimodule.dao;

import java.util.ArrayList;

import org.multimodule.domaine.Medecin;
import org.multimodule.domaine.Patient;

public interface IMedecinDao {

	public void consulter(Medecin m1, Patient p1);

	public void creerMedecin(Medecin m1);

	public ArrayList<Medecin> getById(int id);

	public Medecin getMedecinById(int id);

}
