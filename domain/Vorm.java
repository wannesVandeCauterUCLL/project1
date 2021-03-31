package domain;

import javafx.scene.paint.Color;

public abstract class Vorm {
    private Color kleur;

    public Color getKleur(){
        return kleur;
    }

    public void setKleur(Color kleur){
        this.kleur = kleur;
    }
    /**
     * Van waar komt die omhullende hier?
     */
    //public Omhullende getOmhullende(){
    //
    //}
    public String toString(){
        return "De kleur van deze vorm: "+this.kleur+". Omhullende:";//+this.getOmhullende();
    }
}
