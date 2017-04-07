package com.beimin.eveapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by warden on 2017/4/7.
 */
public class ExpireObject {

    private Date                        lastUpdate;

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
