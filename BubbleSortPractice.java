public class BubbleSortPractice {
    // If you want to mess around with input and integers follow up in cengage
    // 9-1c Sorting Arrays of Objects

    public static void main(String[] args) {

        String[] names = { "Irma", "Abraham", "Kevin", "Yvonne", "Maria", "Baby" };

        String temp;
        int a;
        int b;

        int comparision = names.length - 1;

        // This will move the orders from Greater to lowest
        for (a = 0; a < comparision; ++a) {
            for (b = 0; b < comparision; ++b) {
                if (names[b].compareTo(names[b + 1]) > 0) {

                    temp = names[b];
                    names[b] = names[b + 1];
                    names[b + 1] = temp;

                }

            }

        }
        --comparision;

        // This is to display the final String outcome
        for (String i : names) {
            System.out.println(i);
        }

        System.out.println();

        // The samething but without using ":"
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}