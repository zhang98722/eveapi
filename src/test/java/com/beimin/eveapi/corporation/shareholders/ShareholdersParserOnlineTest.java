package com.beimin.eveapi.corporation.shareholders;

import org.junit.Ignore;
import org.junit.Test;

import com.beimin.eveapi.AbstractOnlineTest;
import com.beimin.eveapi.parser.corporation.ShareholdersParser;
import com.beimin.eveapi.response.corporation.ShareholdersResponse;

public class ShareholdersParserOnlineTest extends AbstractOnlineTest {

    @Test @Ignore("Some data missing")
    public void getResponse() throws Exception {
        final ShareholdersParser parser = new ShareholdersParser();
        prepareParser(parser);

        final ShareholdersResponse response = parser.getResponse(getCorp());

        testResponse(response);
    }

}