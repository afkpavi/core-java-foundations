import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SlidingWindowBG {

    static int slidingWindowMaxSum(List<Integer> arr, int windowSize){

        int maxSum = 0, currentWindowSum = 0;

        for(int i = 0; i<windowSize; i ++){
            currentWindowSum += arr.get(i);
        }

        maxSum = currentWindowSum;

        System.out.println(currentWindowSum);

        for(int i = windowSize; i < arr.size(); i++){
            currentWindowSum += arr.get(i);
            currentWindowSum -= arr.get(i - windowSize);
            System.out.println(currentWindowSum + " " + arr.get(i));
            maxSum = Math.max(maxSum, currentWindowSum);
        }
        return maxSum;
    }

    static void main(String[] args){
        System.out.println("Hello");

        List<Integer> myNums = Arrays.asList(5, 10, 7, 9, 11, 4);

        System.out.println(myNums);

        int windowSize = 3;

        int leftIdx = 0;

        int rightIdx = windowSize-1;

        while(rightIdx < myNums.size()){
            for(int i = leftIdx; i <= rightIdx; i++){
                System.out.print(myNums.get(i) + ", ");
            }
            System.out.println();
            leftIdx++;
            rightIdx++;
        }

        System.out.println(slidingWindowMaxSum(myNums, windowSize));

        
    }
}