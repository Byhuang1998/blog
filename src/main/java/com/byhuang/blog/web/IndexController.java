package com.byhuang.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2022/12/26 21:36
 * @description TODO
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
//        int i = 9 / 0;
//        String blog = null;
//        if (blog == null) {
//            throw new NotFoundException("博客不存在");
//        }
        System.out.println("---------index--------");
        return "index";
    }
}
