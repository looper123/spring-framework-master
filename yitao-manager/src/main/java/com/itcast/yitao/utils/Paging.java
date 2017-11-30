package com.itcast.yitao.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 311198 on 2016/11/28.
 * 百度分页 前5后4
 */
public class Paging {
    private int currentPage;//当前页
    private int totalCounts;//总记录数
    private int totalPage;//总页数
    private int pageSize = 10;//每一页记录数
    private boolean hasNextPage = true;//是否有下一页
    private boolean hasLastPage = true;//是否有上一页
    private List<Integer> labelList = new ArrayList<>();
    private String url;//请求地址
    private String params;//请求参数

    public Paging() {
    }

    public Paging(int currentPage, int totalCounts) {
        this.currentPage = currentPage;
        this.totalCounts = totalCounts;
        this.initTotalPage();
        this.initLabelList();
        this.initHasLastPage();
        this.initHasNextPage();
    }

    //是否有上一页
    private void initHasNextPage() {
        if (this.currentPage == 1) {
            this.hasLastPage = false;
        }
    }

    //    是否有下一页
    private void initHasLastPage() {
        if (this.currentPage == this.totalPage) {
            this.hasNextPage = false;
        }
    }

    //    初始化页码栏
    private void initLabelList() {
        if (this.currentPage < 6) {
            for (int i = 1; i < 11; i++) {
                this.labelList.add(i);
            }
        } else if (this.currentPage > this.totalPage - 4) {
            for (int i = this.totalPage - 9; i <= this.totalPage; i++) {
                this.labelList.add(i);
            }
        } else {
            for (int i = this.currentPage - 5; i < this.currentPage +5; i++) {
                this.labelList.add(i);
            }
        }

    }

    //    总页码数
    private void initTotalPage() {
        this.totalPage = (totalCounts + pageSize - 1) / pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }


    public List<Integer> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<Integer> labelList) {
        this.labelList = labelList;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public int getTotalCounts() {
        return totalCounts;
    }

    public void setTotalCounts(int totalCounts) {
        this.totalCounts = totalCounts;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public boolean isHasLastPage() {
        return hasLastPage;
    }

    public void setHasLastPage(boolean hasLastPage) {
        this.hasLastPage = hasLastPage;
    }
}
