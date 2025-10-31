public class Main{
    public static void main(String[] args){

        Prodotto castello = new Prodotto(10110,"castello");




        Mattoncino piano = new Mattoncino();
        piano.setcodiceunivoco(1);
        piano.setPeso(23);
        piano.volume(10,10,10);
        piano.setRed(255);
        piano.setGreen(0);
        piano.setBlue(0);



        Mattoncino cerchio = new Mattoncino();
        cerchio.setcodiceunivoco(1);
        cerchio.setPeso(23);
        cerchio.volume(12,10,10);
        cerchio.setRed(255);
        cerchio.setGreen(0);
        cerchio.setBlue(0);



        Mattoncino testa = new Mattoncino();
        testa.setcodiceunivoco(3);
        testa.setPeso(23);
        testa.volume(12,10,10);




        castello.aggiungimattoncino(piano);
        castello.aggiungimattoncino(cerchio);

        System.out.println(castello.pesoprodotto());
        System.out.println(castello.getmattoncinodacodice(1));

        System.out.println(castello);
        System.out.println(piano);
        System.out.println(cerchio);
        System.out.println(castello.numeromattoncini());

        castello.stampaMattonciniColorati(255, 0, 0);

    }
}