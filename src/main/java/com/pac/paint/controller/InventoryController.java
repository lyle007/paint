package com.pac.paint.controller;

import com.pac.paint.entity.Inventory;
import com.pac.paint.entity.User;
import com.pac.paint.mapper.InventoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost")
public class InventoryController {

    @Autowired
    private InventoryMapper iMapper;
    @GetMapping("/kucunList")
    public List getKucun()
    {
        List userList = iMapper.selectList(null);
        return  userList;
    }
    @GetMapping("/kucun/{id}")
    public Inventory getKucunByid(@PathVariable int id)
    {
        Inventory inven = iMapper.selectById(id);
        return inven;
    }

    @PostMapping("kucun")
    public String save(Inventory inven) {
        int i = iMapper.updateById(inven);
        if (i > 0)
            return "Save Success";
        else return "Save failed";
    }





}
