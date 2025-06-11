package _38_oop;

public class mainn {
    public static void main(String[] args) {
     Human kunal=new Human(22, "KUNAL", 10000, false);
     
     Human rahul = new Human(34, "RAHUL", 900000, true);

     System.out.println(kunal.salary);
     System.out.println(rahul.name);
    }
}


// package _38_oop;

// public class mainn {
//     public static void main(String[] args) {
//         Human kunal = new Human(22, "KUNAL", 10000, false);
//         Human rahul = new Human(34, "RAHUL", 900000, true);

//         System.out.println(kunal.name); // shared static variable
//     }
// }
