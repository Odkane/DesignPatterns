package behavioral.strategy.example2;

public class BubbleSortMethod implements SortMethod {
    @Override
    public int[] sort(int[] values) {
        System.out.println("Sorting the array with the bubble sort method");
        return new int[]{values[0], values[1], values[2]};
    }
}
