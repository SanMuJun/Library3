package library3.library3.controller.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import library3.library3.R;
import library3.library3.model.bean.NoticeInfo;

/**
 * Created by San on 2017/4/14.
 */
public class ListViewNoticeAdapter extends BaseAdapter {


    private final Context context;
    private final List<NoticeInfo> noticeInfos;


    public ListViewNoticeAdapter(Context context, List<NoticeInfo> noticeInfos) {

        this.context=context;
        this.noticeInfos=noticeInfos;


    }

    @Override
    public int getCount() {
        return noticeInfos.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder=new ViewHolder();
        if (view==null){

            view=View.inflate(context, R.layout.list_context_res,null);

            viewHolder.tv_notice_title= (TextView) view.findViewById(R.id.tv_notice_title);
            viewHolder.tv_notice_context= (TextView) view.findViewById(R.id.tv_notice_context);
            viewHolder.tv_notice_admin= (TextView) view.findViewById(R.id.tv_notice_admin);
            viewHolder.tv_notice_time= (TextView) view.findViewById(R.id.tv_notice_time);

            view.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) view.getTag();
        }

        viewHolder.tv_notice_title.setText(noticeInfos.get(i).getNoticeTitle());
        viewHolder.tv_notice_context.setText("公告内容："+noticeInfos.get(i).getNoticeContent());
        viewHolder.tv_notice_admin.setText("管理员："+noticeInfos.get(i).getNoticeAdminName());
        viewHolder.tv_notice_time.setText("时间："+noticeInfos.get(i).getNoticeTime());

        return view;
    }

    class ViewHolder{

        TextView tv_notice_title;
        TextView tv_notice_context;
        TextView tv_notice_admin;
        TextView tv_notice_time;

    }
}
