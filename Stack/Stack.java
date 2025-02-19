package Queue.Stack;
public class Stack {
    public static void main(String[] args) {
        int x = 70 , y = 40 , z =0 ;
        noeud n = new noeud(x, null);
        noeud n1 = new noeud(y, null);
        noeud n2 = new noeud(z, null);
        liste l1 = new liste(null);
        l1.inserer(x);
        l1.inserer(y);
        l1.extraire();
        l1.afficher();


    }
}

class noeud {
    int x;
    noeud suivant ;

    public noeud(int x, noeud suivant) {
        this.x = x;
        this.suivant = suivant;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public noeud getSuivant() {
        return this.suivant;
    }

    public void setSuivant(noeud suivant) {
        this.suivant = suivant;
    }


}

class liste {
    noeud sommet ;

    public liste(noeud sommet) {
        this.sommet = sommet;
    }

    public void inserer(int x){
        noeud n = new noeud(x, null);
        if(this.sommet == null) this.sommet = n;
        else{
            n.suivant = this.sommet;
            this.sommet = n;}
    }

    public noeud extraire(){
        noeud n ;
        n = this.sommet;
        sommet = n.suivant;
        return n ;
    }

    public void afficher(){
        noeud courant = this.sommet ;
        while (courant != null) {
            System.out.println("le noeud courant a comùme etat la valeur selon l'abscisse x " + courant.x);
            courant = courant.suivant;
        }
    }

}

