package _39_Inheritance;

public class Box {
   private double l;
   double w;
   double h;

   Box(){
    this.l=-1;
    this.w=-1;
    this.h=-1;
   }

   Box(double side){
    this.l=side;
    this.w=side;
    this.h=side;
   }

   Box(double l,double h,double w){
    this.l=l;;
    this.w=w;
    this.h=h;
   }

   Box(Box old){
    this.h=old.h;
    this.l=old.l;
    this.w=old.w;
   }

   public static void information(){
    System.out.println("Running the Box");
   }
}
