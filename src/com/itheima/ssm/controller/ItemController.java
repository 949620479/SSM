package com.itheima.ssm.controller;

import com.itheima.ssm.pojo.Items;
import com.itheima.ssm.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private itemService service;
    @RequestMapping("/itemList")
    public String getItemList(Model model){
        List<Items> list = service.findItemList();
        model.addAttribute("itemList",list);
        return "itemList";
    }
}
