package library3.library3.controller.pager;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.Calendar;
import java.util.List;

import library3.library3.R;
import library3.library3.controller.adapter.ListViewNoticeAdapter;
import library3.library3.controller.base.BasePager;
import library3.library3.model.bean.AdminInfo;
import library3.library3.model.bean.NoticeInfo;
import library3.library3.model.bean.StudentInfo;
import library3.library3.model.dao.AdminTableDAO;
import library3.library3.model.dao.NoticeTableDAO;
import library3.library3.model.dao.StudentTableDAO;

/**
 * Created by San on 2017/4/11.
 */
public class NoticePager extends BasePager {

    private ListViewNoticeAdapter listViewNoticeAdapter;
    private NoticeTableDAO noticeTableDAO;
    private List<NoticeInfo> noticeInfos;
    private  List<StudentInfo> studentInfos;
    private  List<AdminInfo> adminInfos;
    private View viewNoticePager;
    private  String adminName;

    public NoticePager(Context context, int adminInfosId, int studentInfosId, boolean adminIsChecked,boolean studentIsChecked) {
        super(context,adminInfosId, studentInfosId,adminIsChecked,studentIsChecked);


    }


    @ViewInject(R.id.listViewNotice)
    private ListView listViewNotice;

    @ViewInject(R.id.tv_Notice_loading)
    private TextView tv_Notice_loading;

    @ViewInject(R.id.bt_add_notice)
    private Button bt_add_notice;

    @Override
    public void initDataBasePager() {
        super.initDataBasePager();

        //设置公告的页面
        viewNoticePager = View.inflate(context, R.layout.noticepager_res, null);
        //添加布局进xutils
        x.view().inject(this, viewNoticePager);
        //添加视图
        if (fl_basepager_content != null) {

            fl_basepager_content.removeAllViews();
        }
        fl_basepager_content.addView(viewNoticePager);

        //获取数据库的数据初始化
        noticeTableDAO = new NoticeTableDAO(context);
        noticeInfos = noticeTableDAO.queryNoticeTable();

        studentInfos = new StudentTableDAO(context).queryStudentTable();
        adminInfos = new AdminTableDAO(context).queryAdminTable();


        if (noticeInfos.size() != 0) {
            tv_Notice_loading.setVisibility(View.GONE);
        }


        listViewNoticeAdapter = new ListViewNoticeAdapter(context, noticeInfos);
        listViewNotice.setAdapter(listViewNoticeAdapter);
        listViewNoticeAdapter.notifyDataSetChanged();

        //是管理员的时候
        if(adminIsChecked==true){
//           int adminInfosId;
            Log.e("NoticePager", "studentInfosId: " +studentInfosId);
            Log.e("NoticePager", "adminInfosId: " +adminInfosId);

            adminName=adminInfos.get(adminInfosId).getAdminName();


            bt_add_notice.setVisibility(View.VISIBLE);
           //添加按钮
           getOnClickListener();
            //获取ListView
            getListView();

        }



    }

    private void getOnClickListener() {



        bt_add_notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar calendar = Calendar.getInstance();
                final int year = calendar.get(Calendar.YEAR);
                final int month = calendar.get(Calendar.MONTH)+1;
                final int day = calendar.get(Calendar.DAY_OF_MONTH);

                View viewNoticeAdd = View.inflate(context, R.layout.noticeaddcontext_res, null);
                final EditText et_add_notice_title = (EditText) viewNoticeAdd.findViewById(R.id.et_add_notice_title);
                final EditText et_add_notice_context = (EditText) viewNoticeAdd.findViewById(R.id.et_add_notice_context);

                new AlertDialog.Builder(context)
                        .setView(viewNoticeAdd)
                        .setPositiveButton("添加", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                NoticeInfo noticeInfo = new NoticeInfo(
                                        -1,
                                        et_add_notice_title.getText().toString(),
                                        et_add_notice_context.getText().toString(),
                                        year + "/" + month + "/" + day,
                                        adminName+""
//                                                        + studentInfos.get(studentInfosId).getStudentName()
                                );

                                noticeTableDAO.insertNoticeTable(noticeInfo);
                                List<NoticeInfo> noticeInfo2 = noticeTableDAO.queryNoticeTable();
                                noticeInfos.clear();
                                noticeInfos.addAll(noticeInfo2);

                                if (noticeInfos.size() != 0) {
                                    tv_Notice_loading.setVisibility(View.GONE);
                                }

                                listViewNoticeAdapter = new ListViewNoticeAdapter(context, noticeInfos);
                                listViewNotice.setAdapter(listViewNoticeAdapter);
                                listViewNoticeAdapter.notifyDataSetChanged();

                            }
                        })
                        .setNegativeButton("取消", null)
                        .show();



            }
        });


    }

    private void getListView() {

        listViewNoticeAdapter = new ListViewNoticeAdapter(context, noticeInfos);
        listViewNotice.setAdapter(listViewNoticeAdapter);
        listViewNoticeAdapter.notifyDataSetChanged();

        //点击删除本条通知
        listViewNotice.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {


                new AlertDialog.Builder(context)
                        .setMessage("确定要删除本条通知吗？")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int id) {


                                        noticeTableDAO.deleteNoticeTable(noticeInfos.get(i).getNoticeId());

                                        noticeInfos.remove(i);
//
                                        List<NoticeInfo> noticeInfo3 = noticeTableDAO.queryNoticeTable();

                                        listViewNoticeAdapter = new ListViewNoticeAdapter(context, noticeInfo3);
                                        listViewNotice.setAdapter(listViewNoticeAdapter);
                                        listViewNoticeAdapter.notifyDataSetChanged();

                                        if (noticeInfos.size() == 0) {
                                            tv_Notice_loading.setVisibility(View.VISIBLE);
                                        }

                                    }
                                }
                        )
                        .setNegativeButton("取消",null)
                        .show();

//                PopupWindow popupWindow = new PopupWindow(context);

            }
        });

    }


}
