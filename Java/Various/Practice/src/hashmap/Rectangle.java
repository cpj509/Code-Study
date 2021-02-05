package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class Rectangle {
    public static int[] solution(int[][] v) {
        HashMap<Integer, Integer> mapX = new HashMap<>();
        HashMap<Integer, Integer> mapY = new HashMap<>();
        for (int[] xy:
                v) {
            mapX.put(xy[0], 0);
            mapY.put(xy[1], 0);
        }
        for (int[] xy:
                v) {
            mapX.put(xy[0], mapX.get(xy[0]) + 1);
            mapY.put(xy[1], mapY.get(xy[1]) + 1);
        }
        int x = 0;
        int y = 0;
        for (Integer numX:
                mapX.keySet()) {
            Integer value = mapX.get(numX);
            if(value == 1)
                x = numX;
        }
        for (Integer numY:
                mapY.keySet()) {
            Integer value = mapY.get(numY);
            if(value == 1)
                y = numY;
        }
        int[] answer = {x, y};
        return answer;
    }
    public static void main(String[] args) {
        int[][] v = {{1,4}, {3,4}, {3,10}};
        int[] arr = solution(v);
        System.out.println(Arrays.toString(arr));
    }
}
