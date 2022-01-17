public class TwoDimensionArray {
  int arr[][] = null;

  // Constructor
  public TwoDimensionArray(int numberOfRows, int numberOfColumns) {
    this.arr = new int[numberOfRows][numberOfColumns];
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr.length; col++) {
        arr[row][col] = Integer.MIN_VALUE;
      }
    }
  }
  
  // Inserting values in the TwoDimensionArray
  public void insert(int row, int col, int value) {
    try {
      if (arr[row][col] == Integer.MIN_VALUE) {
        arr[row][col] = value;
        System.out.println("Value inserted Successfully");
      } else {
        System.out.println("The cell already Occupied");
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid Index!!!");
    }
  }

 // Accessing a cell value in TwoDimensionArray
 public void Access(int row, int col){
   System.out.println("\nAccessing row "+ row +", col "+col);
   try{
     System.out.println("Cell value is: "+ arr[row][col]);
   }catch(ArrayIndexOutOfBoundsException e){
     System.out.println("Invalid Index!!!");
   }
 }

// Array Traversal
public void Traverse(){
  for(int row = 0 ; row<arr.length; row++){
    for(int col = 0 ; col<arr.length; col++){
      System.out.print(arr[row][col] + " ");
    }
    System.out.println();
  }
}

// Searching
public void Search(int value){
  for(int row = 0; row<arr.length;row++){
    for(int col=0;col<arr.length;col++){
      if(arr[row][col] == value){
        System.out.println("Value is found at row "+row+" col "+ col);
        return;
      }
    }
  }
  System.out.println("Value is not found");
}

//Deleting
public void Delete(int row, int col){
  try{
    System.out.println("Successfully Deleted "+ arr[row][col]);
    arr[row][col] = Integer.MIN_VALUE;
  }catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Invalid Index!!");
  }
}
}