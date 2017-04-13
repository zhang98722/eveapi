package com.beimin.eveapi.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by warden on 2017/3/21.
 */
public class BaseObject implements Serializable {
    public static final int         ENABLE_TRUE                 =1;
    public static final int         ENABLE_FALSE                =2;

    public static final int         DEFAULT_PAGE_SIZE           =20;

    @Getter @Setter
    Date created;
    @Getter @Setter
    Date updated;

    @Getter @Setter
    Integer enable;

    //page
    @Getter
    Integer recordCount                 =0;
    @Setter @Getter
    Integer currentPage                 =1;
    @Getter
    Integer pageSize                    =DEFAULT_PAGE_SIZE;
    @Getter
    Integer pageCount                   =0;
    int                             startIndex                  =0;

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
        check();
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        check();
    }

    public int getStartIndex() {
        return (currentPage-1) * pageSize;
    }

    public BaseObject check(){
        currentPage = currentPage<1 ? 1: currentPage;
        pageSize = pageSize<1 ? 20 : pageSize;
        pageCount = (int) ((recordCount+pageSize-1)/pageSize);
        currentPage = currentPage < pageCount ? currentPage : (pageCount > 0 ? pageCount : 1);
        return this;
    }
}
