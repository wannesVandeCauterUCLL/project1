package domain;

public class Speler {

    private String naam;
    private int score;

    public Speler(String naam) {
        this.naam = naam;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getNaam() {
        return naam;
    }

    public void addToScore(int _score){
        this.score += _score;
    }

    public boolean equals(Speler _speler){
        if(this.naam.equals(_speler.naam) && this.score == _speler.score) return true;
        return false;
    }


}
