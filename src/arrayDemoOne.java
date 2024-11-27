import java.util.Arrays;
import java.util.Scanner;

public class arrayDemoOne {
    public void arrayList() {
        int[] age = {12, 4, 5, 2, 5};

//        Arrays.sort(age);
        //accessing Arrays with index
        System.out.println("Accessing Elements of an Array");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

    }
    public void usingLoop() {
        int[] age = {12, 4, 5,};
        System.out.println("Using for loop: ");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }
    public void usingEnhancedLoop() {
        String[] names = { "New York", "Dallas", "Las Vegas", "Florida"};
        for (String name : names) {
            System.out.println(name);
        }
    }
    public void arrayDemo2(){
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;
        // access all elements using for each loop
        // add each element in sum
        for(int number : numbers){
            sum += number;
        }
        //get the total number of elements
        int arrayLength = numbers.length;
        // calculate the average from int to double
        average = ((double)sum/ (double)arrayLength);
        System.out.println("Sum: " + sum);
        System.out.println("average: " + average);
    }
    public void meanSDArray(){
        int[] marks = {76, 43, 58, 60, 90, 64, 70};
        int sum = 0;
        int sumSq = 0;
        double mean, stdDev;
        for(int i = 0; i < marks.length; ++i){
            sum += marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = (double)sum / marks.length;
        stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean);
        System.out.printf("Mean: %.2f%n", mean);
        System.out.printf("Standard Deviation is: %.2f%n", stdDev);
    }
    public void insertElements(){
        int i, element;
        int[] arr= new int[11];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 10 Elements : ");
        for(i=0; i<10; i++){
            arr[i] = scan.nextInt();
        System.out.print("Enter an Element to insert: ");
        element = scan.nextInt();
        arr[i] = element;
        System.out.println("\nNow the new array is: ");
        for(i=0; i<11; i++){
            System.out.print(arr[i] + " ");
        }
        }
    }

}
