package domain;

public class LijnStuk extends Vorm{
    private Punt startPunt;
    private Punt eindPunt;

    public LijnStuk(Punt start, Punt eind) throws DomainException {
        this.setStartEnEindPunt(start, eind);
    }

    public void setStartEnEindPunt(Punt start, Punt eind) throws DomainException {
        if (start == null || eind == null || start.equals(eind)){
            throw new DomainException("startpunt en eindpunt mogen niet null zijn en niet gelijk aan elkaar zijn.");
        }
        this.eindPunt = eind;
        this.startPunt = start;
    }

    public Punt getStartPunt(){
        return this.startPunt;
    }
    public Punt getEindPunt(){
        return this.eindPunt;
    }

    public boolean equals(Object o){
        if (o instanceof LijnStuk){
            if (this.startPunt.equals(((LijnStuk) o).startPunt) && this.eindPunt.equals(((LijnStuk) o).eindPunt)){
                return true;
            }
            if (this.startPunt.equals(((LijnStuk) o).eindPunt) && this.eindPunt.equals(((LijnStuk) o).startPunt)){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String lijn = "Lijn: startpunt: ";
        lijn += this.startPunt.toString();
        lijn += " - eindpunt: ";
        lijn += this.eindPunt.toString();
        return lijn;
    }
}
