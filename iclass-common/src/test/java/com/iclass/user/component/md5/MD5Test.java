package com.iclass.user.component.md5;

import org.junit.Test;

/**
 * iclass
 * <p>
 * Created by yang.tang on 2017/2/10 20:35.
 */
public class MD5Test {

    @Test
    public void testMD5() {
        String str = "361239731";
        String r = MD5.getPwd(str);
        System.out.println(r);
    }
}
