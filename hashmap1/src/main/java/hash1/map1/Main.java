package hash1.map1;

public class Main {

    public static void main(String[] args) {

        MyHashMap<Integer, Integer> int_int = new MyHashMap<>();
        int_int.put(1, 100);
        int_int.put(11, 1100);
        int_int.put(2, 200);


        MyHashMap<Integer, String> days_map = new MyHashMap<>();
        days_map.put(1, "Sunday");
        days_map.put(2, "Monday");
        days_map.put(4, "Tuesday");

        MyHashMap<Integer, Person> map_person_by_id = new MyHashMap<>();
        Person danny = new Person(1, "danny");
        map_person_by_id.put(danny.id, danny);

        Person id_1 = map_person_by_id.get(1);

        MyHashMap<Person, Integer> map_prize_by_Person = new MyHashMap<>();
        map_prize_by_Person.put(danny, 10000);
        int danny_prize = map_prize_by_Person.get(danny);

        Person dann_from_db = getFromDB(1);
        Person danny2 = new Person(1, "danny");

        System.out.println(danny.equals(danny2));

        danny2 = danny;
        map_prize_by_Person.get(danny2);

        int danny_prize2 = map_prize_by_Person.get(dann_from_db);

        for (Integer key:days_map.getKeys()) {
            System.out.printf("[%d] : [%s] \n", key, days_map.get(key));
        }

        MyHashMap<String, Integer> num_map = new MyHashMap<>();
        num_map.put("Friday", 6);
        num_map.put("Monday", 2);
        num_map.put("Wednsday", 4);

        System.out.println("===================");

        for (String key:num_map.getKeys()) {
            System.out.printf("[%s] : [%d] \n", key, num_map.get(key));
        }

        System.out.println(num_map.get("Monday"));

    }

    static Person getFromDB(int id) {
        return new Person(1, "danny");
    }

}
