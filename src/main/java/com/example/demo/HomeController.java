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
        return "/test";
    }

    @RequestMapping("/test/goods")
    public String goods(Model goods) {
        goods.addAttribute("goods_name", "2019年博彩從業員乒乓球賽");
        goods.addAttribute("goods_basic", "2019-04-09 18:48 工人球場A館");
        goods.addAttribute("goods_img", "/images/134_G_1549939772311.jpg");
        goods.addAttribute("goods_model", "型號");
        goods.addAttribute("goods_num", "222222");
        goods.addAttribute("goods_total", "合計");
        goods.addAttribute("goods_attr1", "10");
        goods.addAttribute("goods_attr2", "20");
        goods.addAttribute("goods_attr3", "30");
        goods.addAttribute("function_list", "活動佈局展示");
        goods.addAttribute("function_list_url", "/images/134_G_1549939772311.jpg");
        goods.addAttribute("goods_activity", "2019年度「博彩從業員體育競技比賽」-系列活動\n" +
                "博彩從業員乒乓球賽\n" +
                "賽程及照片連結:\n" +
                "http://www.gehome.org.mo/list-56/360\n" +
                "< 章 程 >\n" +
                "合辦單位：澳門博彩業職工之家、澳門工會聯合總會體育委員會\n" +
                "贊助單位：澳門基金會、新濠博亞娛樂、永利、美高梅、金沙中國、銀河娛樂集團\n" +
                "協辦單位：博彩從業員志願者協會、博彩業文娛體育促進會\n" +
                "比賽地點：澳門關閘工人體育場A館\n" +
                "比賽日期：2019年4月8-13日 (每晚 20:00 至 23:00)\n" +
                "目    的：創建一個博彩業的體育交流平台，豐富博彩從業員餘暇生活，鍛錬體格、舒緩工作壓力，共建勞資和諧，推動博\n" +
                "彩業健康的職業面貌。" +
                "報名形式：1.個人報名；2.團體報名。\n" +
                "賽事項目：1.男子單打賽（限額三十二名）(男子單打設遺材賽)；2.女子單打賽（限額三十二名）；3.團體賽：（限額十六隊）；\n" +
                "4.男女子混合雙打賽（限額八隊，四隊以下，賽事將取消）；\n" +
                "比賽形式：1.男子單打及遺材賽：淘汰制；2.女子單打賽：淘汰制；3.團體賽：分組循環賽；4.男女子混合雙打賽：淘汰制；\n" +
                "賽    制：1.單打賽/遺材賽︰採用每局11分計，5局3勝制；\n" +
                "2.團體賽：採用國際式(A-X B-Y C-Z A-Y B-X)5場3勝制，不分男女，每場比賽採用五局三勝制，每局打11分；\n" +
                "3.男女子混合雙打賽：採用每局11分計，5局3勝制；\n" +
                "4.一切以球證判決為準；\n" +
                "5.男子單打賽出現棄權的球員不可進入遺材組賽事；\n" +
                "6.賽事籌備委員會將保留解釋及修改上述規則之權利。\n" +
                "裁    判：澳門乒乓球總會 派出\n" +
                "比賽用球：採用“40mm+”白色乒乓球\n" +
                "獎項/頒獎：1.男、女子單打設冠、亞、季軍獎金及獎盃，獎金依次為澳門幣1100/900/700；2.男子單打賽設遺材賽冠、亞、季軍獎金及奬盃800/600/400；3.團體賽設冠、亞、季軍獎金、獎盃及獎牌，奬金為澳門幣1400/1200/1000；4.男女子混合雙打賽設冠、亞、季獎金及獎牌1200/1000/800；\n" +
                "報名時間：由即日起至2019年3月24日止。\n" +
                "抽    籤：2019年3月26日下午2:30進行電腦抽籤，並於3月28日下午5點前公佈賽程。\n" +
                "所需文件：填妥之報名表、吋半彩色近照1張、免責聲明書連同澳門註冊醫生之體檢證明、職工工作證、身份證副本。\n" +
                "報名地點：1. 澳門黑沙灣長壽大馬路492號華景園1-2座1樓(工聯職業技能培訓中心)，逢週一至週日，10:00-20:00 (公眾假期休息)；\n" +
                "表格索取：報名表可到本會索取或於本會網站 http://www.gehome.org.mo 下載。");
        goods.addAttribute("message",getLeave());
        goods.addAttribute("tip_tt","票品真實");
        goods.addAttribute("tip_dd","活動雲台在收到機構和商家的票品後會第一時間核查票品真實性，確保票品100%真實有效，請放心購買");
        goods.addAttribute("recommend",getRecommend());
        return "/goods";

    }

    public List<leave> getLeave() {
        // 模拟数据库数据保存到List集合
        List<leave> leaves = new ArrayList<>();
        leaves.add(new leave(1, "001用戶", "/images/portal-icon-1.png", "這個產品不錯","2018/1/1"));
        leaves.add(new leave(2, "002用戶", "/images/portal-icon-2.png", "這個產品一般","2018/1/10"));
        leaves.add(new leave(3, "003用戶", "/images/portal-icon-3.png", "這個產品不是很好","2018/10/10"));
        leaves.add(new leave(4, "004用戶", "/images/portal-icon-4.png", "這個產品太水阿瑟大師大師大師到貨單哦啊好激動我決賽噢大家愛神的箭阿嬌囧","2018/1/2"));
        return leaves;
    }
    public List<recommend>getRecommend(){
        List<recommend>recommends = new ArrayList<>();
        recommends.add(new recommend(1,"2019年博彩從業員乒乓球賽","/images/123.png","2019-04-09 18:48","工人球場A館","$0.00","http://localhost:8080/test/goods#goods_tip"));
        recommends.add(new recommend(2,"2019年博彩從業員乒乓球賽","/images/123.png","2019-04-09 18:48","工人球場B館","$0.00","http://localhost:8080/test/goods#goods_tip"));
        recommends.add(new recommend(3,"2019年博彩從業員乒乓球賽","/images/123.png","2019-04-09 18:48","工人球場C館","$0.00","http://localhost:8080/test/goods#goods_tip"));
        return recommends;
    }
}
