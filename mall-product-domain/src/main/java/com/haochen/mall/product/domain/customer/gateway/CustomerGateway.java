package com.haochen.mall.product.domain.customer.gateway;

import com.haochen.mall.product.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
