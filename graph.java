import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

class Node
{
    int data;
    Node left=null ,right=null;

    public Node(int data)
    {
        this.data=data;
    }
}
class Tree
{
    public Node create() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data ");
        int data=sc.nextInt();
        if(data==-1)
        {
            return null;
        }
        Node Root= new Node(data);
        System.out.println("enter the left child of : "+ Root.data);
        Root.left=create();
        System.out.println("enter the right child of : "+ Root.data);
        Root.right=create();
        return Root;
    }
    public void inorder(Node Root)// left root right
    {
        if(Root==null)
        {
            return;
        }

        inorder(Root.left);
        System.out.print(Root.data);
        inorder(Root.right);

    }
    public void preorder(Node Root) // root left right
    {
        if(Root==null)
        {
            return;
        }

        System.out.print(Root.data);
        preorder(Root.left);
       
        preorder(Root.right);
    }
    public void postorder(Node Root) //  left right root
    {
        if(Root==null)
        {
            return;
        }

        
        postorder(Root.left);
       
        postorder(Root.right);
        System.out.print(Root.data);
    }
    

}
class Run 
{
    public static void main(String[] args) 
    {
        Tree t=new Tree();
        Node c=t.create();
        t.inorder(c);
        System.out.println();
        t.preorder(c);
        System.out.println();
        t.postorder(c);


    }
}

class Graph
{
    LinkedList<Integer> adjacence[];
    @SuppressWarnings("unchecked")
    public Graph(int v)
    {
        adjacence=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adjacence[i]=new LinkedList<>();
        }
    }
    public void insertedges(int s,int d)
    {
        adjacence[s].add(d);
        adjacence[d].add(s);
    }
    public void bfs(int source)
    {
        boolean visited []=new boolean[adjacence.length];
        int parent[]=new int [adjacence.length];
        Queue<Integer> s=new LinkedList<>();
        s.add(source);
        visited[source]=true;
        parent[source]=-1;
        while(!s.isEmpty())
        {
            int p=s.poll();
            System.out.print(p);
            for(int n:adjacence[p])
            {
                if(visited[n]!=true)
                {
                    visited[n]=true;
                    s.add(n);
                    parent[n]=p;
                }

            }
        }

    }
    public void dfs(int source)
    {
        boolean visited []=new boolean[adjacence.length];
        int parent[]=new int [adjacence.length];
        Stack<Integer> s=new Stack<>();
        s.add(source);
        visited[source]=true;
        parent[source]=-1;
        while(!s.isEmpty())
        {
            int p=s.pop();
            System.out.print(p);
            for(int n:adjacence[p])
            {
                if(visited[n]!=true)
                {
                    visited[n]=true;
                    s.add(n);
                    parent[n]=p;
                }

            }
        }

    }



}
class display
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of vertices and edges");
        int v=sc.nextInt();
        int e=sc.nextInt();
        Graph g=new Graph(v);
        System.out.println("enter the no of edges : ");
        for(int i=0;i<e;i++)     // we have to start with 0 
        {

            int s=sc.nextInt();
            int d=sc.nextInt();
            g.insertedges(s,d);
        }
        System.out.println("enter the source for traversal ");
        int source=sc.nextInt();
        g.dfs(source);
        System.out.println();
        g.bfs(source);


    }
}