package library3.library3.controller.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import library3.library3.R;
import library3.library3.model.bean.RecommendationInfo;

/**
 * Created by San on 2017/4/15.
 */
public class ListViewRecommendationAdapter extends BaseAdapter {
    private final List<RecommendationInfo> recommendationInfos;
    private final Context context;

    public ListViewRecommendationAdapter(Context context, List<RecommendationInfo> recommendationInfos) {

        this.recommendationInfos=recommendationInfos;
        this.context=context;

    }


    @Override
    public int getCount() {
        return recommendationInfos.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder=new ViewHolder();
        if (view==null){

            view=View.inflate(context, R.layout.list_recommendation_res,null);

            viewHolder.tv_recommendation_bookname= (TextView) view.findViewById(R.id.tv_recommendation_bookname);
            viewHolder.tv_recommendation_author= (TextView) view.findViewById(R.id.tv_recommendation_author);
            viewHolder.tv_recommendation_reason= (TextView) view.findViewById(R.id.tv_recommendation_reason);
            viewHolder.tv_recommendation_person= (TextView) view.findViewById(R.id.tv_recommendation_person);
            viewHolder.tv_recommendation_time= (TextView) view.findViewById(R.id.tv_recommendation_time);

            view.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) view.getTag();
        }

        viewHolder.tv_recommendation_bookname.setText("书名："+recommendationInfos.get(i).getRecommendationBookName());
        viewHolder.tv_recommendation_author.setText("作者："+recommendationInfos.get(i).getRecommendationBookAuthor());
        viewHolder.tv_recommendation_reason.setText("推荐理由："+recommendationInfos.get(i).getRecommendationBookReason());
        viewHolder.tv_recommendation_person.setText("推荐人："+recommendationInfos.get(i).getRecommendationPerson());
        viewHolder.tv_recommendation_time.setText("时间："+recommendationInfos.get(i).getRecommendationBookDate());

        return view;
    }

    class ViewHolder{

        TextView tv_recommendation_bookname;
        TextView tv_recommendation_author;
        TextView tv_recommendation_reason;
        TextView tv_recommendation_person;
        TextView tv_recommendation_time;

    }
}
