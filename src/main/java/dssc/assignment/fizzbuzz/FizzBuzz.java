package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String... args) {
        for (int i=1; i <= 105; i++){
            String st = "";
            if (i%3 == 0) st += "Fizz";
            if (i%5 == 0) st += "Buzz";
            if (i%7 == 0) st += "Bang";

            if (st == "") System.out.println(i);
            else System.out.println(st);
        }
    }

}
