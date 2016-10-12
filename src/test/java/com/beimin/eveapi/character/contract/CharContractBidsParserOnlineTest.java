package com.beimin.eveapi.character.contract;

import org.junit.Test;

import com.beimin.eveapi.AbstractOnlineTest;
import com.beimin.eveapi.TestControl;
import com.beimin.eveapi.parser.pilot.CharContractBidsParser;
import com.beimin.eveapi.response.shared.ContractBidsResponse;
import static org.junit.Assume.assumeTrue;

public class CharContractBidsParserOnlineTest extends AbstractOnlineTest {

    @Test
    public void getResponse() throws Exception {
        assumeTrue("No data returned by the API", TestControl.runNoData());
        final CharContractBidsParser parser = new CharContractBidsParser();
        prepareParser(parser);

        final ContractBidsResponse response = parser.getResponse(getCharacter());

        testResponse(response);
    }

}
