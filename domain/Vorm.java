package domain;

import javafx.scene.paint.Color;
import ui.Drawable;

public abstract class Vorm implements Drawable {
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
