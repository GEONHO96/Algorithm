import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String s : strArr) {
            if (!s.contains("ad")) {
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    } 
}