package org.moserp.product.domain;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ProductAttributeEnumTest {

    @Test
    public void testRestrictItemsTo() {
        ProductAttributeEnum attributeEnum = new ProductAttributeEnum();
        attributeEnum.addItem(new ProductAttributeEnumItem("value", "label"));
        attributeEnum.addItem(new ProductAttributeEnumItem("value2", "label2"));
        attributeEnum.restrictItemsTo(Arrays.asList("value"));
        assertEquals("Size", 1, attributeEnum.getItems().size());
        assertEquals("Size", "value", attributeEnum.getItems().get(0).getValue());
    }
}