package GestiondeNotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   static {
	   for (Mat myVar : Mat.values()) {
		  Matiers.add(myVar);
		  
		 }
   }
	public static void main(String[] args) {
		services ser =new services();
		String name;
		String mat ;
		int numcon;
		Scanner scn =new Scanner(System.in);
		System.out.println("Taper votre nom ");
		String nameuser=scn.next();
		System.out.println("Bonjour  "+nameuser);
		first:
		while (true){
		System.out.println("*******************************************************");
		System.out.println("Taper 1 pour ajouter des notes");
		System.out.println("Taper 2 pour calculer la moyne des noter");
		System.out.println("Taper 3 pour afichier la liste des etudiant");
		System.out.println("Taper 4 pour ajouter un etudiant");
		System.out.println("Taper 5 pour suprimmer un etudiant ");
		System.out.println("Taper 6 pour modifier un etudiant ");
		System.out.println("Taper 7 pour quitter le programme ");
		System.out.println("*******************************************************");
		System.out.print("Taper votre choix :");
		int choix = scn.nextInt();
		switch(choix) {
		case 1:
				System.out.println("Taper le nom de etudiant");
				 name=scn.next();
				
				if(ser.chercher(name)!=null) {
					System.out.println("changer les Notes d'etudiant :");
					System.out.println("Tapez le nombre de controle pazzer par  l'etudiant :");
					numcon=scn.nextInt();
					ser.Notes(ser.chercher(name));
				}
				else {
					System.out.println("le nom se trouve pas mais il ajouter entre les notes d'etudiant :");
					
					ser.add(name);
					
					
					System.out.println("");
					
					ser.Notes(ser.chercher(name));
				}
				System.out.println(ser.chercher(name));
				break;
		

		case 2:
						System.out.println("*******************************************************");
						System.out.println("Taper 1 pour calculer la moyen  des matieres que voulez vous ");
						System.out.println("Taper 2 pour calculer la moyne de toute les matiere ");
						System.out.println("Taper 3 pour calculer la moyen generale");
						System.out.println("*******************************************************");
						System.out.print("Taper votre choix :");
						int choix2 = scn.nextInt();
						
					    switch(choix2) {
					    case 1:
					    	System.out.println("Taper le nom de etudiant");
							name=scn.next();
							
							 mat =ser.checkmat();
					        System.out.println("la moyen de "+mat+" est :"+	ser.caluclermoyen(name, mat));
					        break;
					    case 2:
					    	System.out.println("Taper le nom de etudiant");
							name=scn.next();
							System.out.println("Taper le nombre de matiére que  voulez vous calculer leur moyene ");
							int nbmat =scn.nextInt();
							ArrayList<String> Matiere = new ArrayList<String>();
							for(int i=0;i<nbmat;i++) {
								mat= mat =ser.checkmat();
								 Matiere.add(mat);
								
								 
							}
							 ser.caluclemoyen(name, Matiere);
							 break;
					    case 3:
					    	System.out.println("Taper le nom de etudiant");
							name=scn.next();
							ser.moyenGenral(name);
							break;
							
							
					    }
					    break;
		case 3:
			  ser.affichier();
			  break;
		case 4:
			System.out.println("Taper le nom de etudiant voulez vous ajouter");
			name=scn.next();
			ser.add(name);
			break;
		case 5:
			ser.affichier();
			System.out.println("choisi id de etudian que voulez vous suprimmer");
			int id=scn.nextInt();
			ser.delete(id);
			break;
			
	
		case 6:
			System.out.println("Taper le nom de etudiant voulez vous modifier");
			name=scn.next();
			ser.modifier(name);
			break;
			
		case 7:
		   break first;
		   
			   
		    
		}
		
		
		}
		
		
		
		
		
		
	}

}
