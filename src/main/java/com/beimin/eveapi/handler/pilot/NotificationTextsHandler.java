package com.beimin.eveapi.handler.pilot;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import com.beimin.eveapi.handler.AbstractContentListHandler;
import com.beimin.eveapi.model.pilot.NotificationText;
import com.beimin.eveapi.response.pilot.NotificationTextsResponse;

public class NotificationTextsHandler extends AbstractContentListHandler<NotificationTextsResponse, NotificationText> {

    private NotificationText notificationText;

    public NotificationTextsHandler() {
        super(NotificationTextsResponse.class);
    }

    @Override
    public void startElement(final String uri, final String localName, final String qName, final Attributes attrs) throws SAXException {
        if (qName.equals("row")) {
            notificationText = getItem(attrs);
        } else {
            super.startElement(uri, localName, qName, attrs);
        }
    }

    @Override
    public void endElement(final String uri, final String localName, final String qName) throws SAXException {
        if (qName.equals("row")) {
            notificationText.setText(getString());
            response.add(notificationText);
            notificationText = null;
            accumulator.setLength(0);
        }
        super.endElement(uri, localName, qName);
    }

    @Override
    protected NotificationText getItem(final Attributes attrs) {
        final NotificationText notificationText = new NotificationText();
        saveFieldsCount(NotificationText.class, attrs);
        notificationText.setNotificationID(getLong(attrs, "notificationID"));
        return notificationText;
    }
}