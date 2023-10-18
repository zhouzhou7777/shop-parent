package com.zz.service.impl;

import com.zz.dao.ProductDao;
import com.zz.domain.Product;
import com.zz.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IProductServiceImpl implements IProductService {
    @Resource
    private ProductDao productDao;

    @Override
    public Product findById(Long pid) {
        return productDao.findById(pid).get();
    }
}
