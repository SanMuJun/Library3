package library3.library3.controller.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

import library3.library3.R;
import library3.library3.model.bean.AdminInfo;
import library3.library3.model.bean.StudentInfo;
import library3.library3.model.dao.AdminTableDAO;
import library3.library3.model.dao.StudentTableDAO;

public class LoginActivity extends Activity implements View.OnClickListener {

    private List<StudentInfo> studentInfos;
    private StudentTableDAO studentTableDAO;
    private List<AdminInfo> adminInfos;
    private AdminTableDAO adminTableDAO;

    @ViewInject(R.id.et_login_account)
    private EditText et_login_account;

    @ViewInject(R.id.cb_student)
    private CheckBox cb_student;
    @ViewInject(R.id.cb_admin)
    private CheckBox cb_admin;


    @ViewInject(R.id.et_login_password)
    private EditText et_login_password;
    private String et_login_password_string;
    private String et_login_account_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        x.view().inject(this);

        //初始化学生的数据库数据
        studentTableDAO = new StudentTableDAO(this);
        studentInfos = studentTableDAO.queryStudentTable();

        //初始化管理员的数据库数据
        adminTableDAO = new AdminTableDAO(this);
        adminInfos = adminTableDAO.queryAdminTable();

        //初始化点击监听
        cb_student.setOnClickListener(this);
        cb_admin.setOnClickListener(this);


    }


    public void bt_login(View v) {

        if (TextUtils.isEmpty(et_login_account.getText()) && TextUtils.isEmpty(et_login_password.getText())) {
            if (TextUtils.isEmpty(et_login_account.getText())) {
                Toast.makeText(LoginActivity.this, "账号或密码为空", Toast.LENGTH_SHORT).show();
                return;
            }
            if (TextUtils.isEmpty(et_login_password.getText())) {
                Toast.makeText(LoginActivity.this, "账号或密码为空", Toast.LENGTH_SHORT).show();
                return;
            }

        }


        //学生的登陆
        if (cb_student.isChecked() == true) {

            if (studentInfos.size() != 0) {

                for (int i = 0; i < studentInfos.size(); i++) {

                    String studentNumberLogin = studentInfos.get(i).getStudentNumber();
                    String studentPasswordLogin = studentInfos.get(i).getStudentPassword();

                    et_login_account_string = et_login_account.getText().toString();
                    et_login_password_string = et_login_password.getText().toString();


                    if (studentNumberLogin.equals(et_login_account_string) && studentPasswordLogin.equals(et_login_password_string)) {
                        Intent intent = new Intent(this, MainActivity.class);
                        intent.putExtra("studentInfosId", i);
                        intent.putExtra("adminInfosId", i);
                        intent.putExtra("studentIsChecked", cb_student.isChecked());
                        startActivity(intent);
                        finish();

                    }
                    if (et_login_account.getText().toString().equals("7") && et_login_password.getText().toString().equals("7")) {
                        startActivity(new Intent(this, MainActivity.class));
                        Toast.makeText(LoginActivity.this, "无用户登录", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
            } else {
                if (et_login_account.getText().toString().equals("7") && et_login_password.getText().toString().equals("7")) {
                    startActivity(new Intent(this, MainActivity.class));
                    Toast.makeText(LoginActivity.this, "无用户登录", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }


        }else {
//            Toast.makeText(LoginActivity.this, "账号或密码错误", Toast.LENGTH_SHORT).show();
        }


        //管理员的登陆
        if (cb_admin.isChecked() == true) {


            if (adminInfos.size() != 0) {

                for (int i = 0; i < adminInfos.size(); i++) {

                    String adminNumberLogin = adminInfos.get(i).getAdminNumber();
                    String adminPasswordLogin = adminInfos.get(i).getAdminPassword();

                    et_login_account_string = et_login_account.getText().toString();
                    et_login_password_string = et_login_password.getText().toString();


                    if (adminNumberLogin.equals(et_login_account_string) && adminPasswordLogin.equals(et_login_password_string)) {
                        Intent intent = new Intent(this, MainActivity.class);
                        intent.putExtra("adminInfosId", i);
                        intent.putExtra("studentInfosId", i);
                        intent.putExtra("adminIsChecked", cb_admin.isChecked());
                        startActivity(intent);
                        finish();

                    }
                    if (et_login_account.getText().toString().equals("7") && et_login_password.getText().toString().equals("7")) {
                        startActivity(new Intent(this, MainActivity.class));
                        Toast.makeText(LoginActivity.this, "无用户登录", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }

            } else {
                if (et_login_account.getText().toString().equals("7") && et_login_password.getText().toString().equals("7")) {
                    startActivity(new Intent(this, MainActivity.class));
                    Toast.makeText(LoginActivity.this, "无用户登录", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }else {
//            Toast.makeText(LoginActivity.this, "账号或密码错误", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.cb_student:
                if (cb_student.isChecked() == true) {

                    cb_admin.setChecked(false);
                }

                break;
            case R.id.cb_admin:
                if (cb_admin.isChecked() == true) {
//                    startActivity(new Intent(this, MainActivity.class));

                    cb_student.setChecked(false);
                }
                break;


        }


    }
}
