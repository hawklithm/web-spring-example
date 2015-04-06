package org.hawklithm.controller;

import org.hawklithm.dataobject.TestObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hawky on 15-4-6.
 */
@Controller
@RequestMapping("/book.do")
public class MainController {
    @RequestMapping(params = "method=add")
    public void add(TestObject object){
        System.out.println("bookname:"+object.getProperty1());
        System.out.println("author:" + object.getProperty2());
//        return "success";
    }
    @RequestMapping(params = "method=update")
    public void update(TestObject object) {
//        return "success";
    }
}
