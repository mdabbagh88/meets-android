package com.theagilemonkeys.meets.magento.methods;

import com.theagilemonkeys.meets.magento.SoapApiMethod;
import com.theagilemonkeys.meets.magento.models.base.MageMeetsCollectionPojos;

/**
 * Android Meets SDK
 * Original work Copyright (c) 2014 [TheAgileMonkeys]
 *
 * @author Álvaro López Espinosa
 */
public class CatalogInventoryStockItemList extends SoapApiMethod {
    public CatalogInventoryStockItemList() {
        super(MageMeetsCollectionPojos.StockInfos.class);
    }
}

