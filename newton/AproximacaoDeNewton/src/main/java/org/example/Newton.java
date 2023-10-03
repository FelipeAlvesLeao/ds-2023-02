package org.example;

public class Newton {
    //our functio f(x)
    static double f(double x) {
        return Math.sin(x);
    }

    //f'(x) /*first derivative*/
    static double fprime(double x) {
        return Math.cos(x);
    }

    public static void main(String argv[]) {

        double tolerance = .000000001; // Stop if you're close enough
        int max_count = 200; // Maximum number of Newton's method iterations

/* x is our current guess. If no command line guess is given,
   we take 0 as our starting point. */

        double x = 0;

        if(argv.length==1) {
            x= Double.valueOf(argv[0]).doubleValue();
        }

        for( int count=1;
            //Carry on till we're close, or we've run it 200 times.
             (Math.abs(f(x)) > tolerance) && ( count < max_count);
             count ++)  {

            x= x - f(x)/fprime(x);  //Newtons method.
            System.out.println("Step: "+count+" x:"+x+" Value:"+f(x));
        }
        //OK, done let's report on the outcomes.
        if( Math.abs(f(x)) <= tolerance) {
            System.out.println("Zero found at x="+x);
        } else {
            System.out.println("Failed to find a zero");
        }
    }

}
