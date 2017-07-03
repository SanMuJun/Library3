package library3.library3.controller.base;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import library3.library3.R;

/**
 * Created by San on 2017/4/10.
 */
public class BasePager {

    public final Context context;
    public  boolean adminIsChecked;
    public  boolean studentIsChecked;
    public    int adminInfosId;
    public   int studentInfosId;

    public View rootView;

    @ViewInject(R.id.fl_basepager_content)
    public  FrameLayout fl_basepager_content;

    public  BasePager(Context context,int adminInfosId, int studentInfosId,boolean adminIsChecked,boolean  studentIsChecked) {

        this.context=context;
        this.studentInfosId=studentInfosId;
        this.adminInfosId=adminInfosId;
        this.studentIsChecked =studentIsChecked;
        this.adminIsChecked =adminIsChecked;

        rootView=initView();

    }

    public View initView() {

        View viewBasePager=View.inflate(context, R.layout.basepager_res,null);

        x.view().inject(this,viewBasePager);

        return viewBasePager;
    }

   public void initDataBasePager(){


   }
}
