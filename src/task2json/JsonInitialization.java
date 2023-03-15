package task2json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JsonInitialization {

    public static HashMap<String, Object> jsonInitialization() {
        HashMap<String, Object> json = new HashMap<>();
        json.put("squadName", "Super hero squad");
        json.put("homeTown", "Metro City");
        json.put("formed", 2016);
        json.put("secretBase", "Super tower");
        json.put("active", true);
        List<HashMap<String, Object>> members = new ArrayList<>();

        HashMap<String, Object> member1 = new HashMap<>();
        member1.put("name", "Molecule Man");
        member1.put("age", 29);
        member1.put("secretIdentity", "Dan Jukes");
        List<String> member1Powers = new ArrayList<>();
        member1Powers.add("Radiation resistance");
        member1Powers.add("Turning tiny");
        member1Powers.add("Radiation blast");
        member1.put("powers", member1Powers);
        members.add(member1);

        HashMap<String, Object> member2 = new HashMap<>();
        member2.put("name", "Madame Uppercut");
        member2.put("age", 39);
        member2.put("secretIdentity", "Jane Wilson");
        List<String> member2Powers = new ArrayList<>();
        member2Powers.add("Million tonne punch");
        member2Powers.add("Damage resistance");
        member2Powers.add("Superhuman reflexes");
        member2.put("powers", member2Powers);
        members.add(member2);

        HashMap<String, Object> member3 = new HashMap<>();
        member3.put("name", "Eternal Flame");
        member3.put("age", 1000000);
        member3.put("secretIdentity", "Unknown");
        List<String> member3Powers = new ArrayList<>();
        member3Powers.add("Immortality");
        member3Powers.add("Heat Immunity");
        member3Powers.add("Inferno");
        member3Powers.add("Teleportation");
        member3Powers.add("Interdimensional travel");
        member3.put("powers", member3Powers);
        members.add(member3);

        json.put("members", members);
        return json;
    }
}
