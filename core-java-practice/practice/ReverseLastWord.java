public class ReverseLastWord {
    public static void main(String[] args) {
        String str = "I love coding";
        String[]arr=str.split(" ");
        String lastWord = arr[arr.length - 1];
        String reverse="";
        for(int i=lastWord.length()-1;i>=0;i--){
            reverse+=lastWord.charAt(i);
        }
        arr[arr.length-1]=reverse;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}