package com.neo.controller;

import com.neo.model.Laogong;
import com.neo.service.PrintHeihei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/77")
public class HelloController {
	@Autowired
    PrintHeihei printHeihei;

    @RequestMapping("/heihei")
    public String index() {
        return String.valueOf(printHeihei.printHeihei());
    }

    @RequestMapping("/laogong")
    public Laogong laogong(){
        return new Laogong("马威阳", "嘿嘿(●ˇ∀ˇ●)");
    }
}