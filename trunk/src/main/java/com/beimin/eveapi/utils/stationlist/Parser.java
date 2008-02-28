package com.beimin.eveapi.utils.stationlist;

import java.io.IOException;

import org.apache.commons.digester.Digester;
import org.xml.sax.SAXException;

import com.beimin.eveapi.AbstractApiParser;

public class Parser extends AbstractApiParser<Response> {
	protected static final String STATION_LIST_URL = "/eve/ConquerableStationList.xml.aspx";

	public Parser() {
		super(Response.class);
	}

	public Response getStationList() throws IOException, SAXException {
		String requestUrl = EVE_API_URL + STATION_LIST_URL;
		return getResponse(requestUrl, getDigester());
	}

	@Override
	protected Digester getDigester() {
		Digester digester = super.getDigester();
		digester.addObjectCreate("eveapi/result/rowset/row", Station.class);
		digester.addSetProperties("eveapi/result/rowset/row");
		digester.addSetNext("eveapi/result/rowset/row", "addStation");
		return digester;
	}

	public static Parser getInstance() {
		return new Parser();
	}
}
