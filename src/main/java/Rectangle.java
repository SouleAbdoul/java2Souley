


public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    String draw(){
       for(int i = 0; i < length; i++) {
           if(i == 1){
               for(int j = 0; j < width; j++){
                   if(j == 0 || j == width-1){
                       System.out.print("*");
                   }else{
                       System.out.print(" ");
                   }
               }
           }else{
               for(int k = 0; k < width; k++){
                   System.out.print("*");
               }
           }
           System.out.println();
       }
        return "";
    }

}