package com.wukj.business.pipe;


import com.wukj.lib.pipe.Pipe;

/**
 * @author haoge on 2018/1/5.
 */

public interface LoginPipe extends Pipe{

    boolean isLogin();

    void logout();
}
