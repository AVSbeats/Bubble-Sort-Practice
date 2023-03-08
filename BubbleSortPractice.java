public class BubbleSortPractice {
    public static void main(String[] args) {

        int[] someNumbers = { 20, 5, 15, 10 };

        int temp;
        int b;

        for (b = 0; b < someNumbers.length - 1; b++) {
            if (someNumbers[b] > someNumbers[b + 1]) {
                temp = someNumbers[b];
                someNumbers[b] = someNumbers[b + 1];
                someNumbers[b + 1] = temp;

            }
        }
        System.out.println(someNumbers);
    }
}