import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        System.out.println("Shuffled Array: " + Arrays.toString(list.toArray()));
    }
}

//OUTPUT


// PS C:\Users\hp\OneDrive\Desktop\cloudvandana\java> java task1.java
// Shuffled Array: [5, 6, 4, 2, 3, 1, 7]
// PS C:\Users\hp\OneDrive\Desktop\cloudvandana\java> java task1.java
// Shuffled Array: [7, 4, 2, 5, 6, 3, 1]
// PS C:\Users\hp\OneDrive\Desktop\cloudvandana\java> 
