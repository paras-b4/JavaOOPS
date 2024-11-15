import java.util.*;


// Linear search
class Demo
{
    
    public static void main(String[] args) {
        int num[]={2,6,5,8,3,4,9};
        int target=9;
        
        int result=Linearsearch(num,target);
        System.out.println("Element found at index : "+ result);
        
    }

    public static int Linearsearch(int num[],int target)
    {
        

        for(int i=0;i<=num.length-1;i++)
        {

            

            if(num[i]==target)
            return i;
           
        }

        return -1;
        
    }
    
}
//Binary serach
class demo
{
    public static void main(String[]args)
    {
        int num[]={3,6,9,10,12,16,20};
        int target=20;
        int result=BinarySearch(num,target);
        System.out.println("Element found at index : "+result);

    }
    public static int BinarySearch(int num[],int target)
    {
        int left=0;
        int right=num.length-1;
      
       
        while(left<=right)
        {
            int mid=(left+right)/2;

            if(num[mid]==target)
            return mid;
            else if (num[mid]>target)
            right = mid-1;
            else 
            left=mid+1;
            
        }
        return-1;
    }
}
//Bubble sort
class Bubble
{
    public static void main(String[] args) 
    {
        int num[]={2,6,3,8,9,4,1,0};
        int size=num.length;
        System.out.println("Array before sorting ");
        for(int n:num)
        {
            System.out.print(n+" ");
        }

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(num[j]>num[j+1])
                {
                    int temp = num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                }
            }
            System.out.println();
          for(int n: num)
            {
                System.out.print(n+" ");
            }
   
    }
    System.out.println();
    System.out.println("Array before sorting ");
    for(int n:num)
    {
        System.out.print(n+" ");
    }

}
}

//Selection sort
class selection 
{
    public static void main(String[] args) {
        int num[]={4,6,2,9,8,3,7,0};
        int size=num.length;
        int minindex=0;
        System.out.println("Array before sorting ");
        for(int n: num)
        {System.out.print(n+" ");
        }

        for(int i=0;i<size-1;i++)
        {
            minindex=i;
            for(int j=i+1;j<size;j++)
            {
              if(num[minindex] > num[j])
              {
                minindex=j;
              }
            }
            int temp=num[minindex];
            num[minindex]=num[i];
            num[i]=temp;

            System.out.println();
            for(int n:num)
            {
                System.out.print(n+" ");
            }
        }
        System.out.println();
        System.out.println("Array after sorting ");
        for(int n: num)
        {
            System.err.print(n+" ");
        }

    }

}
//insertion sort
class insertion 
{
    public static void main(String[] args) {
        int num[]={6,3,2,5,8,4,9,0};


        int size=num.length;
        int j=0;
        System.out.println("Array before sorting ");
        for(int n:num)
        {
            System.out.print(n+" ");
        }

        for(int i=1;i<size;i++)
        {
             
            int key=num[i];
             j=i-1;
             
            while (j>=0 && num[j]>key )
            {
                num[j+1]=num[j];
                j--;             
           }
           num[j+1]=key;
           System.out.println();
           for(int n: num)
           {
            System.out.print(n+" ");
           }

        }
        System.out.println();
        System.out.println("Array after sorting ");
        for(int n: num)
        {
            System.out.print(n+" ");
        }
       

    }
}
// quick sort
class quick
{
    public static void main(String[] args) {
        int num[]={9,8,6,3,2,6,5,4,7,10,0};
        System.out.println("Array before sorting ");
        for(int n:num)
        {
            System.out.print(n+" ");
        }
        quicksort(num,0,num.length-1);
        System.out.println();
        System.out.println("Array after sorting ");
        for(int n:num)
        {
            System.out.print(n+" ");
        }

    }
    public static int quicksort(int num[],int low,int high)
    {
        if(low<high)
        {
            int pi=partition(num,low,high);
            quicksort(num, low, pi-1);
            quicksort(num, pi+1, high);
        }
        return-1;
        
    }
    public static int partition(int num[],int low,int high)
    {
        int pivot=num[high];
        int p=low-1;
        for(int q=low;q<high;q++)
        {
            if(num[q]<pivot)
            {
                p++;
                int temp=num[q];
                num[q]=num[p];
                num[p]=temp;
            }
        }
        int temp=num[high];
        num[high]=num[p+1];
        num[p+1]=temp;

        return p+1;
        
    }
}
class Merg
{
    public static void main(String[] args) {
        int num[]={6,5,9,8,3,5,7,10,0};
        System.out.println("Array before sorting");
        for(int n:num)
        {
            System.out.print(n+" ");
        }
        
        Mergsort(num,0,num.length-1);
        System.out.println();
        System.out.println("Array after sorting");
        for(int n:num)
        {
            System.out.print(n+" ");
        }

    }
    public static int Mergsort(int num[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            Mergsort(num, low, mid);
            Mergsort(num,mid+1,high);
            Merg(num, low,mid, high);


        }


        return -1;

    }
    private static void Merg(int[] num, int low, int mid, int high) 
    {  // here we are initilize the size of two array
        int n1=mid-low+1;   
        int n2=high-mid;
        int larr[]= new int[n1];
        int rarr[]= new int[n2];
    // here we are copying the elements from one array num to another array larr[] and rarr[] .
        for(int i=0;i<n1;i++)
        {
            larr[i]=num[low+i];
        }
        for(int i=0;i<n2;i++)
        {
            rarr[i]=num[mid+1+i];
        }
        
        int i=0;
        int j=0;
        int k=low;
        // merging two array
        while(i<n1 && j<n2)
        {
            if (larr[i]<=rarr[j])
            {
                num[k]=larr[i];
                i++;

            }
            else
            {
                num[k]=rarr[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            num[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            num[k]=rarr[j];
            j++;
            k++;
        }
        
    }
        
 }
// 2D array 

class array
{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r=obj.nextInt();
        System.out.println("Enter the no of Column");
        int c=obj.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter the values in array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }

        // for(int i=0;i<r;i++)
        // {
        //     for(int j=0;j<c;j++)
        //     {
        //        System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for(int m[]:arr)
        {
            for(int n:m)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}

// 1D
class Array
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int s=obj.nextInt();
        int arr[]=new int [s];
        System.out.println("Enter the values in array");
        for(int i=0;i<s;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }
}
//insertion in array
class arrayinsertion
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int s=obj.nextInt();
        int arr[]=new int[s];
        int arr1[]=new int [s+1];
        System.out.println("enter the elements in array");
        for(int i=0;i<s;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("enter the element which you want to insert");
        int e=obj.nextInt();
        System.out.println("Enter the index at which you want to insert");
        int index=obj.nextInt();
        System.out.println();
        for(int i=0;i<s+1;i++)
        {
            if(i<index)
            {
                arr1[i]=arr[i];
            }
            else if(i==index)
            {
                arr1[i]=e;
            }
            else
            arr1[i]=arr[i-1];

        }
        for(int n:arr1)
        {
            System.out.print(n+"");
        }




    }
}
// Deletion in array
class arraydeletion
{
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int s=obj.nextInt();
    int arr[]=new int[s];
    int arr1[]=new int [s-1];
    System.out.println("enter the elements in array");
    for(int i=0;i<s;i++)
    {
        arr[i]=obj.nextInt();
    }
    
