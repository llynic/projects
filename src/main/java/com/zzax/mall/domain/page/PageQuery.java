package com.zzax.mall.domain.page;

import java.io.Serializable;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2018-01-14 11:55 星期日
 */
public class PageQuery<T> implements Serializable {

    private String sortOrder = "ASC";
    private String searchText = "";

    public PageQuery() {
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

    @Override
    public String toString() {
        return "QueryParam{" +
                "sortOrder='" + sortOrder + '\'' +
                ", searchText='" + searchText + '\'' +
                '}';
    }
}
