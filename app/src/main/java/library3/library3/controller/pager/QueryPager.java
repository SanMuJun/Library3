package library3.library3.controller.pager;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.xys.libzxing.zxing.activity.CaptureActivity;

import library3.library3.R;
import library3.library3.controller.base.BasePager;

/**
 * Created by San on 2017/4/11.
 */
public class QueryPager extends BasePager {
    public QueryPager(Context context, int adminInfosId, int studentInfosId, boolean adminIsChecked,boolean studentIsChecked) {
        super(context, studentInfosId,adminInfosId,adminIsChecked,studentIsChecked);


    }



    @Override
    public void initDataBasePager() {
        super.initDataBasePager();

        View viewQuaeryPager=View.inflate(context, R.layout.query_layout,null);


        fl_basepager_content.removeAllViews();

        fl_basepager_content.addView(viewQuaeryPager);

        context.startActivity(new Intent(context, CaptureActivity.class));

    }


}
