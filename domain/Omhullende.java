package domain;

public class Omhullende extends Rechthoek {

    public int getMinmiumX() {
        return minmiumX;
    }

    public int getMinmiumY() {
        return minmiumY;
    }

    public int getMaximumX() {
        return maximumX;
    }

    public int getMaximumY() {
        return maximumY;
    }

    private int minmiumX;
    private int minmiumY;
    private int maximumX;
    private int maximumY;


    public Omhullende(Punt linkerBovenhoek, int breedte, int hoogte) throws DomainException {
        super(linkerBovenhoek, breedte, hoogte);
    }

    public static Rechthoek getOmhullende(Object vorm){

        if(vorm instanceof Rechthoek){
            Rechthoek rechthoek = ((Rechthoek) vorm);
            int minmiumX = rechthoek.getLinkerBovenhoek().getX();
            int maximumX = minmiumX + rechthoek.getBreedte();
            int minmiumY = rechthoek.getLinkerBovenhoek().getY();
            int maximumY = minmiumY + rechthoek.getHoogte();
        }

        return null;
    }


}
