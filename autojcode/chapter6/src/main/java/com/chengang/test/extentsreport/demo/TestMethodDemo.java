package com.chengang.test.extentsreport.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author 陈刚
 * @ClassName TestMethodDemo
 * @Description //TODO
 * @create 2019-08-18 12:13
 */
public class TestMethodDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void testlogDemo(){
        Assert.assertEquals(1,1);
        throw new RuntimeException("this is my defined exception");
    }
}
