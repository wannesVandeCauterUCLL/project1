package domain;

public class HintWoord {
    private HintLetter[] hintWoord;
    private String woord;

    public HintWoord(String woord) throws DomainException {
        hintWoord = new HintLetter[woord.length()];
        if(woord == null || woord == ""){
            throw new DomainException("Woord mag niet leeg zijn");
        }
        else {
            this.woord = woord;
            for (int i = 0; woord.length() > i; i++){
                HintLetter letter = new HintLetter(woord.charAt(i));
                hintWoord[i] = letter;
            }
        }
    }

    public boolean raad(char letter){
        boolean raad = false;
        for (int i = 0; woord.length() > i; i++){
            if (hintWoord[i].raad(letter)){
                raad = true;
            }
        }
        return raad;
    }

    public boolean isGeraden(){
        return false;
    }

    public String getWoord(){
        String woord = "";
        for(int i = 0; i<this.woord.length(); i++){
            woord += hintWoord[i].getLetter();
        }
        return woord;
    }

    public String toString(){
        String woord = "";
        for(int i = 0; i<this.woord.length(); i++){
            woord += hintWoord[i].toChar()+" ";
        }
        StringBuffer sb= new StringBuffer(woord);
        return sb.deleteCharAt(woord.length()-1).toString();
    }
}
