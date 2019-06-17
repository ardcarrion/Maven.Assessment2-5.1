package rocks.zipcode.assessment2.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {

    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] added = new Integer[integerArray.length+1];
        ArrayList<Integer> clone = new ArrayList<>();
        clone.addAll(Arrays.asList(integerArray));
        clone.add(valueToBeAdded);
        return clone.toArray(added);
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        if (indexToInsertAt >= integerArray.length) return null;
        integerArray[indexToInsertAt] = valueToBeInserted;
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        if (indexToFetch >= integerArray.length) return null;
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        ArrayList<Integer> clone = new ArrayList<>(Arrays.asList(integerArray));
        Integer[] result = clone.toArray(new Integer[clone.size()]);
        int index = 0;
        for (Integer i : integerArray) {
            if (i % 2 == 0) result[index] = (i + 1);
            else result[index] = (i - 1);
            index++;
        }
        return result;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] result = new Integer[integerArray.length];
        int index = 0;
        for (Integer i : integerArray) {
            if (i % 2 == 0) {
                result[index] = (i + 1);
            }else {result[index] = i;}
            index++;
        }
        return result;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] result = new Integer[input.length];
        int index = 0;
        for (Integer i : input) {
            if (i % 2 != 0) {
                result[index] = (i - 1);
            } else result[index] = i;
            index++;
        }
        return result;
    }
}
