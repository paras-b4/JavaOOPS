import java.util.Scanner;
class paras
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
       
        System.out.println("enter the no of rows");
        int r=obj.nextInt();
        System.out.println("enter the no of columns");
        int c=obj.nextInt();
        
        System.out.println("enter the values");
        int a[][]= new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        

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
    public static void main(String [] args)
    {
        B b=new B(22);
        b.n=21;
        System.out.println(b.n);
    }

}

