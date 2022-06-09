import java.util.Scanner;



public class ArrayTools {

//  defining methods

    // caesar cipher method
    static String encrypt(String txt, int shift) {
        int len = txt.length();
        String newStr = "";
        for (int i = 0; i < len; i++)
// in the case of uppercase letters
            if (Character.isUpperCase(txt.charAt(i)))
                newStr += (char) (((int) txt.charAt(i) +
                        shift - 65) % 26 + 65);
//for lowercase letters
            else
                newStr += (char) (((int) txt.charAt(i) +
                        shift - 97) % 26 + 97);

        return newStr;
    }

    // average method
    static float arrayAvg(float array[]) {
        int len = array.length;
        float sum = 0;

        for (int i = 0; i < len; i++)
            sum += array[i];

        return (sum / len);
    }

    //  searching method
    static boolean arrayContains(float array[], float item) {
        int len = array.length;

        for (int i = 0; i < len; i++)
            if (array[i] == item) return true;

        return false;
    }

    // reverse method
    static float[] reverse(float array[]) {
        int len = array.length;
        float newArray[] = new float[len];

        for (int i = len - 1; i >= 0; i--)
            newArray[len - i - 1] = array[i];

        return newArray;
    }

    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);

        System.out.println("\tCeaser Cipher");
        System.out.println("           ");
        System.out.println("Enter a String to encrypt: ");
        String txt = type.nextLine();
// next accept the shift value from user
        System.out.println("Enter a value with which you want to shift your string : ");
        int shift = type.nextInt();

//call the method and store the results
        String encryptedTxt = encrypt(txt, shift);
        System.out.println("\nEncrypted string: " + encryptedTxt); // print results
        System.out.println("Decrypted string with shift value -" + shift +  " is: "
                + (encrypt(encryptedTxt, 26 - shift))); // print decrypted text

        System.out.println("\n\tArray operations");
        System.out.println("------------------------------");
// accept an array size form user
        System.out.printf("Enter an array size: ");
        int arrSize = type.nextInt();
        float array[] = new float[arrSize]; // create new array with given size
        System.out.println("Enter array elements: ");
// now accept array elements from user
        for (int i = 0; i < arrSize; i++)
            array[i] = type.nextFloat();

        System.out.println("****************************");
// using arrayAvg() method to print the average of an array
        System.out.println("Average of entered array elements: " + (arrayAvg(array)));
        System.out.println("********************");


        System.out.printf("Enter a value to check whether array contains it or not : ");
        float item = type.nextFloat();
        //calling the contains method to check whether array has the value or not
        if (arrayContains(array, item))
            System.out.println("The array have " + item);
        else
            System.out.println("The array doesn't have " + item);
        System.out.println("**************************");
         // calling reverse method to reverse the array
        float reversedArray[] = reverse(array);
        System.out.println("The reversed of array is: ");
        for (int i = 0; i < arrSize; i++)
            System.out.printf("%.2f ", reversedArray[i]);

    }
}

