package Introduction_and_Basic_OOPS;
  class  Employee{
      int id;
      String Name;
      long salary;


      public    void PrintDetails(){
          System.out.println( "My Usn is 1RR19CS008"+id);
          System.out.println( "And My name is"+Name);

      }
      public  long getSalary(){
          return  salary;
      }

}

public class OOPS_38 {
    public static void main(String[] args) {
        //       System.out.println(afroz.id);
//        System.out.println(afroz.Name);
        System.out.println("This is our Custom Class");
        Employee afroz=new Employee();   //Instantiation a new Employee Object ;
//        Settting Attribute for Afroz Alam

        afroz.id=8;
        afroz.Name="Afroz Alam";
        afroz.salary=1800000;
//        Setting Attribute for Mahesh Ganjaswag

        Employee mahesh=new Employee();
        mahesh.id=10;
        mahesh.Name="Mahesh Ganjaswag";
        mahesh.salary=1800000;


        afroz.PrintDetails();
        mahesh.PrintDetails();
        long salary=mahesh.getSalary();
        System.out.println("And our Sallary is same"+salary);

         long salarsy=afroz.getSalary();
        System.out.println("And our Sallary is same"+salary);


    }
}
