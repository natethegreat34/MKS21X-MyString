public class MyString implements CharSequence, Comparable<CharSequence>{
private char[] data;


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
    if ((start < 0 || start > end) || (end < 0 || end > data.length - 1)) {
        throw new IndexOutOfBoundsException ("ERROR");
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
    if(this.length() < e.length()){
      return -7;
    }
    if(this.length() > e.length()){
      return 100;
    }
    for (int i = 0; i < this.length();i ++){
      if(this.charAt(i) != e.charAt(i)){
        if (this.charAt(i) * 1 - e.charAt(i) * 1 > 0){
          return -7;
        }
        else {return 100;}
      }}
      return 0;
    }
  }
