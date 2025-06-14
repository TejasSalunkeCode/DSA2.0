package _39_Inheritance;

public class BoxWeight extends Box {
   double weight=8;  

   public BoxWeight(double l,double h,double w,double weight){
    super(l,h,w);//what is this call ? call the parent class constructor

    this.weight=weight;
    
   }
}
