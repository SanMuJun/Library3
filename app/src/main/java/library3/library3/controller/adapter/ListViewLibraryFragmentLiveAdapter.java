package library3.library3.controller.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.xutils.x;

import java.util.List;

import library3.library3.R;
import library3.library3.model.bean.BookBean;
import library3.library3.model.bean.BorrowAndReadInfo;
import library3.library3.model.bean.CollectionInfo;
import library3.library3.model.dao.BorrowAndReadTableDAO;
import library3.library3.model.dao.CollectionTableDAO;

/**
 * Created by San on 2017/4/11.
 * 生活图书列表
 */
public class ListViewLibraryFragmentLiveAdapter extends BaseAdapter {

    private  Context context;
    private  List<BookBean.Book> bookListData;
    private  BorrowAndReadTableDAO borrowAndReadTableDAO;
    private  CollectionTableDAO collectionTableDAO;

    private  List<BookBean.Book.Live> live;

    public ListViewLibraryFragmentLiveAdapter(
            Context context,
            List<BookBean.Book> bookListData) {
        this.context=context;

        //获取收藏的数据库数据
        collectionTableDAO = new CollectionTableDAO(context);
        //获取借阅的数据库数据
        borrowAndReadTableDAO = new BorrowAndReadTableDAO(context);
        this.bookListData=bookListData;
        live = bookListData.get(1).getLive();

    }


    @Override
    public int getCount() {

        return live.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder=new ViewHolder();

        if (view==null){

            view=View.inflate(context, R.layout.listview_libraryframent_res,null);

            //初始化所有listView的控件
            viewHolder.iv_book_image= (ImageView) view.findViewById(R.id.iv_book_image);
            viewHolder.tv_book_name= (TextView) view.findViewById(R.id.tv_book_name);
            viewHolder.tv_book_author= (TextView) view.findViewById(R.id.tv_book_author);
            viewHolder.tv_book_publish= (TextView) view.findViewById(R.id.tv_book_publish);
            viewHolder.tv_book_publicationtime= (TextView) view.findViewById(R.id.tv_book_publicationtime);

            viewHolder.bt_listview_borrowlend= (Button) view.findViewById(R.id.bt_listview_borrowlend);
            viewHolder.bt_listview_collection= (Button) view.findViewById(R.id.bt_listview_collection);

            view.setTag(viewHolder);

        }else {
            viewHolder= (ViewHolder) view.getTag();
        }
        //设置名字/作者/出版社/出版时间 的具体数据
        viewHolder.tv_book_name.setText("书名："+live.get(i).bookName);
        viewHolder.tv_book_author.setText("作者："+live.get(i).bookAuthor);
        viewHolder.tv_book_publish.setText("出版社："+live.get(i).bookPulish);
        viewHolder.tv_book_publicationtime.setText("出版时间："+live.get(i).bookPublicationTime);

        x.image().bind(viewHolder.iv_book_image,live.get(i).bookImageUrl);

        //借阅的按钮的数据设置/添加到数据库
        viewHolder.bt_listview_borrowlend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, "借阅： "+live.get(i).bookName+"  成功", Toast.LENGTH_SHORT).show();

                BorrowAndReadInfo borrowAndReadInfo = new BorrowAndReadInfo(i, live.get(i).getBookName(), live.get(i).getBookAuthor(),
                        live.get(i).getBookImageUrl(), null, null, null);
                borrowAndReadTableDAO.insertBorrowAndReadTable(borrowAndReadInfo);

            }
        });

        //收藏的按钮数据设置/添加到数据库
        viewHolder.bt_listview_collection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CollectionInfo collectionInfo = new CollectionInfo(-1,
                        live.get(i).getBookName(),
                        live.get(i).getBookAuthor(),
                        live.get(i).getBookFloor(),
                        live.get(i).getBookImageUrl());
                collectionTableDAO.insertCollectionTable(collectionInfo);

                Toast.makeText(context, "收藏： "+live.get(i).bookName+"  成功", Toast.LENGTH_SHORT).show();

            }
        });


        return view;
    }

    class ViewHolder{

        ImageView iv_book_image;
        TextView tv_book_name;
        TextView tv_book_author;
        TextView tv_book_publish;
        TextView tv_book_publicationtime;
        Button bt_listview_borrowlend;
        Button bt_listview_collection;


    }

}
