public class MyString implements CharSequence, Comparable<CharSequence>{
private char[] data;
public static void main(String[] args) {

    // sole constructor test
    MyString msg = new MyString("droid");
    System.out.println("MyString msg = new MyString(\"charlotte\")");

    // toString()
    System.out.println("msg: " + msg);                                                  // "droid"

    // length()
    System.out.println("msg.length(): " + msg.length());                                // 5

    System.out.println();

    // charAt() exception catch
    System.out.println("msg.charAt(-1):");
    try {
      System.out.println(msg.charAt(-1));                             // IndexOutOfBoundsException
    } catch(IndexOutOfBoundsException e) { e.printStackTrace(); }

    System.out.println();

    System.out.println("msg.charAt(15):");
    try {
      System.out.println(msg.charAt(15));                             // IndexOutOfBoundsException
    } catch(IndexOutOfBoundsException e) { e.printStackTrace(); }

    System.out.println();

    // charAt()
    System.out.println("msg.charAt(0): " + msg.charAt(0));                              // "d"
    System.out.println("msg.charAt(3): " + msg.charAt(3));                              // "i"

    System.out.println();

    // subSequence() exception catch
    // start < 0
    System.out.println("msg.subSequence(-1,4):");
    try {
      System.out.println(msg.subSequence(-1,4));                      // IndexOutOfBoundsException
    } catch(IndexOutOfBoundsException e) { e.printStackTrace(); }

    System.out.println();

    // end < 0
    System.out.println("msg.subSequence(1,-4):");
    try {
      System.out.println(msg.subSequence(1,-4));                      // IndexOutOfBoundsException
    } catch(IndexOutOfBoundsException e) { e.printStackTrace(); }

    System.out.println();

    // start > end
    System.out.println("msg.subSequence(11,4):");
    try {
      System.out.println(msg.subSequence(11,4));                      // IndexOutOfBoundsException
    } catch(IndexOutOfBoundsException e) { e.printStackTrace(); }

    System.out.println();

    // end > length()
    System.out.println("msg.subSequence(1,14):");
    try {
      System.out.println(msg.subSequence(1,14));                      // IndexOutOfBoundsException
    } catch(IndexOutOfBoundsException e) { e.printStackTrace(); }

    System.out.println();

    // subSequence()
    System.out.println("msg.subSequence(0,3): " + msg.subSequence(0,3));                // "dro"
    System.out.println("msg.subSequence(2,5): " + msg.subSequence(2,5));                // "oid"

    System.out.println();

    // compareTo()
    System.out.println("msg.compareTo(\"droid\"): " + msg.compareTo("droid"));          // 0
    System.out.println("msg.compareTo(\"bat\"): " + msg.compareTo("bat"));              // 1
    System.out.println("msg.compareTo(\"seventh\"): " + msg.compareTo("seventh"));      // -1
    System.out.println("msg.compareTo(\"drank\"): " + msg.compareTo("drank"));          // 1
    System.out.println("msg.compareTo(\"drunk\"): " + msg.compareTo("drunk"));          // -1

  }

public MyString (CharSequence s){
  data  = new char [s.length()];
  for (int i = 0; i<s.length(); i ++){
    data[i] = s.charAt(i);
  }
}


public char charAt (int index) {
  int i = 0;
  //If the index isn't possible, this exception with be printed.
  if (index < 0 || index > data.length - 1){
    throw new IndexOutOfBoundsException ("The specified index does not exist in this CharSequence");
  }
  //Checks each index until it finds the index it was looking for. Goes from index 0 --> index data.length() - 1.
    while (i != index){
      i++;
    }
    return data[i];
  }

  public int length () {
    //For exach number inside the data, it adds one to the number of things inside it(l).
    return data.length;
    }


  public CharSequence subSequence (int start, int end) {
//Catches an error if the start or end is wrong
    if ((start < 0 || start > end) || (end < 0 || end > data.length)) {
        throw new IndexOutOfBoundsException ("Start and end inputs can't be negative. The end input can't be greater than the length of the CharSequence");
      }
    if (start == end){return "";}
    String sup = "";
//starts from the start index and puts each character from each index until the one before the end where it stops (inclusively).
    for (int i = start; i < end; i ++){
    sup = sup + charAt(i);
    }
    return sup;}


  public String toString () {
    //assign it to be a String because we have to return a string
    return new String(data);
  }

  public int compareTo (CharSequence e){
    if (this.length() == 0 && e.length() == 0) {return 0;}
    if(this.length() == 0){return -1;}
    if(e.length() == 0){return 1;}
    if(this.length() < e.length()){
      for (int i = 0; i < this.length();i ++){
        if(this.charAt(i) != e.charAt(i)){
          if (this.charAt(i) * 1 - e.charAt(i) * 1 > 0){
            return 1;
          }
          else {return -1;}}}
    }
    if(this.length() > e.length()){
      for (int i = 0; i < e.length();i ++){
        if(this.charAt(i) != e.charAt(i)){
          if (this.charAt(i) * 1 - e.charAt(i) * 1 > 0){
            return 1;
          }
          else {return -1;}}}
    }
    for (int i = 0; i < this.length();i ++){
      if(this.charAt(i) != e.charAt(i)){
        if (this.charAt(i) * 1 - e.charAt(i) * 1 > 0){
          return 1;
        }
        else {return -1;}
      }}
      return 0;
    }
  }
