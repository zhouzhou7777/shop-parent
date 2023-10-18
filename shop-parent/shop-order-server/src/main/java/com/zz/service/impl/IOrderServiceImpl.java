package com.zz.service.impl;

import com.alibaba.fastjson.JSON;
import com.zz.Order;
import com.zz.dao.OrderDao;
import com.zz.domain.Product;
import com.zz.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
@Slf4j
public class IOrderServiceImpl implements IOrderService {
    @Resource
    private OrderDao orderDao;

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Order createOrder(Long productId, Long userId) {
        Product product = restTemplate.getForObject("http://localhost:8081/product"+userId,Product.class);
        Order order = new Order();
        order.setUid(userId);
        order.setUsername("jpa插入数据");
        order.setPid(productId);
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        orderDao.save(order);
        log.info("创建订单成功,订单信息为{}", JSON.toJSONString(order));
        return order;
    }
}
