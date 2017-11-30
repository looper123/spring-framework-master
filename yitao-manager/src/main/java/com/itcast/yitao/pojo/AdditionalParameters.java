package com.itcast.yitao.pojo;

import java.util.Map;

/**
 * Created by 311198 on 2016/12/10.
 */
public class AdditionalParameters {

    private String id;
    private String pId;
    private Map<String,TreeEntity>  children;

    public AdditionalParameters() {
    }

    public Map<String, TreeEntity> getChildren() {
        return children;
    }

    public void setChildren(Map<String, TreeEntity> children) {
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }
}
