package com.zz.controller;

import com.zz.domain.Product;
import com.zz.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/save")
    public Product order(Long uid) {
        return orderService.findByPid(uid);
    }
}
