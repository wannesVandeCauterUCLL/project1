package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Driehoek {

    public Punt getHoekpunt1() {
        return hoekpunt1;
    }

    public Punt getHoekpunt2() {
        return hoekpunt2;
    }

    public Punt getHoekpunt3() {
        return hoekpunt3;
    }

    private Punt hoekpunt1;
    private Punt hoekpunt2;
    private Punt hoekpunt3;

    public Driehoek(Punt hoekpunt1, Punt hoekpunt2, Punt hoekpunt3){
        this.hoekpunt1 = hoekpunt1;
        this.hoekpunt2 = hoekpunt2;
        this.hoekpunt3 = hoekpunt3;
    }

    public boolean liggenOpEenLijn(Punt p1,Punt p2,Punt p3){

        ArrayList<Punt> puntSet = new ArrayList<Punt> (Arrays.asList(p1, p2,p3));

        ArrayList<Integer> xCompare = new ArrayList<Integer>();
        ArrayList<Integer> yCompare = new ArrayList<Integer>();


        for(Punt punt: puntSet){
            if(xCompare.contains(punt)) xCompare.add(1);
            if(yCompare.contains(punt)) yCompare.add(1);

        }
        if(xCompare.size() == 3 || yCompare.size() == 3){
            return true;
        }

        return false;

    }

    public void sorteerHoekpunten(){
        ArrayList<Punt> puntSet = new ArrayList<Punt> (Arrays.asList(hoekpunt1, hoekpunt2,hoekpunt3));

        Collections.sort(puntSet, Punt.xComparator);
        Collections.sort(puntSet, Punt.yComparator);

        hoekpunt1 = puntSet.get(0);
        hoekpunt2 = puntSet.get(1);
        hoekpunt3 = puntSet.get(2);

    }

    public String toString() {
        String result = "hoekpunt1: (%d, %d) - hoekpunt2: (%d, %d) - hoekpunt3: (%d,%d)";
        String.format(result, hoekpunt1.getX(),hoekpunt1.getX(),hoekpunt2.getX(),hoekpunt2.getY(),hoekpunt3.getX(),hoekpunt3.getY());
        return result;
    }
}
