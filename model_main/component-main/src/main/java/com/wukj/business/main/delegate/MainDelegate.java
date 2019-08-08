package com.wukj.business.main.delegate;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.RelativeLayout;

import com.wukj.business.main.R;
import com.wukj.business.main.R2;
import com.wukj.ui.common.weight.slidingtab.SlidingTabLayout;
import com.kymjs.themvp.view.AppDelegate;

import butterknife.BindView;

/**
 * 项目名称：NetCar_Chauffeur
 * 包名称：com.netcar.chauffeur.main.delegate.
 * 创建时间：2018/8/8 18:51
 * 作者：Jonyker
 * 博客：https://www.jianshu.com/u/07642698e7f4
 * github：https://github.com/Jonyker
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/8/8 18:51
 * 备注：
 * 版本：V.1.0
 * 描述：
 */
public class MainDelegate extends AppDelegate {

    @BindView(R2.id.main_content_frame_parent)
    RelativeLayout mMainContentFrameParent;
    @BindView(R2.id.main_left_drawer_layout)
    RelativeLayout mMainLeftDrawerLayout;
    @BindView(R2.id.main_drawer_layout)
    DrawerLayout mMainDrawerLayout;
    @BindView(R2.id.slidingtab)
    SlidingTabLayout mSlidingTab;
    @BindView(R2.id.viewpager)
    ViewPager mViewPager;


    // 抽屉菜单对象
    private ActionBarDrawerToggle drawerbar;

    @Override
    public int getRootLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initWidget() {
        super.initWidget();

        // 设置菜单内容之外其他区域的背景色
        mMainDrawerLayout.setScrimColor(Color.TRANSPARENT);
        drawerbar = new ActionBarDrawerToggle(getActivity()
                , mMainDrawerLayout
                , R.string.drawer_open
                , R.string.drawer_close) {
            //菜单打开
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            // 菜单关闭
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        mMainDrawerLayout.setDrawerListener(drawerbar);

    }


    private void initSlidingTab() {
        // 标题字体大小
        mSlidingTab.setTabTitleTextSize(14);
        // 标题字体颜色
        mSlidingTab.setTitleTextColor(Color.BLACK, getActivity().getResources().getColor(R.color.pinkdeep));
        // 滑动条宽度
        mSlidingTab.setTabStripWidth(120);
        // 滑动条颜色
        mSlidingTab.setSelectedIndicatorColors(getActivity().getResources().getColor(R.color.pinkdeep));
        // 均匀平铺选项卡
        mSlidingTab.setDistributeEvenly(true);
        // 最后调用此方法
        mSlidingTab.setViewPager(mViewPager);
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {

            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    // 左边菜单开关事件
    public void openLeftLayout(View view) {
        if (mMainDrawerLayout.isDrawerOpen(mMainLeftDrawerLayout)) {
            mMainDrawerLayout.closeDrawer(mMainLeftDrawerLayout);
        } else {
            mMainDrawerLayout.openDrawer(mMainLeftDrawerLayout);
        }
    }


}
