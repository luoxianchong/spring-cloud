package com.ing.pojo;

import java.io.Serializable;

/**
 * Created by ing on 2019-02-23.
 */
public class Item implements Serializable {

    private Long code;
    private String name;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
