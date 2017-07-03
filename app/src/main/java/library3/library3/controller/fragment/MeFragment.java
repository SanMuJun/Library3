package library3.library3.controller.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

import library3.library3.R;
import library3.library3.controller.activity.CollectionActivity;
import library3.library3.controller.activity.LoginActivity;
import library3.library3.controller.base.BaseFragment;
import library3.library3.model.bean.AdminInfo;
import library3.library3.model.bean.BorrowAndReadInfo;
import library3.library3.model.bean.StudentInfo;
import library3.library3.model.dao.AdminTableDAO;
import library3.library3.model.dao.BorrowAndReadTableDAO;
import library3.library3.model.dao.StudentTableDAO;

/**
 * Created by San on 2017/4/10.
 */
public class MeFragment extends BaseFragment {

    @ViewInject(R.id.iv_person)
    private TextView iv_person;

    @ViewInject(R.id.tv_student_name)
    private TextView tv_student_name;
    @ViewInject(R.id.tv_student_number)
    private TextView tv_student_number;
    @ViewInject(R.id.tv_student_class)
    private TextView tv_student_class;
    @ViewInject(R.id.tv_student_major)
    private TextView tv_student_major;
    @ViewInject(R.id.tv_student_colloge)
    private TextView tv_student_colloge;

    @ViewInject(R.id.bt_add_student)
    private Button bt_add_student;
    @ViewInject(R.id.bt_add_admin)
    private Button bt_add_admin;
    @ViewInject(R.id.bt_collection)
    private Button bt_collection;

    @ViewInject(R.id.bt_back_loading)
    private TextView bt_back_loading;
    private StudentTableDAO studentTableDAO;
    private List<StudentInfo> studentInfos;
    private List<AdminInfo> adminInfos;
    private AdminTableDAO adminTableDAO;


    public MeFragment(List<BorrowAndReadInfo> borrowAndReadInfo, BorrowAndReadTableDAO borrowAndReadTableDAO, int studentInfosId) {
        super(borrowAndReadInfo, borrowAndReadTableDAO,studentInfosId);
    }



    @Override
    public View initView() {

        View viewMeFragment=View.inflate(context, R.layout.mefragment_res,null);

        x.view().inject(this,viewMeFragment);


        return viewMeFragment;
    }

    @Override
    protected void initData() {

        //获取学生的数据库信息
        studentTableDAO = new StudentTableDAO(context);
        studentInfos = studentTableDAO.queryStudentTable();

        //获取管理员的数据库信息
        adminTableDAO = new AdminTableDAO(context);
        adminInfos = adminTableDAO.queryAdminTable();

        //点击事件
        bt_add_student.setOnClickListener(new OnClickListenerAddStudent());
        bt_add_admin.setOnClickListener(new OnClickListenerAddAdmin());
        bt_collection.setOnClickListener(new OnClickListenerCollection());
        bt_back_loading.setOnClickListener(new OnClickBackLoading());

        setTextStudentContent();

    }

    //设置基本信息
    private void setTextStudentContent() {

        //获取传递的信息
        int studentInfosId = getActivity().getIntent().getIntExtra("studentInfosId", -1);
        int adminInfosId = getActivity().getIntent().getIntExtra("adminInfosId", -1);
        boolean studentIsChecked = getActivity().getIntent().getBooleanExtra("studentIsChecked", false);
        boolean adminIsChecked = getActivity().getIntent().getBooleanExtra("adminIsChecked", false);
        //设置学生的基本信息
        if (studentIsChecked==true){

            if (studentInfosId==-1){
                return;
            }
            tv_student_major.setVisibility(View.VISIBLE);
            tv_student_colloge.setVisibility(View.VISIBLE);
            tv_student_name.setText("姓名："+studentInfos.get(studentInfosId).getStudentName());
            tv_student_number.setText("学号："+studentInfos.get(studentInfosId).getStudentNumber());
            tv_student_class.setText("班级："+studentInfos.get(studentInfosId).getStudentClass());
            tv_student_major.setText("专业："+studentInfos.get(studentInfosId).getStudentMajor());
            tv_student_colloge.setText("学院："+studentInfos.get(studentInfosId).getStudentCollege());
            bt_add_student.setVisibility(View.INVISIBLE);
            bt_add_admin.setVisibility(View.INVISIBLE);

        }

        //设置管理员的基本信息
        if (adminIsChecked==true){
            if (adminInfosId==-1){
                return;
            }
            tv_student_name.setText("姓名："+adminInfos.get(adminInfosId).getAdminName());
            tv_student_number.setText("账号："+adminInfos.get(adminInfosId).getAdminNumber());
            tv_student_class.setText("职业："+adminInfos.get(adminInfosId).getAdminJob());
            tv_student_major.setVisibility(View.INVISIBLE);
            tv_student_colloge.setVisibility(View.INVISIBLE);
            bt_add_student.setVisibility(View.VISIBLE);
            bt_add_admin.setVisibility(View.VISIBLE);

        }
    }

