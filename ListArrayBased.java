
// ********************************************************
// Array-based implementation of the ADT list.
// *********************************************************
public class ListArrayBased implements ListInterface {

  private static final int MAX_LIST = 50;
  private Object items[];  // an array of list items
  private int numItems;  // number of items in list

  public ListArrayBased() {
    this.items = new Object[MAX_LIST];
    this.numItems = 0;
  }  // end default constructor
   
  public boolean isEmpty() {
    return (this.numItems == 0);
  } // end isEmpty
   
  public int size() {
    return this.numItems;
  }  // end size
   
  public void removeAll() {
    // Creates a new array; marks old array for 
    // garbage collection.
    this.items = new Object[MAX_LIST];
    this.numItems = 0;
  } // end removeAll

  public void add(int index, Object item) 
                  throws  ListIndexOutOfBoundsException {
    if (this.numItems >= MAX_LIST) {
      throw new ListException("ListException on add");
    }  // end if

    if (index >= 0 && index <= numItems) {
      // make room for new element by shifting all items at 
      // positions >= index toward the end of the 
      // list (no shift if index == numItems)
      for (int pos = numItems; pos >= index; pos--) {
          this.items[pos+1] = this.items[pos];
      } // end for
      // insert new item
      this.items[index] = item;
      this.numItems++;
    } 
    else {  // index out of range
      throw new ListIndexOutOfBoundsException(
       "ListIndexOutOfBoundsException on add");
    }  // end if
  } //end add
   
  public Object get(int index) 
                    throws ListIndexOutOfBoundsException {
    if (index >= 0 && index < this.numItems) {
      return this.items[index];
    }
    else  {  // index out of range
      throw new ListIndexOutOfBoundsException(
        "ListIndexOutOfBoundsException on get");
    }  // end if
  } // end get
   
  public void remove(int index) 
                     throws ListIndexOutOfBoundsException {
    if (index >= 0 && index < this.numItems) {
      // delete item by shifting all items at 
      // positions > index toward the beginning of the list
      // (no shift if index == size-1)
      for (int pos = index+1; pos <= size(); pos++) {
        this.items[pos-1] = this.items[pos];
      }  // end for
      numItems--;
    }
    else {  // index out of range
      throw new ListIndexOutOfBoundsException(
                "ListIndexOutOfBoundsException on remove");
    }  // end if
  } // end remove
