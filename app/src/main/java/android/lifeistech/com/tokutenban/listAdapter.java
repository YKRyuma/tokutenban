package android.lifeistech.com.tokutenban;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.ImageViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class listAdapter extends ArrayAdapter<list> {
        List<list>mlist;

        public listAdapter(Context context,int layoutResourceId, List<list> objects){
            super(context,layoutResourceId,objects);

            mlist = objects;
        }

        @Override
        public int getCount(){
            return mlist.size();
        }

        @Override
        public list getItem(int position){
            return mlist.get(position);
        }

        @Override
        public View getView(final int position, View convertView,ViewGroup parent){
            final ViewHolder viewHolder;

            if (convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list,null);
                viewHolder = new ViewHolder(convertView);
                convertView.setTag(viewHolder);
            }else {
                viewHolder = (ViewHolder)convertView.getTag();
            }

            final list item=getItem(position);
            viewHolder.point1TextView.setText(item.point1);
            viewHolder.point2TextView.setText(item.point2);
            return convertView;
        }

        public static class ViewHolder{
            TextView point1TextView;
            TextView point2TextView;

            public ViewHolder(View view){
                point1TextView = (TextView)view.findViewById(R.id.point1);
                point2TextView = (TextView)view.findViewById(R.id.point2);

            }
        }
}
