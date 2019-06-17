package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex)
            throws IndexOutOfBoundsException, IllegalArgumentException {
        if (startingIndex < 0 | endingIndex < 0 ) throw new IllegalArgumentException();
        if (startingIndex >= arrayToBeSpliced.length | endingIndex > arrayToBeSpliced.length) throw new IndexOutOfBoundsException();
        String[] result = new String[(endingIndex - startingIndex)];
        for (int i = startingIndex; i < endingIndex; i++)
            result[i-startingIndex] = arrayToBeSpliced[i];

        return result;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex)
            throws IndexOutOfBoundsException, IllegalArgumentException {
        if (startingIndex < 0) throw new IndexOutOfBoundsException();
        if (startingIndex >= arrayToBeSpliced.length) throw new IllegalArgumentException();
        return getSubArray(arrayToBeSpliced, startingIndex, arrayToBeSpliced.length);
    }
}
