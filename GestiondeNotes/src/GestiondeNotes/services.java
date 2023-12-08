package GestiondeNotes;

import java.util.ArrayList;
import java.util.Scanner;

public class services implements Gestion {
 static Scanner scn =new Scanner(System.in);
 public static ArrayList<Etudiants> etud = new ArrayList<Etudiants>();
 
 
// pour check value of note
public static boolean check(double note) {
		if(note<=20 && note>=0) {
			return false ;
		}
		return true;
	}

//pour vérifierlede nom  matiere 
public static String checkmat() {
     boolean check =true;
     String mat;
    
     
 	do {
 		System.out.println("ARB,MAT,ENG,SVT ");
		System.out.println("Taper le nom de matiere voulez vous calculer leur moyen et Tapez le nom corectte ");
		 mat =scn.next();
		for(int i =0; i<Etudiants.Matiere.size();i++) {
			if(mat.equals(Etudiants.Matiere.get(i).getName().toString())) {
				check =false;
			}
		}
		}while(check)
     
	
;
	return mat;
}


// pour rechercher un etudiant
public static  Etudiants chercher(String name) {
		for(Etudiants i:etud) {
			if(i.getName().equals(name)) {
				return i;
			}
		}
		return null;
	}


// calculer la moyen pour une matiere
	@Override
	public float caluclermoyen(String name ,String mat) {
		int size=0;
		float moyen=0;
		for(int i=0;i<services.chercher(name).Matiere.size();i++) {
			
			if(services.chercher(name).Matiere.get(i).getName().toString().equals(mat)) {
				
				for(int j=0;j<etud.get(etud.indexOf(services.chercher(name))).Matiere.get(i).tabcont.size();j++) {
				
				moyen+=etud.get(etud.indexOf(services.chercher(name))).Matiere.get(i).tabcont.get(j);
				}
				
			}
			size=etud.get(etud.indexOf(services.chercher(name))).Matiere.get(i).tabcont.size();
		};
		
	;
	return moyen/size;
	}
	
// calculer les moyenes des matiéres saisie
	@Override
	public void caluclemoyen(String name,ArrayList<String> mat) {
		for(int i=0;i<mat.size();i++) {
			;
			 System.out.println("la moyen de "+mat.get(i)+" est :"+	this.caluclermoyen(name, mat.get(i)));
          }
		}
	
	// caculer moyene General pour un etudiant
	public void moyenGenral(String name) {
		int moyene=0;
		for(int i=0;i<Etudiants.Matiere.size();i++) {
			 
			
             moyene+=this.caluclermoyen(name, Etudiants.Matiere.get(i).getName().toString());
		}
		 System.out.println("la moyen genrale de etudiant  "+" est :"+	moyene/Etudiants.Matiere.size());
	}

	
	@Override
	public void add(String name) {
		
		if(this.chercher(name)!=null) {
			System.out.println("etudiant deja ajouter ");
			}
		else {
			System.out.println("*******************************************************");
			System.out.println("Taper 1 voulez ajouter juste le nom  ");
			System.out.println("Taper 2 voulez vous ajouter  les notes et le nom ");
			System.out.println("*******************************************************");
			System.out.print("Taper votre choix :");
			int choix2 = scn.nextInt();
			switch(choix2) {
			case 1:
				 Etudiants etd = new Etudiants(name);
				 etud.add(etd);
				 System.out.println("le nom est ajouter   ");
				 
				  break;
				  
			case 2:
				 Etudiants etd2 = new Etudiants(name);
				 etud.add(etd2);
				 this.Notes(etd2);
				 System.out.println("etudiant  est ajouter   ");
				 break;
				
			}
			
		}
		
		
	}

