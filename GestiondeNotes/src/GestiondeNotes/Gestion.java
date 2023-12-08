package GestiondeNotes;

import java.util.ArrayList;

public interface Gestion {
   
     public float caluclermoyen(String name ,String matiere);
     public void caluclemoyen(String name,ArrayList<String> mat);
     public void add(String name);
     public void modifier(String name);
     public void affichier();
     public void delete(int id);
     
   
     
     
}
