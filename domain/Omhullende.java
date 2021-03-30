package domain;

public class Omhullende {

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

}
