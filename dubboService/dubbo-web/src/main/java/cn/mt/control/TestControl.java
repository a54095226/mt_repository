package cn.mt.control;

import cn.mt.xy.bean.UserView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mt")
public class TestControl {

    @RequestMapping(value = "/hello",produces = "application/json;charset=UTF-8")
    public UserView hello() {

        UserView user = new UserView();
        user.setUserId("00000101");
        user.setUserNm("chris631202");
        user.setPasswd("123");
        return user;
    }
}
