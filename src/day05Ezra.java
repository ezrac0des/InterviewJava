//find largest and smallest element of an array

public class day05Ezra {

    public static void main(String[] args) {

        //array of 10 numbers
        int arr[] = new int[]{58, 12, 56, 76, 89, 100, 343, 21, 234};

        //assign first element of an array to largest and smallest
        int smallest = arr[0]; //12
        int largest = arr[0]; //12

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i]; //343
            else if (arr[i] < smallest)
                smallest = arr[i];
        }

        System.out.println("Smallest Number is : " + smallest);
        System.out.println("Largest Number is : " + largest);
    }
}
