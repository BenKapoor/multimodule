package org.multimodule.service;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.multimodule.dao.IMedecinDao;
import org.multimodule.domaine.Medecin;

import junit.framework.Assert;

public class TestCabinet {
	// 1- Mocker l'interface du dao
	@Mock
	IMedecinDao dao;

	// 2- Injecte le service
	@InjectMocks
	MedecinService service;

	@Test
	public void testLectureInfoMedecin() {
		// Permet d'initialiser l'objet mock
		MockitoAnnotations.initMocks(this);
		/**
		 * S�nario de test : La demande de lecture de l'information d'un m�decin �
		 * partir de son identifiant nous ram�ne la totalit� des informations de ses
		 * caract�ristiques
		 */

		// 3- Imposer un comportement au mock(stubber)
		// @Spy
		Medecin spiedMedecin = new Medecin(1, "JJ", "KK", "adresse", "disponibilite");
		Mockito.when(this.dao.getMedecinById(1)).thenReturn(spiedMedecin);

		// 4- Appeler une m�thode du service
		Medecin medecin = service.lireUnMedecin(1);

		// 5- Comparer le r�sultat r�el avec le r�sultat attendu
		Assert.assertEquals(medecin.getId(), 1);

		// verifier l'appel et le nombre de fois
		Mockito.verify(dao, Mockito.times(1)).getMedecinById(1);
	}
}
