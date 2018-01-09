import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
     * @param number: An integer
     * @return: nothing
     */
    private Map<Integer,Integer> map = new HashMap<>();


    public void add(int number) {
        if(!map.containsKey(number)){
            map.put(number,1);
        }
        else {
            map.put(number,map.get(number)+1);
        }
    }

    /*
     * @param value: An integer
     * @return: Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {

        for (Integer key : map.keySet()
             ) {
            if( value- key == key && map.get(key) > 1 ||
                    value - key != key && map.containsKey(value - key)){
                return true;
            }
        }
        return false;
    }

}