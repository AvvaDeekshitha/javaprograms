import java.util.Scanner;

class LengthNotSufficientException extends Exception {
    LengthNotSufficientException(String msg) {
        super(msg);
    }
}

public class exceotions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mobile number: ");
        String num = sc.nextLine();

        try {
            if (!num.matches("[0-9]+"))
                throw new NumberFormatException();

            if (num.length() > 10)
                throw new ArrayIndexOutOfBoundsException();

            if (num.length() < 10)
                throw new LengthNotSufficientException("Length less than 10");

            System.out.println("Valid number");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Mobile Number-ArrayIndexOutOfBounds Exception");
        }
        catch (LengthNotSufficientException e) {
            System.out.println("Invalid Mobile Number – LengthNotSufficientException");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Mobile Number – NumberFormatException");
        }
        finally {
            sc.close();
        }
    }
}
