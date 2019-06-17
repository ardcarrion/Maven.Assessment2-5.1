package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private HashMap<Integer, String> monthsByNumber;
    private HashMap<String, Integer> monthsByName;

    public MonthConversion() {
        this.monthsByNumber = new HashMap<>();
        this.monthsByName = new HashMap<>();
    }

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        monthsByNumber.put(monthNumber, monthName);
        monthsByName.put(monthName, monthNumber);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber)  {
        return monthsByNumber.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        return monthsByName.getOrDefault(monthName, null);
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        Set<Integer> months = monthsByNumber.keySet();
        for (Integer month : months) if (monthNumber.equals(month)) return true;
        return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        Set<String> months = monthsByName.keySet();
        for (String month : months) if (monthName.equals(month)) return true;
        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return monthsByNumber.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        monthsByName.replace(monthName, monthNumber);
        monthsByNumber.replace(monthNumber, monthName);
    }
}
