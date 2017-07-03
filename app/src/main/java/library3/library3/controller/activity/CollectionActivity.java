package library3.library3.controller.activity;

import android.app.Activity;
import android.os.Bundle;
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
import library3.library3.controller.adapter.ListViewCollection;
import library3.library3.model.bean.CollectionInfo;
import library3.library3.model.dao.CollectionTableDAO;

public class CollectionActivity extends Activity {

    @ViewInject(R.id.listViewCollection)
    private ListView listViewCollection;

    @ViewInject(R.id.tv_collection_loading)
    private TextView tv_collection_loading;

    @ViewInject(R.id.tv_back)
    private TextView tv_back;

    private List<CollectionInfo> collectionInfos;
    private CollectionTableDAO collectionTableDAO;
    private int position;
    private ListViewCollection listViewCollectionAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        //将视图注入xUtils
        x.view().inject(this);

        //获取收藏的数据库数据
        collectionTableDAO = new CollectionTableDAO(this);
        collectionInfos = collectionTableDAO.queryCollectionTable();

        //获取ListView
        getListViewCollection();

        if(collectionInfos.size()!=0){
            tv_collection_loading.setVisibility(View.GONE);
        }

        //点击返回
        tv_back.setOnClickListener(new OnClickLisetnerBack());

    }

    private void getListViewCollection() {

        listViewCollectionAdapter = new ListViewCollection(this,collectionInfos,collectionTableDAO);
        listViewCollection.setAdapter(listViewCollectionAdapter);

        //设置长按弹出删除弹框
        listViewCollection.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {

                contextMenu.add(0, 1, 0, "删除收藏");
                contextMenu.add(0, 2, 0, "取消");

                AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
                position = info.position;

            }
        });

    }

    //删除收藏的弹框设置
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case 1:
                collectionTableDAO.deleteCollectionTable(collectionInfos.get(position).getCollectionId());
                collectionInfos.remove(position);
                listViewCollectionAdapter.notifyDataSetChanged();

                if(collectionInfos.size()==0){
                    tv_collection_loading.setVisibility(View.VISIBLE);
                }

                Toast.makeText(this, "已删除该书 ", Toast.LENGTH_SHORT).show();

                break;
            case 2:

                break;
        }

        return super.onContextItemSelected(item);
    }

    //点击返回主页面
    private class OnClickLisetnerBack implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            finish();
        }
    }
}
