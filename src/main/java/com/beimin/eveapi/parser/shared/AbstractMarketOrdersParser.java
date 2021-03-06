package com.beimin.eveapi.parser.shared;

import com.beimin.eveapi.exception.ApiException;
import com.beimin.eveapi.handler.shared.MarketOrdersHandler;
import com.beimin.eveapi.model.shared.MarketOrder;
import com.beimin.eveapi.parser.ApiAuth;
import com.beimin.eveapi.parser.ApiPage;
import com.beimin.eveapi.parser.ApiPath;
import com.beimin.eveapi.response.shared.MarketOrdersResponse;

public abstract class AbstractMarketOrdersParser extends AbstractListParser<MarketOrdersHandler, MarketOrdersResponse, MarketOrder> {
    protected AbstractMarketOrdersParser(final ApiPath path) {
        super(MarketOrdersResponse.class, 2, path, ApiPage.MARKET_ORDERS, MarketOrdersHandler.class);
    }

    @Override
    public MarketOrdersResponse getResponse(final ApiAuth auth) throws ApiException {
        return super.getResponse(auth);
    }

    public MarketOrdersResponse getResponse(final ApiAuth auth, final long orderID) throws ApiException {
        return super.getResponse(auth, "orderID", Long.toString(orderID));
    }
}
