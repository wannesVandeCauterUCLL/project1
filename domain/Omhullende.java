package domain;

public class Omhullende {
<<<<<<< HEAD

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

    public Rechthoek getOmhullende(Object vorm){

        if(vorm instanceof Rechthoek){
            Rechthoek rechthoek = ((Rechthoek) vorm);
            minmiumX = rechthoek.getLinkerBovenhoek().getX();
            maximumX = minmiumX + rechthoek.getBreedte();
            minmiumY = rechthoek.getLinkerBovenhoek().getY();
            maximumY = minmiumY + rechthoek.getHoogte();
        }

        return null;
    }

=======
    public Omhullende(Punt linkerBovenhoek, int breedte, int hoogte) {
    }
>>>>>>> a020e139aad042b956a8a29314cefc3d3d65be64
}
