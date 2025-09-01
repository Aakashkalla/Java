public class BoxCost extends BoxWeight{
    double cost;

    BoxCost(){
        this.cost = -1;
    }

    BoxCost(double l, double w, double h, double weight, double cost){
        super(h, l, w, weight);
        this.cost = cost;
    }

    BoxCost(BoxCost other){
        this.h = other.h;
        this.w = other.h;
        this.l = other.h;
        this.weight = other.weight;
        this.cost = other.cost;
    }
}
