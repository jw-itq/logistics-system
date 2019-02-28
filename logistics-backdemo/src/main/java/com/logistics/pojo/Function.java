package com.logistics.pojo;

public class Function {
    private Integer id;

    private String pageFunction;

    private String pageName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPageFunction() {
        return pageFunction;
    }

    public void setPageFunction(String pageFunction) {
        this.pageFunction = pageFunction == null ? null : pageFunction.trim();
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName == null ? null : pageName.trim();
    }
}