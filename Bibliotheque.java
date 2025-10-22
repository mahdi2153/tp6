package tp6;

public class Bibliotheque {
    private Document[] listdoc;
   
    private int nbdoc;
    private int maxC=100;

    public Bibliotheque() {
        this.listdoc = new Document[maxC];
        this.nbdoc = 0;
    }

    public int getCapacite() {
        return maxC;
    }

    public int getNombreDocuments() {
        return nbdoc;
    } 
            public void ajout_doc(Document d) {
        if (nbdoc >= maxC) {
            System.out.println("bib max");
            return;
        }
        int i=nbdoc- 1;
        while (i >=0 && listdoc[i].getNumIdentification() >d.getNumIdentification()) {
            listdoc[i +1]=listdoc[i];
            i--;
        }
        listdoc[i + 1] = d;
        nbdoc++;
        }


    
    }

    public void supprim_doc(int num) {
        for (int i = 0; i <nbdoc; i++) {
            if (listdoc[i].getNumIdentification() == num) {
                for (int j=i; j< nbdoc - 1; j++) {
                    listdoc[j] =listdoc[j + 1];
                }
                listdoc[nbdoc-1] = null;
                nbdoc--;
                break;
            }
        }
    }

    public void Inventaire_doc() {
        for (int i =0; i < nbdoc; i++) {
            if (listdoc[i] instanceof Livre) {
                System.out.println( this.toString()  +"cest un livre");
            }
            else if (listdoc[i] instanceof Article) {
                System.out.println( this.toString() +"cest un artcle");

            }
            else if (listdoc[i] instanceof Periodique) {
                System.out.println( this.toString()+ "cest un periodique");

            }
            else {
                System.out.println( this.toString()  +"cest un document" );
        }
        }


    }

    Bibliotheque liste_livre(){
        Bibliotheque b1 = new Bibliotheque();
        for (int i = 0; i < nbdoc; i++){
            if (listdoc[i] instanceof Livre){
                listlv[i] = listdoc[i];
            }
        }
    }

    Bibliotheque liste_document(){
        Bibliotheque b2 = new Bibliotheque();
        this.listdc = new Document[maxC];
        for (int i = 0; i < nbdoc; i++){
            if (listdoc[i] instanceof Document){
                listdc[i] = listdoc[i];
            }
        }
    }
    Bibliotheque  liste_article(){
        Bibliotheque b3 = new Bibliotheque();
        for (int i = 0; i < nbdoc; i++){
            if (listdoc[i] instanceof Article){
                listar[i] = listdoc[i];
            }
        }
    }
    Bibliotheque liste_periodique(){
        Bibliotheque b4 = new Bibliotheque();        for (int i = 0; i < nbdoc; i++){
            if (listdoc[i] instanceof Periodique){
                listper[i] = listdoc[i];
            }
        }
    }

}
