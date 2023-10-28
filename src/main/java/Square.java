public class Square extends Shape{
    private int s;
    public Square(int s){
       this.s = s;
    }
    String draw(){
        for(int i = 0; i< s;i++){
            if(i == 1){
               for(int j = 0; j < s; j++){
                   if(j == 1){
                       System.out.print(" ");
                   }else{
                       System.out.print("*");
                   }
               }
            }else{
                for(int j = 0; j < s;j++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }
        return "";
    }
}
