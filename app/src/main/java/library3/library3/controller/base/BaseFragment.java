package library3.library3.controller.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import library3.library3.model.bean.BorrowAndReadInfo;
import library3.library3.model.dao.BorrowAndReadTableDAO;

/**
 * Created by San on 2017/4/10.
 */
public abstract class BaseFragment extends Fragment {


    public  int adminInfosId;
    public int studentInfosId;
    public Activity context;
    public  List<BorrowAndReadInfo> borrowAndReadInfo;
    public  BorrowAndReadTableDAO borrowAndReadTableDAO;

    public BaseFragment(List<BorrowAndReadInfo> borrowAndReadInfo, BorrowAndReadTableDAO borrowAndReadTableDAO,int studentInfosId) {

        this.borrowAndReadInfo = borrowAndReadInfo;
        this.borrowAndReadTableDAO = borrowAndReadTableDAO;
        this.studentInfosId=studentInfosId;
        this.adminInfosId=adminInfosId;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context = getActivity();

        borrowAndReadTableDAO=new BorrowAndReadTableDAO(context);
        borrowAndReadInfo= borrowAndReadTableDAO.queryBorrowAndReadTable();
        studentInfosId = context.getIntent().getIntExtra("studentInfosId", 0);
//        context.getIntent().getIntExtra()


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return initView();

    }

    public abstract View initView();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();
    }

    protected abstract void initData();
}
