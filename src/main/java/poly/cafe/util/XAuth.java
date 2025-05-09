/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.util;

import poly.cafe.entity.User;

/**
 *
 * @author admin
 */
public class XAuth {
    public static User user = null;
    
    public static void clear() {
        XAuth.user = null;
    }
    
    public static boolean isLogin() {
        return XAuth.user !=null;
    }
    
    public static boolean isManager() {
        return XAuth.isLogin() && user.isManager();
    }
}
