package com.netcar.chauffeur.app;

import com.jonyker.lib.delegate.ApplicationDelegate;
import com.netcar.chauffeur.ucenter.application.UCenterApplication;

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
