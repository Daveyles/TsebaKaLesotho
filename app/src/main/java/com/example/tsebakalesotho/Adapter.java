package com.example.tsebakalesotho;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<Integer> data0; //images
    private List<String> data; //titles
    private List<String> data2; //descriptions activity 1

    //facts
    private List<String> data3;
    private List<String> data4;
    private List<String> data5;


    Adapter(Context context, List<String> data,List<String> data2,List<String> data3,List<String> data4,List<String> data5, List<Integer> data0){
        this.layoutInflater = LayoutInflater.from(context);
        this.data0= data0;
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= layoutInflater.inflate(R.layout.custom_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        int image = data0.get(i);
        String title = data.get(i);
        String description = data2.get(i);
        String fact1 = data3.get(i);


        viewHolder.imageView.setImageResource(image);
        viewHolder.textTitle.setText(title);
        viewHolder.description.setText(description);


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView,mainView;
        TextView textTitle,description;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(),Details.class);
                    i.putExtra("image",data0.get(getBindingAdapterPosition()));
                    i.putExtra("title",data.get(getBindingAdapterPosition()));
                    i.putExtra("fact1",data3.get(getBindingAdapterPosition()));
                    i.putExtra("fact2",data4.get(getBindingAdapterPosition()));
                    i.putExtra("fact3",data5.get(getBindingAdapterPosition()));


                    v.getContext().startActivity(i);
                }
            });
            mainView=itemView.findViewById(R.id.mainImage);
            imageView = itemView.findViewById(R.id.imageView);
            textTitle = itemView.findViewById(R.id.myText1);
            description = itemView.findViewById(R.id.myText2);




        }
    }
}
