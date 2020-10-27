package com.qfjy.project.weixin.api.hitokoto;

import com.qfjy.project.weixin.util.WeixinUtil;
import net.sf.json.JSONObject;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @Author wuyang
 * @Description TODO https://v1.hitokoto.cn/ 一言 一句话 接口测试
 * @Date 2020/10/27 20:10
 * @Version 1.0
 */
public class Hitokoto {

    private static final String HITOKOTO_URL = "https://v1.hitokoto.cn?c=h";

    public static String getHitokoto(){
        JSONObject jsonObject = WeixinUtil.httpRequest(HITOKOTO_URL, "GET", null);
        String hitokoto = jsonObject.getString("hitokoto");
        System.out.println(hitokoto);
        return hitokoto;
    }


}
