package library3.library3.controller.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.RadioGroup;

import java.util.List;

import library3.library3.R;
import library3.library3.controller.fragment.BorrowAndLendFragment;
import library3.library3.controller.fragment.LibraryFragment;
import library3.library3.controller.fragment.MeFragment;
import library3.library3.controller.fragment.SeatFragment;
import library3.library3.model.bean.BorrowAndReadInfo;
import library3.library3.model.dao.BorrowAndReadTableDAO;

public class MainActivity extends FragmentActivity {

//    @ViewInject(R.id.rg_main)

    private RadioGroup rg_main;
    private LibraryFragment libraryFragment;
    private MeFragment meFragment;
    private SeatFragment seatFragment;
    private BorrowAndLendFragment borrowAndLendFragment;

    public List<BorrowAndReadInfo> borrowAndReadInfo;
    public BorrowAndReadTableDAO borrowAndReadTableDAO;

    public int studentInfosId;
    private int adminInfosId;
    private boolean studentIsChecked;
    private boolean adminIsChecked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        borrowAndReadTableDAO=new BorrowAndReadTableDAO(this);
        borrowAndReadInfo= borrowAndReadTableDAO.queryBorrowAndReadTable();

        //获取登陆传递的 学生id和管理员的id
        studentInfosId = getIntent().getIntExtra("studentInfosId", 0);
        studentIsChecked = getIntent().getBooleanExtra("studentIsChecked", false);
        //管理员的id
        adminInfosId = getIntent().getIntExtra("adminInfosId", 0);
        adminIsChecked = getIntent().getBooleanExtra("adminIsChecked", false);
        //初始化视图
        initView();
        //获取数据
        initData();
        //点击监听
        initListener();

    }


    private void initListener() {

        rg_main.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                Fragment fragment=null;
                switch (i){

                    case R.id.bt_library:
                        fragment=libraryFragment;
                        break;

                    case R.id.bt_borrow_lend:

                        fragment=borrowAndLendFragment;
                        break;

                    case R.id.bt_seat:

                        fragment=seatFragment;
                        break;

                    case R.id.bt_me:

                        fragment=meFragment;
                        break;

                }

                getFragment(fragment);
            }
        });

        rg_main.check(R.id.bt_library);
    }

    private void getFragment(Fragment fragment) {

        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main,fragment).commit();

    }

    private void initData() {

        libraryFragment = new LibraryFragment(borrowAndReadInfo,borrowAndReadTableDAO,studentInfosId);
        borrowAndLendFragment = new BorrowAndLendFragment(borrowAndReadInfo,borrowAndReadTableDAO,studentInfosId);
        seatFragment = new SeatFragment(borrowAndReadInfo,borrowAndReadTableDAO,studentInfosId);
        meFragment = new MeFragment(borrowAndReadInfo,borrowAndReadTableDAO,studentInfosId);

    }

    private void initView() {


        rg_main= (RadioGroup) findViewById(R.id.rg_main);

    }



}
