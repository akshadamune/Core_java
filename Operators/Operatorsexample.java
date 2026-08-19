public class Operatorsexample{
    public static void main(String[] args) {
        // Arthimatic operations
        int num1 = 10;
        int num2 = 5;

    System.out.println(num1 + num2);   
    System.out.println(num1 - num2);
    System.out.println(num1 * num2);
    System.out.println(num1 / num2);
    System.out.println(num1 % num2);   
    
    // relational operators
    
    System.out.println(num1 > num2);   
    System.out.println(num1 < num2);
    System.out.println(num1 <= num2);
    System.out.println(num1 >= num2);
    System.out.println(num1 == num2);

    // logical operators

    boolean a = true;
    boolean b = true;

    boolean isAdmin = false;
    System.out.println(!isAdmin);

   // uniary operators
   
    int num = 7;
    int result = num++;
    System.out.println(result); // 7
    System.out.println(num); // 8

    result = ++num;
    System.out.println(result);  //9//8
    System.out.println(num);  //9

    }
}