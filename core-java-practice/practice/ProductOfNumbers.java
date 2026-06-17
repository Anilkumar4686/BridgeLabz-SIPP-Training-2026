public class ProductOfNumbers{
    public int sumofproduct(int n){
        if(n>0){
            return n*sumofproduct(n-1);
        }
        return 1;
    }
    public static void main(String[] args) {
        ProductOfNumbers p = new ProductOfNumbers();
        int result = p.sumofproduct(5);
        System.out.println("The product of numbers from 1 to 5 is: " + result);
    }
}