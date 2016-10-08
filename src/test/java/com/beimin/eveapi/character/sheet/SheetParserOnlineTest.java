package com.beimin.eveapi.character.sheet;

import org.junit.Test;

import com.beimin.eveapi.AbstractOnlineTest;
import com.beimin.eveapi.parser.pilot.CharacterSheetParser;
import com.beimin.eveapi.response.pilot.CharacterSheetResponse;

public class SheetParserOnlineTest extends AbstractOnlineTest {

    @Test
    public void getResponse() throws Exception {
        final CharacterSheetParser parser = new CharacterSheetParser();
        final CharacterSheetResponse response = parser.getResponse(getPilot());
        testResponse(response, 1);
    }

}