    //退出的按钮
    private class OnClickBackLoading implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(context, LoginActivity.class);
            startActivity(intent);
            getActivity().finish();

        }
    }

    //添加管理员的按钮
    private class OnClickListenerAddAdmin implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            View viewAddStudent=View.inflate(context,R.layout.add_admin_res,null);
            final TextView et_admin_name = (TextView) viewAddStudent.findViewById(R.id.et_admin_name);
            final TextView et_admin_number = (TextView) viewAddStudent.findViewById(R.id.et_admin_number);
            final TextView et_admin_password = (TextView) viewAddStudent.findViewById(R.id.et_admin_password);
            final TextView et_admin_job = (TextView) viewAddStudent.findViewById(R.id.et_admin_job);

            new AlertDialog.Builder(context)
                    .setTitle("添加管理员信息")
                    .setView(viewAddStudent)
                    .setNegativeButton("取消",null)
                    .setPositiveButton("添加", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            String et_admin_name_string = String.valueOf(et_admin_name.getText().toString());
                            String et_admin_number_string =String.valueOf(et_admin_number.getText().toString());
                            String et_admin_password_string = String.valueOf(et_admin_password.getText().toString());
                            String et_admin_job_string = String.valueOf(et_admin_job.getText().toString());

                            AdminInfo adminInfo = new AdminInfo(
                                    -1,
                                    et_admin_number_string,
                                    et_admin_password_string,
                                    et_admin_name_string,
                                    et_admin_job_string);

                            adminTableDAO.insertAdminTable(adminInfo);

                        }
                    })
                    .show();
        }
    }

    //添加学生的按钮
    private class OnClickListenerAddStudent  implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            View viewAddStudent=View.inflate(context,R.layout.add_student_res,null);
            final TextView et_student_name = (TextView) viewAddStudent.findViewById(R.id.et_student_name);
            final TextView et_student_number = (TextView) viewAddStudent.findViewById(R.id.et_student_number);
            final TextView et_student_password = (TextView) viewAddStudent.findViewById(R.id.et_student_password);
            final TextView et_student_class = (TextView) viewAddStudent.findViewById(R.id.et_student_class);
            final TextView et_student_major = (TextView) viewAddStudent.findViewById(R.id.et_student_major);
            final TextView et_student_college = (TextView) viewAddStudent.findViewById(R.id.et_student_college);

            new AlertDialog.Builder(context)
                    .setTitle("添加学生信息")
                    .setView(viewAddStudent)
                    .setNegativeButton("取消",null)
                    .setPositiveButton("添加", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            String et_student_name_string = String.valueOf(et_student_name.getText().toString());
                            String et_student_number_string =String.valueOf(et_student_number.getText().toString());
                            String et_student_password_string = String.valueOf(et_student_password.getText().toString());
                            String et_student_class_string = String.valueOf(et_student_class.getText().toString());
                            String et_student_major_string = String.valueOf(et_student_major.getText().toString());
                            String et_student_college_string =  String.valueOf(et_student_college.getText().toString());

                            StudentInfo studentInfos = new StudentInfo(
                                    -1,
                                    et_student_number_string,
                                    et_student_password_string,
                                    et_student_name_string,
                                    et_student_major_string,
                                    et_student_class_string,
                                    et_student_college_string,
                                    "没有预约座位");

                            studentTableDAO.insertStudentTable(studentInfos);

                        }
                    })
                    .show();

        }
    }

    //收藏的点击事件
    private class OnClickListenerCollection implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(context, CollectionActivity.class);

            getActivity().startActivity(intent);

        }
    }
}
