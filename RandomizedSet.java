import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    Random r;
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        r = new Random();
    }
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        int i = map.get(val);
        int j = list.get(list.size()-1);
        list.set(i, j);
        map.put(j, i);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    public int getRandom() {
        int k = r.nextInt(list.size());
        return list.get(k);
    }
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        System.out.println(obj.insert(1));
        System.out.println(obj.remove(2));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
        System.out.println(obj.remove(1));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
    }
}