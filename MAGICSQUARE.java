import java.util.Scanner; 
public class MAGICSQUARE { 
 public static void generateMagicSquare(int n) { 
 if (n % 2 == 0) { 
 System.out.println("This method only works for odd-order magic squares.");  return; 
 } 
 int[][] magicSquare = new int[n][n]; 
  
 int row = 0; 
 int col = n / 2; 
 for (int num = 1; num <= n * n; num++) { 
 magicSquare[row][col] = num; 
 int newRow = (row - 1 + n) % n; 
 int newCol = (col + 1) % n;  
 if (magicSquare[newRow][newCol] != 0) { 
 row = (row + 1) % n; 
 } else { 
 row = newRow;
 col = newCol; 
 } 
 } 
System.out.println("Magic Square of size " + n + ":"); 
 for (int i = 0; i < n; i++) { 
 for (int j = 0; j < n; j++) { 
 System.out.print(magicSquare[i][j] + "\t"); 
 } 
 System.out.println(); 
 } 
 } 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
 System.out.print("Enter the size of the magic square (odd number): ");  int n = scanner.nextInt(); 
 if (n % 2 == 0) { 
 System.out.println("The size must be an odd number. Please try again.");  } else { 
 generateMagicSquare(n); 
 } 
 scanner.close(); 
 } 
}


