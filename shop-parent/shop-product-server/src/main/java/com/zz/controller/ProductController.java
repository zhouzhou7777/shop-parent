package com.zz.controller;

import com.alibaba.fastjson.JSON;
import com.zz.domain.Product;
import com.zz.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class ProductController {
    @Resource
    private IProductService productService;

    @RequestMapping("/product/{pid}")
    public Product findByPid(@PathVariable("pid") Long pid) {
        log.info("{}商品信息查询", pid);
        Product product = productService.findById(pid);
        log.info("查询成功{}", JSON.toJSONString(product));
        return product;
    }
}
