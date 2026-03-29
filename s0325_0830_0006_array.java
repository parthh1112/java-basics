import java.util.Arrays;

public class s0325_0830_0006_array {

  public static void main(String args[]) {

    // // 1. Declare and Initialize with new keyword
    // System.out.println("=== 1. Declare and Initialize with new keyword ===");
    // int[] arr1 = new int[5]; // Creates array of size 5, default values: 0
    // String[] names = new String[3]; // Default values: null
    // System.out.println(arr1);

    // System.out.println("Integer array: " + Arrays.toString(arr1));
    // System.out.println("String array: " + Arrays.toString(names));

    // // 2. Array Literal Initialization (at declaration)
    // System.out.println("\n=== 2. Array Literal Initialization ===");
    // int[] arr2 = { 10, 20, 30, 40 }; // Size is inferred (4)
    // String[] fruits = { "Apple", "Banana", "Orange" };
    // double[] prices = { 9.99, 15.50, 25.00 };
    // System.out.println("Integer array: " + Arrays.toString(arr2));
    // System.out.println("Fruits array: " + Arrays.toString(fruits));
    // System.out.println("Prices array: " + Arrays.toString(prices));

    // // 3. Anonymous Array Initialization
    // System.out.println("\n=== 3. Anonymous Array Initialization ===");
    // printArray(new int[] { 1, 2, 3, 4, 5 }); // Pass array directly to method
    // int[] arr3 = new int[] { 10, 20, 30 }; // Create temporary array
    // System.out.println("Created anonymous array: " + Arrays.toString(arr3));

    // // 4. Using new with Initialization Block
    // System.out.println("\n=== 4. Using new with Initialization Block ===");
    // int[] arr4 = new int[] { 5, 10, 15, 20 }; // Explicit type
    // char[] chars = new char[] { 'a', 'b', 'c' };
    // System.out.println("Integer array: " + Arrays.toString(arr4));
    // System.out.println("Character array: " + Arrays.toString(chars));

    // // 5. Initialize with Loop
    // System.out.println("\n=== 5. Initialize with Loop ===");
    // int[] arr5 = new int[5];
    // for (int i = 0; i < arr5.length; i++) {
    //   arr5[i] = i * 2; // Fill with values
    // }
    // System.out.println("Array initialized with loop: " + Arrays.toString(arr5));

    // // 6. Using Arrays.fill()
    // System.out.println("\n=== 6. Using Arrays.fill() ===");
    // int[] arr6 = new int[10];
    // Arrays.fill(arr6, 5); // Fill all elements with 5
    // System.out.println("Array filled with 5: " + Arrays.toString(arr6));

    // int[] arr6b = new int[10];
    // Arrays.fill(arr6b, 2, 5, 10); // Fill indices 2-4 with 10
    // System.out.println(
    //   "Array filled (indices 2-4 with 10): " + Arrays.toString(arr6b)
    // );

    // // 7. For Loop with Range (Enhanced for loop - Java 5+)
    // System.out.println("\n=== 7. For Loop with Range (Enhanced for loop) ===");
    // String[] items = { "Item1", "Item2", "Item3" };
    // System.out.print("Array contents: ");
    // for (String item : items) {
    //   System.out.print(item + " ");
    // }
    // System.out.println();

    // // 8. Using Java Streams (Java 8+)
    // System.out.println("\n=== 8. Using Java Streams ===");
    // int[] arr8a = java.util.stream.IntStream.range(0, 5).toArray(); // [0,1,2,3,4]
    // int[] arr8b = java.util.stream.IntStream.rangeClosed(1, 5).toArray(); // [1,2,3,4,5]
    // int[] arr8c = java.util.stream.IntStream
    //   .iterate(0, i -> i + 2)
    //   .limit(5)
    //   .toArray(); // [0,2,4,6,8]
    // System.out.println("Range [0,5): " + Arrays.toString(arr8a));
    // System.out.println("RangeClosed [1,5]: " + Arrays.toString(arr8b));
    // System.out.println("Iterate pattern: " + Arrays.toString(arr8c));

    // // 9. 2D Array Initialization
    // System.out.println("\n=== 9. 2D Array Initialization ===");

    // // 2D array with new keyword
    // int[][] matrix1 = new int[3][3]; // 3x3 matrix with default values (0)
    // System.out.println("3x3 matrix (new keyword):");
    // print2DArray(matrix1);

    // // 2D array with literal values
    // int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    // System.out.println("\n3x3 matrix (literal):");
    // print2DArray(matrix2);

    // // Jagged array (different row sizes)
    // int[][] jagged = new int[3][];
    // jagged[0] = new int[2]; // First row has 2 elements
    // jagged[1] = new int[3]; // Second row has 3 elements
    // jagged[2] = new int[4]; // Third row has 4 elements
    // System.out.println("\nJagged array created with varying row sizes");



          
        // 1. length - Array Property
        System.out.println("=== 1. length Property ===");
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Length of array: " + arr.length);  // Property, not method///////////////////////////////////////////////////////////////////////////
        System.out.println();
        
        
        // 2. Index Access
        System.out.println("=== 2. Index Access ===");
        System.out.println("First element (index 0): " + arr[0]);
        System.out.println("Last element (index 4): " + arr[arr.length - 1]);///////////////////////////////////////////////////////////////////////////
        arr[2] = 99;  // Modify element
        System.out.println("After modifying index 2: " + Arrays.toString(arr));
        System.out.println();
        
        
        // 3. Arrays.sort() - Sorting
        System.out.println("=== 3. Arrays.sort() - Sorting ===");
        int[] unsorted = {50, 30, 10, 40, 20};
        System.out.println("Original array: " + Arrays.toString(unsorted));
        Arrays.sort(unsorted);///////////////////////////////////////////////////////////////////////////
        System.out.println("Sorted array: " + Arrays.toString(unsorted));
        System.out.println();
        
        
        // 4. Arrays.binarySearch() - Search in sorted array
        System.out.println("=== 4. Arrays.binarySearch() - Search ===");
        int[] sorted = {10, 20, 30, 40, 50};
        int index = Arrays.binarySearch(sorted, 30);///////////////////////////////////////////////////////////////////////////
        System.out.println("Array: " + Arrays.toString(sorted));
        System.out.println("Index of 30: " + index);
        int notFound = Arrays.binarySearch(sorted, 25);
        System.out.println("Index of 25 (not found): " + notFound);  // Returns negative value
        System.out.println();
        
        
        // 5. Arrays.equals() - Compare arrays
        System.out.println("=== 5. Arrays.equals() - Compare Arrays ===");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println("arr1 equals arr2: " + Arrays.equals(arr1, arr2));///////////////////////////////////////////////////////////////////////////
        System.out.println("arr1 equals arr3: " + Arrays.equals(arr1, arr3));
        System.out.println();
        
        
        // 6. Arrays.copyOf() - Copy array
        System.out.println("=== 6. Arrays.copyOf() - Copy Array ===");
        int[] original = {10, 20, 30};
        int[] copy = Arrays.copyOf(original, original.length);///////////////////////////////////////////////////////////////////////////
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
        copy[0] = 999;  // Modify copy
        System.out.println("After modifying copy, original: " + Arrays.toString(original));
        System.out.println();
        
        
        // 7. Arrays.copyOfRange() - Copy part of array
        System.out.println("=== 7. Arrays.copyOfRange() - Partial Copy ===");
        int[] source = {10, 20, 30, 40, 50};
        int[] partial = Arrays.copyOfRange(source, 1, 4);  // Copy indices 1, 2, 3///////////////////////////////////////////////////////////////////////////
        System.out.println("Original: " + Arrays.toString(source));
        System.out.println("Partial copy (index 1-3): " + Arrays.toString(partial));
        System.out.println();
        
        
        // 8. Array clone() - Shallow copy
        System.out.println("=== 8. clone() Method ===");
        int[] original2 = {5, 10, 15};
        int[] cloned = original2.clone();///////////////////////////////////////////////////////////////////////////
        System.out.println("Original: " + Arrays.toString(original2));
        System.out.println("Cloned: " + Arrays.toString(cloned));
        cloned[0] = 100;
        System.out.println("After modifying clone: " + Arrays.toString(original2));
        System.out.println();
        
        
        // 9. Arrays.fill() - Fill array with value
        System.out.println("=== 9. Arrays.fill() - Fill Array ===");
        int[] toFill = new int[5];
        Arrays.fill(toFill, 7);///////////////////////////////////////////////////////////////////////////
        System.out.println("Array filled with 7: " + Arrays.toString(toFill));
        
        int[] toFill2 = new int[5];
        Arrays.fill(toFill2, 1, 4, 9);  // Fill indices 1-3
        System.out.println("Array filled (indices 1-3 with 9): " + Arrays.toString(toFill2));
        System.out.println();
        
        
        // 10. Arrays.toString() - Convert to String
        System.out.println("=== 10. Arrays.toString() - Convert to String ===");
        int[] numbers = {1, 2, 3, 4, 5};
        String arrayString = Arrays.toString(numbers);///////////////////////////////////////////////////////////////////////////
        System.out.println("Array: " + numbers);  // Shows memory address
        System.out.println("As String: " + arrayString);
        System.out.println();
        
        
        // 11. Arrays.deepToString() - 2D Array to String
        System.out.println("=== 11. Arrays.deepToString() - 2D Array ===");
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("2D Array: " + Arrays.deepToString(matrix));
        System.out.println();
        
        
        // 12. Arrays.deepEquals() - Compare 2D arrays
        System.out.println("=== 12. Arrays.deepEquals() - Compare 2D Arrays ===");
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{1, 2}, {3, 4}};
        int[][] mat3 = {{1, 2}, {3, 5}};
        System.out.println("mat1 deepEquals mat2: " + Arrays.deepEquals(mat1, mat2));
        System.out.println("mat1 deepEquals mat3: " + Arrays.deepEquals(mat1, mat3));
        System.out.println();
        
        
        // 13. for-each loop - Iterate through array
        System.out.println("=== 13. For-each Loop - Iteration ===");
        int[] items = {10, 20, 30, 40};
        System.out.print("Array elements: ");
        for (int item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println();
        
        
        // 14. Traditional for loop with index
        System.out.println("=== 14. Traditional For Loop ===");
        String[] colors = {"Red", "Green", "Blue"};
        for (int i = 0; i < colors.length; i++) {
            System.out.println("Index " + i + ": " + colors[i]);
        }
        System.out.println();
        
        
        // 15. instanceof - Check if object is array
        System.out.println("=== 15. instanceof - Check Array Type ===");
        int[] testArray = {1, 2, 3};
        String notArray = "Hello";
        System.out.println("testArray instanceof int[]: " + (testArray instanceof int[]));
        // System.out.println("notArray instanceof int[]: " + (notArray instanceof int[]));  // This line will cause a compile-time error because notArray is not an array type
        System.out.println();
        
        
        // 16. Array.toString() vs Arrays.toString()
        System.out.println("=== 16. toString() Methods Comparison ===");
        int[] arr16 = {1, 2, 3};
        
        System.out.println("arr.toString(): " + arr16.toString());  // Shows memory address
        System.out.println("arr.toString(): " + arr16);  // Shows memory address
        System.out.println("Arrays.toString(): " + Arrays.toString(arr16));  // Shows elements
  
  }

  // Helper method to print 1D array
  static void printArray(int[] arr) {
    System.out.println("Array: " + Arrays.toString(arr));
  }

  // Helper method to print 2D array
  static void print2DArray(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }
  }
}
