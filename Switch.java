/* 
import java.io.IOException;
import java.util.Scanner;
class Switch 
{
    public static void main (String [] args)
    {
        String day="tuesday";
        String result=" ";
       

          result= switch (day){
            case "sunday","saturday": yield "6am";
          //  System.out.println("6am");
                
            case "monday","tuesday": yield "7am";
          //  System.out.println("7am");
        
            default : yield"Somthing went wrong";
            //System.out.println("somthing went wrong ");
          }; System.out.println(result);
        
    }
    
}


public class switch1
{
    public static void main (String [] args)
    {
        String day="tuesday";
        String result=" ";
       

          result= switch (day){
            case "sunday","saturday"-> result= "6am";
          //  System.out.println("6am");
                
            case "monday","tuesday"-> result= "7am";
          //  System.out.println("7am");
        
            default ->result="Somthing went wrong";
            //System.out.println("somthing went wrong ");
          }; System.out.println(result);
        
    }
    
}

public class Switch2
{
    public static void main (String [] args)
    {
        String day="tuesday";
        
           switch (day){
            case "sunday","saturday"-> 
            System.out.println("6am");
                
            case "monday","tuesday"-> 
           System.out.println("7am");
        
            default ->
            System.out.println("somthing went wrong ");
          }; 
        
    }
    
}


public class Switch3
{
    public static void main (String [] args)
    {
        String day="tuesday";
        String result=" ";
       

          result= switch (day){
            case "sunday","saturday"->"6am";
          //  System.out.println("6am");
                
            case "monday","tuesday"->"7am";
          //  System.out.println("7am");
        
            default ->"Somthing went wrong";
            //System.out.println("somthing went wrong ");
          }; System.out.println(result);
        
    }
    
}
    
class While  // we use do while when we want to execute false condition 
{
    public static  void main (String [] args)
    {
        int i=1;
    do
    {
        System.out.println("hi "+ i);
        i++;
    }while(i<=10);
    } 
    
}

class For
{
    public static void main(String [] args)
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("hi "+ i);
            for(int j=0;j<=10;j++)
            {
                System.out.println("hello "+ j);
            }
           

        }
    }
}
    
class For1
{
    public static void main (String[]args)
    {
        int i=0;
        for(;i <=10;)
        {
            System.out.println("Hi Paras " + i);
            i=i+1;

        }
    }
}



class calculator
{
    public int add(int i,int j)
    {
        int r= i+j;
        return r;
    }
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two no which you want to add");
        int i=s.nextInt();
        int j=s.nextInt();
        calculator calc= new calculator();
        
        
        int result= calc.add( i, j);
        System.out.println("sum is : "+result);


    }

    
}



class computer
{
    public void add(int a,int b,int c)
    {
        int r=a+b+c;
        System.out.println(r);
    }

    public void add(int a,int b)
    {
        int r1=a+b;
        System.out.println(r1);
    }
    public static void main(String[]args)
    {
        computer com = new computer();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter three no");
        int a=S.nextInt();
        int b=S.nextInt();
        int c=S.nextInt();
        com.add(a,b,c);
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter two no");
        int a1=S1.nextInt();
        int b1=S1.nextInt();
        

        com.add(a1,b1);

    }
}




class arrays
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int j=s.nextInt();
        int num[]=new int [j];
        int i=0;
        for ( i=0;i<j;i++)
        {
           num[i]= s.nextInt();
            
            
        }
        System.out.println();
        for(int k:num)
        {
            System.out.print(k);
            
        }
        
        
    }
}

// static variavle,method

class Static 
{
    String name; // Instance variable
    static  String  Brand; // satic variable
    int age;


    public void show() // we cannot use static variable inside non static method .
    {
        System.out.println(name + " : "+ age +" : "+ Brand);
    }
    public static void show1(Static obj) //we cannot use non static variable inside static method .
    {
        System.out.println(obj.age+" : "+obj.name+" : "+ Brand);
    }
    public static void main(String []args)
    {
        Static s=new Static();
        s.name="paras";
        s.age=20;
        Static.Brand="Google Pixel";
        Static s1=new Static();
        s1.name="paras1";
        s1.age=21;
        Static.Brand="Samasung";
        s.show();
        s1.show();
        Static.show1(s1);
    }
}
class Static1
{
    String name; // Instance variable
    static  String  Brand; // satic variable
    int age;

    static {       // static block is use to hold static variable 
        Brand="Dell";
    }


    public void show() // we cannot use static variable inside non static method .
    {
        System.out.println(name + " : "+ age +" : "+ Brand);
    }
    public static void show1(Static1 obj) //we cannot use non static variable inside static method .
    {
        System.out.println(obj.age+" : "+obj.name+" : "+ Brand);
    }
    public static void main(String []args)
    {
        Static1 s=new Static1();
        s.name="paras";
        s.age=20;
       // Static.Brand="Google Pixel";
        Static1 s1=new Static1();
        s1.name="paras1";
        s1.age=21;
      //  Static.Brand="Samasung";
        s.show();
        s1.show();
        Static1.show1(s1);
    }
}
class Main
{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("paras ");
        sb.append("yadav");
        sb.capacity();
        sb.insert(0, "Rao ");
        sb.delete(10,15);
        System.out.println(sb);

    }
}

class string 
{
    public static void main(String[] args) {
        String str=new String("HELLO");
        String str1=str;
        String str2="HELLO";
        String str3="HELLO";
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str2));
    }
}
class Encapsulation
{
    private int age;
    private String name;
    private String subject;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
       this.age = age; // if we have same local and instance variable name then we use this keyword to differenciate between these two.
     // age=age;  // here age is a local variable and it is calling itself so we does not get instance variable 
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
      // name=name;    // here age is a local variable and it is calling itself so we does not get instance variable 
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
       this.subject = subject;
     // subject=subject;   //  here age is a local variable and it is calling itself so we does not get instance variable 
    }
    public static void main(String[] args)
     {
        Encapsulation en= new Encapsulation();
        en.setAge(20);
        en.setName("paras");
        en.setSubject("Java");
        System.out.println(en.getAge()+" : "+en.getName()+" : "+en.getSubject());

    }
}
class constructor
{
    private int age;
    private String name;
    private String tech;
    public constructor()  //default constructor
    {
        System.out.println("default constructor");

    }
    public constructor(int age,String name) // parametrized constructor .
    {
        this.age=age;
        this.name=name;
       

    }
    public constructor(String tech)
    {
        this.tech=tech;
    }

    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        constructor con =new constructor(20,"paras");
        constructor con1=new constructor("java");
        // con.setAge(19);
        // con.setName("paras1");
        System.out.println(con.getAge()+" : "+con.getName()+" : "+con1.getTech());

    }
  
}




class anonymous
{
    public anonymous()
    {
        System.out.println("object is created ");
    }
    public void show()
    {
        System.out.println("in a show");
    }
    public void config()
    {
        System.out.println("in a config");
    }
    public static void main(String[] args) {
        new anonymous().show();
        new anonymous().config();

    }
}




class A
{
    int n;
    public A()
    {
        System.out.println("default constructor of A ");
    }
    public A(int n)
    {
        this.n=n;
        
        System.out.println("parametrized constructor of A");

    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("default constructor of B");
    }
    public B(int n)
    {
       // super(n); // this super method call the parametrized construtor of superclass .
        this();
       this.n=n;
        System.out.println("parametrized constructor of B");
    }
 

}
public class Main1
{
    public static void main(String [] args)
    {
        B b=new B(22);
        b.n=21;
        System.out.println(b.n);


    }
}




class A1
{
    public void show()
    {
        System.out.println("in a show");
    }
}
class B1 extends A1
{
    public void show()
    {
        System.out.println("in b show");
    }
}
class C1 extends A1
{
    public void show()
    {
        System.out.println("in c show");
    }
}
class main1
{
    public static void main(String[] args)  // dynamic method dispatch :- here we decide which show() method will call at run time .
    {                                        // at runtime we decide which method will be called .
        A1 obj=new A1();
        obj.show();              // here we create one refrence variable of class A that refers/points to the object of A class in heap 

        obj=new B1();
        obj.show();        // here we use one refrence variable of class A that refers/points to the object of B class in heap 


        obj=new C1();
        obj.show();          // here we use one refrence variable of class A that refers/points to the object of c class in heap 

        
    }
}




class A12 // if we create this class as final then we cannot extends it or inherite it
{
  
  // final public void show() // if we create this method final so we canot override this method .
    public void show() 
    {
        System.out.println("in a show");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
class B12 extends A1
{
    public void show()
    {
        System.out.println("in b show");
    }
}
class C12
{
    public static void main(String[] args) {
        B1 obj=new B1();
        obj.show();
    }
}



class A2
{  
    
     public static void main(String[] args) {
       final  int n=10 ;// if we create this variable final then its value become constant or immutable .
       // n=90;
    
    System.out.println(n);
    }

}

//final class A3 // if we create this class as final then we cannot extends it or inherite it
class A3
{
  
  // final public void show() // if we create this method final so we canot override this method .
    public void show() 
    {
        System.out.println("in a show");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
class B2 extends A3
{
    public void show1()
    {
        System.out.println("in b show");
    }
}
class C2
{
    public static <B> void main(String[] args) {
        
        A3 obj=new B2();  // if we have different method name and we are using refrence variable of parent class and object of child class then it is called upcasting .
        obj.show();
        
        B2 obj1= (B2) obj; // down casting
       obj1.show1();
    }
}



abstract class demo
{
    public abstract void show();
    
    public void config()
    {
        System.out.println("in demo config");
    }
}
class demo1 extends demo  
{
    public void show()
    {
        System.out.println("in demo1 show");
    }
}
class my 
{
    public static void main(String[] args) {
        demo1 obj=new demo1();
        obj.show();
        obj.config();
    }
}
//Inner class
class computer1
{
    public void show()
    {
        System.out.println("in computer show");
    }
    class laptop1
    {
        public void show1()
        {
            System.out.println("in laptop show");
        }
    }
    public static void main(String[] args) {
        computer1 con =new computer1();
        con.show();
        
        computer1.laptop1 obj= con.new laptop1();
        obj.show1();

    }

}



//Anonymous inner class 

class computer2
{
    public void show()
    {
        System.out.println("in computer show");
    }
   
    
    public static void main(String[] args) 
    {
        computer2 con = new computer2()
        {
            public void show()   // it will override the show() method .
            {
                System.out.println("in inner config");
            }
        };
        con.show();

    }
}

// Abstract Anonymous inner class .
// Method 1
abstract class Abs
{
    public abstract int  demo(int n);

    public static void main(String[] args) 
    {
        Abs a=new Abs() 
        {
            public int demo(int age)
            {
                return age;
            }

        };
        int b=a.demo(20);
        System.out.println(b);
    }
}



//Interface 
interface A4
{
    void show();
    int age(int n);
    String name(String  s);
}
class B3 implements A4
{
    public void show()
    {
        System.out.println("in B3 show");
    }
    public int age(int a)
    {
        return a;
    }
    public String name(String s)
    {
        return s;
    }
    public static void main(String[] args) {
        B3 obj=new B3();
       int a= obj.age(20);
       String n = obj.name("paras");
        obj.show();
        System.out.println(a + " : " + n + " : " );

    }
}
// functional interface 
@FunctionalInterface
interface i1
{
    void show();
   // void config();// we cannot define more than one abstract method in functional interface .



    public static void main(String [] args)
    {
        i1 obj = new i1()
        {
            public void show()
            {
                System.out.println("in Mango show");
            }
        };obj.show();

    }
}
//Functional interface with lambda expression 

@FunctionalInterface
interface i
{
    void show();
   // void config();// we cannot define more than one abstract method in functional interface .



    public static void main(String [] args)
    {
        i obj = ()->  System.out.println("in MAngo show");
            
        obj.show();

    }
}
//Functional interface with return statement 
@FunctionalInterface
interface i2
{
    int  show(int age);
   // void config();// we cannot define more than one abstract method in functional interface .



    public static void main(String [] args)
    {
        i2 obj = (int g)->  g;
            
        //obj.show(20);
        System.out.println(obj.show(21));

    }
}

//Enum also called Enumeration 
enum object
{
    Running ,Failed,Success,pending;

    
    public static void main(String[] args) {
        object obj=object.Running;
       System.out.println(obj.ordinal());
       object[] s=object.values();
       for(object o: s)
       {
        System.out.println(o+" : " + o.ordinal() );
       }
    }

} 

enum status
{
    running, pending, failed, success ;

    public static void main(String[] args) {
        status s=status.success;
        if (s==status.pending)
        System.out.println("plz wait transaction is in preceed ");
        else if(s==status.failed)
        System.out.println("try again later");
        else if (s==status.running)
        System.out.println("work in progress");
        else
        System.out.println("transaction succesfully");
        
        
    }


}

enum Status
{
    running, pending, failed, success ;

    public static void main(String[] args) {
        Status s=Status.success;
        switch(s)
        {
        case pending:
        System.out.println("plz wait transaction is in preceed ");
        break;
        case failed:
        System.out.println("try again later");
        break;
        case running:
        System.out.println("work in progress");
        break;
        default:
        System.out.println("transaction succesfully");
        break;
    }
        
        
    }


}
enum laptop
{
    dell(2000),lenovo(1700),asus(15000),macbook(),accer(); // these are named constant or objects 
    //private int price;
    // public int getPrice() {
    //     return price;
    // }
    // public void setPrice(int price) {
    //     this.price = price;
    // }
    public int price;
    private laptop()
    {
        price=1000;
    }
    private laptop(int price)
    {
        this.price=price;

    }
    public static void main(String[] args) {
        laptop[] l=laptop.values();
        for(laptop L:l)
        {
            System.out.println(L+" : "+L.price);
        }
    }

}

class tom extends Thread
{
    public void run()
    {
        for (int i=0;i<100;i++)
        System.out.println("Hi");
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {e.printStackTrace();}
 
    }
}
class jerry extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        System.out.println("Hello");
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) { e.printStackTrace();}
        
    }
}
class t 
{
    public static void main(String[] args) {
        tom obj =new tom();
        jerry obj1=new jerry();
       System.out.println(obj.getPriority()); 
        
        
        obj.start();
        
        obj1.start();
    }
}

class tom1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<100;i++)
        System.out.println("hi");
    }
}
class jerry1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<100;i++)
        System.out.println("hello");
    }
}
class t1
{
    public static void main(String []args)
    {
        Runnable obj=new tom1();
        Runnable obj1=new jerry1();

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);

        t1.start();
        t2.start();

    }
}
*/
// ToString() method is use when you want to access the parametrized constructor without using getter and setter 
class Paras
{
    private String name;
    private int age;
    private int Marks;
    private String tech;

    
    public Paras(String name, int age, int marks, String tech) {
        this.name = name;
        this.age = age;
        Marks = marks;
        this.tech = tech;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMarks() {
        return Marks;
    }
    public void setMarks(int marks) {
        Marks = marks;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Paras [name=" + name + ", age=" + age + ", Marks=" + Marks + ", tech=" + tech + "]";
    }
    public static void main(String[] args) {
        Paras obj=new Paras("paras", 21, 95, "java");
        System.out.println(obj);
    }
}
// Wrapper class
class paras
{
    public static void main(String[] args) 
    {
        int num =10;
        @SuppressWarnings("removal")
     //   Integer num1 = new Integer(num); // here we store primitive data type value into an object , also called boxing .
       // Integer num1= num; // auto-boxing 

      //  int num2=num1 ; // auto-unboxing
     // int num2= num1.intValue(); // here we fetch primitive datatype value from an object .
      String str="12";
      int num3=Integer.parseInt(str);

      int num4=10;
      String str1=Integer.toString(num4);
    //  System.out.println(num2);
      System.out.println(str1);
      System.out.println(num3);

    }
}
// Exception Handling Try Catch 
class paras1
{
    public static void main(String[] args) {
        int i=0;
        int j=18;

        try{
            j=j%i;
        }catch(Exception obj)
        {
            System.out.println("Somthing went wromg "+obj);
        }
        System.out.println(j);

    }
}
// try with multiple ctach 
class paras2
{
    public static void main(String[] args) {
        
        int i=0;
        int j=18;
        int num[]=new int[5];

        try
        {
            j=j%i;  // this is a critical statement so if any one statement in the try block generates an exception then other remaining statements in the try block are skipped and execution may jumps to catch block that is palced next to the try block.
            System.out.println(num[0]);
            System.out.println(num[5]);



        }catch(ArithmeticException e){
            System.out.println("canot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("stay in your limits");
        }catch(Exception e){
            System.out.println("Somthing went wrong ");
        }
        System.out.println(j);
        System.out.println("hi paras");
    }

}
//
class paras3
{
    public static void main(String[] args) {
        
        int i=0;
        int j=18;
        int num[]=new int[5];

        try
        {
            j=j%i;  // this is a critical statement so if any one statement in the try block generates an exception then other remaining statements in the try block are skipped and execution may jumps to catch block that is palced next to the try block.
            if(j==0) throw new ArithmeticException(); // throw keyword is used to throw the exception and catch will catch the exception .
            System.out.println(num[0]);
            System.out.println(num[5]);throw new ArrayIndexOutOfBoundsException();



        }catch(ArithmeticException e){
            System.out.println("canot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("stay in your limits");
        }catch(Exception e){
            System.out.println("Somthing went wrong ");
        }
        System.out.println(j);
        System.out.println("hi paras");
    }
    
}
// Customize exception 
class ParasException extends Exception {
    public ParasException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int i = 3;
        int j = 0;
        
        try {
           j = j/i;
            if (j == 0) {
                throw new ParasException("i do not know");
            }
            
        } 
         catch (ParasException p) {
            j = j % 1; 
            System.out.println("Something went wrong: " + p);
        }
        
        System.out.println("Final value of j: " + j);
    }
}
















