/*
 1.Features of java
 - java is always within top 5 languages list
 -In every 6 months minor updates of java released 
 -Easy to read
 -Maintainable
 -Follow WORA (write once read anywhere) concept
 -OOPs Language
 -Multithereading 
 -has collection api
 -exception handling 
 -java is platform Independent 

 2.History of java
 -java language first realeased by sun microsystem in 1995
 -But after that oracle brought the sun microsystem 
 

 3.Editor - it is a software use to write code ex:-notepad,notepad++,vs code, sublime etc

 IDE(integrated development environment) - it is a software use to write code and compile and run the code. ex:- eclipse ,intelij ide, visual studio code. 
 

 4.How Java Works ?
 - At first our java file is converted/compiled into byte code by compiler at JVM and then byte code runs on JRE
 
* with jdk we also get jre and jvm with it 

* DataBase is used to store data and it is a permanent and persistent storage which means data will remain there if the machine get shutdowns 

variables
-variables is a type of box in which we store data and attach a type with it . type can be a number, text , image etc 
-variables is a type of box in which we store data and a type is attached with it . type can be a number, text , image etc thus a box is known as variable and  name or values are present in it 


DataType
- Datatype describes the type of data stored in the variable .

DataType are categories into primitive and non primitive datatype .
- Primitive datatype are simple and predefined type like integer,float,character and booleans used for basic data storage 
these are the most basic building blocks for data manipulations .

types of primitive datatype
- Every type have different size to it .
1. Integer= byte (1 bytes),short (2 bytes),int (4 bytes),long(8 bytes) 
2.Float = float(4 bytes) , doubles(8 bytes)
float vs double
double have more precision than float by default java support double.
3. character= char(2 byetes) ( it represents the single letter enclosed inside the single quorts )
4 Boolean = Boolean it can be either true or false .

-NoN Primitive datatype are more complex and user defined datatype and more sophisticated structure ex:- string ,class,interface,Arrays
 non primitive datatype are also known as refrence type.

 what is literals ?
 -literal is a source code representation of a fixed value eg:- 20000l represent long type of integers , 20.5f represents float 
 
 their are many ways to represent integer using literal 

 a.decimal
 - int num =10 ,int num=10004.
  here literal in decimal must start with 10

 b.binary
 -int num=0b1010
 here literal in binary must start with 0b or 0B

 c.octal
 int num=0123;
 literal in octal musta start with 0.

 d.Hexadecimal
 -int num =0x138
 -literal in hexadecimal must start with 0x or 0X .


what is type conversion or type casting ?
-type conversion or type casting is the process of converting a value from one data type to another data type 

Different ways to casting
a.Implicit type casting (also called as Type Conversion)
it is a way in which compiler automatically convert smaller size data type in larger .

b. Explicit type casting (also called as type casting in simple words)
manually when programmer cast one data type into other is known as explicit type conversion .
 

*java is an object oriented programing language
In real world every thing is an object and an object has two things 
1.An object Knows somthing (it has its properties)
2.An object do somthing (its behaviour)

To create an object first we need to create a class. class is a blueprint to create an object .

* In java we are managing our memory using two data structure stack and heap  
In java every method has its own stack and stack contain local variables that are declare inside the method,and also contain  and their values .
-Reference variable stored inside the main methods stack and it refers to the object inside the heap memory.
-object is created inside heap memory and instance variable are stored in heap. heap also contain method   

*Arrays = An Array is a collection of similar type of data and store in contagious memory ( in contagious memory allocation we store file in continious mammer  types of contagious memory location are 1.fixed partation and variable partation ) 
1.Why we need arrays ?
- if you want to store multiple values inside a particular variable than we use array
Syntax for creating an array :-
1.Dynamic Array  // by default all the value are zero.
int num[] = new int[10];

2.Static Array // In this we are adding values manually .
int num[]={4,5,7,8};

*Enhanced For loop
-For traversing any collection and array without index we can use enhanced for loop . 

* Static Keyword
- when we are using static keyword with variable , block , method it become independent of object 
-In other words if we declare any variable using static then all the object points to the same static variable. if any object modify the value of variable then change can be seen in other object as well
- if we declare a variable static then it will be common to all objects .
- also we can use/call static variable,Method using class name Syntax:- [className.StaticVariable= value; ]
-We can use static variable inside static Method but we cannot use non static variable(instance variable) in static method .


*Drawback of array
-Array is an object 
-Fixed size = size of an array is fixed
-Insertion and deletion = in case of inserting an element into an array require moving each elements from its original location to the new available slot .
-single data type = arrays are designed to store elements of the same type .
-memory waste = if you allocate an array that is larger tahn needed. 

* String = String is a sequence of character enclosed in double quorts. string is a non-primitive data type.
-By default String is Immutable .
-String is a class . we can perform operation on it  ex:- charAt(0), length() concat("paras").
syntax :- // below syntax have different memory location .
1.String str="paras"; // here "paras" store in string constant pool inside the heap memory
2.String str=new String("paras");   //here "paras" is stored in heap memory object and str is a refrence variable refer to that object.

-hashcode = hashcode is a unique code given to every object in the heap memory.

* We can create mutable string with the heip of StringBuilder and StringBuffer classes .
StringBuilder and StringBuffer class have different method ex:- append(), capacity() by default 16 , length(),insert(index,value),deletechar().
we can also convert StringBuilder into String by using ToString method() .

-Difference between StringBuffer and StringBuilder is that stringBuilder is thread safe where StringBuffer is not .


* Encapsulation = Binding of data with method to make your program secure from outside world .
-we can access data only in the class in which it is declare .
- We can acchive encapsulation through access specifier (private). and using setter getter method we can set and get values of variable .

benifits of encapsulation:-
1.helpful in achieve abstraction .
2.for security point of view it is most benifitial .  

*This keyword 
-This keyword represents the current object. current object ia an object which is calling the method 
This keyword is used to differentiate between instance variable and local variable .

*Constructor is a block having name as that of class name .
-it does not have any return type or even void .
-it execute automaticaly when an object is created .
 1.Types of constructor :-
-Parametrized constructor
-Default constructor .

* Anonymous objects are those object that does not have any name .
-Anonymous objects are simply created by using new keyword.
-We cannot use the same Anonymous object anagin to call the other method .it can be use only for one time .

* Inheritance is a mechanism that allow one class to inherite the property and feature of another class 
-Types of inheritance 
1.single inheritance = In that one class derived from one only base class .
2.multilevel inheritance = In that derived class act as base class for another class .
3.mutliple inheritance = 
4.hybrid inheritance =
5.Hierarchical inheritance

why multiple inheritance not supported in java 
- To avoid the complexity and unambiguity associated with it 
-but their are some indirect way to acchive multiple inheritance in java using interface .

* this and super method 
-Every constructor in java has a method even if you do not mention it. by default it is there and that is super() method .
-super() method call the superclass constructor . if you pass an agrument in super() method then it will call the parametrized constructor .
-this method call the constructor of the same class . 

* polymorphism is the ability of any data to be processed in more than one form .
-Types of polymorphism
1.Runtime polymorphism
2.compile time polymorphism

* Final keyword is used to make constant we cannot change the value of final keyword 
-Also if we declare a class as final than we cannot inherits/extends that class
-If we create method as final then we cannot override that methdo .


* Abstraction is a process of hiding the implementation details and showing only functionality to the user 

*Abstract Class 
-Abstract class is a ristricted class . we can not create an object of it 
-Abstract class consist of both abstarct as well as non abstract method . but abstract method can only be defined in abstract class . 


* Inner class means class inside the class .

* Interface 
-Interface simply define a set of method but does not implement them 
-A class that implements the interface compulsery to define all the method that are declare in that interface .
-Interface is a collection of method declaration .
Ex of interface are Clonable,serializable interface .

* Functional interface 
- Function interface only define one abstract method .
- we can also implement functional interface using lambda expression 

*Lambda Expression makes our code more consiced and more readable . we use lambda expresion with functional interface 

*Enum also called enumeration 
-Enum serves the purpose of representing a group of named constant in programing language .
-Enum is named constant that we create for error codes .
-Enum is created in place of an object . and Enum is a class so that we can do some operation  ex:- ordinal() gives index of Enum , values() gives list of named constant .
-In Enum all the named constant are defined by using numbers .


* Threads is a class we have to extend it to implement the thread
-Thread is a light weight and smallest unit of a task .
-Threads are useful when you want to execute multiple task at the same time .

-os support multiple software working at the same time thats mean it support multitasking .
-multitasking is the ability of the cpu to perform multiple task at the same time .
-cpu has a concept of time sharing which means each process run for short period of time .
-All thread cannot run at the same time so thread go for time sharing .

-we have to use start() method to start the execution of anew thread . only start() method can call the run() method 

* Runnable an interface we have to implement the runnable to implement thread
syntax :- for object creation in runnable .
Runnable obj=new className(); // runnable object 

Thread t= new Thread(obj); // thread object 

t.start()

* Race Condition 
- Race condition is a condition in which critical section of a program is executed by two or more threads.
-use of thread and mutation at the same time is not good as it create instability in the code .
-synchronization helps to prevent race condition .
- join() method allow main() method to wait for other threads to come back and join .
* Thread safe
-Thread safe means only one thread work at one point .

* Thread state 

NEW ----START()-----> RUNNABLE ---RUN()-------> RUNNING-----SLEEP()-------> WAITING-----STOP-------> DEAD

* Wrapper class
-Wrapper class wrappes the value of primitive data type into an object .
-every primitive data type has their own wrapper class ex:- int -> Integer ,byte-> Byte, short->Short ,long -> Long
-Also Wrapper class convert the value from int to String or vice-versa .

* Exception is an error that may occur during the execution of a program that disturbes the normal flow of a program instruction .
Types of error 
1.compile time error
2.runtime error
3.Logical error

-we can handle exception through the use of try and catch block .

* FrameWork is a set of class and interface which provides a ready-made architecture . 
-Any group of individual object which are represented as a single unit is known as the collection of object 
-collection is used to store multiple values .
-Array is also used to store multiple values but it is not used in dynamic programing .
-Collection API = where you can work with all data structure by using some in-build classes .
Collection is an interface and Collections is a class .

- List is an interface that is implemented by ArrayList,LinkedList,Vector,Stack. it can be defined as an ordered collection of object .
it allows duplicate value/object to store .  
- ArrayList use dynamic array to store the object .the arraylist class maintain the insertion order and is non synchronized .
-LinkedList use doubleyLinkedList to store the object .it maintain the insertion order and is synchronized
-vectors use dynamic array to store elements .it maintains the insertion order and is synchronised
-Stack maintains LIFO principle .it is a subClass of vector .
-Queue maintains FIFO principle . it is an ordered list that holds the elements which are about to processed .
-Set is an interface that is implemented by HashSet,TreeSet. it is an unordered collection of element . it doesnot allow duplicate value 
it doesnot support indexing .

// Map is a collection of key value pair for every value of an element a key is associated with it 
// Map itself is an interface that support key-value pairs. a class that implements Mapis called HashMap .
// In map we can fetch value form it by using the key and we get value .
// we can add elements in a map using the put() method
// keys are unique but values can be repeated . the vaue can be updated
// In map keys are in set while values are in list .
*/


