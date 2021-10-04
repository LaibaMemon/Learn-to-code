import java.util.LinkedList;




public class LinkedList {
    public static void main(String args[])
    {
       LinkedList <String> ll = new LinkedList<String>();
       
       ll.add("Apple");
       ll.add("Banna");
       ll.add("Mango");
       ll.addFirst("peach");
       ll.addLast("Mud Butter");
       ll.add(2,"Butte");
       
       
       for(String a:ll)
       {
           System.out.println(a);
       }
        
    }
    
}
