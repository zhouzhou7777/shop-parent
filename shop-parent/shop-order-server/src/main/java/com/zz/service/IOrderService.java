package com.zz.service;

import com.zz.Order;

public interface IOrderService {
    Order createOrder(Long productId, Long userId);
}
