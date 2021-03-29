package domain;

public class Punt {

    private int x;
    private int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean equals(Punt _punt){
        if(this.x == _punt.x && this.y == _punt.y) return true;
        return false;
    }

    public String toString(){
        return "X: "+this.x +" Y: "+this.y;
    }
}
