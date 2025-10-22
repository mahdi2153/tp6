public class documents{
     private String titre;
     private int nid;
     private int nbp;
     private documents[] listdoc;

    public void edition(){
        system.out.println("le titre est"+ titre, "nid est" + nid "nb pages est"+ nbp)
    }

    public documents(String titre, int nid , int nbp){
        this.titre=titre;
        this.nid=nid;
        this.nbp=nbp;
    

    }
    public String titre(){
        return titre;
    }
    public int nid(){
        return nid;
    }
    public int nbp(){
        return nbp;
    }
    public void settitre(String x){
        this.titre=x;

}
public void setnid(int y){
        this.nid=y;}

        public void setnbp(int z){
        this.nbp=z;
        }
        
            

        }
}
