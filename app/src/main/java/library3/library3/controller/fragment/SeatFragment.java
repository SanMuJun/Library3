package library3.library3.controller.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.Calendar;
import java.util.List;

import library3.library3.R;
import library3.library3.controller.activity.ToSeatActivity;
import library3.library3.controller.base.BaseFragment;
import library3.library3.model.bean.BorrowAndReadInfo;
import library3.library3.model.bean.StudentInfo;
import library3.library3.model.bean.SubscribeSeatInfo;
import library3.library3.model.dao.BorrowAndReadTableDAO;
import library3.library3.model.dao.StudentTableDAO;
import library3.library3.model.dao.SubscribeSeatTableDAO;

/**
 * Created by San on 2017/4/10.
 */
public class SeatFragment extends BaseFragment implements View.OnClickListener {


    private int studentInfosId;
    private List<StudentInfo> studentInfos;
    private StudentTableDAO studentTableDAO;
    private SubscribeSeatTableDAO subscribeSeatTableDAO;
    private List<SubscribeSeatInfo> subscribeSeatInfos;

    public SeatFragment(List<BorrowAndReadInfo> borrowAndReadInfo, BorrowAndReadTableDAO borrowAndReadTableDAO, int studentInfosId) {
        super(borrowAndReadInfo, borrowAndReadTableDAO, studentInfosId);


    }

    @ViewInject(R.id.bt_to_second_floor)
    private Button bt_to_second_floor;
    @ViewInject(R.id.bt_cancel)
    private Button bt_cancel;
    @ViewInject(R.id.tv_seat_number)
    private TextView tv_seat_number;

    @ViewInject(R.id.rg_floor_first)
    private RadioGroup rg_floor_first;

    @ViewInject(R.id.bt_floor_first_east_1)
    private CheckBox bt_floor_first_east_1;
    @ViewInject(R.id.bt_floor_first_east_2)
    private CheckBox bt_floor_first_east_2;
    @ViewInject(R.id.bt_floor_first_east_3)
    private CheckBox bt_floor_first_east_3;
    @ViewInject(R.id.bt_floor_first_east_4)
    private CheckBox bt_floor_first_east_4;
    @ViewInject(R.id.bt_floor_first_east_5)
    private CheckBox bt_floor_first_east_5;
    @ViewInject(R.id.bt_floor_first_east_6)
    private CheckBox bt_floor_first_east_6;
    @ViewInject(R.id.bt_floor_first_east_7)
    private CheckBox bt_floor_first_east_7;
    @ViewInject(R.id.bt_floor_first_east_8)
    private CheckBox bt_floor_first_east_8;
    @ViewInject(R.id.bt_floor_first_east_9)
    private CheckBox bt_floor_first_east_9;
    @ViewInject(R.id.bt_floor_first_east_10)
    private CheckBox bt_floor_first_east_10;
    @ViewInject(R.id.bt_floor_first_east_11)
    private CheckBox bt_floor_first_east_11;
    @ViewInject(R.id.bt_floor_first_east_12)
    private CheckBox bt_floor_first_east_12;

    @ViewInject(R.id.bt_floor_first_east_13)
    private CheckBox bt_floor_first_east_13;
    @ViewInject(R.id.bt_floor_first_east_14)
    private CheckBox bt_floor_first_east_14;
    @ViewInject(R.id.bt_floor_first_east_15)
    private CheckBox bt_floor_first_east_15;
    @ViewInject(R.id.bt_floor_first_east_16)
    private CheckBox bt_floor_first_east_16;
    @ViewInject(R.id.bt_floor_first_east_17)
    private CheckBox bt_floor_first_east_17;
    @ViewInject(R.id.bt_floor_first_east_18)
    private CheckBox bt_floor_first_east_18;
    @ViewInject(R.id.bt_floor_first_east_19)
    private CheckBox bt_floor_first_east_19;
    @ViewInject(R.id.bt_floor_first_east_20)
    private CheckBox bt_floor_first_east_20;
    @ViewInject(R.id.bt_floor_first_east_21)
    private CheckBox bt_floor_first_east_21;
    @ViewInject(R.id.bt_floor_first_east_22)
    private CheckBox bt_floor_first_east_22;
    @ViewInject(R.id.bt_floor_first_east_23)
    private CheckBox bt_floor_first_east_23;
    @ViewInject(R.id.bt_floor_first_east_24)
    private CheckBox bt_floor_first_east_24;

    @ViewInject(R.id.bt_floor_first_east_25)
    private CheckBox bt_floor_first_east_25;
    @ViewInject(R.id.bt_floor_first_east_26)
    private CheckBox bt_floor_first_east_26;
    @ViewInject(R.id.bt_floor_first_east_27)
    private CheckBox bt_floor_first_east_27;
    @ViewInject(R.id.bt_floor_first_east_28)
    private CheckBox bt_floor_first_east_28;
    @ViewInject(R.id.bt_floor_first_east_29)
    private CheckBox bt_floor_first_east_29;
    @ViewInject(R.id.bt_floor_first_east_30)
    private CheckBox bt_floor_first_east_30;
    @ViewInject(R.id.bt_floor_first_east_31)
    private CheckBox bt_floor_first_east_31;
    @ViewInject(R.id.bt_floor_first_east_32)
    private CheckBox bt_floor_first_east_32;
    @ViewInject(R.id.bt_floor_first_east_33)
    private CheckBox bt_floor_first_east_33;
    @ViewInject(R.id.bt_floor_first_east_34)
    private CheckBox bt_floor_first_east_34;
    @ViewInject(R.id.bt_floor_first_east_35)
    private CheckBox bt_floor_first_east_35;
    @ViewInject(R.id.bt_floor_first_east_36)
    private CheckBox bt_floor_first_east_36;

    @ViewInject(R.id.bt_floor_first_east_37)
    private CheckBox bt_floor_first_east_37;
    @ViewInject(R.id.bt_floor_first_east_38)
    private CheckBox bt_floor_first_east_38;
    @ViewInject(R.id.bt_floor_first_east_39)
    private CheckBox bt_floor_first_east_39;
    @ViewInject(R.id.bt_floor_first_east_40)
    private CheckBox bt_floor_first_east_40;
    @ViewInject(R.id.bt_floor_first_east_41)
    private CheckBox bt_floor_first_east_41;
    @ViewInject(R.id.bt_floor_first_east_42)
    private CheckBox bt_floor_first_east_42;
    @ViewInject(R.id.bt_floor_first_east_43)
    private CheckBox bt_floor_first_east_43;
    @ViewInject(R.id.bt_floor_first_east_44)
    private CheckBox bt_floor_first_east_44;
    @ViewInject(R.id.bt_floor_first_east_45)
    private CheckBox bt_floor_first_east_45;
    @ViewInject(R.id.bt_floor_first_east_46)
    private CheckBox bt_floor_first_east_46;
    @ViewInject(R.id.bt_floor_first_east_47)
    private CheckBox bt_floor_first_east_47;
    @ViewInject(R.id.bt_floor_first_east_48)
    private CheckBox bt_floor_first_east_48;

