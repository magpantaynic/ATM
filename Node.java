// Node is a self-referential data type.

// Each node has a data field: item (an Object)
// and a link field (next) that points to another node (of the same type).

public class Node {

  // Attributes
  private Object item;
  private Node next;

  // Constructor: create a new node with the given data (newItem).
  public Node(Object newItem) {
    item = newItem;
    next = null;
  } // end constructor

  // Constructor: create a new node 
  // with the given data (newItem) and link (nextNode).
  public Node(Object newItem, Node nextNode) {
    item = newItem;
    next = nextNode;
  } // end constructor

   // Mutator method for item.
  public void setItem(Object newItem) {
    item = newItem;
  } // end setItem

  // Accessor method for item.
  public Object getItem() {
    return item;
  } // end getItem

  // Mutator method for next.
  public void setNext(Node nextNode) {
    next = nextNode;
  } // end setNext

  // Accessor method for next.
  public Node getNext() {
    return next;
  } // end getNext
