package library3.library3.controller.pager;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
import library3.library3.controller.adapter.ListViewRecommendationAdapter;
import library3.library3.controller.base.BasePager;
import library3.library3.model.bean.AdminInfo;
import library3.library3.model.bean.RecommendationInfo;
import library3.library3.model.bean.StudentInfo;
import library3.library3.model.dao.AdminTableDAO;
import library3.library3.model.dao.RecommendationTableDAO;
import library3.library3.model.dao.StudentTableDAO;

/**
 * Created by San on 2017/4/11.
 */
public class RecommendationPager extends BasePager {



    private  List<StudentInfo> studentInfos;
    private  List<AdminInfo> adminInfos;

    private List<RecommendationInfo> recommendationInfos;
    private RecommendationTableDAO recommendationTableDAO;
    private ListViewRecommendationAdapter listViewRecommendationAdapter;

    public RecommendationPager(Context context, int adminInfosId, int studentInfosId, boolean adminIsChecked,boolean studentIsChecked) {
        super(context, studentInfosId,adminInfosId,adminIsChecked,studentIsChecked);


    }


    @ViewInject(R.id.listViewRecommendation)
    private ListView listViewRecommendation;

    @ViewInject(R.id.tv_Recommendation_loading)
    private TextView tv_Recommendation_loading;

    @ViewInject(R.id.bt_add_Recommendation)
    private Button bt_add_Recommendation;

    @Override
    public void initDataBasePager() {
        super.initDataBasePager();

        View viewRecommendationPager = View.inflate(context, R.layout.recommendationpager_res, null);

        x.view().inject(this, viewRecommendationPager);


        if (fl_basepager_content!=null){

            fl_basepager_content.removeAllViews();
        }
        fl_basepager_content.addView(viewRecommendationPager);

        recommendationTableDAO = new RecommendationTableDAO(context);
        recommendationInfos = recommendationTableDAO.queryRecommendationTable();

        if (recommendationInfos.size()!=0){
            tv_Recommendation_loading.setVisibility(View.GONE);
        }

        //获取数据库的数据初始化

        studentInfos = new StudentTableDAO(context).queryStudentTable();
        adminInfos = new AdminTableDAO(context).queryAdminTable();

        //添加按钮
        getOnClickListener();
        //获取ListView
        getListView();

    }

    private void getOnClickListener() {

        bt_add_Recommendation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                final Calendar calendar = Calendar.getInstance();
                final int year = calendar.get(Calendar.YEAR);
                final int month = calendar.get(Calendar.MONTH);
                final int day = calendar.get(Calendar.DAY_OF_MONTH);

                View viewNoticeAdd = View.inflate(context, R.layout.recommendationaddcontext_res, null);
                final EditText et_add_recommendation_bookname = (EditText) viewNoticeAdd.findViewById(R.id.et_add_recommendation_bookname);
                final EditText et_add_recommendation_bookauthor = (EditText) viewNoticeAdd.findViewById(R.id.et_add_recommendation_bookauthor);
                final EditText et_add_recommendation_context = (EditText) viewNoticeAdd.findViewById(R.id.et_add_recommendation_context);

                new AlertDialog.Builder(context)
                        .setView(viewNoticeAdd)
                        .setPositiveButton("添加", new DialogInterface.OnClickListener() {

                            private ListViewRecommendationAdapter listViewRecommendationAdapter;

                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                RecommendationInfo recommendationInfo = new RecommendationInfo(-1,
                                        et_add_recommendation_bookname.getText().toString(),
                                        et_add_recommendation_bookauthor.getText().toString(),
                                        et_add_recommendation_context.getText().toString(),
                                        year + "/" + month + "/" + day,
                                        studentInfos.get(studentInfosId).getStudentName()+"");


                                recommendationTableDAO.insertRecommendationTable(recommendationInfo);
                                recommendationInfos.add(recommendationInfo);


                                if (recommendationInfos.size()!=0){
                                    tv_Recommendation_loading.setVisibility(View.GONE);
                                }


                                listViewRecommendationAdapter = new ListViewRecommendationAdapter(context,recommendationInfos);
                                listViewRecommendation.setAdapter(listViewRecommendationAdapter);
                                listViewRecommendationAdapter.notifyDataSetChanged();


                            }
                        })
                        .setNegativeButton("取消", null)
                        .show();



            }
        });


    }

    private void getListView() {

        listViewRecommendationAdapter = new ListViewRecommendationAdapter(context, recommendationInfos);
        listViewRecommendation.setAdapter(listViewRecommendationAdapter);
        listViewRecommendationAdapter.notifyDataSetChanged();

        //点击删除本条通知
        listViewRecommendation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {


                new AlertDialog.Builder(context)
                        .setMessage("确定要删除本条通知吗？")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int id) {

                                        recommendationTableDAO.deleteRecommendationTable(recommendationInfos.get(i).getRecommendationId());
                                        recommendationInfos.remove(i);


                                        List<RecommendationInfo> recommendationInfo3 = recommendationTableDAO.queryRecommendationTable();

                                        recommendationInfos.clear();
                                        recommendationInfos.addAll(recommendationInfo3);

                                        listViewRecommendationAdapter = new ListViewRecommendationAdapter(context,recommendationInfos);
                                        listViewRecommendation.setAdapter(listViewRecommendationAdapter);
                                        listViewRecommendationAdapter.notifyDataSetChanged();

                                        if (recommendationInfos.size()==0){
                                            tv_Recommendation_loading.setVisibility(View.VISIBLE);
                                        }
//


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
