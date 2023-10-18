package com.zz.controller;

import com.zz.Order;
import com.zz.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    @Resource
    private IOrderService orderService;

    @RequestMapping("/save")
    public Order order(Long pid, Long uid) {
        return orderService.createOrder(pid, uid);
    }
}
