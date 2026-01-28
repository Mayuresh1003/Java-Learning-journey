
package JavaMethods;
class SumVarArgs {
    static int sum(int... nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3)); 
        System.out.println(sum(10, 20, 30));  
    }
}
