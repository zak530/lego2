public class Mattoncino {
    private int codiceunivoco;
    private float peso;
    private int red;
    private int blue;
    private int green;
    private int larghezza;
    private int lunghezza;
    private int altezza;


    public Mattoncino(){

    }


    //codice univoco
    public void setcodiceunivoco(int codiceunivoco){
        this.codiceunivoco = codiceunivoco;
    }

    public int getcodiceunivoco() {
        return codiceunivoco;
    }


    //peso
    public float getpeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }



    //altezza
    public float getaltezza() {
        return altezza;
    }

    public void setaltezza(int altezza) {
        this.altezza = altezza;
    }


    //lunghezza

    public float getlunghezza() {
        return lunghezza;
    }

    public void setlunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }



    //larghezza


    public float getlarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    //red

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }


    //blue

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    //green


    public int getGreen() {
        return green;
    }

    public void setGreen(int green){
        this.green = green;
    }
}
