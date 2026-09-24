import java.util.*;
public class day1 {
    public static void main(String[] args)
    {
        /*BASIC INFORMATION*/
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=obj.nextLine();
        System.out.println("Enter Age");
        int age=obj.nextInt();
        System.out.println("Enter your Department");
        String department=obj.next();
        System.out.println("Enter your Phone no");
        Long phone=obj.nextLong();
        System.out.println("Enter Marks");
        double marks=obj.nextDouble();
        System.out.println("whether a student(true/false)");
        boolean isStudent=obj.nextBoolean();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Department: "+department);
        System.out.println("Phone no: "+phone);
        System.out.println("Marks: "+marks);
        System.out.println("Is a student: "+isStudent);

/*ARRAY OF INTEGERS*/
       Scanner obj=new Scanner(System.in);
       int size=obj.nextInt();
       int arr[]=new int[size];
       for(int i=0;i<size;i++)
       {
           arr[i]=obj.nextInt();
           System.out.println(arr[i]);
       }    
/*ARRAY OF STRINGS*/
       Scanner obj=new Scanner(System.in);
       int size=obj.nextInt();
       String arr[]=new String[size];
       for(int i=0;i<size;i++)
       {
           arr[i]=obj.next();
           System.out.print(arr[i]+" ");
       }    

/*print even numbers*/
   Scanner obj=new Scanner(System.in);
   int size=obj.nextInt();
   int arr[]=new int[size];
    for(int i=0;i<size;i++)
    {
         arr[i]=obj.nextInt();

   }
   System.out.println("Even numbers are:");
   for(int i=0;i<size;i++)
   {
       if(arr[i]%2==0)
       {
           System.out.print(arr[i]+" ");
       }
   }
   System.out.println();
   System.out.println("Odd numbers are:");
   for(int i=0;i<size;i++)
   {
       if(arr[i]%2!=0)
       {
           System.out.print(arr[i]+" ");
       }
   }
}
}