package GestiondeNotes;

import java.util.ArrayList;
import java.util.Arrays;

public class Matiers {
  private Mat name;
  private int id ;
  private int nmbcnt;
  static int i ;
  public  ArrayList<Integer> tabcont = new ArrayList<Integer>();
 
 
 public Matiers(Mat name) {
		this.name = name;
		this.id = i;
		i++;
	}
 

 

public Mat getName() {
	return name;
}

public void setName(Mat name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

 public int getNmbcnt() {
	return nmbcnt;
}

public void setNmbcnt(int nmbcnt) {
	this.nmbcnt = nmbcnt;
}

public static  void add(Mat myVar) {
     Matiers m = new Matiers(myVar);
	 Etudiants.Matiere.add(m);
 }
@Override
public String toString() {
	return "name=" + name + ", tabcont=" + tabcont.toString() + "]";
}

  
}
