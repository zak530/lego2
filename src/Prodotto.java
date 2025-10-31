public class Prodotto {

    private int codice;
    private String nome;
    private Mattoncino[] costruzione;
    private int size;
    private float pesotot = 0;
    private int counter = 0;

    public Prodotto(int codice, String nome){
        this.codice = codice;
        this.nome = nome;
        this.costruzione = new Mattoncino[500];
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

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void aggiungimattoncino(Mattoncino a) {
        if (size < costruzione.length) {
            costruzione[size] = a;
            size++;
        }
    }


    public int numeromattoncini(){
        return size;
    }



    public float pesoprodotto(){
        for(int i=0;i<size;i++){
            pesotot+=costruzione[i].getpeso();
        }
        return pesotot;
    }



    public int getmattoncinodacodice(int codice){
        for(int i=0;i<size;i++){
        if(costruzione[i].getcodiceunivoco()==codice){
            counter++;
            }
        }
        return counter;
    }

    public void stampaMattonciniColorati(int red, int green, int blue){
        System.out.println("I mattoncini di colore ("+red+","+green+","+blue+") sono:");
        for(int i=0;i<size;i++){
            Mattoncino m = costruzione[i];
            if (m.getRed()==red && m.getGreen()==green && m.getBlue()==blue){
                System.out.println(m);
            }
        }
    }




    public String toString() {
        String toReturn = nome + "[";
        for (int i = 0; i < size; i++) {
            toReturn += costruzione[i].toString();
            if (i < size - 1) {
                toReturn += ", ";
            }
        }
        toReturn += "]";
        return toReturn;
    }




}
