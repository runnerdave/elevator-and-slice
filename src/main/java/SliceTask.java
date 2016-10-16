import java.util.*;

/**
 * Created by runnerdave on 17/10/16.
 */
public class SliceTask {
    Map<Integer, List<Integer>> validSlices;

    public SliceTask() {
        validSlices = new HashMap<>();
    }

    public int solution(int[] ints) {
        int longestSlice = 0;
        newSlice:
        for (int i = 0; i < ints.length; i++) {
            int counter = 0;
            List<Integer> slice = new ArrayList<>();
            slice.add(ints[i]);
            for (int j = i + 1; j < (ints.length - 1); j++) {
                counter++;
                slice.add(ints[j]);
                if (ints[i] == ints[j]) {
                    validSlices.put(++counter, slice);
                    continue newSlice;
                }
            }
        }
        Set<Integer> keys = validSlices.keySet();
        if (keys.size() > 0) {
            List<Integer> sortedKeys = new ArrayList<>(keys);
            Collections.sort(sortedKeys);
            longestSlice = sortedKeys.get(sortedKeys.size() - 1);
        }
        return longestSlice;
    }
}
