package GestiondeNotes;

import java.util.ArrayList;

class Etudiants{
	private int id ;
	private String name;
	static int i;
	static final ArrayList<Matiers> Matiere = new ArrayList<Matiers>();
	
	public Etudiants( String name) {
		
		this.id = i;
		this.name = name;
		i++;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Etudiants [id=" + id + ", name=" + name + ", Matiere=" + Matiere + "]";
	}
	
	
	
	
	
	
	
	
	
	
}