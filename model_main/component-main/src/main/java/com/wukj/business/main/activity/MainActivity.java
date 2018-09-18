package com.wukj.business.main.activity;


import com.wukj.ui.common.activity.CommonUIActivity;
import com.kymjs.themvp.databind.DataBinder;
import com.wukj.business.main.databinder.MainDataBinder;
import com.wukj.business.main.delegate.MainDelegate;

public class MainActivity extends CommonUIActivity<MainDelegate> {



    @Override
    protected Class<MainDelegate> getDelegateClass() {
        return MainDelegate.class;
    }

    @Override
    public DataBinder getDataBinder() {
        return new MainDataBinder();
    }


}
