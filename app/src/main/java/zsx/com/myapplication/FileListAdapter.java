package zsx.com.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * 
 * @author xingx
 * @TODO 菜单文件列表适配器
 * @TIME 2015年7月23日 下午3:06:22
 */
public class FileListAdapter extends BaseExpandableListAdapter {

	final String TAG = FileListAdapter.class.getName();

	private Context mContext;

	FileListAdapter(Context context){
		mContext=context;
	}

	// 一级菜单目录总数，盘符列表
	@Override
	public int getGroupCount() {
		return  10;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return 10;
	}

	// 返回一级菜单目录
	@Override
	public Object getGroup(int groupPosition) {
		return null;
	}

	// 返回单个文件单个实体
	@Override
	public Object getChild(int groupPosition, int childPosition) {

		return null;
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	// 盘符目录列表
	@Override
	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		Holder holder ;
		if (convertView == null) {
			holder = new Holder();
			convertView = LayoutInflater.from(mContext).inflate(R.layout.layout_item, null);
			holder.textView = (TextView) convertView.findViewById(R.id.text);
			convertView.setTag(holder);
		} else {
			holder = (Holder) convertView.getTag();
		}
		holder.textView.setText("我是："+groupPosition);
		// 当convertView 的子item标签为-1时表示当前选中item为group选项
		convertView.setTag(R.id.text, groupPosition);// 添加组item标签
		convertView.setTag(R.id.text, -1);// 添加子item标签
		return convertView;
	}

	// 所有文件目录列表
	@Override
	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView,
			ViewGroup parent) {
		Holder holder ;
		if (convertView == null) {
			holder = new Holder();
			convertView = LayoutInflater.from(mContext).inflate(R.layout.layout_item, null);
			holder.textView = (TextView) convertView.findViewById(R.id.text);
			convertView.setTag(holder);
		} else {
			holder = (Holder) convertView.getTag();
		}
		holder.textView.setText("我是zi："+groupPosition);
		return convertView;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}

	static class Holder {
		TextView textView;
	}

}
