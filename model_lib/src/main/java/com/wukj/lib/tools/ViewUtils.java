package com.wukj.lib.tools;

import android.view.View;

public class ViewUtils {

    public <V extends View> V getView(View root,int resId) {
        //noinspection unchecked
        return (V) root.findViewById(resId);
    }

}
