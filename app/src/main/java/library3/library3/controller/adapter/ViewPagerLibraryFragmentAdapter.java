package library3.library3.controller.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import library3.library3.controller.base.BasePager;

/**
 * Created by San on 2017/4/11.
 */
public class ViewPagerLibraryFragmentAdapter extends PagerAdapter {


    private  List<BasePager> basePagers;

    private  List<String> titlePagers;


    public ViewPagerLibraryFragmentAdapter(List<BasePager> basePagers) {

        this.basePagers=basePagers;

        titlePagers = new ArrayList<>();
        titlePagers.add("公告");
//        titlePagers.add("查询");
//        titlePagers.add("公开课");
        titlePagers.add("个性推荐");
        titlePagers.add("馆藏详情");
        titlePagers.add("意见箱");
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return titlePagers.get(position);
    }

    @Override
    public int getCount() {
        return basePagers.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        BasePager basePagerAdapter = basePagers.get(position);
        View rootView = basePagerAdapter.rootView;

//        basePagerAdapter.initDataBasePager();

        //错误的
//        fl_libraryfragment_content.addView(rootView);
        container.addView(rootView);
        return rootView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((View) object);
    }

}
