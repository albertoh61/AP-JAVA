public class recursion{

    public String lastName(){
        return "Oh";
    }

    public String firstName(){
        return "Albert";
    }

    public int hailLen(int n){
        if (n == 1) {
            return 1;
        } else if (n%2 == 0) {
            return 1 + hailLen(n/2);
        } else {
            return 1 + hailLen(3*n+1);
        }
    }

    public int longestHail(int n){
        if(n==1)
            return 1;
        int max = longestHail(n-1);
        if(hailLen(n) > hailLen(max)){
            return n;
        }
        return max;
    }
    
    public int fibItr(int n){
        if (n < 2) 
	    return fib(n);
	return help(0,1,n-2);
    }

    public static int fib (int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    public int help(int a, int b, int n) {
	if (n == 0)
	    return a+b;
	else
	    return help(b,a+b,n-1);
		
    }

    public recursion(){
        /*leave alone*/
    }
}
