


public class Queue {
	
	public static void main(String[] args){
		etat e1 = new etat(4, 5);
		etat e = new etat(4, 54);
		noeud n1 = new noeud(e1, null, null);
		liste l1 = new liste(null, null);
		l1.insererFile(e1, n1);
		l1.insererFile(e, null);
		l1.afficher();
		l1.extraire();
		l1.afficher();

}
	}


class etat {

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	int x;
	int y;
	public etat(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

	
class noeud{
	public etat getEtat() {
		return this.etat;
	}

	public void setEtat(etat etat) {
		this.etat = etat;
	}

	public noeud getSuivant() {
		return this.suivant;
	}

	public void setSuivant(noeud suivant) {
		this.suivant = suivant;
	}

	public noeud getPrecesseur() {
		return this.precesseur;
	}

	public void setPrecesseur(noeud precesseur) {
		this.precesseur = precesseur;
	}
	public noeud(etat etat, noeud suivant, noeud precesseur) {
		this.etat = etat;

	
		this.suivant = suivant;
		this.precesseur = precesseur;
	}
	etat etat;
	noeud suivant ;
	noeud precesseur ;
	
}

class liste{
	noeud debut;
	noeud fin;

	public liste(noeud debut, noeud fin) {
		this.debut = debut;
		this.fin = fin;
	}
	public void insererFile(etat e , noeud pr){
		noeud n = new noeud(e, null, pr);
		if(this.debut == null){
			this.debut = n ;
			this.fin = n;
		}
		else{
			this.fin.suivant = n ;
			this.fin = n ;
		}
	}
	public noeud extraire(){
		noeud n ;
		if(this.debut==this.fin) this.fin = null ;
		n = this.debut;
		this.debut = n.suivant ;
		return n;
	}
	public void afficher(){
		noeud p = this.debut ;
		while (p != null) {
			System.out.println("le noeud courand a comme etat x = "+p.etat.x+ "et comme y = "+p.etat.y);
			p = p.suivant ;
		}
	}
	
}