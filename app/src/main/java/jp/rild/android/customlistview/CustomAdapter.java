package jp.rild.android.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rild on 16/02/28.
 */
public class CustomAdapter extends ArrayAdapter<Item> {
    LayoutInflater mInflater;

    public CustomAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public CustomAdapter(Context context, int resource, List<Item> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder viewHolder;

        if (convertView == null) {
            mInflater = LayoutInflater.from(getContext());
            convertView = mInflater.inflate(R.layout.item_main, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Item item = getItem(position);

        if (item != null) {
            viewHolder.titleTextView.setText(item.title);
            viewHolder.contentTextView.setText(item.content);
        }

        return convertView;
    }

    private class ViewHolder{
        TextView titleTextView;
        TextView contentTextView;
        public ViewHolder(View view) {
            titleTextView = (TextView) view.findViewById(R.id.item_title);
            contentTextView = (TextView) view.findViewById(R.id.item_content);
        }
    }
}
