package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/test")
    public String index(Model model) {
        Person single = new Person("hyj", 21);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("dlp", 21);
        Person p2 = new Person("tq", 21);
        Person p3 = new Person("mk", 21);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        model.addAttribute("recommend",getRecommend());
        return "/test";
    }

    public List<recommend>getRecommend(){
        List<recommend>recommends = new ArrayList<>();
        recommends.add(new recommend(1,"2019年博彩從業員乒乓球賽","/images/123.png","2019-04-09 18:48","工人球場A館","$0.00","http://localhost:8080/test/goods#goods_tip"));
        recommends.add(new recommend(2,"2019年博彩從業員乒乓球賽","/images/123.png","2019-04-09 18:48","工人球場B館","$0.00","http://localhost:8080/test/goods#goods_tip"));
        recommends.add(new recommend(3,"2019年博彩從業員乒乓球賽","/images/123.png","2019-04-09 18:48","工人球場C館","$0.00","http://localhost:8080/test/goods#goods_tip"));
        recommends.add(new recommend(4,"2019年博彩從業員乒乓球賽","/images/123.png","2019-04-09 18:48","工人球場C館","$0.00","http://localhost:8080/test/goods#goods_tip"));
        recommends.add(new recommend(5,"2019年博彩從業員乒乓球賽","/images/123.png","2019-04-09 18:48","工人球場C館","$0.00","http://localhost:8080/test/goods#goods_tip"));
        return recommends;
    }


}
