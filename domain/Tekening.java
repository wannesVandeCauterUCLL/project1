package domain;
import java.util.*;

public class Tekening {
    String naamTekening;
    public static final int MIN_X = 0;public static final int MIN_Y = 0;
    public static final int MAX_X = 399; public static final int MAX_Y = 399;
    ArrayList<Vorm> vormen;

    public Tekening(String naamTekening) {
        if(isValidNaam(naamTekening)){
            this.naamTekening = naamTekening;
        }
        else{
            throw new IllegalArgumentException("Naam mag niet leeg zijn.");
        }
        vormen = new ArrayList<>();
    }

    public static boolean isValidNaam(String naamTekening){
        return naamTekening != null && !naamTekening.equals("") && !naamTekening.equals(" ");
    }

    public String getNaam(){
        return this.naamTekening;
    }

    public void voegToe(Vorm vorm){
        if (vorm != null && !this.bevat(vorm)) {
            vormen.add(vorm);
        }
    }

    public Vorm getVorm(int vorm){
        return vormen.get(vorm);
    }

    public int getAantalVormen(){
        return vormen.size();
    }

    public void verwijder(Vorm vorm){
        vormen.remove(vorm);
    }

    public boolean bevat(Vorm vorm){
        return this.vormen.contains(vorm);
    }

    public boolean bevatVorm(Vorm vorm){
        return bevat(vorm);
    }

    public boolean equals(Tekening tekening){
        if(tekening == null){
            return  false;
        }
        else{
            return this.getAantalVormen() == tekening.getAantalVormen() && this.vormen.containsAll(tekening.vormen);
        }

    }
}
