package com.markerhub;/**
 * @description TODO
 * @date 2022-09-03 17:01
 * @author wu yunChuan
 */

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;
import redis.clients.jedis.Jedis;

/**
 * @BelongsProject: vueblog
 * @BelongsPackage: com.markerhub
 * @Author: wu yunChuan
 * @CreateTime: 2022-09-03  17:01
 * @Description: TODO
 * @Version: 1.0
 */
public class TestConnectRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        System.out.println(jedis.ping());
        jedis.close();
    }
}
