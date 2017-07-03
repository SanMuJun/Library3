package library3.library3.controller.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import library3.library3.R;
import library3.library3.model.bean.SuggestionInfo;

/**
 * Created by San on 2017/4/14.
 */
public class ListViewSuggestionAdapter extends BaseAdapter {


    private final Context context;
    private final List<SuggestionInfo> suggestionInfo;

    public ListViewSuggestionAdapter(Context context, List<SuggestionInfo> suggestionInfo) {
        this.context = context;
        this.suggestionInfo = suggestionInfo;
    }


    @Override
    public int getCount() {
        return suggestionInfo.size();
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

        ViewHolder viewHolder = new ViewHolder();
        if (view == null) {

            view = View.inflate(context, R.layout.list_suggestbox_context_res, null);

            viewHolder.tv_suggestion_name = (TextView) view.findViewById(R.id.tv_suggestion_name);
            viewHolder.tv_suggestion_context = (TextView) view.findViewById(R.id.tv_suggestion_context);
            viewHolder.tv_suggestion_time = (TextView) view.findViewById(R.id.tv_suggestion_time);

            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.tv_suggestion_name.setText("提建议者："+suggestionInfo.get(i).getSuggestionName());
        viewHolder.tv_suggestion_context.setText("建议/意见："+suggestionInfo.get(i).getSuggestionContent());
        viewHolder.tv_suggestion_time.setText("时间："+suggestionInfo.get(i).getSuggestionDate());

        return view;
    }

    class ViewHolder {

        TextView tv_suggestion_name;
        TextView tv_suggestion_context;
        TextView tv_suggestion_time;


    }
}