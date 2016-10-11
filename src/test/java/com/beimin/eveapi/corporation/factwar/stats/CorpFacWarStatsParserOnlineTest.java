package com.beimin.eveapi.corporation.factwar.stats;

import org.junit.Ignore;
import org.junit.Test;

import com.beimin.eveapi.AbstractOnlineTest;
import com.beimin.eveapi.parser.corporation.CorpFacWarStatsParser;
import com.beimin.eveapi.response.shared.FacWarStatsResponse;

public class CorpFacWarStatsParserOnlineTest extends AbstractOnlineTest {

    @Test @Ignore("API Error")
    public void getResponse() throws Exception {
        final CorpFacWarStatsParser parser = new CorpFacWarStatsParser();
        prepareParser(parser);

        final FacWarStatsResponse facWarStatsResponse = parser.getResponse(getCorp());

        testResponse(facWarStatsResponse);
    }

}