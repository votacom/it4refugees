package src;

public class Examples211116 {

    public static void main(String[] args) {

        printTheArrayWithLoop();

        System.out.println("\n#########\n");

        sum2Matrices();

    }

    public static void printTheArrayWithLoop(){
        //declaring and initializing 2D array
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};

        //printing 2D array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void sum2Matrices(){
        //creating two matrices
        int a[][]={{1,3,4},{3,4,5}};
        int b[][]={{1,3,4},{3,4,5}};

        //creating another matrix to store the sum of two matrices
        int c[][]=new int[2][3];

        //adding and printing addition of 2 matrices
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();//new line
        }
    }
}
