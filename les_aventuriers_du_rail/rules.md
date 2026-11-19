# Règles du jeu — Les Aventuriers du Rail (Adaptation AP4B / UTBM)

## 1. Configuration et État Initial
- **Joueurs :** `2` à `5`. Chaque joueur commence avec `0` point, `45` wagons, `4` cartes Wagon et `4` tickets (au moins `2` conservés).
- **Cartes Wagon (110) :** 12 cartes par couleur (`VIOLET`, `ROUGE`, `ORANGE`, `JAUNE`, `VERT`, `BLEU`, `BLANC`, `NOIR`) + 14 `LOCOMOTIVE` (jokers).
- **Zone visible :** 5 cartes face visible. Si >= 3 `LOCOMOTIVE` visibles, défausser les 5 et remplacer.
- **Plateau :** Graphe de lieux (sommets) et routes (arêtes de longueur 1 à 6, colorées ou `GRISE`).

## 2. Tour de jeu (1 action au choix)
1. **Prendre des cartes Wagon :** Jusqu'à 2 cartes (pioche cachée ou zone visible). Prendre une `LOCOMOTIVE` visible compte pour 2 cartes (fin du tour).
2. **Prendre une Route :** Défausser `L` cartes de la couleur de la route (ou d'une couleur unique si `GRISE`) + jokers éventuels. Poser `L` wagons et marquer les points (`1->1`, `2->2`, `3->4`, `4->7`, `5->10`, `6->15`).
3. **Reprendre des Tickets :** Piocher 3 tickets, en garder au moins 1, remettre les autres sous le paquet.

## 3. Fin de partie et Score
- Déclenchée quand un joueur a `<= 2` wagons restants : chaque joueur (y compris lui) joue **1 dernier tour**.
- **Score :** Points des routes + Tickets réussis (`+valeur`) - Tickets échoués (`-valeur`) + Bonus chemin continu le plus long (`+10 pts`).
