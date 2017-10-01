package test;

import com.company.Result;
import com.company.Solution;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OneElementArrayTest {
    @Test
    public void oneElementArrayTest() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        Solution solution = new Solution(arrayList);
        Result answer = solution.findSolution();
        System.out.println("buy day: " + answer.getLeft() + "\nsell day: " + answer.getRight() + "\nsum: " + answer.getSum());
    }
}