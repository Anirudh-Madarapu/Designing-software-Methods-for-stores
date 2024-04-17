import java.util.*;

public class Line {
    private Queue<String> q;
    public Line(){
        q = new LinkedList<>(); //Creating a queue in the form of LinkedList
    }

    public void add(String name){ //adds the person name to the list
      q.add(name);
    }

    public boolean contains(String name){ //returns true or false based on if a person is in the list
         return q.contains(name);
    }

    public void remove(){
        q.remove();//removes the front most person of the list
    }

    public String peek(){
        return q.peek(); //returns the name of the person that is in fron of the list
    }

    public int size(){
        return q.size(); //returns the size of the list
    }

}
