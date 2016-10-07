package com.beimin.eveapi.handler.corporation;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import com.beimin.eveapi.handler.AbstractContentListHandler;
import com.beimin.eveapi.model.corporation.RoleHistory;
import com.beimin.eveapi.model.corporation.SecurityRole;
import com.beimin.eveapi.response.corporation.MemberSecurityLogResponse;

public class MemberSecurityLogHandler extends AbstractContentListHandler<MemberSecurityLogResponse, RoleHistory> {
    private boolean oldRoles;
    private boolean newRoles;
    private RoleHistory roleHistory;

    public MemberSecurityLogHandler() {
        super(MemberSecurityLogResponse.class);
    }

    @Override
    public void startElement(final String uri, final String localName, final String qName, final Attributes attrs) throws SAXException {
        if (qName.equals("rowset")) {
            final String name = getString(attrs, "name");
            oldRoles = name.equals("oldRoles");
            newRoles = name.equals("newRoles");
        } else if (qName.equals("row")) {
            if (oldRoles) {
                roleHistory.addOldRole(getRole(attrs));
            } else if (newRoles) {
                roleHistory.addNewRole(getRole(attrs));
            } else {
                roleHistory = getItem(attrs);
                response.add(roleHistory);
            }
        } else {
            super.startElement(uri, localName, qName, attrs);
        }
    }

    private SecurityRole getRole(final Attributes attrs) {
        final SecurityRole securityRole = new SecurityRole();
        saveFieldsCount(SecurityRole.class, attrs);
        securityRole.setRoleID(getLong(attrs, "roleID"));
        securityRole.setRoleName(getString(attrs, "roleName"));
        return securityRole;
    }

    @Override
    public void endElement(final String uri, final String localName, final String qName) throws SAXException {
        if ((qName.equals("rowset") && oldRoles) || newRoles) {
            oldRoles = false;
            newRoles = false;
        }
    }

    @Override
    protected RoleHistory getItem(final Attributes attrs) {
        final RoleHistory item = new RoleHistory();
        saveFieldsCount(RoleHistory.class, attrs);
        item.setCharacterID(getLong(attrs, "characterID"));
        item.setCharacterName(getString(attrs, "characterName"));
        item.setChangeTime(getDate(attrs, "changeTime"));
        item.setIssuerID(getLong(attrs, "issuerID"));
        item.setIssuerName(getString(attrs, "issuerName"));
        item.setRoleLocationType(getString(attrs, "roleLocationType"));
        return item;
    }
}