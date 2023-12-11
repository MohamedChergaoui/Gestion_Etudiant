# Gestion_Etudiant
check(double note) :
Méthode statique pour vérifier si la note est dans la plage de 0 à 20 inclus.
Renvoie false si la note est dans la plage, sinon true.

1-  checkmat() :
    Méthode pour vérifier et retourner le nom correct d'une matière parmi "ARB", "MAT", "ENG", "SVT".
    Utilise une boucle pour demander à l'utilisateur de taper le nom de la matière jusqu'à ce qu'un nom correct soit fourni.

2-  chercher(String name) :
    Méthode pour rechercher un étudiant par son nom.
    Renvoie l'objet Etudiants correspondant au nom donné, ou null si l'étudiant n'est pas trouvé.

3-  caluclermoyen(String name, String mat) :
    Implémentation de la méthode de l'interface Gestion pour calculer la moyenne d'un étudiant dans une matière donnée.
    Utilise les notes stockées dans l'objet Etudiants pour effectuer le calcul.

4-  caluclemoyen(String name, ArrayList<String> mat) :
    Implémentation de la méthode de l'interface Gestion pour calculer les moyennes de l'étudiant dans les matières spécifiées.
    Utilise la méthode caluclermoyen pour chaque matière.

5-  moyenGenral(String name) :
    Calcule et affiche la moyenne générale de l'étudiant en parcourant toutes les matières.

6-  add(String name) :
    Méthode pour ajouter un nouvel étudiant.
    Demande à l'utilisateur s'il veut ajouter seulement le nom ou aussi les notes, puis prend les mesures nécessaires.

7-  modifier(String name) :
    Méthode pour modifier les informations d'un étudiant (nom et/ou notes).
    Demande à l'utilisateur quelles modifications il souhaite effectuer.

8_  affichier() :
    Implémentation de la méthode de l'interface Gestion pour afficher la liste des étudiants.

9-  delete(int id) :
    Méthode pour supprimer un étudiant en fonction de son identifiant.
    Parcourt la liste d'étudiants et supprime l'étudiant correspondant à l'ID donné.

10-   Notes(Etudiants e) :
      Méthode statique pour entrer les notes d'un étudiant.
      Demande à l'utilisateur s'il veut entrer les notes pour toutes les matières ou pour des matières spécifiques.
