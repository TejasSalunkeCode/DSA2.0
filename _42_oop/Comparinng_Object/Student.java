package _42_oop.Comparinng_Object;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;
    
    public Student(int rollno,float marks){
        this.rollno=rollno;
        this.marks=marks;
    }

    @Override
    public String toString(){
        return marks+" "+rollno;
    }

    @Override
    public int compareTo(Student o){
        int diff = (int)(this.marks-o.marks);
        return diff;
    }
}
