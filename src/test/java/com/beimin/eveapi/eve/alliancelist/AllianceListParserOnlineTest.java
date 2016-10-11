package com.beimin.eveapi.eve.alliancelist;

import org.junit.Ignore;
import org.junit.Test;

import com.beimin.eveapi.AbstractOnlineTest;
import com.beimin.eveapi.parser.eve.AllianceListParser;
import com.beimin.eveapi.response.eve.AllianceListResponse;

public class AllianceListParserOnlineTest extends AbstractOnlineTest {

    @Test @Ignore("No data returned by the API")
    public void getResponse() throws Exception {
        final AllianceListParser parser = new AllianceListParser();
        prepareParser(parser);

        final AllianceListResponse response = parser.getResponse();

        testResponse(response);
    }

}