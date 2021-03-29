package domain;

public class Rechthoek {

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

    public Punt getLinkerBovenhoek(){
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

    public String toString(){
        String ret = "Rechthoek: linkerbovenhoek: ";
        ret += this.linkerBovenHoek.toString();
        ret += " - breedte: ";
        ret += this.breedte;
        ret += " - hoogte: ";
        ret += this.hoogte;
        return ret;
    }
}

