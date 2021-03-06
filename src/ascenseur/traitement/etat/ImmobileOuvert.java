package ascenseur.traitement.etat;

import ascenseur.traitement.Ascenseur;
import ascenseur.traitement.Requete;
import ascenseur.utils.Constantes;

public class ImmobileOuvert implements Etat {

    @Override
    public void effectuerAction(Ascenseur ascenseur) {
        ascenseur.validerRequetesEtage();
    }

    @Override
    public Etat calculerNouvelEtat(Requete req, int etage) {
        if (req == null || req.getEtage() != etage)
            return new ImmobileFerme();

        return this;
    }

    @Override
    public Constantes.ValeursEtat getValeur() {
        return Constantes.ValeursEtat.IMMOBILE_OUVERT;
    }

    @Override
    public String toString() {
        return "ImmobileOuvert";
    }
}
