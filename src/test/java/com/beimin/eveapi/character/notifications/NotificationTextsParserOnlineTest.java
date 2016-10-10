package com.beimin.eveapi.character.notifications;

import java.util.Set;

import org.junit.Test;

import com.beimin.eveapi.AbstractOnlineTest;
import com.beimin.eveapi.model.pilot.Notification;
import com.beimin.eveapi.parser.pilot.NotificationTextsParser;
import com.beimin.eveapi.parser.pilot.NotificationsParser;
import com.beimin.eveapi.response.pilot.NotificationTextsResponse;
import com.beimin.eveapi.response.pilot.NotificationsResponse;
import org.junit.Ignore;

public class NotificationTextsParserOnlineTest extends AbstractOnlineTest {

    @Test @Ignore("No data returned by the API")
    public void getResponse() throws Exception {
        final NotificationsParser notificationsParser = new NotificationsParser();
        final NotificationsResponse notificationsResponse = notificationsParser.getResponse(getPilot());
        testResponse(notificationsResponse);
        final Set<Notification> notifications = notificationsResponse.getAll();
        test(notifications);
        final NotificationTextsParser parser = new NotificationTextsParser();
        for (final Notification notification : notifications) {
            final NotificationTextsResponse response = parser.getResponse(getPilot(), notification.getNotificationID());
            testResponse(response);
        }
    }

}
