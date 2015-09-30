package simon_4_prime_methods;
public class Simon_4_Prime_Methods {
    
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is prime");
            }
                
}
    
}

    //A method is like a little program.
    //It can receive and return values to other methods.
    
    static boolean isEven(int somenumber) {
        return (somenumber % 2 == 0);
    
    }
     
    static boolean isOdd(int somenumber) {
         return (somenumber % 2 !=0);
     
    }
    
    static boolean isPrime (int somenumber) {
        int divisor = 0;
        for (int i = 2; i < somenumber; i++) {
            if (somenumber % i == 0) {
                divisor += 1;
            }
        }
        
        if(divisor > 0) {
            return false;
       
        } else {
            return true;
        
        }
      
        //return (divisor == 0);
}

}

