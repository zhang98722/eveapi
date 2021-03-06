package com.beimin.eveapi.model.corporation;

import java.util.Date;

public class MemberMedal {
    private int medalID;
    private long characterID;
    private String reason;
    private String status;
    private long issuerID;
    private Date issued;

    public int getMedalID() {
        return medalID;
    }

    public void setMedalID(final int medalID) {
        this.medalID = medalID;
    }

    public long getCharacterID() {
        return characterID;
    }

    public void setCharacterID(final long characterID) {
        this.characterID = characterID;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public boolean isPublic() {
        return status.equals("public");
    }

    public long getIssuerID() {
        return issuerID;
    }

    public void setIssuerID(final long issuerID) {
        this.issuerID = issuerID;
    }

    public Date getIssued() {
        return issued;
    }

    public void setIssued(final Date issued) {
        this.issued = issued;
    }
}
