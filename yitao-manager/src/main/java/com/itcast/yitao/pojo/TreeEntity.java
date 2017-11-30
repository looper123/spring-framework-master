package com.itcast.yitao.pojo;

/**
 * Created by 311198 on 2016/12/10.
 */
public class TreeEntity {

    private String  id;
    private String  pId;
    private String  name;
    private Integer  isRank;

    public TreeEntity() {
    }

    public Integer getIsRank() {
        return isRank;
    }

    public void setIsRank(Integer isRank) {
        this.isRank = isRank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }
}
