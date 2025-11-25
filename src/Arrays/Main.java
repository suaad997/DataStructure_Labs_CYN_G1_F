package Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Arrayss arr=new Arrayss();
      // int []numbers=new int[5];
        int []numbers={1,2,3,4,5,6};
        //arr.Shift_Left_Delete(numbers,3);

      //  arr.Traversal(numbers);
      int result=  arr.LinearSearch(numbers,9);



      if(result!=-1)
        System.out.println("Value found at index : "+result);
      else
          System.out.println("Value not found!!");























//        arr.input(numbers);
     //  arr.update(numbers,1,9);
       // arr.delete(numbers,9);

       // arr.Revers_Traversal(numbers);




        //System.out.println(Arrays.toString(numbers));


//
//        for (int num:numbers)
//            System.out.println(num);



    }
}
