package com.beimin.eveapi.journal;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.digester.Digester;
import org.xml.sax.SAXException;

import com.beimin.eveapi.AbstractApiParser;
import com.beimin.eveapi.ApiAuth;

public class Parser extends AbstractApiParser<Response> {
	protected static final String JOURNAL_URL = "/WalletJournal.xml.aspx";

	public Parser() {
		super(Response.class, 2, JOURNAL_URL);
	}

	public Response getJournal(ApiAuth auth, Long beforeRefID) throws IOException, SAXException {
		Map<String, String> extraParams = new HashMap<String, String>();
		if (beforeRefID!=null) {
			extraParams.put("beforeRefID", beforeRefID.toString());
		}
		if(extraParams.size() > 0) {
			return getResponse(auth, Path.CORP, extraParams);	
		}
		return getResponse(auth, Path.CHARACTER);
	}

	public Response getJournal(ApiAuth auth, int accountKey, Long beforeRefID) throws IOException, SAXException {
		Map<String, String> extraParams = new HashMap<String, String>();
		extraParams.put("accountKey", Integer.toString(accountKey));
		if (beforeRefID!=null) {
			extraParams.put("beforeRefID", beforeRefID.toString());
		}
		return getResponse(auth, Path.CORP, extraParams);	
	}

	@Override
	protected Digester getDigester() {
		Digester digester = super.getDigester();
		digester.addObjectCreate("eveapi/result/rowset/row", ApiJournalEntry.class);
		digester.addSetProperties("eveapi/result/rowset/row");
		digester.addSetNext("eveapi/result/rowset/row", "addJournalEntry");
		return digester;
	}

	public static Parser getInstance() {
		return new Parser();
	}
}