package com.zzax.mall.domain.page;

import java.io.Serializable;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2018-01-14 11:55 星期日
 */
public class QueryParam<T> implements Serializable {

    private String sortOrder = "ASC";
    private String searchText = "";
    private String status = "";

    public QueryParam() {
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "QueryParam{" +
                "sortOrder='" + sortOrder + '\'' +
                ", searchText='" + searchText + '\'' +
                ", status=" + status +
                '}';
    }
}
