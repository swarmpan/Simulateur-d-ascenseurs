package ascenseur.traitement.etat;

import ascenseur.traitement.Ascenseur;
import ascenseur.traitement.Requete;
import ascenseur.utils.Constantes;

public interface Etat {

    /**
     * Effectue l'action spécifique à l'état (ex: monter quand MouvementHaut)
     * @param ascenseur une instance d'ascenseur
     */
    void effectuerAction(Ascenseur ascenseur);

    /**
     * Détermine et renvoie le prochain état de l'ascenseur en fonction de la requete courante
     * @param req la requete a traiter
     * @param etage l'étage courante de l'ascenseur
     * @return le prochain état
     */
    Etat calculerNouvelEtat(Requete req, int etage);

    Constantes.ValeursEtat getValeur();
}
