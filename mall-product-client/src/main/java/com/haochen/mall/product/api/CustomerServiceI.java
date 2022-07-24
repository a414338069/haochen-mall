package com.haochen.mall.product.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.haochen.mall.product.dto.CustomerAddCmd;
import com.haochen.mall.product.dto.CustomerListByNameQry;
import com.haochen.mall.product.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
