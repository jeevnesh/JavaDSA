import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many day's Temprature? ");
    int numDays = sc.nextInt();
    int temp[] = new int[numDays];
    // Enter Temprature and find AverageTemprature
    int sum = 0;
    for (int i = 0; i < numDays; i++) {
      System.out.println("Enter day " + (i + 1) + " 's high Temprature");
      temp[i] = sc.nextInt();
      sum += temp[i];
    }
    double Average = sum / numDays;
    // Calculate days above Average Temprature
    int Above = 0;
    for (int i = 0; i < temp.length; i++) {
      if (temp[i] > Average) {
        Above++;
      }
    }
    System.out.println();
    System.out.println("Average Temprature is: " + Average);
    System.out.println("Number of days above Average Temprature is: " + Above);
  }
}