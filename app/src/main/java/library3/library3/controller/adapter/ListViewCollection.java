package library3.library3.controller.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.xutils.x;

import java.util.List;

import library3.library3.R;
import library3.library3.model.bean.CollectionInfo;
import library3.library3.model.dao.CollectionTableDAO;

/**
 * Created by San on 2017/4/13.
 */
public class ListViewCollection extends BaseAdapter {


    private  CollectionTableDAO collectionTableDAO;
    private  List<CollectionInfo> collectionInfos;
    private  Context context;

    public ListViewCollection(Context context, List<CollectionInfo> collectionInfos, CollectionTableDAO collectionTableDAO) {
        this.context=context;
        this.collectionInfos=collectionInfos;
        this.collectionTableDAO=collectionTableDAO;
    }

    @Override
    public int getCount() {
        return collectionInfos.size();
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
            view=View.inflate(context, R.layout.listview_collection_res,null);

            viewHolder.iv_book_image= (ImageView) view.findViewById(R.id.iv_book_image);

            viewHolder.tv_book_name= (TextView) view.findViewById(R.id.tv_book_name);
            viewHolder.tv_book_author= (TextView) view.findViewById(R.id.tv_book_author);
            viewHolder.tv_book_location= (TextView) view.findViewById(R.id.tv_book_location);

            view.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) view.getTag();
        }

        x.image().bind(viewHolder.iv_book_image,collectionInfos.get(i).getCollectionBookContent());

        viewHolder.tv_book_name.setText("书名："+collectionInfos.get(i).getCollectionBookName());
        viewHolder.tv_book_author.setText("作者："+collectionInfos.get(i).getCollectionBookAuthor());
        viewHolder.tv_book_location.setText("图书所在的位置："+collectionInfos.get(i).getCollectionBookLocation());

        return view;
    }

    class ViewHolder{

        ImageView iv_book_image;

        TextView tv_book_name;
        TextView tv_book_author;
        TextView tv_book_location;

    }

}
