// package Day 9;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;        // count = count + 1;
        } while (count <= 10);
        System.out.println("Loop finished, Count is now: " + count);
    }
}

/*
 * Output:
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 */


//  While Loops -> Pehle condition check karte hain, agar condition false ho to loop body execute nahi hoti.
//  Do-While Loops -> Pehle loop body execute karte hain, phir condition check karte hain. Isliye do-while loop body kam se kam ek baar to execute hoti hi hai, chahe condition false hi kyu na ho.