    System.out.println("Enter the index at which you want to delete");
    int index=obj.nextInt();
    System.out.println();
    for(int i=0;i<s;i++)
    {
        if(i<index)
         {
             arr1[i]=arr[i];
         }
         else if(i==index)
         {
             continue;
         }
         else
         arr1[i-1]=arr[i];
    
        }
        for(int n:arr1)
        {
            System.out.print(n+" ");
        }
    }
}
// Linketlist 
class Node
{
    int data;
    Node next;
}
class LinkedList
{
    Node head;
    public void insert(int data)
    {
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;

        if(head==null)
        {
            head=newnode;
        }
        else{
            Node temp = head;
            while(temp.next!=null)
            {
                temp=temp.next;

            } 
            temp.next=newnode;
        }
    }
    public void insertAtStart(int data)
    {
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;

        newnode.next=head;
        head=newnode;

    }
    public void insertAtindex(int data,int index )
    {
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;

        if(index==0)
        {
            insertAtStart(data);
        }
        else{
        
        Node temp=head;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;

        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    }
    public void delete(int index)
    {
        Node temp=head;
        Node nextnode=temp;
        if(index==0)
        {
            deletefrombeg();
        }
        else{

       
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;

        }
        nextnode=temp.next;
        temp.next=nextnode.next;
    }
    }
    public void deletefrombeg()
    {
        head=head.next;
    }
    public void deleteatend()
    {
        Node temp=head;
        Node prevnode=temp;
        while(temp.next!=null)
        {
            prevnode=temp;
            temp=temp.next;
        }
        prevnode.next=null;

        
    }

    public void show()
    {
    Node temp=head;
    while(temp.next!=null)
    {
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
    System.out.println(temp.data);
}

}
class Runnable
{
    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insertAtStart(100);
        obj.insert(40);
        obj.insert(50);
        obj.insertAtindex(90, 0);
        obj.delete(0);
        obj.deleteatend();
        
