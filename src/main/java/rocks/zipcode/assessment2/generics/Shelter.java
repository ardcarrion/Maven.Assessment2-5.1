package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Object`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Object> implements Iterable {

    private ArrayList<Object> house;

    public Shelter() {
        house = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return house.size();
    }

    public void add(Object object) {
        house.add(object);
    }

    public Boolean contains(Object object) {
        return house.lastIndexOf(object) >= 0;
    }

    public void remove(Object object) {
        house.remove(object);
    }

    public Object get(Integer index) {
        return house.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return house.indexOf(ageable);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}