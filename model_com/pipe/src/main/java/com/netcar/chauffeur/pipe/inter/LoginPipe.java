package com.netcar.chauffeur.pipe.inter;


import com.jonyker.lib.pipe.Pipe;

/**
 * @author haoge on 2018/1/5.
 */

public interface LoginPipe extends Pipe{

    boolean isLogin();

    void logout();
}