    @ViewInject(R.id.bt_floor_first_east_49)
    private CheckBox bt_floor_first_east_49;
    @ViewInject(R.id.bt_floor_first_east_50)
    private CheckBox bt_floor_first_east_50;
    @ViewInject(R.id.bt_floor_first_east_51)
    private CheckBox bt_floor_first_east_51;
    @ViewInject(R.id.bt_floor_first_east_52)
    private CheckBox bt_floor_first_east_52;
    @ViewInject(R.id.bt_floor_first_east_53)
    private CheckBox bt_floor_first_east_53;
    @ViewInject(R.id.bt_floor_first_east_54)
    private CheckBox bt_floor_first_east_54;
    @ViewInject(R.id.bt_floor_first_east_55)
    private CheckBox bt_floor_first_east_55;
    @ViewInject(R.id.bt_floor_first_east_56)
    private CheckBox bt_floor_first_east_56;
    @ViewInject(R.id.bt_floor_first_east_57)
    private CheckBox bt_floor_first_east_57;
    @ViewInject(R.id.bt_floor_first_east_58)
    private CheckBox bt_floor_first_east_58;
    @ViewInject(R.id.bt_floor_first_east_59)
    private CheckBox bt_floor_first_east_59;
    @ViewInject(R.id.bt_floor_first_east_60)
    private CheckBox bt_floor_first_east_60;

    @ViewInject(R.id.bt_floor_first_east_61)
    private CheckBox bt_floor_first_east_61;
    @ViewInject(R.id.bt_floor_first_east_62)
    private CheckBox bt_floor_first_east_62;
    @ViewInject(R.id.bt_floor_first_east_63)
    private CheckBox bt_floor_first_east_63;
    @ViewInject(R.id.bt_floor_first_east_64)
    private CheckBox bt_floor_first_east_64;
    @ViewInject(R.id.bt_floor_first_east_65)
    private CheckBox bt_floor_first_east_65;
    @ViewInject(R.id.bt_floor_first_east_66)
    private CheckBox bt_floor_first_east_66;
    @ViewInject(R.id.bt_floor_first_east_67)
    private CheckBox bt_floor_first_east_67;
    @ViewInject(R.id.bt_floor_first_east_68)
    private CheckBox bt_floor_first_east_68;
    @ViewInject(R.id.bt_floor_first_east_69)
    private CheckBox bt_floor_first_east_69;

    @ViewInject(R.id.bt_floor_first_east_70)
    private CheckBox bt_floor_first_east_70;
    @ViewInject(R.id.bt_floor_first_east_71)
    private CheckBox bt_floor_first_east_71;
    @ViewInject(R.id.bt_floor_first_east_72)
    private CheckBox bt_floor_first_east_72;
    @ViewInject(R.id.bt_floor_first_east_73)
    private CheckBox bt_floor_first_east_73;
    @ViewInject(R.id.bt_floor_first_east_74)
    private CheckBox bt_floor_first_east_74;
    @ViewInject(R.id.bt_floor_first_east_75)
    private CheckBox bt_floor_first_east_75;
    @ViewInject(R.id.bt_floor_first_east_76)
    private CheckBox bt_floor_first_east_76;
    @ViewInject(R.id.bt_floor_first_east_77)
    private CheckBox bt_floor_first_east_77;
    @ViewInject(R.id.bt_floor_first_east_78)
    private CheckBox bt_floor_first_east_78;
    @ViewInject(R.id.bt_floor_first_east_79)
    private CheckBox bt_floor_first_east_79;

    @ViewInject(R.id.bt_floor_first_east_80)
    private CheckBox bt_floor_first_east_80;
    @ViewInject(R.id.bt_floor_first_east_81)
    private CheckBox bt_floor_first_east_81;
    @ViewInject(R.id.bt_floor_first_east_82)
    private CheckBox bt_floor_first_east_82;
    @ViewInject(R.id.bt_floor_first_east_83)
    private CheckBox bt_floor_first_east_83;
    @ViewInject(R.id.bt_floor_first_east_84)
    private CheckBox bt_floor_first_east_84;
    @ViewInject(R.id.bt_floor_first_east_85)
    private CheckBox bt_floor_first_east_85;
    @ViewInject(R.id.bt_floor_first_east_86)
    private CheckBox bt_floor_first_east_86;
    @ViewInject(R.id.bt_floor_first_east_87)
    private CheckBox bt_floor_first_east_87;
    @ViewInject(R.id.bt_floor_first_east_88)
    private CheckBox bt_floor_first_east_88;
    @ViewInject(R.id.bt_floor_first_east_89)
    private CheckBox bt_floor_first_east_89;

    @ViewInject(R.id.bt_floor_first_east_90)
    private CheckBox bt_floor_first_east_90;
    @ViewInject(R.id.bt_floor_first_east_91)
    private CheckBox bt_floor_first_east_91;
    @ViewInject(R.id.bt_floor_first_east_92)
    private CheckBox bt_floor_first_east_92;
    @ViewInject(R.id.bt_floor_first_east_93)
    private CheckBox bt_floor_first_east_93;
    @ViewInject(R.id.bt_floor_first_east_94)
    private CheckBox bt_floor_first_east_94;
    @ViewInject(R.id.bt_floor_first_east_95)
    private CheckBox bt_floor_first_east_95;
    @ViewInject(R.id.bt_floor_first_east_96)
    private CheckBox bt_floor_first_east_96;


    private CheckBox radioButton = null;

    private boolean SEAT_STASE = false;


    @Override
    public View initView() {

        View viewSeatFragment = View.inflate(context, R.layout.seatfragment_res, null);

        x.view().inject(this, viewSeatFragment);

        return viewSeatFragment;
    }


    @Override
    protected void initData() {

        //获取当前用户的id
        studentInfosId = getActivity().getIntent().getIntExtra("studentInfosId", -1);

        //初始化学生的数据库数据
        studentTableDAO = new StudentTableDAO(context);
        studentInfos = studentTableDAO.queryStudentTable();
        Log.e("SubscribeSeatTablDAOTag", "studentInfo初始化数据" + studentInfos);

        //初始化座位预约的数据库数据
        subscribeSeatTableDAO = new SubscribeSeatTableDAO(context);
        subscribeSeatInfos = subscribeSeatTableDAO.querySubscribeSeatTable();
        Log.e("SubscribeSeatTablDAOTag", "subscribeSeatInfos初始化数据" + subscribeSeatInfos);

        //设置点击监听
        getListenerRadioButton();


    }


