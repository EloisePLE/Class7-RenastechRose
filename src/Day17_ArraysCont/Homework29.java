package Day17_ArraysCont;

public class Homework29 {
    public static void main(String[] args) {
     /*
    write a code with following requirements:
    - Define an array with following values {90,34,23,87,45,36,98};
    - Print the values that can be divided by 2 or 3.
     */
        int num2[] = {90, 34, 23, 87, 45, 36, 98};

        for(int i = 0; i <num2.length; i++){
            if(num2[i] % 2 == 0 || num2[i] % 3 == 0){
               System.out.print(num2[i]+" ");
            }
        }
    }

}
