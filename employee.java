import java.util.*;
class main
 {
   int n;
   int salary;
   String name;
   
   
   void read()
   {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the names:");
    name=s.next();
    System.out.println("enter employee numbner:");
    n=s.nextInt();
    System.out.println("enter the salary:");
     salary=s.nextInt();
    
    }
    public static void main(String args[])
    {
    int flag=0;
    Scanner obj=new Scanner(System.in);
     main m[]= new main[4];
     for(int i=0;i<2;i++)
     {
     m[i]=new main();
     m[i].read();
     }
     System.out.println("enter the employee  number to be searched:");
     int f=obj.nextInt();
     for(int i=0;i<2;i++)
     {
      if(m[i].n==f)
      {
      
      System.out.println("employee name:"+m[i].name);
     System.out.println("employee number:"+m[i].n);
     System.out.println("employee slary:"+m[i].salary);
         flag=1;
        break;
     }
     }
     if(flag==1)
     {
          System.out.println("found"); 
     }
     else
     {
     System.out.println("not fount");
     }  
    }
    }
    
