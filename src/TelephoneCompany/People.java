import java.util.LinkedList;

public class People {
    private LinkedList<String> p;
    public People(){
       p = new LinkedList<String>();
    }
    public void addPerson(String name) {
        p.addFirst(name); // this takes O(1) to add
   }

   public boolean contains(String name){
      return p.contains(name); // returns true if the given person is in the list
   }

}
