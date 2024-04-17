import java.util.*;

public class GroceryStore {
    private HashMap<String,Line> groceryStore;
    public GroceryStore(){
        groceryStore = new HashMap<String,Line>();
    }

    public void add(String name, int items){ //adding items into our list
       if(items<=0){ //From question customers are supposed to ahve atleast 1 item
          throw new UnsupportedOperationException();
       }

       int line = (items/10)+1;//there is no 0th line according to the question, so we have to add 1
       String lineNumber = "Line"+line;

       if((items%10)==0){ // in question it is mentioned that items 10 go into 1st line and 20 items go into 2nd line. To satisy this I adding this if statement
           lineNumber = "Line"+(items/10); //having 10 items will place in 1st line, having 20 items will place in 2nd line, etc
       }

       if(groceryStore.containsKey(lineNumber)){
         Line l1 = groceryStore.get(lineNumber);
         l1.add(name); //adding name to the respective line
       }

       else{
         Line l2 = new Line();
         l2.add(name);//creating and then adding name to the respective line
         groceryStore.put(lineNumber,l2);
       }

    }

    public void remove(int items){
       if(items<=0){ //From question customers are supposed to ahve atleast 1 item
        throw new UnsupportedOperationException();
       }

       int line = (items/10)+1;//there is no 0th line according to the question, so we have to add 1
       String lineNumber = "Line"+line;

       if((items%10)==0){ // in question it is mentioned that items 10 go into 1st line and 20 items go into 2nd line. To satisy this I adding this if statement
           lineNumber = "Line"+(items/10); //having 10 items will place in 1st line, having 20 items will place in 2nd line, etc
       }

       Line l1 = groceryStore.get(lineNumber);

       if(l1.size()==0){ //we cannot remove from an empty list
        throw new UnsupportedOperationException();
       }

       l1.remove();

    }

    public void removeByline(int line){ // same as remove except for taking line number instead of number of items
        if((line<=0) || (!groceryStore.containsKey("Line"+line))){ //From question customers are supposed to ahve atleast 1 item and if the given line doesn't exist in map, then it's an error
          throw new UnsupportedOperationException();
        }
        Line l1 = groceryStore.get("Line"+line);

        if(l1.size()==0){ //we cannot remove from an empty list
            throw new UnsupportedOperationException();
        }

        l1.remove();

    }

    public boolean contains(String name, int items){
        if(items<=0){ //From question customers are supposed to ahve atleast 1 item
          throw new UnsupportedOperationException();
        }

        int line = (items/10)+1;
        String lineNumber = "Line"+line;

        //if items are divisible by 10 then we don't want it to go into next line therefore we will not increment this by 1
        if((items%10)==0){
            lineNumber = "Line"+(items/10);
        }

        Line l1 = groceryStore.get(lineNumber);
        return l1.contains(name);

    }

    public String peek(int items){ // let us decide line based on items
        if(items<=0){ //From question customers are supposed to ahve atleast 1 item
            throw new UnsupportedOperationException();
        }
        int line = (items/10)+1;
        String lineNumber = "Line"+line;

        if((items%10)==0){
            lineNumber = "Line"+(items/10);
        }

        //fetches the line based on string value plus line number
        Line l1 = groceryStore.get(lineNumber);

        return l1.peek();
    }

    public String peekByLine(int line){ //From question customers are supposed to ahve atleast 1 item and if the given line doesn't exist in map, then it's an error
        if((line<=0) || (!groceryStore.containsKey("Line"+line))){//we have lines starting from 1 so anything less than that is an error
           throw new UnsupportedOperationException();
        }

        String lineNumber = "Line"+line;

        //fetches the line based on string value plus line number
        Line l1 = groceryStore.get(lineNumber);

        return l1.peek();
    }

    public String greet(int items){
          if(items<=0){ //From question customers are supposed to ahve atleast 1 item
            throw new UnsupportedOperationException();
          }

          int line = (items/10)+1;
          String lineNumber = "Line"+line;

          //if items are divisible by 10 then we don't want it to go into next line therefore we will not increment this by 1
          if((items%10)==0){
              lineNumber = "Line"+(items/10);
          }

          //fetches the line based on string value plus line number
          Line l1 = groceryStore.get(lineNumber);
          return "Hello " + l1.peek() + ", How are you doing today?";
    }

    public String greetByline(int line){
        if((line<=0) || (!groceryStore.containsKey("Line"+line))){//we have lines starting from 1 so anything less than that is an error
            throw new UnsupportedOperationException();
        }

        //fetches the line based on string value plus line number
        Line l1 = groceryStore.get("Line"+line);
        return "Hello " + l1.peek() + ", How are you doing today?";
    }

    public int lineLength(int line){
      //From question customers are supposed to ahve atleast 1 item and if the given line doesn't exist in map, then it's an error
      if((line<=0) || (!groceryStore.containsKey("Line"+line))){//we have lines starting from 1 so anything less than that is an error
         throw new UnsupportedOperationException();
       }
       Line l1 = groceryStore.get("Line"+line);
       return l1.size();
    }


}
