/**
 * Class of my exception which is used when toy
 * is initialised with wrong input data
 */
public class MyException extends Exception {
    public MyException() {
        System.out.println("Wrong input data!");
    }
}