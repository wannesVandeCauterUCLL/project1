package domain;

public class Rechthoek extends Vorm{

    private int breedte;
    private int hoogte;
    private Punt linkerBovenHoek;

    public Omhullende getOmhullende() {
        return omhullende;
    }

    private Omhullende omhullende;

    public Rechthoek(Punt linkerBovenhoek, int breedte, int hoogte) throws DomainException {
        try {
            if (breedte <= 0 || hoogte <= 0) {
                throw new DomainException("Rechthoek heeft een breedte en hoogte groter dan 0 nodig.");
            }
            if (linkerBovenhoek == null) {
                throw new DomainException("Rechthoek heeft een linkerbovenhoek nodig.");
            }
            this.breedte = breedte;
            this.hoogte = hoogte;
            this.linkerBovenHoek = linkerBovenhoek;


            this.omhullende = new Omhullende(linkerBovenhoek, breedte,hoogte);


        }catch(DomainException e){

        }


    }

    public int getBreedte() {
        return this.breedte;
    }

    public int getHoogte() {
        return this.hoogte;
    }

    public Punt getLinkerBovenhoek() {
        return this.linkerBovenHoek;
    }

    public boolean equals(Object o) {
        if (o instanceof Rechthoek) {
            if (this.linkerBovenHoek == ((Rechthoek) o).linkerBovenHoek && this.hoogte == ((Rechthoek) o).hoogte && this.breedte == ((Rechthoek) o).breedte) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String ret = "Rechthoek: linkerbovenhoek: ";
        ret += this.linkerBovenHoek.toString();
        ret += " - breedte: ";
        ret += this.breedte;
        ret += " - hoogte: ";
        ret += this.hoogte;
        return ret;
    }
}

