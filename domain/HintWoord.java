package domain;


public class HintWoord {
    private HintLetter[] hintWoord;
    private String woord;
    public HintWoord(String woord){
        if(woord == null || woord == ""){

        }
        else {
            this.woord = woord;
            char[] ch = new char[woord.length()];
            for (int i = 0; i < woord.length(); i++) {
                ch[i] = woord.charAt(i);
            }
            for (int i = 0; woord.length() > i; i++){
                HintLetter letter = new HintLetter(ch[i]);
                hintWoord[i] = letter;
            }
        }
    }

    public boolean raad(char letter){
        return false;
    }

    public boolean isGeraden(){
        return false;
    }

    public String getWoord(){
        return "";
    }

    public String toString(){
        return "";
    }
}
