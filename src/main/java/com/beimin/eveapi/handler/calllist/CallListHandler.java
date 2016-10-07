package com.beimin.eveapi.handler.calllist;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import com.beimin.eveapi.handler.AbstractContentHandler;
import com.beimin.eveapi.model.calllist.Call;
import com.beimin.eveapi.model.calllist.CallGroup;
import com.beimin.eveapi.model.calllist.CallList;
import com.beimin.eveapi.model.shared.KeyType;
import com.beimin.eveapi.response.calllist.CallListResponse;

public class CallListHandler extends AbstractContentHandler {
    private CallListResponse response;
    private boolean callGroups = false;
    private boolean calls = false;
    private CallList callList;

    @Override
    public void startDocument() throws SAXException {
        response = new CallListResponse();
    }

    @Override
    public void startElement(final String uri, final String localName, final String qName, final Attributes attrs) throws SAXException {
        if (qName.equals("result")) {
            callList = new CallList();
            saveFieldsCount(CallList.class, attrs);
        }
        if (qName.equals("rowset")) {
            final String name = attrs.getValue("name");
            if (name.equals("callGroups")) {
                callGroups = true;
            } else if (name.equals("calls")) {
                calls = true;
            }
        }
        if (qName.equals("row")) {
            if (callGroups) {
                final CallGroup callGroup = new CallGroup();
                saveFieldsCount(CallGroup.class, attrs);
                callGroup.setGroupID(getInt(attrs, "groupID"));
                callGroup.setName(getString(attrs, "name"));
                callGroup.setDescription(getString(attrs, "description"));
                callList.add(callGroup);
            } else if (calls) {
                final Call call = new Call();
                saveFieldsCount(Call.class, attrs);
                call.setAccessMask(getLong(attrs, "accessMask"));
                call.setType(KeyType.valueOf(getString(attrs, "type")));
                call.setName(getString(attrs, "name"));
                call.setGroupID(getInt(attrs, "groupID"));
                call.setDescription(getString(attrs, "description"));
                callList.add(call);
            }
        }
        super.startElement(uri, localName, qName, attrs);
        accumulator.setLength(0);
    }

    @Override
    public void endElement(final String uri, final String localName, final String qName) throws SAXException {
        if (qName.equals("result")) {
            response.set(callList);
        }
        if (qName.equals("rowset")) {
            callGroups = false;
            calls = false;
        }
        super.endElement(uri, localName, qName);
    }

    @Override
    public CallListResponse getResponse() {
        return response;
    }
}
