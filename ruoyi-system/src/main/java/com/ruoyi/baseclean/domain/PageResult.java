package com.ruoyi.baseclean.domain;

import java.util.LinkedHashMap;

public class PageResult {

    private LinkedHashMap<String,Object> map;

    public PageResult(LinkedHashMap<String, Object> map) {
        this.map = map;
    }

    public LinkedHashMap<String, Object> getMap() {
        return map;
    }

    public void setMap(LinkedHashMap<String, Object> map) {
        this.map = map;
    }
}
