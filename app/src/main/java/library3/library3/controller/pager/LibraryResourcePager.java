package library3.library3.controller.pager;

import android.content.Context;
import android.view.View;

import library3.library3.R;
import library3.library3.controller.base.BasePager;

/**
 * Created by San on 2017/4/11.
 */
public class LibraryResourcePager extends BasePager {

    public LibraryResourcePager(Context context, int adminInfosId, int studentInfosId, boolean adminIsChecked,boolean studentIsChecked) {
        super(context, studentInfosId,adminInfosId,adminIsChecked,studentIsChecked);


    }

    @Override
    public void initDataBasePager() {
        super.initDataBasePager();

        //馆藏页面的布局
        View  viewLibraryResource=View.inflate(context, R.layout.libraryresource_res,null);

        if (fl_basepager_content!=null){

            fl_basepager_content.removeAllViews();
        }

        fl_basepager_content.addView(viewLibraryResource);
    }
}
