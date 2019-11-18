package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.sql.RowSet;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {
    //用戶登錄頁面
    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("img_code", "/images/captcha.png");
        model.addAttribute("pwd_url", "http://localhost:8080/user?id=retrievepw");
        model.addAttribute("actnum", "0");
        return "member";
    }

    @RequestMapping("/register")
    //註冊用戶
    public String register(Model model) {
        model.addAttribute("img_code", "/images/captcha.png");
        model.addAttribute("pwd_url", "http://localhost:8080/user?id=retrievepw");
        model.addAttribute("uploadimg", "/images/upload.png");
        model.addAttribute("actnum", "1");
        return "user/register";
    }

    @RequestMapping("/changepw")
    //修改密碼
    public String change(Model model) {
        model.addAttribute("img_code", "/images/captcha.png");
        model.addAttribute("pwd_url", "http://localhost:8080/user?id=retrievepw");
        model.addAttribute("actnum", "1");
        return "user/changepw";
    }

    @RequestMapping("/collection")
    //我的收藏
    public String collection(Model model) {
        model.addAttribute("img_code", "/images/captcha.png");

        return "user/collection";
    }


    @RequestMapping("/retrievepw")
    //找回密碼
    public String retrievepw(Model model) {
        model.addAttribute("img_code", "/images/captcha.png");
        model.addAttribute("pwd_url", "http://localhost:8080/user?id=retrievepw");
        model.addAttribute("actnum", "1");
        return "user/retrievepw";
    }

    @RequestMapping("/apply")
    //我的活動
    public String apply(Model model) {
        model.addAttribute("goodsorder", getusergoods());
        return "user/apply";
    }

    @RequestMapping("/userindex")
    //用戶首頁
    public String userindex(Model model) {
        model.addAttribute("img_code", "/images/captcha.png");
        model.addAttribute("user_name", "admin888");
        model.addAttribute("last_name", "admin888");
        model.addAttribute("secon_ame ", "admin123");
        model.addAttribute("usermobile", "65764474");
        model.addAttribute("user_title", "歡迎您回到 活動雲台 ~");
        model.addAttribute("login_time", " 您的上一次登錄時間：2019-01-16 12:05:40");
        model.addAttribute("user_bonus", "共計 0 個,價值 $0.00 ");
        model.addAttribute("user_tip", "您最近30天內報名了0個活動 ");
        model.addAttribute("actnum", "1");
        return "user/userindex";
    }

    @RequestMapping("/userinfo")
    //用戶首頁
    public String userinfo(Model model) {
        return "redirect:/user/userrouter?id=userinfo";
    }

    @RequestMapping("/userphone")
    //用戶綁定手機號
    public String userphone(Model model) {
        model.addAttribute("content", getContent());
        model.addAttribute("tip", "活動評論");
        return "user/userphone";
    }


    @RequestMapping("/usercomment")
    //用戶評論
    public String usercomment(Model model) {
        model.addAttribute("content", getContent());
        model.addAttribute("tip", "活動評論");
        return "user/usercomment";
    }

    @RequestMapping("/userbonus")
    //用戶紅包
    public String userbonus(Model model) {
        model.addAttribute("userbon", "yes");
        model.addAttribute("bonus", getuserbonu());
        return "user/userbonus";
    }

    @RequestMapping("/userback")
    //用戶退款
    public String userback(Model model) {
        model.addAttribute("backs", getuserbacks());
        model.addAttribute("userbacks", "yes");
        return "user/userback";
    }

    @RequestMapping("/refunpages")
    //用戶退款
    public String refunpages(Model model) {
        model.addAttribute("backs", getuserbacks());
        model.addAttribute("userbacks", "yes");
        return "user/refunpages";
    }

    @RequestMapping("/actcount")
    //活動參與統計
    public String actcount(Model model) {
        model.addAttribute("backs", getuserbacks());
        return "user/useractcount";
    }

    @RequestMapping("/useravatar")
    //更換頭像
    public String useravatar(Model model) {
        model.addAttribute("userimg", "/images/upload.png");
        return "user/useravatar";
    }

    @RequestMapping("/userdetail")
    //用戶清單詳情
    public String userdetail(Model model) {
        model.addAttribute("goods_num", "222");
        model.addAttribute("act_time", "2019011291898");
        model.addAttribute("act_state", "已確認");
        model.addAttribute("pay_state", "未付款");
        model.addAttribute("ticket_state", "未取票");
        model.addAttribute("act_name", "香港昂坪360缆车");
        model.addAttribute("act_att", "选择场次:2019年1月24日 \n" +
                "選擇票檔:昂坪360标准缆车车票成人电子票（线路）");
        model.addAttribute("act_price", "$1.00");
        model.addAttribute("pay_num", "1");
        model.addAttribute("sub_total", "$1.00");
        model.addAttribute("red_packet", "$10.00");
        model.addAttribute("pay_method", "線下付款");
        model.addAttribute("total_amount", "$1110.00");
        return "user/userdetail";
    }

    //返回路由
    @GetMapping(value="/userrouter")
    public String userrouter( @RequestParam String id,  Model model){
        switch (id){
            case "usercenter":{
                model.addAttribute("img_code", "/images/captcha.png");
                model.addAttribute("secon_ame ", "admin123");
                model.addAttribute("user_title", "歡迎您回到 活動雲台 ~");
                model.addAttribute("login_time", " 您的上一次登錄時間：2019-01-16 12:05:40");
                model.addAttribute("user_bonus", "共計 0 個,價值 $0.00 ");
                model.addAttribute("user_tip", "您最近30天內報名了0個活動 ");
                model.addAttribute("actnum", "1");
                return "user/usercenter";
            }
            case "userinfo":{
                model.addAttribute("userid", "sadsadsa ");
                model.addAttribute("userbirthday", "2019/04/10");
                model.addAttribute("usermobile", "65764474");
                return "user/userinfo";
            }
        }
        return "";
    }

    //用戶中心首頁
    @PostMapping(value="/usercenter")
    public String usercenter(@RequestParam String login_id, Model model)
    {
        return "redirect:/user/userrouter?id=usercenter";
    }

    public List<contents> getContent() {
        // 模拟数据库数据保存到List集合
        List<contents> content = new ArrayList<>();
        content.add(new contents(1, "001用戶", "這個產品不錯", "2018/1/1"));
        content.add(new contents(2, "002用戶", "這個產品一般", "2018/1/10"));
        content.add(new contents(3, "003用戶", "這個產品不是很好", "2018/10/10"));
        content.add(new contents(4, "004用戶", "這個產品太水阿瑟大師大師大師到貨單哦啊好激動我決賽噢大家愛神的箭阿嬌囧", "2018/1/2"));
        return content;
    }

    public List<bonus> getuserbonu() {
        // 模拟数据库数据保存到List集合
        List<bonus> bon = new ArrayList<>();
        bon.add(new bonus(1, "電子活動報名費禮券(MOP10)", "10.00", "10.00", "未使用"));
        bon.add(new bonus(1, "電子活動報名費禮券(MOP10)", "10.00", "10.00", "未使用"));
        bon.add(new bonus(1, "電子活動報名費禮券(MOP10)", "10.00", "10.00", "未使用"));
        bon.add(new bonus(1, "電子活動報名費禮券(MOP10)", "10.00", "10.00", "未使用"));
        return bon;
    }

    public List<goodnews> getusergoods() {
        // 模拟数据库数据保存到List集合
        List<goodnews> good = new ArrayList<>();
        good.add(new goodnews(1, "2019011291898", "2019-01-12 16:28:28", "images/127_thumb_G_1547164716179.jpg", " 香港昂坪360缆车", "选择场次:2019年1月24日選擇票檔:186 ", "$1.00", "1"
                , "23", "243", "$187.00", "已確認，未付款,未取票", "http://localhost:8080/test/goods", "已確認"));
        good.add(new goodnews(2, "2019011232132", "2019-01-11 16:28:28", "images/127_thumb_G_1547164716179.jpg", " 香港昂坪360缆车1232131", "选择场次:2019年2月24日選擇票檔:1000 ", "$1000.00", "1"
                , "123", "243", "$1000.00", "未確認，未付款，未取票", "http://localhost:8080/test/goods", "已確認"));
        return good;
    }

    public List<userbacks> getuserbacks() {
        // 模拟数据库数据保存到List集合
        List<userbacks> back = new ArrayList<>();
        back.add(new userbacks(1, "2019011291898", "澳門金沙中國秀《西遊記》", "2019-01-09 16:36:30", " $260.00", "退款 - 已退款 ", "http://localhost:8080/test/goods", "http://localhost:8080/test"));
        back.add(new userbacks(2, "2019011232132", "澳門金沙中國秀《西遊記》", "2019-01-09 16:36:30", " $2620.00", "退款 - 申請中 ", "http://localhost:8080/test/goods", "http://localhost:8080/test"));
        return back;
    }

}

