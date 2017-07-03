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
import library3.library3.model.bean.BookInfo;
import library3.library3.model.bean.BorrowAndReadInfo;
import library3.library3.model.bean.CollectionInfo;
import library3.library3.model.dao.BorrowAndReadTableDAO;
import library3.library3.model.dao.CollectionTableDAO;

/**
 * Created by San on 2017/4/13.
 */
public class ListViewLibraryFragmentSearch extends BaseAdapter {
    private final Context context;
    private final List<BookInfo> bookSearchDataInfo;
    private final BorrowAndReadTableDAO borrowAndReadTableDAO;
    private final CollectionTableDAO collectionTableDAO;


    public ListViewLibraryFragmentSearch(Context context, List<BookInfo> bookSearchDataInfo) {
        this.context=context;
        this.bookSearchDataInfo=  bookSearchDataInfo;

        borrowAndReadTableDAO = new BorrowAndReadTableDAO(context);
        collectionTableDAO = new CollectionTableDAO(context);

    }

    @Override
    public int getCount() {
        return bookSearchDataInfo.size();
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
        viewHolder.tv_book_name.setText("书名："+bookSearchDataInfo.get(i).getBookName());
        viewHolder.tv_book_author.setText("作者："+bookSearchDataInfo.get(i).getBookAuthor());
        viewHolder.tv_book_publish.setText("出版社："+bookSearchDataInfo.get(i).getBookPulish());
        viewHolder.tv_book_publicationtime.setText("出版时间："+bookSearchDataInfo.get(i).getBookPublicationTime());

        x.image().bind(viewHolder.iv_book_image,bookSearchDataInfo.get(i).getBookImageUrl());

        //借阅的按钮的数据设置/添加到数据库
        viewHolder.bt_listview_borrowlend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, "借阅： "+bookSearchDataInfo.get(i).getBookName()+"  成功", Toast.LENGTH_SHORT).show();

                BorrowAndReadInfo borrowAndReadInfo = new BorrowAndReadInfo(
                        i,
                        bookSearchDataInfo.get(i).getBookName(),
                        bookSearchDataInfo.get(i).getBookAuthor(),
                        bookSearchDataInfo.get(i).getBookImageUrl(),
                        null, null, null);
                borrowAndReadTableDAO.insertBorrowAndReadTable(borrowAndReadInfo);

            }
        });

        //收藏的按钮数据设置/添加到数据库
        viewHolder.bt_listview_collection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CollectionInfo collectionInfo = new CollectionInfo(-1,
                        bookSearchDataInfo.get(i).getBookName(),
                        bookSearchDataInfo.get(i).getBookAuthor(),
                        bookSearchDataInfo.get(i).getBookFloor(),
                        bookSearchDataInfo.get(i).getBookImageUrl());
                collectionTableDAO.insertCollectionTable(collectionInfo);

                Toast.makeText(context, "收藏： "+bookSearchDataInfo.get(i).getBookName()+"  成功", Toast.LENGTH_SHORT).show();

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
