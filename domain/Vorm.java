package domain;

import javafx.scene.paint.Color;
import ui.Drawable;


public abstract class Vorm implements Drawable {
    private Omhullende omhullende;

    private static OmhullendeFactory omhullendeFactory = new OmhullendeFactory();

    public Vorm(){

    }


    public void create_omHullende(Object vorm) throws DomainException {
        this.omhullende = omhullendeFactory.getOmhullende(vorm);
    }



    public Omhullende getOmhullende() {
        return this.omhullende;
    }

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
