package com.beimin.eveapi.corporation.assetlist;

import org.junit.Test;

import com.beimin.eveapi.AbstractOnlineTest;
import com.beimin.eveapi.parser.corporation.AssetListParser;
import com.beimin.eveapi.parser.shared.AbstractAssetListParser;
import com.beimin.eveapi.response.shared.AssetListResponse;

public class CorpAssetListParserOnlineTest extends AbstractOnlineTest {

    @Test
    public void getResponse() throws Exception {
        final AbstractAssetListParser parser = new AssetListParser();
        final AssetListResponse response = parser.getResponse(getCorp());
        testResponse(response);
    }

    @Test
    public void getResponseFlat() throws Exception {
        final AbstractAssetListParser parser = new AssetListParser();
        final AssetListResponse response = parser.getResponse(getCorp(), true);
        testResponse(response);
    }

}