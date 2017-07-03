package library3.library3.controller.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.xutils.x;

import java.util.Calendar;
import java.util.List;

import library3.library3.R;
import library3.library3.model.bean.BorrowAndReadInfo;
import library3.library3.model.dao.BorrowAndReadTableDAO;

/**
 * Created by San on 2017/4/11.
 */
public class LisiViewBorrowAndLendAdapter extends BaseAdapter {

    private final int position;
    private  List<BorrowAndReadInfo> borrowAndReadInfo;
    private  BorrowAndReadTableDAO borrowAndReadTableDAO;

    private  Context context;

    public LisiViewBorrowAndLendAdapter(Context context, List<BorrowAndReadInfo> borrowAndReadInfo, BorrowAndReadTableDAO borrowAndReadTableDAO, int position) {

        this.context=context;
        this.borrowAndReadInfo=borrowAndReadInfo;
        this.borrowAndReadTableDAO=borrowAndReadTableDAO;
        this.position=position;

    }

    @Override
    public int getCount() {


        return borrowAndReadInfo.size();
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

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int monthBack=month+2;

        ViewHolder viewHolder=new ViewHolder();

        if (view==null){
            view=View.inflate(context, R.layout.listview_borrowandlend_res,null);

            viewHolder.iv_book_image= (ImageView) view.findViewById(R.id.iv_book_image);
            viewHolder.tv_book_name= (TextView) view.findViewById(R.id.tv_book_name);
            viewHolder.tv_book_author= (TextView) view.findViewById(R.id.tv_book_author);

            viewHolder.tv_borrow_data= (TextView) view.findViewById(R.id.tv_borrow_data);
            viewHolder.tv_back_data= (TextView) view.findViewById(R.id.tv_back_data);
//            viewHolder.tv_remain_date= (TextView) view.findViewById(R.id.tv_remain_date);
//            viewHolder.bt_back_book= (TextView) view.findViewById(R.id.bt_back_book);

            view.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) view.getTag();
        }

        x.image().bind(viewHolder.iv_book_image,borrowAndReadInfo.get(i).getBorrowAndReadBookImageUrl());
        viewHolder.tv_book_name.setText("书名："+borrowAndReadInfo.get(i).getBorrowAndReadBookName());
        viewHolder.tv_book_author.setText("作者："+borrowAndReadInfo.get(i).getBorrowAndReadBookAuthor());

        viewHolder.tv_borrow_data.setText("借书日期："+year+"/"+month+"/"+day);
        viewHolder.tv_back_data.setText("截止归还日期："+year+"/"+monthBack+"/"+day);
//        viewHolder.tv_remain_date.setText("剩余天数:"+borrowAndReadInfo.get(i).getBorrowAndReadBookRemainDate());

        //提前换书的button
//        viewHolder.bt_back_book.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Toast.makeText(context, "归还:  "+borrowAndReadInfo.get(i).getBorrowAndReadBookName()+"成功", Toast.LENGTH_SHORT).show();
//
//
//                borrowAndReadInfo.remove(borrowAndReadInfo.get(position));
//                Log.e("TAG","borrowAndReadInfo.get(position)"+borrowAndReadInfo.get(position).toString());
////            if (borrowAndReadInfo.size() == 0) {
////                borrowAndReadTableDAO.deleteBorrowAndReadTable(borrowAndReadInfo.get(i-1));
////            }
//                borrowAndReadTableDAO.deleteBorrowAndReadTable(borrowAndReadInfo.get(position).getBorrowAndReadId());
//                Log.e("TAG","borrowAndReadInfo.get(position)"+borrowAndReadInfo.get(position).toString());
//                notifyDataSetChanged();
//
//            }
//        });

        return view;
    }

    class ViewHolder{

        ImageView iv_book_image;

        TextView tv_book_name;
        TextView tv_book_author;
        TextView tv_borrow_data;
        TextView tv_back_data;
//        TextView tv_remain_date;

//        Button bt_back_book;

    }


}
