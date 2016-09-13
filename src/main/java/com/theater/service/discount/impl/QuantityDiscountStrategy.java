package com.theater.service.discount.impl;

import com.theater.service.discount.DiscountStrategy;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public class QuantityDiscountStrategy implements DiscountStrategy {

    public static int DISCOUNT_VALUE = 50;

    public int getDiscount() {
        return DISCOUNT_VALUE;
    }
}
