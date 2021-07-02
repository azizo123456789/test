public class Ok implements Cloneable{
    private String nom;

    public Ok(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
      if(obj.getClass().equals("class Ok")){
          System.out.println(obj.getClass());
          return true;
      }
      return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
