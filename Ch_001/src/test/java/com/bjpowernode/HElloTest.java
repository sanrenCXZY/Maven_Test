package com.bjpowernode;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Program: Maven_Test
 * @PACKAGE_NAME: com.bjpowernode
 * @ClassName HElloTest
 * @Description
 * @Author: sanren
 * @Create: 2023-01-12 20:55
 **/
public class HElloTest extends TestCase {
      @Test
    public void testAdd() {
          HEllo h=new HEllo();
          int res=h.add(3,2);
          Assert.assertEquals(5,res);
    }
}