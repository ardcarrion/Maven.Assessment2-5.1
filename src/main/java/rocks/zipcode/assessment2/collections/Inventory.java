package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    private HashMap inventory;
    List<String> strings;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        inventory = new HashMap();
        strings.forEach(string -> inventory.put(string, 1));
        this.strings = strings;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        inventory = new HashMap();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if (inventory.get(item) == null) {
            inventory.put(item, 1);
            return;
        }
        Integer amount = (Integer)inventory.get(item);
        inventory.put(item, amount+1);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        Integer amount = (Integer)inventory.get(item);
        if (amount == 0) return;
        inventory.put(item, amount-1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if (inventory.get(item) == null) {
            inventory.put(item, 0);
        }
        return (Integer)inventory.get(item);
    }
}
