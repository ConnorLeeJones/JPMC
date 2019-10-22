import java.util.ArrayList;
import java.util.Arrays;

public class Sum {

    private int[] numbers;
    private int sum;


    public Sum(int[] numbers, int sum) {
        this.numbers = numbers;
        this.sum = sum;
    }

    public ArrayList<ArrayList<Integer>> returnPairs(){
        Arrays.sort(this.numbers);

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int l = 0;
        int r = numbers.length - 1;

        while(l < r){
            if (numbers[l] + numbers[r] == sum){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(numbers[l]);
                pair.add(numbers[r]);
                result.add(pair);
                l++;
                r--;
            } else if (numbers[l] + numbers[r] < sum){
                l++;
            } else {
                r--;
            }
        }
        return result;
    }

}
