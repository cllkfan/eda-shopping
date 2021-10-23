package com.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.LinkedHashSet;
import java.util.Set;

public class aa {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void test() {
        System.out.println(stringRedisTemplate);
    }

    @Test
    public void test2() {
        String test1 = stringRedisTemplate.opsForValue().get("test1");
        System.out.println(test1);
    }



    @Test
    public  void  test3(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();

        // 最大连接数
        poolConfig.setMaxTotal(1);
        // 最大空闲数
        poolConfig.setMaxIdle(1);
        // 最大允许等待时间，如果超过这个时间还未获取到连接，则会报JedisException异常：
        // Could not get a resource from the pool
        poolConfig.setMaxWaitMillis(1000);

        Set<HostAndPort> nodes = new LinkedHashSet<HostAndPort>();
        nodes.add(new HostAndPort("8.130.172.12", 6380));
        nodes.add(new HostAndPort("8.130.172.12", 6381));
        nodes.add(new HostAndPort("8.130.172.12", 6382));

        JedisCluster cluster = new JedisCluster(nodes, poolConfig);
        System.out.println(cluster);
        cluster.set("zhangjunyan","188");

        System.out.println(cluster.get("zhangjunyan"));
    }

    @Test
    public void test22() {
        Jedis jedis = new Jedis("8.130.172.12", 6383);
        jedis.auth("123456");
        System.out.println(jedis);
//        jedis.set("test3", "123", "NX","EX", 10);
        System.out.println(jedis.get("test3"));
    }

}
