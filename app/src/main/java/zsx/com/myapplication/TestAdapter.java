package zsx.com.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by moram on 2017/2/16.
 */

public class TestAdapter extends BaseAdapter {

    private Context mContext;

    TestAdapter(Context context){
        this.mContext=context;
    }

    @Override
    public int getCount() {
        return 20;
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
        ViewHolder holder ;
        if(view==null){
            view= LayoutInflater.from(mContext).inflate(R.layout.layout_item,null,false);
            holder=new ViewHolder();
            holder.text=(TextView)view.findViewById(R.id.text);
        }else{
            holder=(ViewHolder) view.getTag();
        }
        if(i%2==0){
            view.setMinimumHeight(100);
        }else{
            view.setMinimumHeight(50);
        }

        return view;
    }

    class ViewHolder{
        TextView text;
    }
}
