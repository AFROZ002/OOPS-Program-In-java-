import java.lang.reflect.Array;
import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {
  int []roll=new int[5];
  String []name=new String[5];
  float []marks=new float[5];
  Student[]students=new Student[5];
//  Student afroz;
//        System.out.println(Arrays.toString(students));



        Student afroz=new Student();
//        afroz.roll=8;
//        afroz.name="Afroz Alam";
//        afroz.marks=75.5f;
        System.out.println(afroz.roll);
        System.out.println(afroz.name);
        System.out.println(afroz.marks);

    }
}
class  Student{
    int roll;
    String name="Kafil";
    float marks=90.9f;
    Student(){
       this.roll=8;
        this.name="Afroz Alam";
        this.marks=75.5f;
    }
}
