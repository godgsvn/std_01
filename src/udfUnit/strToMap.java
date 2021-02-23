package udfUnit;

import java.util.HashMap;
import java.util.Map;

public class strToMap {
    public static void main(String[] args) {
        String str1 = "p:福建省;c:泉州市;a:德化县;ad:城东工业区百鸿对面金星家私城5楼正扬茶具";
        Map<String,String> map = new HashMap<String,String>();
        String[] text = str1.split(";");
        for (String str:text){
            String[] keyText = str.split(":");
            if(keyText.length < 1){
                continue;
            }
            String key = keyText[0];
            String value = keyText[1];
            map.put(key,value);
        }
        System.out.println("省份：" + map.get("p"));
        System.out.println("城市：" + map.get("c"));
        System.out.println("区县：" + map.get("a"));
        System.out.println("地址：" + map.get("ad"));
    }
}
