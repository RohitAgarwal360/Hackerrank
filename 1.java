import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
    LinkedList<Integer> l=new LinkedList<Integer>();
    List<Integer> l1=new ArrayList<Integer>();
   Scanner sc=new Scanner(System.in);
   int end=sc.nextInt();  
   int count=end;
        int flag=0;
   //System.out.println(end);      
    sc.nextLine();    
            
    
     String s=sc.nextLine();
        //System.out.println(s); 
     String arr[]=s.split(" ");    
   // System.out.println(s); 

   // char arr[]=s.toCharArray();
        
       for(String a:arr)
       {
           int x=Integer.parseInt(a);
           l.add(x);
          // System.out.println(a);
       }
       // System.out.println(l.size());
       // System.out.println(l);
        
        if(l.size()<end)
        {
            System.out.println("NIL");
            return ;
        }
        
        
        
        ListIterator<Integer> it=l.listIterator(l.size());
        
        for(int i=l.size();i>=0;i--)
        {
            if(i==(l.size())-end)
            {
                 System.out.println(l.get(i));
                 flag=1;
                 break;
            }
          
        }
        
        if(flag==0)
        {
            System.out.println("NIL");
        }
    }
}
