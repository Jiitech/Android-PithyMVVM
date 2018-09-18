package com.wukj.business.ucenter.app;

import com.wukj.lib.delegate.ApplicationDelegate;

/**
 * @author haoge on 2018/1/5.
 */

public class UCApplication extends ApplicationDelegate {
    @Override
    public int getLevel() {
        return LEVEL_APP;
    }

    @Override
    public Class[] subDelegates() {
        return new Class[] {UCenterApplication.class};
    }

    @Override
    public void onCreateDelegate() {

    }
}
