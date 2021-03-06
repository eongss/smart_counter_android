package com.bang.project;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChatAdapter extends BaseAdapter {

    private LayoutInflater inflater;  // 추출한 inflate를 저장할 변수
    private Context context; // inflater를 추출하기 위한 화면 정보
    private int layout; // 템플릿의 id
    private ArrayList<QuestVO> data; // 꾸밀 데이터

    public ChatAdapter(Context context, int layout, ArrayList<QuestVO> data) {
        this.context = context;
        this.layout = layout;
        this.data = data;

        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {return data.size();}

    @Override
    public Object getItem(int position) {return data.get(position); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView =inflater.inflate(layout,parent,false);
        }

        ImageView q_check = convertView.findViewById(R.id.q_check);
        TextView q_name = convertView.findViewById(R.id.q_name);
        TextView q_exp = convertView.findViewById(R.id.q_exp);



        //리스트뷰에 띄울 데이터 삽입하는 부분
        q_name.setText(data.get(position).getQ_name()); //getQ_text1


        if(data.get(position).getQ_check().equals("Y")) {
           q_check.setImageResource(R.drawable.quest_check);
           q_exp.setTextColor(Color.parseColor("#66C266"));
        } else {
            q_check.setImageResource(R.drawable.quest_check_no);
        }

        q_exp.setText(data.get(position).getQ_exp()+" Exp");

        return convertView;
    }
}