    //初始化点击监听事件
    private void getListenerRadioButton() {


        //设置只有点击离开才会触发的数据
        judgeSeatIsTure(bt_floor_first_east_1, true);
        judgeSeatIsTure(bt_floor_first_east_2, true);
        judgeSeatIsTure(bt_floor_first_east_3, true);
        judgeSeatIsTure(bt_floor_first_east_4, true);
        judgeSeatIsTure(bt_floor_first_east_5, true);
        judgeSeatIsTure(bt_floor_first_east_6, true);
        judgeSeatIsTure(bt_floor_first_east_7, true);
        judgeSeatIsTure(bt_floor_first_east_8, true);
        judgeSeatIsTure(bt_floor_first_east_9, true);

        judgeSeatIsTure(bt_floor_first_east_10, true);
        judgeSeatIsTure(bt_floor_first_east_11, true);
        judgeSeatIsTure(bt_floor_first_east_12, true);
        judgeSeatIsTure(bt_floor_first_east_13, true);
        judgeSeatIsTure(bt_floor_first_east_14, true);
        judgeSeatIsTure(bt_floor_first_east_15, true);
        judgeSeatIsTure(bt_floor_first_east_16, true);
        judgeSeatIsTure(bt_floor_first_east_17, true);
        judgeSeatIsTure(bt_floor_first_east_18, true);
        judgeSeatIsTure(bt_floor_first_east_19, true);

        judgeSeatIsTure(bt_floor_first_east_20, true);
        judgeSeatIsTure(bt_floor_first_east_21, true);
        judgeSeatIsTure(bt_floor_first_east_22, true);
        judgeSeatIsTure(bt_floor_first_east_23, true);
        judgeSeatIsTure(bt_floor_first_east_24, true);
        judgeSeatIsTure(bt_floor_first_east_25, true);
        judgeSeatIsTure(bt_floor_first_east_26, true);
        judgeSeatIsTure(bt_floor_first_east_27, true);
        judgeSeatIsTure(bt_floor_first_east_28, true);
        judgeSeatIsTure(bt_floor_first_east_29, true);

        judgeSeatIsTure(bt_floor_first_east_30, true);
        judgeSeatIsTure(bt_floor_first_east_31, true);
        judgeSeatIsTure(bt_floor_first_east_32, true);
        judgeSeatIsTure(bt_floor_first_east_33, true);
        judgeSeatIsTure(bt_floor_first_east_34, true);
        judgeSeatIsTure(bt_floor_first_east_35, true);
        judgeSeatIsTure(bt_floor_first_east_36, true);
        judgeSeatIsTure(bt_floor_first_east_37, true);
        judgeSeatIsTure(bt_floor_first_east_38, true);
        judgeSeatIsTure(bt_floor_first_east_39, true);

        judgeSeatIsTure(bt_floor_first_east_40, true);
        judgeSeatIsTure(bt_floor_first_east_41, true);
        judgeSeatIsTure(bt_floor_first_east_42, true);
        judgeSeatIsTure(bt_floor_first_east_43, true);
        judgeSeatIsTure(bt_floor_first_east_44, true);
        judgeSeatIsTure(bt_floor_first_east_45, true);
        judgeSeatIsTure(bt_floor_first_east_46, true);
        judgeSeatIsTure(bt_floor_first_east_47, true);
        judgeSeatIsTure(bt_floor_first_east_48, true);
        judgeSeatIsTure(bt_floor_first_east_49, true);

        judgeSeatIsTure(bt_floor_first_east_50, true);
        judgeSeatIsTure(bt_floor_first_east_51, true);
        judgeSeatIsTure(bt_floor_first_east_52, true);
        judgeSeatIsTure(bt_floor_first_east_53, true);
        judgeSeatIsTure(bt_floor_first_east_54, true);
        judgeSeatIsTure(bt_floor_first_east_55, true);
        judgeSeatIsTure(bt_floor_first_east_56, true);
        judgeSeatIsTure(bt_floor_first_east_57, true);
        judgeSeatIsTure(bt_floor_first_east_58, true);
        judgeSeatIsTure(bt_floor_first_east_59, true);

        judgeSeatIsTure(bt_floor_first_east_60, true);
        judgeSeatIsTure(bt_floor_first_east_61, true);
        judgeSeatIsTure(bt_floor_first_east_62, true);
        judgeSeatIsTure(bt_floor_first_east_63, true);
        judgeSeatIsTure(bt_floor_first_east_64, true);
        judgeSeatIsTure(bt_floor_first_east_65, true);
        judgeSeatIsTure(bt_floor_first_east_66, true);
        judgeSeatIsTure(bt_floor_first_east_67, true);
        judgeSeatIsTure(bt_floor_first_east_68, true);
        judgeSeatIsTure(bt_floor_first_east_69, true);

        judgeSeatIsTure(bt_floor_first_east_70, true);
        judgeSeatIsTure(bt_floor_first_east_71, true);
        judgeSeatIsTure(bt_floor_first_east_72, true);
        judgeSeatIsTure(bt_floor_first_east_73, true);
        judgeSeatIsTure(bt_floor_first_east_74, true);
        judgeSeatIsTure(bt_floor_first_east_75, true);
        judgeSeatIsTure(bt_floor_first_east_76, true);
        judgeSeatIsTure(bt_floor_first_east_77, true);
        judgeSeatIsTure(bt_floor_first_east_78, true);
        judgeSeatIsTure(bt_floor_first_east_79, true);

        judgeSeatIsTure(bt_floor_first_east_80, true);
        judgeSeatIsTure(bt_floor_first_east_81, true);
        judgeSeatIsTure(bt_floor_first_east_82, true);
        judgeSeatIsTure(bt_floor_first_east_83, true);
        judgeSeatIsTure(bt_floor_first_east_84, true);
        judgeSeatIsTure(bt_floor_first_east_85, true);
        judgeSeatIsTure(bt_floor_first_east_86, true);
        judgeSeatIsTure(bt_floor_first_east_87, true);
        judgeSeatIsTure(bt_floor_first_east_88, true);
        judgeSeatIsTure(bt_floor_first_east_89, true);

        judgeSeatIsTure(bt_floor_first_east_90, true);
        judgeSeatIsTure(bt_floor_first_east_91, true);
        judgeSeatIsTure(bt_floor_first_east_92, true);
        judgeSeatIsTure(bt_floor_first_east_93, true);
        judgeSeatIsTure(bt_floor_first_east_94, true);
        judgeSeatIsTure(bt_floor_first_east_95, true);
        judgeSeatIsTure(bt_floor_first_east_96, true);


        //所有点击事件
        bt_cancel.setOnClickListener(this);
        bt_to_second_floor.setOnClickListener(this);

        bt_floor_first_east_1.setOnClickListener(this);
        bt_floor_first_east_2.setOnClickListener(this);
        bt_floor_first_east_3.setOnClickListener(this);
        bt_floor_first_east_4.setOnClickListener(this);
        bt_floor_first_east_5.setOnClickListener(this);
        bt_floor_first_east_6.setOnClickListener(this);
        bt_floor_first_east_7.setOnClickListener(this);
        bt_floor_first_east_8.setOnClickListener(this);
        bt_floor_first_east_9.setOnClickListener(this);
        bt_floor_first_east_10.setOnClickListener(this);

        bt_floor_first_east_11.setOnClickListener(this);
        bt_floor_first_east_12.setOnClickListener(this);
        bt_floor_first_east_13.setOnClickListener(this);
        bt_floor_first_east_14.setOnClickListener(this);
        bt_floor_first_east_15.setOnClickListener(this);
        bt_floor_first_east_16.setOnClickListener(this);
        bt_floor_first_east_17.setOnClickListener(this);
        bt_floor_first_east_18.setOnClickListener(this);
        bt_floor_first_east_19.setOnClickListener(this);
        bt_floor_first_east_20.setOnClickListener(this);

        bt_floor_first_east_21.setOnClickListener(this);
        bt_floor_first_east_22.setOnClickListener(this);
        bt_floor_first_east_23.setOnClickListener(this);
        bt_floor_first_east_24.setOnClickListener(this);
        bt_floor_first_east_25.setOnClickListener(this);
        bt_floor_first_east_26.setOnClickListener(this);
        bt_floor_first_east_27.setOnClickListener(this);
        bt_floor_first_east_28.setOnClickListener(this);
        bt_floor_first_east_29.setOnClickListener(this);
        bt_floor_first_east_30.setOnClickListener(this);

        bt_floor_first_east_31.setOnClickListener(this);
        bt_floor_first_east_32.setOnClickListener(this);
        bt_floor_first_east_33.setOnClickListener(this);
        bt_floor_first_east_34.setOnClickListener(this);
        bt_floor_first_east_35.setOnClickListener(this);
        bt_floor_first_east_36.setOnClickListener(this);
        bt_floor_first_east_37.setOnClickListener(this);
        bt_floor_first_east_38.setOnClickListener(this);
        bt_floor_first_east_39.setOnClickListener(this);
        bt_floor_first_east_40.setOnClickListener(this);

        bt_floor_first_east_41.setOnClickListener(this);
        bt_floor_first_east_42.setOnClickListener(this);
        bt_floor_first_east_43.setOnClickListener(this);
        bt_floor_first_east_44.setOnClickListener(this);
        bt_floor_first_east_45.setOnClickListener(this);
        bt_floor_first_east_46.setOnClickListener(this);
        bt_floor_first_east_47.setOnClickListener(this);
        bt_floor_first_east_48.setOnClickListener(this);
        bt_floor_first_east_49.setOnClickListener(this);
        bt_floor_first_east_50.setOnClickListener(this);

        bt_floor_first_east_51.setOnClickListener(this);
        bt_floor_first_east_52.setOnClickListener(this);
        bt_floor_first_east_53.setOnClickListener(this);
        bt_floor_first_east_54.setOnClickListener(this);
        bt_floor_first_east_55.setOnClickListener(this);
        bt_floor_first_east_56.setOnClickListener(this);
        bt_floor_first_east_57.setOnClickListener(this);
        bt_floor_first_east_58.setOnClickListener(this);
        bt_floor_first_east_59.setOnClickListener(this);
        bt_floor_first_east_60.setOnClickListener(this);

        bt_floor_first_east_61.setOnClickListener(this);
        bt_floor_first_east_62.setOnClickListener(this);
        bt_floor_first_east_63.setOnClickListener(this);
        bt_floor_first_east_64.setOnClickListener(this);
        bt_floor_first_east_65.setOnClickListener(this);
        bt_floor_first_east_66.setOnClickListener(this);
        bt_floor_first_east_67.setOnClickListener(this);
        bt_floor_first_east_68.setOnClickListener(this);
        bt_floor_first_east_69.setOnClickListener(this);
        bt_floor_first_east_70.setOnClickListener(this);

        bt_floor_first_east_71.setOnClickListener(this);
        bt_floor_first_east_72.setOnClickListener(this);
        bt_floor_first_east_73.setOnClickListener(this);
        bt_floor_first_east_74.setOnClickListener(this);
        bt_floor_first_east_75.setOnClickListener(this);
        bt_floor_first_east_76.setOnClickListener(this);
        bt_floor_first_east_77.setOnClickListener(this);
        bt_floor_first_east_78.setOnClickListener(this);
        bt_floor_first_east_79.setOnClickListener(this);
        bt_floor_first_east_80.setOnClickListener(this);

        bt_floor_first_east_81.setOnClickListener(this);
        bt_floor_first_east_82.setOnClickListener(this);
        bt_floor_first_east_83.setOnClickListener(this);
        bt_floor_first_east_84.setOnClickListener(this);
        bt_floor_first_east_85.setOnClickListener(this);
        bt_floor_first_east_86.setOnClickListener(this);
        bt_floor_first_east_87.setOnClickListener(this);
        bt_floor_first_east_88.setOnClickListener(this);
        bt_floor_first_east_89.setOnClickListener(this);
        bt_floor_first_east_90.setOnClickListener(this);

        bt_floor_first_east_91.setOnClickListener(this);
        bt_floor_first_east_92.setOnClickListener(this);
        bt_floor_first_east_93.setOnClickListener(this);
        bt_floor_first_east_94.setOnClickListener(this);
        bt_floor_first_east_95.setOnClickListener(this);
        bt_floor_first_east_96.setOnClickListener(this);


//        //有人登陆过
//        if (subscribeSeatInfos.size() != 0 && subscribeSeatInfos.size() > 0 && studentInfos.size() != 0 && studentInfos.size() > 0) {
//
//            //判断 自己登陆过 还是 别人登陆过
//            for (int i = 0; i < subscribeSeatInfos.size(); i++) {
//
//                //判断当前控件的 座位号 有没有与 保存在数据库中的相同 来判断当前控件有没有被预约
//                if (bt_floor_first_east_1.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//
//                    bt_floor_first_east_1.setChecked(true);
//
//
//                } else {
//                    bt_floor_first_east_1.setChecked(false);
//                }
//
//
//                if (bt_floor_first_east_2.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//
//                    bt_floor_first_east_2.setChecked(true);
//
//                } else {
//                    bt_floor_first_east_2.setChecked(false);
//                }
//
//
//                if (bt_floor_first_east_3.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//
//                    bt_floor_first_east_3.setChecked(true);
//
//                } else {
//                    bt_floor_first_east_3.setChecked(false);
//                }
//
//                if (bt_floor_first_east_4.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//
//                    bt_floor_first_east_4.setChecked(true);
//
//                } else {
//                    bt_floor_first_east_4.setChecked(false);
//                }
//
//                if (bt_floor_first_east_5.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//                    judgeSeatIsTure(bt_floor_first_east_5);
//                    bt_floor_first_east_5.setChecked(true);
//
//                    if (SEAT_STASE == true) {
////                        subscribeSeatInfos.remove(studentInfos.get(studentInfosId).getStudentSeatId()-1);
//                        Log.e("SubscribeSeatTablDAOTag", "subscribeSeatInfos数据" + subscribeSeatInfos);
//                        subscribeSeatTableDAO.deleteSubscribeSeatTable(subscribeSeatInfos.get(i).getSubscribeSeatId());
//
//                        List<SubscribeSeatInfo> subscribeSeatInfos3 = subscribeSeatTableDAO.querySubscribeSeatTable();
//                        subscribeSeatInfos.clear();
//                        subscribeSeatInfos.addAll(subscribeSeatInfos3);
//                        Log.e("SubscribeSeatTablDAOTag", "subscribeSeatInfos数据" + this.subscribeSeatInfos);
//
//                        studentInfos.get(studentInfosId).setStudentSeatId(-3);
//                        studentTableDAO.updateStudentTable(studentInfos.get(studentInfosId));
//                        Log.e("SubscribeSeatTablDAOTag", "studentInfos数据" + studentInfos);
//                        bt_floor_first_east_5.setChecked(false);
//                        SEAT_STASE = false;
//                    }
//
//                } else {
//                    bt_floor_first_east_5.setChecked(false);
//                }
//
//                if (bt_floor_first_east_6.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//
//                    judgeSeatIsTure(bt_floor_first_east_6);
//                    bt_floor_first_east_6.setChecked(true);
//
//                    if (SEAT_STASE == true) {
////                        subscribeSeatInfos.remove(studentInfos.get(studentInfosId).getStudentSeatId()-1);
//                        Log.e("SubscribeSeatTablDAOTag", "subscribeSeatInfos数据" + subscribeSeatInfos);
//                        subscribeSeatTableDAO.deleteSubscribeSeatTable(subscribeSeatInfos.get(i).getSubscribeSeatId());
//
//                        List<SubscribeSeatInfo> subscribeSeatInfos3 = subscribeSeatTableDAO.querySubscribeSeatTable();
//                        subscribeSeatInfos.clear();
//                        subscribeSeatInfos.addAll(subscribeSeatInfos3);
//                        Log.e("SubscribeSeatTablDAOTag", "subscribeSeatInfos数据" + this.subscribeSeatInfos);
//
//                        studentInfos.get(studentInfosId).setStudentSeatId(-3);
//                        studentTableDAO.updateStudentTable(studentInfos.get(studentInfosId));
//                        Log.e("SubscribeSeatTablDAOTag", "studentInfos数据" + studentInfos);
//                        bt_floor_first_east_6.setChecked(false);
//                        SEAT_STASE = false;
//                    }
//
//                } else {
//                    bt_floor_first_east_6.setChecked(false);
//                }
//
//                if (bt_floor_first_east_7.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//                    judgeSeatIsTure(bt_floor_first_east_7);
//                    bt_floor_first_east_7.setChecked(true);
//
//                    if (SEAT_STASE == true) {
////                        subscribeSeatInfos.remove(studentInfos.get(studentInfosId).getStudentSeatId()-1);
//                        Log.e("SubscribeSeatTablDAOTag", "subscribeSeatInfos数据" + subscribeSeatInfos);
//                        subscribeSeatTableDAO.deleteSubscribeSeatTable(subscribeSeatInfos.get(i).getSubscribeSeatId());
//
//                        List<SubscribeSeatInfo> subscribeSeatInfos3 = subscribeSeatTableDAO.querySubscribeSeatTable();
//                        subscribeSeatInfos.clear();
//                        subscribeSeatInfos.addAll(subscribeSeatInfos3);
//                        Log.e("SubscribeSeatTablDAOTag", "subscribeSeatInfos数据" + this.subscribeSeatInfos);
//
//                        studentInfos.get(studentInfosId).setStudentSeatId(-3);
//                        studentTableDAO.updateStudentTable(studentInfos.get(studentInfosId));
//                        Log.e("SubscribeSeatTablDAOTag", "studentInfos数据" + studentInfos);
//                        bt_floor_first_east_7.setChecked(false);
//                        SEAT_STASE = false;
//                    }
//                } else {
//                    bt_floor_first_east_7.setChecked(false);
//                }
//
//                if (bt_floor_first_east_8.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//
//                    bt_floor_first_east_8.setChecked(true);
//
//                } else {
//                    bt_floor_first_east_8.setChecked(false);
//                }
//
//                if (bt_floor_first_east_9.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//
//                    bt_floor_first_east_9.setChecked(true);
//
//                } else {
//                    bt_floor_first_east_9.setChecked(false);
//                }
//
//            }
//
//        } else if (subscribeSeatInfos.size() == 0) {
//
//            bt_floor_first_east_1.setChecked(false);
//            bt_floor_first_east_2.setChecked(false);
//            bt_floor_first_east_3.setChecked(false);
//            bt_floor_first_east_4.setChecked(false);
//            bt_floor_first_east_5.setChecked(false);
//            bt_floor_first_east_6.setChecked(false);
//            bt_floor_first_east_7.setChecked(false);
//            bt_floor_first_east_8.setChecked(false);
//            bt_floor_first_east_9.setChecked(false);
//            bt_floor_first_east_10.setChecked(false);
//
//        }

    }


