package utils;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.Arrays;

public class Mock {
    public static int Integer(int limit) {
        return new Random().nextInt(limit);
    }

    public static int FromArray(int[] arr) {
        return arr[Mock.Integer(arr.length)];
    }

    public static int[] UnsortedArray(int elementLimit, int valueLimit) {
        var rand = new Random();

        return IntStream
        .range(0, elementLimit)
        .map(n -> rand.nextInt(valueLimit))
        .toArray();
    }

    
    public static int[] SortedArray(int elementLimit, int valueLimit) {
        int[] randomArray = UnsortedArray(elementLimit, valueLimit);
        Arrays.sort(randomArray);
        return randomArray;
    }

    // public static int[] UnsortedUniqueArray(int elementLimit, int valueLimit) {
    //
    //     if (elementLimit > valueLimit) {
    //         throw new IllegalArgumentException(
    //             String.fomrat("Element Limit (%d) cannot be lower than Value Limit (%d) when creating Unique Array", elementLimit, valueLimit);
    //         )
    //     }
    //
    // }
}
