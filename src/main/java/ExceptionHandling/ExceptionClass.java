package ExceptionHandling;

public class ExceptionClass {
    public static void main(String[] args) {
        try {
            int n = 50/0;
        }
/*
        catch(Exception e) {
            System.out.println(e);
        }
*/
        finally {
            System.out.println("Exception");
        }
    }
}
