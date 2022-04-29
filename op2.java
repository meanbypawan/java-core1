/*
  Arithmetic (+,-,*,/,%) --> Binary 
  Relational  -->Binary
  Logical --> Binary
  Inc/Dec --> Unary
  Assignment --> Binary
  Shorthand --> Binary
  Bitwise --> &,|,^,<<,>>,>>> Binary, ~ unary
  Conditional --> Ternary op
  instance of  
*/ 
class TestMain{
  public static void main(String args[]){
    System.out.println("7/2 : "+(7/2)); // 3
    System.out.println("7%2 : "+(7%2)); // 1
    System.out.println("-7%2 : "+(-7%2)); // -1
    System.out.println("7%-2 : "+(7%-2)); // 1
    System.out.println("-7%-2 : "+(-7%-2));// -1
    System.out.println("-7/-2 : "+(-7/-2));
    System.out.println("2%7 : "+(2%7)); // 2
    //System.out.println("7/0 : "+(7/0)); // AE
    System.out.println("7.7/0 : "+(7.7/0));
    System.out.println("-7.7/0 : "+(-7.7/0));
    System.out.println("7.7%0 : "+(7.7%0));
    /*
    float x;
    x = 7.0f/2;  //3.5
    System.out.println(x); 
    */
  }
}











