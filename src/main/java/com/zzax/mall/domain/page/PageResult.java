package com.zzax.mall.domain.page;

import java.util.List;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2018-01-14 13:41 星期日
 */
public class PageResult<T> extends QueryParam {

    private Integer pageNumber = 1;
    private Integer pageSize = 10;
    private Integer total;
    private List<T> rows;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", rows=" + rows +
                ",sortOrder=" + super.getSortOrder() +
                ",searchText=" + super.getSearchText() +
                '}';
    }
}
