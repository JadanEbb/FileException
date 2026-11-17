import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //FileNotFoundException
        //If an exception occurs then the following statements are not executed
        try {

//            null-printerException read as NullReferenceException
            String str = null;
            System.out.println("String length is:" + str.length());



//            ArrayIndexOutOfBoundsException
            int[] nums = {-9, -7, -5, -3, -1};
            System.out.println("Array index value: " + nums[5]);


            //MFME = NumberFormatMismatchException
            int i = Integer.parseInt("123");
            System.out.println("Integer Value is: " + i);

            //AE (Arithmetic expression)
            int a = 10;
            int b = 5*0;

            a = a/b;
            System.out.println("Division result is: " + a);


            //FileNotFoundException
            File f = new File("BikeShare.txt");
            FileReader fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception:" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(" Arithmetic Exception:" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(" Number Format Exception:" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Array Index Out Of Bound Exception:" + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(" NullPointer Exception:" + e.getMessage());
        } finally {
            System.out.println("Finally block executed - typically used to close IO resources such as file.close()");
        }
//        catch (IOException e) {
//            System.out.println("IOException:" + e.getMessage());
//        }

        //try
    }
}

