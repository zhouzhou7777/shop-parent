package com.zz.service;

import com.zz.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-server")
public interface IOrderService {
    @RequestMapping("/product/{pid}")
    Product findByPid(@PathVariable("pid") Long pid);
}
