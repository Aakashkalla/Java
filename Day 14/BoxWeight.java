public class BoxWeight extends Box {
    double weight;


    BoxWeight(){
        super();
        this.weight = -1;
    }

    BoxWeight(double h, double l, double w, double weight){
        super(l,h,w); //Calling the parent class constructor and used to initialise values present in parent class
        this.weight = weight;
    }
}   
