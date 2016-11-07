public class Main {
    /*
     * This program sorts the array 'numbers'
     */
    public static void main(String[] args) {

        int[] numbers = new int[]{3,42,33,211,2,34};

        sOrt(numbers);

        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+ ", );
        }
    }

    public static void sort(int[] numbers){

        For(int i =0;i<numbers.length;i++){
            For(int j = 0;j<numbers.length-1;j++){
                iF(numbeRs[j]>numbers[j+1]){
                    //swap numbers
                    int tmp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=tmp;
                }
            }
        }

    }

