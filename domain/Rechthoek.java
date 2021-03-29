package domain;

public class Rechthoek {

<<<<<<< HEAD
    private Punt linkerBovenhoek;

    public Rechthoek(Punt linkerBovenhoek, int breedte, int hoogte) {
    }

    public Punt getLinkerBovenhoek() {
        return this.linkerBovenhoek;
    }

    public int getHoogte() {
        return 0;
    }

    public int getBreedte() {
        return 0;
    }
=======
    private int breedte;
    private int hoogte;
    private Punt linkerBovenHoek;

    public Rechthoek(Punt linkerBovenhoek, int breedte, int hoogte) throws DomainException {
        if (breedte <= 0 || hoogte <= 0){
            throw new DomainException("Rechthoek heeft een breedte en hoogte groter dan 0 nodig.");
        }
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.linkerBovenHoek = linkerBovenhoek;
    }

    public int getBreedte(){
        return this.breedte;
    }

    public int getHoogte(){
        return this.hoogte;
    }

    public Punt getLinkerBovenHoek(){
        return this.linkerBovenHoek;
    }

    public boolean equals(Object o){
        if (o instanceof Rechthoek){
            if (this.linkerBovenHoek == ((Rechthoek) o).linkerBovenHoek && this.hoogte == ((Rechthoek) o).hoogte && this.breedte == ((Rechthoek) o).breedte){
                return true;
            }
        }
        return false;
    }

>>>>>>> b5ddd95f7a26ccecdbd813a451c40a736763ad0e
}
