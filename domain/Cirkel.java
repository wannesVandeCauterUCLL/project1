package domain;

public class Cirkel extends Vorm{
    private Punt middelPunt;
    private int radius;
        public Cirkel(Punt punt, int radius) throws DomainException {
            this.middelPunt = punt;
            if(punt == null){
                throw new DomainException("punt mag niet leeg zijn");
            }
            if(radius<=0){
               throw new DomainException("int: Radius, kan niet <0 of 0 zijn.");
            }
            else{
                this.radius = radius;
            }


        }
    private void setMiddelPunt(Punt punt){
            this.middelPunt = punt;
        }

        private void setRadius(int radius){
            this.radius = radius;
        }

        public Punt getMiddelPunt(){
            return this.middelPunt;
        }

        public int getRadius(){
            return this.radius;
        }

        public boolean equals(Cirkel cirkel){

            return this.middelPunt == cirkel.middelPunt && this.radius == cirkel.radius;
        }
        public String toString(){
            return "Cirkel: middelpunt: ("+middelPunt.getX()+", "+middelPunt.getY()+") - straal:"+radius;
        }

}
