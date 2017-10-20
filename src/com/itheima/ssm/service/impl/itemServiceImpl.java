package com.itheima.ssm.service.impl;

import com.itheima.ssm.mapper.ItemsMapper;
import com.itheima.ssm.pojo.Items;
import com.itheima.ssm.pojo.ItemsExample;
import com.itheima.ssm.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class itemServiceImpl implements itemService {

    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public List<Items> findItemList() {
        ItemsExample example = new ItemsExample();
        List<Items> list = itemsMapper.selectByExample(example);
        return list;
    }
}
