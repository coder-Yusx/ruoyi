package com.ruoyi.common.json;

import net.sf.json.JSONObject;

public class JSONContrast {


    public JSONObject JSONContrast1(JSONObject obj1, JSONObject obj2) {

        JSONObject jsonObject1 =  new JSONObject();
        for(Object k1 : obj1.keySet()){
            Object v1 = obj1.get(k1);
            for(Object k2 : obj2.keySet()){
                Object v2 = obj2.get(k2);
                if(k1.equals(k2)){
                    if(!v1.equals(v2)){
                        jsonObject1.put(k1,v1);
                    }
                }
            }
        }
        return jsonObject1;
    }

    public JSONObject JSONContrast2(JSONObject obj1, JSONObject obj2) {
        JSONObject jsonObject2 =  new JSONObject();
        for(Object k1 : obj1.keySet()){
            Object v1 = obj1.get(k1);
            for(Object k2 : obj2.keySet()){
                Object v2 = obj2.get(k2);
                if(k1.equals(k2)){
                    if(!v1.equals(v2)){
                        jsonObject2.put(k2,v2);
                    }
                }
            }
        }
        return jsonObject2;
    }
}