/*public class Paras
 
{
    public static void main (String[] args)
    {
        System.out.print("hello ");
        System.out.print(" paras");
    }
    
}*/
import java.io.*;
class Demo2
{
    public static  void main(String[] args) throws IOException {
        // System.out.println("Enter a no ");
        // int num = System.in.read(); // this method gives ascii value and only applicable for single digit no 0-9 .
        // System.err.println(num-48);
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(i);

    }
}
class Paras
{
    public static void main (String [] args)
    {
        // long num =25;
        // int  f = num;        // it will give us an error
        // System.out.println(f);      

        int num =35;
        double num1=(double)num;
        System.out.println(num1);

    }
}

class ternary
{
    public static void main(String[] args) {
        int num =20;
        boolean result = num%2==0 ? true: false ;
        System.out.println(result);
    }
   
}

class Demo
{
    public static  void main(String[] args) throws IOException {
        // System.out.println("Enter a no ");
        // int num = System.in.read(); // this method gives ascii value and only applicable for single digit no 0-9 .
        // System.err.println(num-48);
        System.out.println("enter the no");
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(i);
        String str = bf.readLine();  // BufferReader gives values as String if you want integer no than convert it into integer using Integer.parseInt .
        System.out.println("enter your name");
        String str1=bf.readLine();
        int num=Integer.parseInt(str);
        System.out.println(num);
        System.out.println(str1);


    }


}




