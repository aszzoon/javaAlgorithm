package dataStructure;

public class Array {
  public static void main(String[] args) {

//    int[] numbers;
//    String[] names;
//
//    numbers = new int[18];
//    names = new String[18];
//
//
//  System.out.println(numbers.length);
//  System.out.println(names[0]);


  //선언과 생성을 동시에
    String[] milk = new String[5];
    milk[0] = "Milk";
    milk[4] = String.valueOf(222);
    milk[2] = "coffee";
    int[] bread = {3, 4, 5, 6, 1, 2};


    System.out.println(bread.length);
    System.out.println(bread[0]);
    System.out.println(bread[5]);
//    System.out.println(milk[0]);
//    System.out.println(milk[1]);
//    System.out.println(milk[2]);
//    System.out.println(milk[3]);
//    System.out.println(milk[4]);

    for(int i = 0; i < bread.length; i++){
      System.out.println("반복문"+ i);
    }
  }




}