        obj.show();

    }
}
// 
class circularLinkedList
{
    Node head;
    Node tail;
    public void insertAtend(int data)
    {
        Node newnode = new Node();
        newnode.data=data;
        newnode.next=null;

        if(head==null)
        {
            head=newnode;
            tail=newnode;
            newnode.next=tail;

        }
        else{
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
        }
        

    }
    public void insertAtStart(int data)
    {
        Node newnode =new Node();
        newnode.data=data;
        newnode.next=null;

        if(head==null)
        {
            head=newnode;
            tail=newnode;
            newnode.next=tail;

        }
        else
        {
            newnode.next=head;
            head=newnode;
            tail.next=head;
        }
    }
    public void insertAtindex(int data,int index)
    {
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;

        if(index==0)
        {
            insertAtStart(data);

        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
    public void deleteAtend()
    {
        Node temp=head;
        Node ptr=temp.next;
        while(ptr.next!=head)
        {
            temp=ptr;
            ptr=ptr.next;

        }
        tail=temp;
        tail.next=head;
    }
    public void deleteFrombeg()
    {
        if(head==null)
        {
            System.out.println("CLL is empty");

        }
        else{
            head=head.next;
            tail.next=head;
        }
      
    }
    public void deleteAtindex(int index)
    {
        Node temp = head;
        Node nextNode;
        if(index==0)
        {
            deleteFrombeg();
        }
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        
        nextNode=temp.next;
        temp.next=nextNode.next;
        
    }
    
    public void show()
    {
        Node temp=head;
        do{
            System.out.println(temp.data+" ");
            temp=temp.next;
           

        }while(temp!=head);
    }
}
class Runnable1
{
    public static void main(String[] args) {
        circularLinkedList obj=new circularLinkedList();
        obj.insertAtend(10);
        obj.insertAtend(20);
        obj.insertAtend(30);
        obj.insertAtend(40);
        obj.insertAtend(50);
        obj.insertAtend(60);
        obj.insertAtStart(100);
        obj.insertAtend(80);
        obj.insertAtindex(90 ,7);
        obj.insertAtend(110);
        
        obj.show();
        System.out.println();
        obj.deleteAtend();
        obj.deleteFrombeg();
        obj.deleteAtindex(7 );
        
        obj.show();
    }
}

class node{
    int data;
    node prev;
    node next;
}
class DoublyLinkedList
{
    node head;
    node tail;
    public void insertatend(int data)
    {
        node newnode =new node();
        newnode.data=data;
        newnode.next=null;
        newnode.prev=null;
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            newnode.next=null;
            newnode.prev=null;

        }
        else
        {
            tail.next=newnode;
            newnode.prev=tail;
            
            tail=newnode;
            

        }
    }
   
    public void insertAtStart(int data)
    {
        node newnode=new node();
        newnode.data=data;
        newnode.next=null;
        newnode.next=null;

        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        
        


    }
    public void insertAtindex(int data,int index)
    {
        node newnode=new node();
        newnode.data=data;
        newnode.next=null;
        newnode.prev=null;
        if(index==0)
        {
            insertAtStart(data);
        }
        else{
        node temp=head;
        node nextnode=temp.next;
        for(int i=0;i<index-1;i++)
        {

            temp=nextnode;
            nextnode=nextnode.next;

        }
        
        newnode.prev=temp;
        newnode.next=nextnode;
        temp.next=newnode;
        nextnode.prev=newnode;}


    }
    public void deleteAtend()
    {
       node temp=tail;
       temp=temp.prev;
       tail=temp;
       temp.next=null;

    }

 
    public void deleteFrombeg()
    {
        head=head.next;
        head.prev=null;
    }
    public void deleteAtindex(int index)
    {
        node temp=head;
        node nextNode=temp.next;
        if(index==0)
        {
            deleteFrombeg();
        }
        else{
            for(int i=0;i<index-1;i++)
            {
                
                temp=nextNode;
                nextNode=nextNode.next;
            }
            if(nextNode!=null)
            {
                temp.next=nextNode.next;

            }
            else if(nextNode.next!=null)
            {
                nextNode.next.prev=temp;
            }
           else
            {
                deleteAtend();
            }
            
            

        }

    }
    public void show()
    {
        node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
           
        }
        System.out.println(temp.data);

        
    }
}
class Runner
{
    public static void main(String[] args) {
        DoublyLinkedList obj=new DoublyLinkedList();
        obj.insertatend(10);
        obj.insertatend(20);
        obj.insertatend(30);
        obj.insertatend(40);
        obj.insertatend(50);
        obj.insertAtStart(100);
      
        obj.insertatend(110);
        obj.insertatend(200);
        obj.show();
        obj.insertAtindex(70, 8);
        System.out.println();
        obj.deleteAtindex(8);
        obj.show();
    }
}

