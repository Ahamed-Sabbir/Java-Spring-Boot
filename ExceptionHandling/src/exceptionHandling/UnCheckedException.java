package exceptionHandling;

public class UnCheckedException {

    /*
        @ Unchecked exceptions / runtime exceptions: These are the exceptions that occur at runtime
            and are not checked by the compiler. That’s why they are hard to pinpoint.
            They typically represent programming errors or unexpected conditions in your code.

            1. Identify whether the method is a general purpose method or specific method.
            2. If the method is general purpose, then there is no need to handle the exception here.
                If the method is a specific business only method, then handle the exception here
                with a try-catch block. And then inside the catch block, throw an appropriate exception.
            3. Identify the actual caller method, that calls the method with the throws keyword.
                Only there handle the exception with try-catch block and appropriate action.
                (basically it become a checked exception then).
            - ArithmeticException
            - NullPointerException
            - ArrayIndexOutOfBoundException
            - ArrayStoreException
    */


    public static void main(String[] args) {
        try {
            Integer person2Salary = 0;
            double person2Tax = calSalary(person2Salary);
            System.out.println(person2Tax);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    // this is a specific purpose method which calculates salary
    public static double calSalary(Integer salary) throws Exception {
        try {
            int taxRation = 15000000;
            int rebate = 2;
            return (double)(taxRation / salary * rebate);
        } catch (Exception ex) {
            throw new Exception("Invalid Salary Value");
        }
    }

}