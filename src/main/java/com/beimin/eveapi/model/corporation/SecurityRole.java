package com.beimin.eveapi.model.corporation;

public class SecurityRole {
    private long roleID;
    private String roleName;

    public long getRoleID() {
        return roleID;
    }

    public void setRoleID(final long roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(final String roleName) {
        this.roleName = roleName;
    }
}