public class SummativeSums {
    public static void main(String[] args) {
        //define arrays
        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = { 999, -60, -77, 14, 160, 301};
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};


        // calculate sums
        int sum1 = sumArrayInts(array1) ;
        int sum2 = sumArrayInts(array2) ;
        int sum3 = sumArrayInts(array3) ;

        // print results
        System.out.println("#1 Array Sum: " + sum1);
        System.out.println("#2 Array Sum: " + sum2);
        System.out.println("#3 Array Sum: " + sum3);

    }
    // define sumArrayInts method
    public static int sumArrayInts (int[] arrayInts) {
        int i = 0;
        int sum = 0;
        // iterate through arrayInts
        for (i=0; i < arrayInts.length; i++) {
            sum = sum + arrayInts[i];
        }
        return sum;
    }


}
