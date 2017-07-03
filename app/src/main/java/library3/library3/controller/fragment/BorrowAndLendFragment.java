package library3.library3.controller.fragment;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

import library3.library3.R;
import library3.library3.controller.adapter.LisiViewBorrowAndLendAdapter;
import library3.library3.controller.base.BaseFragment;
import library3.library3.model.bean.BorrowAndReadInfo;
import library3.library3.model.dao.BorrowAndReadTableDAO;

/**
 * Created by San on 2017/4/10.
 */
public class BorrowAndLendFragment extends BaseFragment {

    //初始化控件
    @ViewInject(R.id.listViewBorrowAndLend)
    private ListView listViewBorrowAndLend;
    @ViewInject(R.id.tv_collection_loading)
    private TextView tv_collection_loading;


    private LisiViewBorrowAndLendAdapter lisiViewBorrowAndLendAdapter;
    private int position;

    public BorrowAndLendFragment(List<BorrowAndReadInfo> borrowAndReadInfo,
                                 BorrowAndReadTableDAO borrowAndReadTableDAO,
                                 int studentInfosId) {
        super(borrowAndReadInfo, borrowAndReadTableDAO, studentInfosId);
    }


    @Override
    public View initView() {

        View viewBorrowAndLend = View.inflate(context, R.layout.borrowandlend_res, null);

        x.view().inject(this, viewBorrowAndLend);

        return viewBorrowAndLend;
    }

    @Override
    protected void initData() {

        if (borrowAndReadInfo.size() != 0) {
            tv_collection_loading.setVisibility(View.GONE);

        }
        lisiViewBorrowAndLendAdapter = new LisiViewBorrowAndLendAdapter(context, borrowAndReadInfo, borrowAndReadTableDAO, position);
        listViewBorrowAndLend.setAdapter(lisiViewBorrowAndLendAdapter);


        listViewBorrowAndLend.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {

                contextMenu.add(0, 1, 0, "还书");
                contextMenu.add(0, 2, 0, "取消");

                AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
                position = info.position;

//                borrowAndReadTableDAO.deleteBorrowAndReadTable(borrowAndReadInfo.get(position).getBorrowAndReadId());
//                borrowAndReadInfo.remove(borrowAndReadInfo.get(position));
//                lisiViewBorrowAndLendAdapter.notifyDataSetChanged();

            }
        });



    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case 1:
                borrowAndReadTableDAO.deleteBorrowAndReadTable(borrowAndReadInfo.get(position).getBorrowAndReadId());
                borrowAndReadInfo.remove(position);
                lisiViewBorrowAndLendAdapter.notifyDataSetChanged();
                Toast.makeText(context, "还书成功", Toast.LENGTH_SHORT).show();

                if (borrowAndReadInfo.size()==0){
                    tv_collection_loading.setVisibility(View.VISIBLE);
                }
                break;
            case 2:


                break;

        }

        return super.onContextItemSelected(item);
    }

}
