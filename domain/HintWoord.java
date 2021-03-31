package domain;


public class HintWoord {
    char[] hintwoord;
    boolean[] geraden;

    public HintWoord(String woord){
        if(woord == null || woord == ""){
            throw new IllegalArgumentException("Woord mag niet leeg zijn.");
        }
        else{
            hintwoord = woord.toCharArray();
        }
    }

    public String getWoord(){
        String woord = null;
        for(int i = 0; i<hintwoord.length;i++){
            woord += hintwoord[i];
        }
        return woord;
    }
    public boolean raad(char letter){
        boolean geraden = false;
        for(int i = 0; i<hintwoord.length;i++){
            if(Character.toLowerCase(hintwoord[i]) == Character.toLowerCase(letter)){
                geraden = true;
                if(this.geraden[i]){
                    return false;
                }
                this.geraden[i] = true;
            }
        }
        return geraden;
    }
    public boolean isGeraden(){
        return false;
    }
}
