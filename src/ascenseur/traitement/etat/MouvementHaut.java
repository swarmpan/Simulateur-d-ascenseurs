package ascenseur.traitement.etat;

import ascenseur.traitement.Ascenseur;
import ascenseur.traitement.Requete;
import ascenseur.utils.Constantes;

public class MouvementHaut implements Etat {

    @Override
    public void effectuerAction(Ascenseur ascenseur) {
        ascenseur.monter();
    }

    @Override
    public Etat calculerNouvelEtat(Requete req, int etage) {
        if (req != null && req.getEtage() == etage)
            return new ImmobileOuvert();

        return this;
    }

    @Override
    public Constantes.ValeursEtat getValeur() {
        return Constantes.ValeursEtat.MOUVEMENT_HAUT;
    }

    @Override
    public String toString() {
        return "MouvementHaut";
    }
}
