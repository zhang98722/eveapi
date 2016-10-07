package com.beimin.eveapi.parser;

public class ApiAuthorization extends ApiAuth {
    private static final long serialVersionUID = 1369641401371970736L;

    private final int keyID;
    private Long characterID;
    private final String vCode;

    public ApiAuthorization(final int keyID, final long characterID, final String vCode) {
        this.keyID = keyID;
        this.vCode = vCode;
        this.characterID = characterID;
    }

    public ApiAuthorization(final int keyID, final String vCode) {
        this.keyID = keyID;
        this.vCode = vCode;
        characterID = null;
    }

    @Override
    public int getKeyID() {
        return keyID;
    }

    @Override
    public Long getCharacterID() {
        return characterID;
    }

    @Override
    public void setCharacterID(final long characterID) {
        this.characterID = characterID;
    }

    @Override
    public String getVCode() {
        return vCode;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("keyID: ").append(keyID).append(", characterID: ").append(characterID).toString();
    }
}