    //设置96个RadioButton的点击监听事件
    @Override
    public void onClick(View view) {

        //退出座位按钮
        if (view == bt_cancel) {


            new AlertDialog.Builder(context)
                    .setMessage("确定要离开吗")
                    .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            SEAT_STASE = true;

                            getListenerRadioButton();
                        }
                    })

                    .show();

        } else if (view == bt_to_second_floor) {

            Toast.makeText(context, "第二层已经开启，请安心等待", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(context, ToSeatActivity.class));

        }

        if (view == bt_floor_first_east_1) {
            Toast.makeText(context, "东1号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_1;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
            Log.e("SeatFragemtTAG", subscribeSeatInfos.toString());

        } else if (view == bt_floor_first_east_2) {
            Toast.makeText(context, "东2号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_2;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
            Log.e("SeatFragemtTAG", subscribeSeatInfos.toString());
        } else if (view == bt_floor_first_east_3) {
            Toast.makeText(context, "东3号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_3;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_4) {
            Toast.makeText(context, "东4号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_4;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_5) {
            Toast.makeText(context, "东5号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_5;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_6) {
            Toast.makeText(context, "东6号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_6;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_7) {
            Toast.makeText(context, "东7号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_7;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_8) {
            Toast.makeText(context, "东8号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_8;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_9) {
            Toast.makeText(context, "东9号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_9;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_10) {
            Toast.makeText(context, "东10号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_10;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_11) {
            Toast.makeText(context, "东11号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_11;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_12) {
            Toast.makeText(context, "东12号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_12;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
            Log.e("SeatFragemtTAG", subscribeSeatInfos.toString());
        } else if (view == bt_floor_first_east_13) {
            Toast.makeText(context, "东13号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_13;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_14) {
            Toast.makeText(context, "东14号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_14;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_15) {
            Toast.makeText(context, "东15号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_15;
            //判断座位是否已经预约过了，如果是返回1
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_16) {
            Toast.makeText(context, "东16号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_16;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_17) {
            Toast.makeText(context, "东17号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_17;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_18) {
            Toast.makeText(context, "东18号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_18;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_19) {
            Toast.makeText(context, "东19号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_19;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_20) {
            Toast.makeText(context, "东20号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_20;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_21) {
            Toast.makeText(context, "东21号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_21;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_22) {
            Toast.makeText(context, "东22号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_22;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
            Log.e("SeatFragemtTAG", subscribeSeatInfos.toString());
        } else if (view == bt_floor_first_east_23) {
            Toast.makeText(context, "东23号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_23;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_24) {
            Toast.makeText(context, "东24号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_24;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_25) {
            Toast.makeText(context, "东25号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_25;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_26) {
            Toast.makeText(context, "东26号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_26;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_27) {
            Toast.makeText(context, "东27号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_27;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_28) {
            Toast.makeText(context, "东28号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_28;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_29) {
            Toast.makeText(context, "东29号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_29;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_30) {
            Toast.makeText(context, "东30号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_30;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_31) {
            Toast.makeText(context, "东31号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_31;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_32) {
            Toast.makeText(context, "东32号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_32;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
            Log.e("SeatFragemtTAG", subscribeSeatInfos.toString());
        } else if (view == bt_floor_first_east_33) {
            Toast.makeText(context, "东33号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_33;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_34) {
            Toast.makeText(context, "东34号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_34;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_35) {
            Toast.makeText(context, "东35号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_35;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_36) {
            Toast.makeText(context, "东36号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_36;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_37) {
            Toast.makeText(context, "东37号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_37;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_38) {
            Toast.makeText(context, "东38号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_38;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_39) {
            Toast.makeText(context, "东39号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_39;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_40) {
            Toast.makeText(context, "东40号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_40;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_41) {
            Toast.makeText(context, "东41号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_41;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_42) {
            Toast.makeText(context, "东42号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_42;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
            Log.e("SeatFragemtTAG", subscribeSeatInfos.toString());
        } else if (view == bt_floor_first_east_43) {
            Toast.makeText(context, "东43号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_43;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_44) {
            Toast.makeText(context, "东44号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_44;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_45) {
            Toast.makeText(context, "东45号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_45;
            //判断座位是否已经预约过了，如果是返回4
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_46) {
            Toast.makeText(context, "东46号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_46;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_47) {
            Toast.makeText(context, "东47号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_47;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_48) {
            Toast.makeText(context, "东48号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_48;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_49) {
            Toast.makeText(context, "东49号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_49;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_50) {
            Toast.makeText(context, "东50号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_50;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_51) {
            Toast.makeText(context, "东51号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_51;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_52) {
            Toast.makeText(context, "东52号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_52;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
            Log.e("SeatFragemtTAG", subscribeSeatInfos.toString());
        } else if (view == bt_floor_first_east_53) {
            Toast.makeText(context, "东53号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_53;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_54) {
            Toast.makeText(context, "东54号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_54;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_55) {
            Toast.makeText(context, "东55号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_55;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_56) {
            Toast.makeText(context, "东56号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_56;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_57) {
            Toast.makeText(context, "东57号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_57;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_58) {
            Toast.makeText(context, "东58号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_58;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_59) {
            Toast.makeText(context, "东59号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_59;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_60) {
            Toast.makeText(context, "东60号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_60;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_61) {
            Toast.makeText(context, "东61号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_61;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_62) {
            Toast.makeText(context, "东62号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_62;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
            Log.e("SeatFragemtTAG", subscribeSeatInfos.toString());
        } else if (view == bt_floor_first_east_63) {
            Toast.makeText(context, "东63号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_63;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_64) {
            Toast.makeText(context, "东64号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_64;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_65) {
            Toast.makeText(context, "东65号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_65;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_66) {
            Toast.makeText(context, "东66号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_66;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_67) {
            Toast.makeText(context, "东67号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_67;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_68) {
            Toast.makeText(context, "东68号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_68;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_69) {
            Toast.makeText(context, "东69号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_69;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_70) {
            Toast.makeText(context, "东70号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_70;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_71) {
            Toast.makeText(context, "东71号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_71;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_72) {
            Toast.makeText(context, "东72号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_72;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
            Log.e("SeatFragemtTAG", subscribeSeatInfos.toString());
        } else if (view == bt_floor_first_east_73) {
            Toast.makeText(context, "东73号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_73;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_74) {
            Toast.makeText(context, "东74号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_74;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_75) {
            Toast.makeText(context, "东75号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_75;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_76) {
            Toast.makeText(context, "东76号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_76;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_77) {
            Toast.makeText(context, "东77号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_77;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_78) {
            Toast.makeText(context, "东78号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_78;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_79) {
            Toast.makeText(context, "东79号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_79;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_80) {
            Toast.makeText(context, "东80号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_80;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_81) {
            Toast.makeText(context, "东81号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_81;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_82) {
            Toast.makeText(context, "东82号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_82;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
            Log.e("SeatFragemtTAG", subscribeSeatInfos.toString());
        } else if (view == bt_floor_first_east_83) {
            Toast.makeText(context, "东83号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_83;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_84) {
            Toast.makeText(context, "东84号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_84;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_85) {
            Toast.makeText(context, "东85号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_85;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_86) {
            Toast.makeText(context, "东86号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_86;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_87) {
            Toast.makeText(context, "东87号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_87;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_88) {
            Toast.makeText(context, "东88号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_88;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_89) {
            Toast.makeText(context, "东89号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_89;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_90) {
            Toast.makeText(context, "东90号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_90;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_91) {
            Toast.makeText(context, "东91号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_91;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_92) {
            Toast.makeText(context, "东92号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_92;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
            Log.e("SeatFragemtTAG", subscribeSeatInfos.toString());
        } else if (view == bt_floor_first_east_93) {
            Toast.makeText(context, "东93号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_93;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_94) {
            Toast.makeText(context, "东94号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_94;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_95) {
            Toast.makeText(context, "东95号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_95;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        } else if (view == bt_floor_first_east_96) {
            Toast.makeText(context, "东96号", Toast.LENGTH_SHORT).show();
            //设置当前的id
            radioButton = bt_floor_first_east_96;
            //判断座位是否已经预约过了，如果是返回
            judgeSeatIsTure(radioButton, false);
        }


    }

    //判断本人是不是已经预约过座位了
    private void judgeSeatIsTure(CheckBox radioButton, boolean state) {


        //当前的按钮时高亮的说明有人预约了，则直接返回，并且把状态设置为高亮
        if (radioButton.isChecked() == false && state == false) {
            radioButton.setChecked(true);
            Toast.makeText(context, "当前位置已经被预约了", Toast.LENGTH_SHORT).show();
            return;
        }

        //当前按钮的状态不是高两说明没有人预约
        if (radioButton.isChecked() == true && state == false) {

            //没有预约座位
            if (studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")) {

                //预约座位
                saveSeat(radioButton);
                return;

                //预约过座位了
            } else if (!studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")) {
                Toast.makeText(context, "别调皮，您已经预约过座位了", Toast.LENGTH_SHORT).show();
                radioButton.setChecked(false);
                return;
            }

        }

//        Log.e("SeatFragemtTAG","进来之前按钮的状态isChecked："+radioButton.isChecked());
//
//        //1.该按钮没有人预约过 且本人没有预约过座位
//        if (radioButton.isChecked()==true&&studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")&&state==false) {
//
//            Log.e("SeatFragemtTAG","该按钮没有人预约过 且本人没有预约过座位isChecked："+radioButton.isChecked()+"  "+studentInfos.get(studentInfosId).getStudentSeatNumber());
//
////            List<SubscribeSeatInfo> subscribeSeatInfos3 = subscribeSeatTableDAO.querySubscribeSeatTable();
////            //先清除数据，再添加新的数据
////            subscribeSeatInfos.clear();
////            subscribeSeatInfos.addAll(subscribeSeatInfos3);
////            getListenerRadioButton();
//            //集合不为空，有人预约过了
//            if (subscribeSeatInfos.size() != 0 && subscribeSeatInfos.size() > 0 && studentInfos.size() != 0 && studentInfos.size() > 0) {
//
//                //判断 自己登陆过 还是 别人登陆过
//                for (int i = 0; i < subscribeSeatInfos.size(); i++) {
//
//
//                    //判断 当前点击的按钮的座位号 与 座位数据库中保存的座位号 有没有相等的 看有没有有人预约过了(当前控件被预约了)
//                    if (radioButton.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//
//                        radioButton.setChecked(true);
//                        return;
//
//                    }else if(!radioButton.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
////                        radioButton.setChecked(false);
//                        if (radioButton.isChecked()==false){
//                            radioButton.setChecked(radioButton.isChecked());
//                            return;
//                        }else {
//
//                        //预约座位
//                            saveSeat(radioButton);
//                            return;
//                        }
//
//                    }
//
//                }
//
//            }
//
//            if (subscribeSeatInfos.size()==0){
//                saveSeat(radioButton);
//                return;
//            }
//
//        }
//
//
//        //2.该按钮没有人预约过  但是本人已经预约过座位了
//        if (radioButton.isChecked()==true&&!studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")&&state==false){
//
//            Log.e("SeatFragemtTAG","该按钮没有人预约过  但是本人已经预约过座位了isChecked："+radioButton.isChecked()+"  "+studentInfos.get(studentInfosId).getStudentSeatNumber());
////            List<SubscribeSeatInfo> subscribeSeatInfos3 = subscribeSeatTableDAO.querySubscribeSeatTable();
////            //先清除数据，再添加新的数据
////            subscribeSeatInfos.clear();
////            subscribeSeatInfos.addAll(subscribeSeatInfos3);
////            getListenerRadioButton();
////            Toast.makeText(context, "您已经预约过座位了，请不要调皮！"+!studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位"), Toast.LENGTH_SHORT).show();
//
//            //集合不为空，有人预约过了
//            if (subscribeSeatInfos.size() != 0 && subscribeSeatInfos.size() > 0 && studentInfos.size() != 0 && studentInfos.size() > 0) {
//
//                //判断 自己登陆过 还是 别人登陆过
//                for (int i = 0; i < subscribeSeatInfos.size(); i++) {
//
//
//                    //判断 当前点击的按钮的座位号 与 座位数据库中保存的座位号 有没有相等的 看有没有有人预约过了(当前控件被预约了)
//                    if (radioButton.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//
//                        radioButton.setChecked(true);
//                        return;
//
//                    }else if(!radioButton.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//
//
//                        if (radioButton.isChecked()==true){
//                            radioButton.setChecked(true);
//                        }else if(radioButton.isChecked()==false) {
//                            radioButton.setChecked(false);
//                        }
//
//
//                        return;
//                    }
//
//                }
//
//            }
//
////            Log.e("SeatFragemtTAG","radioButton.isChecked()22222"+radioButton.isChecked());
//
//        }
//
//
//         //3.该按钮已经被预约过了 当本人没有预约
//        if (radioButton.isChecked()==false&&state==false&&studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")){
//            Log.e("SeatFragemtTAG","该按钮已经被预约过了 当本人没有预约isChecked："+radioButton.isChecked()+"  "+studentInfos.get(studentInfosId).getStudentSeatNumber());
////            Toast.makeText(context, "该位置已经被预约了"+radioButton.isChecked(), Toast.LENGTH_SHORT).show();
////
////            List<SubscribeSeatInfo> subscribeSeatInfos3 = subscribeSeatTableDAO.querySubscribeSeatTable();
////            //先清除数据，再添加新的数据
////            subscribeSeatInfos.clear();
////            subscribeSeatInfos.addAll(subscribeSeatInfos3);
////            getListenerRadioButton();
//            //集合不为空，有人预约过了
//            if (subscribeSeatInfos.size() != 0 && subscribeSeatInfos.size() > 0 && studentInfos.size() != 0 && studentInfos.size() > 0) {
//
//                //判断 自己登陆过 还是 别人登陆过
//                for (int i = 0; i < subscribeSeatInfos.size(); i++) {
//
//
//                    //判断 当前点击的按钮的座位号 与 座位数据库中保存的座位号 有没有相等的 看有没有有人预约过了(当前控件被预约了)
//                    if (radioButton.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//
//                        radioButton.setChecked(true);
//                        return;
//
//                    }else if(!radioButton.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//                        radioButton.setChecked(false);
//                        return;
//                    }
//
//                }
//
//            }
//
////            Log.e("SeatFragemtTAG","radioButton.isChecked()233333"+radioButton.isChecked());
//            return;
//
//        }
//
//
//         //4.该按钮已经被预约过了 且本人已经预约了
//        if (radioButton.isChecked()==false&&state==false&&!studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")){
//            Log.e("SeatFragemtTAG","该按钮已经被预约过了 且本人已经预约了isChecked："+radioButton.isChecked()+"  "+studentInfos.get(studentInfosId).getStudentSeatNumber());
////            Toast.makeText(context, "该位置已经被预约了"+radioButton.isChecked(), Toast.LENGTH_SHORT).show();
////            List<SubscribeSeatInfo> subscribeSeatInfos3 = subscribeSeatTableDAO.querySubscribeSeatTable();
////            //先清除数据，再添加新的数据
////            subscribeSeatInfos.clear();
////            subscribeSeatInfos.addAll(subscribeSeatInfos3);
////
////            getListenerRadioButton();
//            //集合不为空，有人预约过了
//            if (subscribeSeatInfos.size() != 0 && subscribeSeatInfos.size() > 0 && studentInfos.size() != 0 && studentInfos.size() > 0) {
//
//                //判断 自己登陆过 还是 别人登陆过
//                for (int i = 0; i < subscribeSeatInfos.size(); i++) {
//
//                    //判断 当前点击的按钮的座位号 与 座位数据库中保存的座位号 有没有相等的 看有没有有人预约过了(当前控件被预约了)
//                    if (radioButton.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//                    Log.e("SeatFragemtTAG","集合内的isChecked1111："+radioButton.isChecked()+"  "+studentInfos.get(studentInfosId).getStudentSeatNumber());
//
//                        radioButton.setChecked(true);
//
//                        return;
//
//                    }else if(!radioButton.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//                        Log.e("SeatFragemtTAG","集合内的isChecked22222："+radioButton.isChecked()+"  "+studentInfos.get(studentInfosId).getStudentSeatNumber());
//                        radioButton.setChecked(false);
//                        return;
//                    }
//
//                }
//
//            }
//
////            Log.e("SeatFragemtTAG","radioButton.isChecked()233333"+radioButton.isChecked());
//            return;
//
//        }

        List<SubscribeSeatInfo> subscribeSeatInfos3 = subscribeSeatTableDAO.querySubscribeSeatTable();
        //先清除数据，再添加新的数据
        subscribeSeatInfos.clear();
        subscribeSeatInfos.addAll(subscribeSeatInfos3);

//            getListenerRadioButton();

        //集合不为空，有人预约过了
        if (subscribeSeatInfos.size() != 0 && subscribeSeatInfos.size() > 0 && studentInfos.size() != 0 && studentInfos.size() > 0) {

            tv_seat_number.setText(studentInfos.get(studentInfosId).getStudentSeatNumber());

            //判断 自己登陆过 还是 别人登陆过
            for (int i = 0; i < subscribeSeatInfos.size(); i++) {


                //判断 当前点击的按钮的座位号 与 座位数据库中保存的座位号 有没有相等的 看有没有有人预约过了(当前控件被预约了)
                if (radioButton.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
                    Log.e("SeatFragemtTAG", "集合内的isChecked设置初始状态：" + radioButton.isChecked() + "  " + studentInfos.get(studentInfosId).getStudentSeatNumber());
                    radioButton.setChecked(true);

                }


//                //判断 当前点击的按钮的座位号 与 座位数据库中保存的座位号 有没有相等的 看有没有有人预约过了(当前控件被预约了)
//                if (state==false&&radioButton.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//                    Log.e("SeatFragemtTAG","集合内的isChecked1111："+radioButton.isChecked()+"  "+studentInfos.get(studentInfosId).getStudentSeatNumber());
//                    radioButton.setChecked(true);
//                    if (state==false){
//                        Log.e("SeatFragemtTAG","当前位置已经被预约了"+radioButton.isChecked());
//
//                        return;
////                        if (studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")){
////                            return;
////                        }
////
////                        if (!studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")){
////                            return;
////                        }
//                    }
//
//                }
//
//                //判断 当前点击的按钮的座位号 与 座位数据库中保存的座位号 有没有相等的 看有没有有人预约过了(当前控件被预约了)
//                if (state==false&&!radioButton.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber())) {
//                    Log.e("SeatFragemtTAG","集合内的isChecked22222："+radioButton.isChecked()+"  "+studentInfos.get(studentInfosId).getStudentSeatNumber());
////                    radioButton.setChecked(false);
//
//                    if (state==false){
//                        Log.e("SeatFragemtTAG","正在进行预约座位："+radioButton.isChecked());
//                        if (SeatNumber==1){
//                            if (studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")){
//                                saveSeat(radioButton);
//                                return;
//                            }else if (!studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")){
//                                Toast.makeText(context, "您已经与预约过座位了", Toast.LENGTH_SHORT).show();
//                                radioButton.setChecked(radioButton.isChecked());
//                            }
//
//                        }if (SeatNumber==2){
//                            if (studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")){
//                                saveSeat(radioButton);
//                                return;
//                            }else if (!studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")){
//                                Toast.makeText(context, "您已经与预约过座位了", Toast.LENGTH_SHORT).show();
//                                radioButton.setChecked(radioButton.isChecked());
//                                return;
//                            }
//                        }if (SeatNumber==3){
//                            if (studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")){
//                                saveSeat(radioButton);
//                                return;
//                            }else if (!studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")){
//                                Toast.makeText(context, "您已经与预约过座位了", Toast.LENGTH_SHORT).show();
//                                radioButton.setChecked(radioButton.isChecked());
//                                return;
//                            }
//                        }if (SeatNumber==4){
//                            if (studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")){
//                                saveSeat(radioButton);
//                                return;
//                            }else if (!studentInfos.get(studentInfosId).getStudentSeatNumber().equals("没有预约座位")){
//                                Toast.makeText(context, "您已经与预约过座位了", Toast.LENGTH_SHORT).show();
//                                radioButton.setChecked(radioButton.isChecked());
//                                return;
//                            }
//                        }
//
//                    }
//
//                }


                //点击离开时
                if (radioButton.getText().toString().equals(studentInfos.get(studentInfosId).getStudentSeatNumber()) && radioButton.getText().toString().equals(subscribeSeatInfos.get(i).getSubscribeSeatNumberAndStudentNumber()) && SEAT_STASE == true) {

                    //删除表数据
                    subscribeSeatTableDAO.deleteSubscribeSeatTable(subscribeSeatInfos.get(i).getSubscribeSeatId());
                    //数据集合已经改变，重新查询
                    List<SubscribeSeatInfo> subscribeSeatInfos5 = subscribeSeatTableDAO.querySubscribeSeatTable();
                    //先清除数据，再添加新的数据
                    subscribeSeatInfos.clear();
                    subscribeSeatInfos.addAll(subscribeSeatInfos5);

                    //把学生的位置置为空,代表没有预约过座位
                    studentInfos.get(studentInfosId).setStudentSeatNumber("没有预约座位");
                    tv_seat_number.setText(studentInfos.get(studentInfosId).getStudentSeatNumber());
                    //把点击的状态设置为false
                    SEAT_STASE = false;
                    //把当前控件设为false
                    radioButton.setChecked(false);


                }

            }

        } else if (subscribeSeatInfos.size() == 0 && state == false) {

            saveSeat(radioButton);

        }

    }


    //预约座位
    private void saveSeat(final CheckBox radioButton) {


        final Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH) + 1;
        final int hour = calendar.get(Calendar.HOUR_OF_DAY);
        final int minute = calendar.get(Calendar.MINUTE);
        final int second = calendar.get(Calendar.SECOND);

        new AlertDialog.Builder(context)
                .setMessage("是否预约当前座位" + radioButton.getText().toString())
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {

                    private SubscribeSeatInfo subscribeSeatInfo;

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        subscribeSeatInfo = new SubscribeSeatInfo(
                                -1,
                                radioButton.getText().toString(),
                                studentInfos.get(studentInfosId).getStudentName(),
                                studentInfos.get(studentInfosId).getStudentNumber(),
                                studentInfos.get(studentInfosId).getStudentId(),
                                hour + ":" + minute + ":" + second,
                                year + "/" + month + "/" + day
                        );
                        //把数据添加到座位的表中
                        subscribeSeatTableDAO.insertSubscribeSeatTable(subscribeSeatInfo);
                        //把数据添加到座位的集合
                        List<SubscribeSeatInfo> subscribeSeatInfos1 = subscribeSeatTableDAO.querySubscribeSeatTable();
                        subscribeSeatInfos.clear();
                        subscribeSeatInfos.addAll(subscribeSeatInfos1);

                        //更新学生的座位信息2
                        StudentInfo studentInfo2 = studentInfos.get(studentInfosId);
                        studentInfo2.setStudentSeatNumber(radioButton.getText().toString());
                        studentTableDAO.updateStudentTable(studentInfo2);


                        radioButton.setChecked(true);
                        tv_seat_number.setText(studentInfos.get(studentInfosId).getStudentSeatNumber());

                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        radioButton.setChecked(false);

                    }
                })
                .show();

    }
}
