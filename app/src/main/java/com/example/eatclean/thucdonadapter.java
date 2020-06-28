package com.example.eatclean;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class thucdonadapter {
    Context myContext;
    int myLayout;
    ArrayList<MonAn> thucdonsList;

    public thucdonadapter(Context context, int myLayout, ArrayList<MonAn> thucdonsList) {
        this.myContext = context;
        this.myLayout = myLayout;
        this.thucdonsList = thucdonsList;
    }

    public int getCount() {
        return thucdonsList.size();
    }


    public Object getItem(int position) {
        return null;
    }


    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView==null)
        {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(myContext).inflate(R.layout.itemthucdon,parent,false);
            holder.anh = convertView.findViewById(R.id.itemsanh);
            holder.mota  = convertView.findViewById(R.id.itemsmota);

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }

        MonAn  monAn = thucdonsList.get(position);


        holder.mota.setText(monAn.getMota());
        holder.anh.setBackgroundResource(R.drawable.b1);


        // set anh
//        byte [] Anh = nv.getAnh();
//        Bitmap bitmap = BitmapFactory.decodeByteArray(Anh,0,Anh.length);
//        holder.AnhNV.setImageBitmap(bitmap);
//
//        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        convertView = inflater.inflate(myLayout,null);

        return convertView;
    }
    // view holder giúp listview custom không phải load lại danh sách
    // nếu dùng listview custom cũ thì load lại danh sách rất lag
    public class ViewHolder{
        ImageView anh;
        TextView mota;
    }
}
