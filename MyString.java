public class MyString implements CharSequence{
private char[] data;


// public MyString (CharSequence e){
//   char [] e = new CharSequence;
//
// }


public char charAt (int index) {
  //If the index isn't possible, this exception with be printed.
  if (index < 0 || index > data.length() - 1){
    throw new IndexOutOfBoundsException ("The specified index does not exist in this CahrSequence");
  }
  //Checks each index until it finds the index it was looking for. Goes from index 0 --> index data.length() - 1.
    for (int i = 0; i < data.length(); i ++){
      if (i == index){return data[i];}
      }
  }

  public int length () {
    //For exach number inside the data, it adds one to the number of things inside it(l).
    return data.length;
    }


  // public CharSequence subSequence (int start, int end) {
  //   ;
  // }
  // public String toString () {
  //   ;
  // }
  //
  //
  //
  //
  //
  //
  //
  //
  //













}
