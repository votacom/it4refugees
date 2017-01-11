class IterableNumbers implements java.lang.Iterable<Integer> {
    private Integer[] numbers;

    public IterableNumbers(Integer[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public java.util.Iterator<Integer> iterator() {
        return new NumberIterator(this.numbers);
    }
}

class NumberIterator implements java.util.Iterator<Integer> {
    private int currentIndex;
    private Integer[] numbers;
    
    public NumberIterator(Integer[] numbers) {
        this.currentIndex = 0;
        this.numbers = numbers;
    }
    
    @Override
    public boolean hasNext() {
        return currentIndex < this.numbers.length;
    }
    
    @Override
    public Integer next() {
        return this.numbers[this.currentIndex++];
    }
}

public class Main {
    public static void main(String[] args) {
        IterableNumbers n = new IterableNumbers(new Integer[] { 1, 2, 3 });
        for (Integer i : n) {
            System.out.println(i);
        }
    }
}