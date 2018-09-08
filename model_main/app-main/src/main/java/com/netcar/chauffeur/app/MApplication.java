package com.netcar.chauffeur.app;

import com.jonyker.lib.delegate.ApplicationDelegate;
import com.netcar.chauffeur.main.MainApplication;

/**
 * @author haoge on 2018/1/5.
 */

public class MApplication extends ApplicationDelegate {
    @Override
    public int getLevel() {
        return LEVEL_APP;
    }

    @Override
    public Class[] subDelegates() {
        return new Class[] {MainApplication.class};
    }

    @Override
    public void onCreateDelegate() {

    }
}
