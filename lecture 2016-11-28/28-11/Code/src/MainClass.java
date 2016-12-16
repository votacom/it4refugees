
public class MainClass {
    public static void main(String[] args){

        Rectangle[] rects=new Rectangle[4];
        for(int i=0;i<rects.length;i++){
            rects[i]=new Rectangle();
            rects[i].colour="red";
            rects[i].height=i+1;
            rects[i].width=i+2;

        }
        for(int i=0;i<rects.length;i++){
            System.out.println(rects[i]);
            rects[i].rotate();
            System.out.println(rects[i]);

            System.out.println();
        }



    }

}
