// java program to find the sum of the digits

class Main4{

    static int getSum(int n){
        int sum = 0;          // local variable : variable declared inside the class 
        while(n!=0){
            sum = sum + n%10; //sum = 0 + 687 % 10 = 0 + 7 i.e sum = 7
            n = n/10;
        }
    return sum;
    }

    public static void main(String args[]){
       int n = 99999;                            // variable declared inside the class but outside the method 
       
       System.out.println(getSum(n));
}
}                                                 // static variable are the variable that are declared The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
//The static variable gets memory only once in the class area at the time of class loading.
//When a variable is declared static in Java programming, it means that the variable belongs to the class itself rather than to any
// specific instance of the class. This means that there is only one copy of the variable in memory, regardless of how many instances of the class are created.