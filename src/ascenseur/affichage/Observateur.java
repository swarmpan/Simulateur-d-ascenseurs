package ascenseur.affichage;

import ascenseur.traitement.ControleurAbstrait;

/**
 * Created by s14000079 on 15/01/16.
 */
public interface Observateur {

    void actualiser (ControleurAbstrait controleurAbstrait);
}
