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
import library3.library3.controller.adapter.ListViewSuggestionAdapter;
import library3.library3.controller.base.BasePager;
import library3.library3.model.bean.AdminInfo;
import library3.library3.model.bean.StudentInfo;
import library3.library3.model.bean.SuggestionInfo;
import library3.library3.model.dao.StudentTableDAO;
import library3.library3.model.dao.SuggestionTableDAO;

/**
 * Created by San on 2017/4/11.
 */
public class SuggestionBoxPager extends BasePager {

    private List<SuggestionInfo> suggestionInfos;
    private SuggestionTableDAO suggestionTableDAO;
    private ListViewSuggestionAdapter listViewSuggestionAdapter;
    private String studentName;
    private List<StudentInfo> studentInfos;
    private List<AdminInfo> adminInfos;

    public SuggestionBoxPager(Context context, int adminInfosId, int studentInfosId, boolean adminIsChecked,boolean studentIsChecked) {
        super(context, studentInfosId,adminInfosId,adminIsChecked,studentIsChecked);


    }

    @ViewInject(R.id.listViewSuggestion)
    private ListView listViewSuggestion;

    @ViewInject(R.id.tv_Suggestion_loading)
    private TextView tv_Suggestion_loading;

    @ViewInject(R.id.bt_add_Suggestion)
    private Button bt_add_Suggestion;


    @Override
    public void initDataBasePager() {
        super.initDataBasePager();

        //添加布局
        View viewSuggestionBoxPager = View.inflate(context, R.layout.suggestionbox_pager_res, null);
        //添加到xutils中
        x.view().inject(this, viewSuggestionBoxPager);
        //添加视图
        if (fl_basepager_content != null) {

            fl_basepager_content.removeAllViews();
        }
        fl_basepager_content.addView(viewSuggestionBoxPager);

        //初始化意见箱的数据库数据
        suggestionTableDAO = new SuggestionTableDAO(context);
        suggestionInfos = suggestionTableDAO.querySuggestionTable();

        studentInfos = new StudentTableDAO(context).queryStudentTable();


        Log.e("SuggestionBoxPager", "studentInfosId: " +studentInfosId);
        Log.e("SuggestionBoxPager", "adminInfosId: " +adminInfosId);
        if (suggestionInfos.size() != 0) {
            tv_Suggestion_loading.setVisibility(View.GONE);
        }

        if (suggestionInfos.size() != 0) {

            listViewSuggestionAdapter = new ListViewSuggestionAdapter(context, suggestionInfos);
            listViewSuggestion.setAdapter(listViewSuggestionAdapter);
            listViewSuggestionAdapter.notifyDataSetChanged();
        }


        if (studentIsChecked==true){
            bt_add_Suggestion.setVisibility(View.VISIBLE);

            studentName = studentInfos.get(studentInfosId).getStudentName();
            //添加按钮
        getOnClickListener();

        }

        if (studentIsChecked==false){
            bt_add_Suggestion.setVisibility(View.GONE);

        //获取ListView
        getListView();

        }


    }

    private void getOnClickListener() {

        bt_add_Suggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Calendar calendar = Calendar.getInstance();
                final int year = calendar.get(Calendar.YEAR);
                final int month = calendar.get(Calendar.MONTH);
                final int day = calendar.get(Calendar.DAY_OF_MONTH);

                View viewNoticeAdd = View.inflate(context, R.layout.suggestionboxaddcontext_res, null);
                final EditText et_add_suggestionbox_context = (EditText) viewNoticeAdd.findViewById(R.id.et_add_suggestionbox_context);

                new AlertDialog.Builder(context)
                        .setView(viewNoticeAdd)
                        .setPositiveButton("添加", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {


                                SuggestionInfo suggestionInfo = new SuggestionInfo(
                                        -1,
                                        studentName,
                                        et_add_suggestionbox_context.getText().toString(),
                                        year + "/" + month + "/" + day);


                                suggestionTableDAO.insertSuggestionTable(suggestionInfo);
                                List<SuggestionInfo> suggestionInfo2 = suggestionTableDAO.querySuggestionTable();
                                suggestionInfos.clear();
                                suggestionInfos.addAll(suggestionInfo2);

                                if (suggestionInfos.size() != 0) {
                                    tv_Suggestion_loading.setVisibility(View.GONE);
                                }

                                listViewSuggestionAdapter = new ListViewSuggestionAdapter(context, suggestionInfos);
                                listViewSuggestion.setAdapter(listViewSuggestionAdapter);
                                listViewSuggestionAdapter.notifyDataSetChanged();


                            }
                        })
                        .setNegativeButton("取消", null)
                        .show();

            }
        });


    }

    private void getListView() {


        listViewSuggestionAdapter = new ListViewSuggestionAdapter(context, suggestionInfos);
        listViewSuggestion.setAdapter(listViewSuggestionAdapter);
        listViewSuggestionAdapter.notifyDataSetChanged();

        //点击删除本条通知
        listViewSuggestion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {


                new AlertDialog.Builder(context)
                        .setMessage("确定要删除本条建议吗？")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int id) {

                                        suggestionTableDAO.deleteSuggestionTable(suggestionInfos.get(i).getSuggestionId());
                                        suggestionInfos.remove(i);
                                        List<SuggestionInfo> suggestionInfo3 = suggestionTableDAO.querySuggestionTable();
                                        suggestionInfos.clear();
                                        suggestionInfos.addAll(suggestionInfo3);

                                        if (suggestionInfos.size() == 0) {
                                            tv_Suggestion_loading.setVisibility(View.VISIBLE);
                                        }

                                        listViewSuggestionAdapter = new ListViewSuggestionAdapter(context, suggestionInfos);
                                        listViewSuggestion.setAdapter(listViewSuggestionAdapter);
                                        listViewSuggestionAdapter.notifyDataSetChanged();


                                    }
                                }
                        )
                        .setNegativeButton("取消", null)
                        .show();

//                PopupWindow popupWindow = new PopupWindow(context);

            }
        });

    }


}
