package com.umcsuser.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class Hasher {
    public static String hashPassword(String str) {
        return DigestUtils.sha256Hex(str);
    }
}
