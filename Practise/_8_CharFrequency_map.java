
//import java.util.Arrays;
//import java.util.Map;
import java.util.*;

public class _8_CharFrequency_map {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 4, 4, 2, 2 };
        System.out.println(Arrays.toString(charFrequnecy(arr)));

        //int[] map = freq(arr);
        //System.out.println(Arrays.toString(freq(arr)));
        freq(arr);
    }

    @SuppressWarnings("unused")
    private static int[] charFrequnecy2(int[] arr) {
        int n = arr.length;
        int[] frequency = new int[n];

        for (int i = 0; i < arr.length; i++) {
            frequency[i]++;
            if (frequency[i] == 1) {
                frequency[i] = 1;
                //frequency[i]++;
                //} else {
            }
        }
        return frequency;
    }

    // char frequency
    public static int[] charFrequnecy(int[] arr) {
        int n = arr.length;
        int[] frequency = new int[n];
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }

        int nonZeroCount = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                nonZeroCount++;
            }
        }

        int[] result = new int[nonZeroCount];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                result[index++] = frequency[i];
            }
        }

        return result;

        //return frequency;
    }

    //import java.util.HashMap;

    static void freq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put((arr[i]), map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        //return map.values().stream().mapToInt(i -> i).toArray();
    }
}
/* 
const findLetters = (test: string): { [key: string]: number } =>
{
    const charFrequency: { [key: string]: number } = {};
    for (let val of test)
    {
        if (charFrequency[val])
        {
            charFrequency[val]++;
        } else
        {
            charFrequency[val] = 1;
        }
    }
    console.log(charFrequency)
    // let keys = Object.keys(charFrequency);
    for (const [key, value] of Object.entries(charFrequency))
    {
        console.log(`Character: ${key}, Frequency: ${value}`);
    } return charFrequency;
}
 */