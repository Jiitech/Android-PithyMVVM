package com.wukj.business.main.app;

import com.wukj.lib.delegate.ApplicationDelegate;
import com.wukj.business.main.app.MainApplication;

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
