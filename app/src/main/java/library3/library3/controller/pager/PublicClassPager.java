package library3.library3.controller.pager;

import android.content.Context;
import android.widget.TextView;

import library3.library3.controller.base.BasePager;

/**
 * Created by San on 2017/4/11.
 */
public class PublicClassPager extends BasePager {

    public PublicClassPager(Context context, int adminInfosId, int studentInfosId, boolean adminIsChecked,boolean studentIsChecked) {
        super(context, studentInfosId,adminInfosId,adminIsChecked,studentIsChecked);


    }

    @Override
    public void initDataBasePager() {
        super.initDataBasePager();

        TextView textView=new TextView(context);

        textView.setText("公开课页面");
        textView.setTextSize(50);

        if (fl_basepager_content!=null){

            fl_basepager_content.removeAllViews();
        }
        fl_basepager_content.addView(textView);
    }

}
