package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {
    @RequestMapping("/search")
    public String search(Model model) {
        model.addAttribute("content", "1");
        model.addAttribute("searchname", "測試");
        model.addAttribute("goods", getgoods());
        return "search";
    }




    public List<goodsdetail> getgoods() {
        // 模拟数据库数据保存到List集合
        List<goodsdetail> good = new ArrayList<>();
        good.add(new goodsdetail(1, "/images/123.png", "澳門金沙中國秀《西遊記》", "2019-08-28 07:06  -  2019-09-29 07:06", "夏灣",
                "$250","2","4"));
        good.add(new goodsdetail(1, "/images/127_thumb_G_1547164716179.jpg", "澳門金沙中國秀《西遊記》", "2019-08-28 07:06  -  2019-09-29 07:06", "夏灣",
                "$250","2","4"));
        return good;
    }
}
