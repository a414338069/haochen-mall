package com.haochen.mall.product.domain.customer.gateway;

import com.haochen.mall.product.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
