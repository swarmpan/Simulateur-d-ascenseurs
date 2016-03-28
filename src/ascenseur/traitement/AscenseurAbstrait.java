package ascenseur.traitement;

import ascenseur.traitement.etat.Etat;

import java.util.List;

public interface AscenseurAbstrait {

    void action() ;
    void ajouterRequete(RequeteExterne requete);
    void creerRequeteInterne(int etage);
    int getNombreRequetes();
    List<RequeteInterne> getRequetesInternes();
    List<RequeteExterne> getRequetesExternes();
    Requete obtenirRequeteATraiter();
    Etat getEtat();
    int getEtage();
    boolean estBloque();
    void bloquer();
    void debloquer();
    String getOptions();
}
