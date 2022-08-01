/**
Node.java
Owner: Théa W
Collaborators: Maxwell Y, Will L, Jerusha T
**/

public class Node{
  private String data;
  private Node next;


  /* Constructors */

    public Node(){

    }

      public Node(String data){
        this.data = data;
        this.next = null;

      }


        public Node(String data, Node next){
          
          this.data = data;
          this.next = next;
        }

          // Getters
  
            public String getData(){
            return data;
            }
            public Node getNext(){
            return next;
            }

          // Setters
  
            public void setData(String data){
            this.data = data;
            }      
            public void setNext(Node next){
	          this.next = next;
            }

  
      // toString
  
        public String toString(){
        //use the toString() method to get the string representation of an object.
        return "" + data + "->";
        }        
}