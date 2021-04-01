package domain;

public class HangMan {

    private Speler speler;

    public Speler getSpeler() {
        return speler;
    }

    public WoordenLijst getWoordenLijst() {
        return woordenLijst;
    }

    public boolean isGewonnen() {
        return gewonnen;
    }

    public TekeningHangMan getTekening() {
        return tekening;
    }

    private WoordenLijst woordenLijst;

    private boolean gewonnen;
    private TekeningHangMan tekening;
    private HintWoord hintWoord;
    private int beurtenOver;



    public HangMan(Speler speler, WoordenLijst woordenlijst) throws DomainException {
        setSpeler(speler);
        setWoordenLijst(woordenlijst);
        this.gewonnen = false;
        this.tekening = new TekeningHangMan();
        this.hintWoord = new HintWoord(this.woordenLijst.getRandomWoord());
        this.beurtenOver = 18;

    }

    public boolean isGameOver(){
        return this.beurtenOver > 0;
    }

    public void raad(char _char){
        if(this.beurtenOver > 0){
            this.beurtenOver -= 1;
            if(hintWoord.isGeraden()) this.gewonnen = true;
        }


    }

    public String getHint(){
        return hintWoord.getHint();
    }

    public void setSpeler(Speler _speler) {
        try {
            if(_speler  == null ) throw new DomainException("Speler mag niet null zijn");
            this.speler = speler;
        }catch(DomainException e){
            System.out.println(e);
        }
    }

    public void setWoordenLijst(WoordenLijst _woordenLijst){
        try {
            if(_woordenLijst  == null ) throw new DomainException("Woordenlijst mag niet null zijn");
            this.woordenLijst = _woordenLijst;
        }catch(DomainException e){
            System.out.println(e);
        }
    }
}
