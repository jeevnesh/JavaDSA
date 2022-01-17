import java.util.*;
class Main {
  public static void main(String[] args) {
    TwoDimensionArray sda = new TwoDimensionArray(3,3);
    sda.insert(0, 0, 10);
    sda.insert(0, 1, 20);
    sda.Access(0, 0);
    sda.Traverse();
    sda.Search(20);
    sda.Search(40);
    sda.Delete(0,0);
    System.out.println(Arrays.deepToString(sda.arr));

    
  }
}