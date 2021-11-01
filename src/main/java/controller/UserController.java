package controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import pojo.Msg;
import pojo.User;
import service.Impl.userLoginServiceImpl;
import service.userLoginService;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 用户管理
 *
 * @author kgako
 */

@Controller
public class UserController {

    @Autowired
    @Resource
    public userLoginService userService;

    @RequestMapping("/save")
    protected String detail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return "create";
    }

    @RequestMapping("/sav")
    @ResponseBody
    protected Msg doPost(User user) throws ServletException, IOException {


        System.out.println(user.toString());
        //System.out.println(user.getUserName());
        User pojo = new User();
        pojo.setUserName(user.getUserName());
        pojo.setUserPass(user.getUserPass());
        pojo.setUserid(1);
        UUID token=UUID.randomUUID();
        TokenUtils tokenUtils = new TokenUtils();
       // String token =tokenUtils.token(pojo.getUserName(),pojo.getUserPass());
        System.out.println(token);
        userService.insert(pojo);
        if(user != null) {
            return Msg.success();
        }else {
            return Msg.fail();
        }
    }
}