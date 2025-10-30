public class Prodotto {

    private int codice;
    private String nome;
    private Mattoncino[] costruzione;
    private int size;

    public Prodotto(int codice, String nome){
        this.codice = codice;
        this.nome = nome;
        this.costruzione = new Mattoncino[5];
        this.size = 0;
    }

    public int getCodice() {
        return codice;
    }


    public String getnome(){
        return nome;
    }

    public void setCostruzione(Mattoncino[] costruzione) {
        this.costruzione = costruzione;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    private void aggiungimattoncino(Mattoncino a){

        costruzione[size] = a;
        size++;
    }

    public float pesoprodotto(){
        return 1;
    }


    public String toString(){
        String toReturn = "mattoncini[";
        for(int i = 0; i < size; i++){
            toReturn += costruzione[i].toString();
            if(i < size - 1) toReturn += ", ";
        }
        toReturn += "]";
        return toReturn;
    }


}
