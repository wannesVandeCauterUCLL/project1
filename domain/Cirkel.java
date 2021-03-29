package domain;

public class Cirkel {
    private Punt middelPunt;
    private int radius;
        public Cirkel(Punt punt, int radius){
            this.middelPunt = punt;
            this.radius = radius;

        }
    private void setMiddelPunt(Punt punt){
            this.middelPunt = punt;
        }
        private void setRadius(int radius){
            this.radius = radius;
        }
        public Punt getMiddelPunt(){
            return middelPunt;
        }
        public int getRadius(){
            return radius;
        }
        public boolean equals(Cirkel cirkel){
            return this.middelPunt == cirkel.middelPunt && this.radius == cirkel.radius;
        }
        public String toString(){
            return "Cirkel: middelpunt: ("+middelPunt.getX()+", "+middelPunt.getY()+") - straal:"+radius;
        }

}
