package exam02;

import java.util.HashMap;

public class Ex01 {
    public static void main(String[] args) {
        HashMap<String, String> members = new HashMap<>();
        members.put("user01", "사용자1");
        members.put("user02", "사용자2");
        members.put("user03", "사용자3");
        members.putIfAbsent("user02", "(수정)사용자2");

        HashMap<String, String> members2 = new HashMap<>();
        members2.put("user06", "사용자6");
        members2.put("user07", "사용자7");

        members.putAll(members2);
        //members.put("user03","(수정)사용자3");
        members.replace("user03","(수정)사용자3");
        //System.out.println(userNm);
        String userNm = members.get("user03");

        members.remove("user03");
        String userNm2 = members.getOrDefault("user08", "없음");
        System.out.println(userNm2);

        System.out.println(members); // == members.toString()
    }
}