class stack
{
    int stack[]=new int[5];
    int top;
    public void push(int data)
    {
        if(top==5)
        {
            System.out.println("stack is full ");
        }
        else{
            stack[top]=data;
            top++;
        }
        
    }
    public int pop()
    {
        int data=0;
        if(isempty())
        {
            System.out.println("Stack is empty ");
        }
       
        else
        {
            top--;
        
            data=stack[top];
            stack[top]=0;

        }
        
        
        return data;
        
        
       
        
    }
    public int  peek()
    {
        if(isempty())
        {
            return 0;
        }
        else
        {

        
        top--;
        int data;
        data=stack[top];
        return data;
    }
    }
    public int  size()
    {
        return top;

    }
    public boolean isempty()
    {
        return top<=0;
    }
    public void show()
    {
        for(int n:stack)
        {
            System.out.println(n+" ");
        }
    }
}
class Run
{
    public static void main(String[] args) {
        stack num=new stack();
        num.push(10);
        num.show();
        num.push(20);
        num.show();
        num.push(30);
        num.show();
        num.push(40);
        num.show();
        num.push(50);
        num.show();
        num.push(60);
        num.show();
        int s=num.size();
        System.out.println("size of array is : "+s);
        System.out.println("element pop is : "+ num.pop());
        System.out.println("element pop is : "+ num.pop());
        System.out.println("element pop is : "+ num.pop());
        System.out.println("element pop is : "+ num.pop());
        System.out.println("element pop is : "+ num.pop());
        System.out.println("element pop is : "+ num.pop());
       int p= num.peek();
       System.out.println("peeek element is : "+p);

    }
}

class Queue
{
    int Queue[]=new int[5];
    int front;
    int rear;
    int size;
    public void EnQueue(int data)
    {
        Queue[rear]=data;
        rear=(rear+1)%5;
        size=size+1;
    }
    public int DeQueue()
    {
        int data;
        data=Queue[front];
        Queue[front]=0;
        front=(front+1)%5;
        size=(size-1);
        return data;
        

    }
    public int size()
    {
        return size;
    }
    public boolean isempty()
    {
        return size<=0;
    }
    public void show()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(Queue[(i+front)%5]);
        }
        for(int n:Queue)
        {
            System.out.println("Element are : "+ n);
    
        }
    }
}
class Run1
{
    public static void main(String[] args) {
        Queue num=new Queue();
        num.EnQueue(5);
        num.EnQueue(2);
        num.EnQueue(7);
        num.EnQueue(3);
        System.out.println("deleted element is : "+num.DeQueue());
        System.out.println("deleted element is : "+num.DeQueue());
        num.EnQueue(9);
        num.EnQueue(1);
        num.EnQueue(19);
        num.EnQueue(15);
        num.show();
        System.out.println("size of queue is : "+num.size());
        System.out.println("is queue is empty : "+num.isempty());

    }
}

class node1
{
    node1 left=null;
    node1 right=null;
    int data;
    public node1(int data)
    {
        this.data=data;

    }

}

class BinaryTree
{
    public node1 create()
    {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value");
        int data=sc.nextInt();
        if(data==-1)
        return null;
        node1 Root=new node1(data);
        System.out.println("enter left child of "+ Root.data);
        Root.left=create();
        System.out.println("insert right node : "+ Root.data);
        Root.right=create();
        return Root;
    }
    public void inorder(node1 Root) // Left Root Right
    {
        if(Root==null)
        {
            return;
        }
        inorder(Root.left);
        System.out.print(Root.data);
        inorder(Root.right);
    }
    public void postorder(node1 Root) // left right root 
    {
        if(Root==null)
        {
            return;
        }
        postorder(Root.left);
        postorder(Root.right);
        System.out.print(Root.data);
       
    }
    public void preorder(node1 Root) //  root left right
    {
        if(Root==null)
        {
            return;
        }
        System.out.print(Root.data);
        preorder(Root.left);
        preorder(Root.right);
        
       
    }
    public static void main(String[] args) {
        BinaryTree obj=new BinaryTree();
       node1 root= obj.create();
        obj.inorder( root);
        System.out.println();
        obj.preorder(root);
        System.out.println();
        obj.postorder(root);

    }
    
}







   