	@Override
	public void modifier(String name) {
        
		if(this.chercher(name)!=null) {
			System.out.println("*******************************************************");
			System.out.println("Taper 1 voulez modifier juste le nom  ");
			System.out.println("Taper 2 voulez vous modifier juste les notes ");
			System.out.println("Taper 3 voulez vous modifier  les notes et le nom ");
			System.out.println("*******************************************************");
			System.out.print("Taper votre choix :");
			int choix2 = scn.nextInt();
			switch(choix2) {
			case 1:
				System.out.print("Tapez  le nouveau  nom: ");
				 String nvnam =scn.next();
				 etud.get(etud.indexOf(this.chercher(name))).setName(nvnam); 
				  System.out.println("le nom est change  ");
				  break;
				  
			case 2:
				this.Notes(this.chercher(name));
				break;
			case 3:
				System.out.print("Tapez  le nouveau  nom: ");
				  nvnam =scn.next();
				 etud.get(etud.indexOf(this.chercher(name))).setName(nvnam); 
				  System.out.println("le nom est change  ");
				  this.Notes(this.chercher(name));
				  System.out.println("les notes sont changer ");
				  break;
			default :
				System.out.println("le choix introuvable ");
				
			}
			
				
			}
		else {
			System.out.println("le nom de etudiant introuvable  ");
		}
		
		
	}
   // affichier la liste des eudiants
	@Override
	public void affichier() {
		System.out.println("La Liste des etudiants");
		System.out.println("*******************************************************");
		for(Etudiants i:etud) {
			System.out.println(i.toString());
		}
		System.out.println("*******************************************************");
		
		
	}

	@Override
	public void delete(int id ) {
		int c =0;
		 {for(Etudiants i:etud) {
			if(i.getId()==id) {
				etud.remove(i);
				c=1;
				System.out.println("le etudiant eté supprimé");
				break;
			}
		}
		}
		if(c==0) {
			System.out.println("le etudiant introuvable");
		}
		
	}
	
	
	
	
public static  void Notes(Etudiants e ) {
	
	System.out.println("*******************************************************");
	System.out.println("Taper 1 enter les notes de tous les matiéres  ");
	System.out.println("Taper 2 entrer les notes des matiere terminè de corection ");
	System.out.println("*******************************************************");
	System.out.print("Taper votre choix :");
	int choix2 = scn.nextInt();
	int not;
	switch(choix2) {
	case 1:
		for (int i=0;i<4;i++) {
			System.out.println("Tapez le nombre des contoroles de "+ etud.get(etud.indexOf(e)).Matiere.get(i).getName() );
			int nmbcn=scn.nextInt();
				System.out.println("saisie "+ nmbcn+"controles  de " + etud.get(etud.indexOf(e)).Matiere.get(i).getName()+" :");
				for(int j=0;j<nmbcn;j++) {
					Scanner scn =new Scanner(System.in);
					do {
						System.out.print
						("Taper la note de controle "+(j+1)+" :");	
						 not=scn.nextInt();
						if(services.check(not)) {
							System.out.println("la note doit etre entre 0 et 20 ");
						}
						else {
							etud.get(etud.indexOf(e)).Matiere.get(i).tabcont.add(not);
						}
					}while(services.check(not));
				}
				System.out.println("");
			}
		   break;
	case 2:
		    
		    System.out.println("taper combier de matiére voulez vous entrer leur note ");
		    int nm=scn.nextInt();
		    
		    for(int i=0;i<nm;i++) {
		    	String nom= services.checkmat();
		    	for(int j=0;j<4;j++) {
		    		if(nom.equals(etud.get(etud.indexOf(e)).Matiere.get(j).getName().toString())) {
		    			System.out.println("Tapez le nombre de controle pazzer   l'etudiant dans cette matiere :");
	    				int nmbcn=scn.nextInt();
		    			for(int d=0;d<nmbcn;d++) {
		    				
							Scanner scn =new Scanner(System.in);
							do {
								System.out.print
								("Taper la note de controle "+(d+1)+" :");	
								  not=scn.nextInt();
								if(services.check(not)) {
									System.out.println("la note doit etre entre 0 et 20 ");
								}
								else {
									etud.get(etud.indexOf(e)).Matiere.get(j).tabcont.add(not);
								}
								
								
							}while(services.check(not));
							
						}
		    			
		    		}
		    	}
		    	
		    	
		    	
		    }
		    
         }
		}

}
