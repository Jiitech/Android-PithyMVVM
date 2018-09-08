package com.netcar.chauffeur.main.activity;


import com.jonyker.ui.common.CommonUIActivity;
import com.kymjs.themvp.databind.DataBinder;
import com.netcar.chauffeur.main.databinder.MainDataBinder;
import com.netcar.chauffeur.main.delegate.MainDelegate;

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
