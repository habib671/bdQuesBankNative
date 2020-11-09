package com.example.bdjobprep.adapterClass;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bdjobprep.R;

public class eeeAdapterClass extends RecyclerView.Adapter<eeeAdapterClass.ViewHolder> {

    private Context context;
    private String[] arrayList;


    public eeeAdapterClass(Context context, String[] arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.ques_rv_layout_desgin,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {
        holder.textView.setText(arrayList[position]);
        holder.imageView.setImageResource(R.drawable.flat);

        holder.textView
                .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent lol;
                switch (position){
                    case 0:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1qfIahkXvbzUz3iVx56B35KRPbU_2wyUo/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 1:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1yok7vT0aacoGr9phMOUGbOhQeNwu5YFO/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 2:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Es72J7zhuJDPr3RCVkxNbinK2TOOPka-/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 3:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/18BD-r5W-Bjiu5oXCSiD86yTYI8tyjOMx/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 4:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1A4zhuCmrB9fa0sVtAKDQ1aOve9toDxNU/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 5:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/13p8zj-g-k6xO8gUn-jTtE5s3GhWHyNjP/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 6:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-xWcDUKH8auyBPfk77xY0YYn78uFokvq/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 7:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1S52wuaus8UUHGC1kHtPegfoP7XQ2G2_n/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 8:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1k3op5f4jfRicG93f4o0DjvhcJ_gWwMD0/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 9:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1rChc9SX05qteRObUwJkcNaz7CvCLGWUJ/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 10:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1YzeD2kTqA0EGdTOZMLjp1mCZBvd9fGxA/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 11:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tyVzGopyXMbCC9zvYlVkEN6lL8NyO9YI/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 12:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1sDU_1SP9MiKJK6nKm6uD47LpsAA0op_C/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 13:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19AO0K9LkPMpXQ-21BJne5KWG0mOCbssa/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 14:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1kWu6wNm_sfiXq99E59tBvI3Bzaz5iRnh/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 15:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1bepdmRuK56X_AV2c5FYSAsashThlK2LY/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 16:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1nBV61h1UtMGH62NCF6y3mG1NjHOxyME6/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 17:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1V8JMgCi_IrR9otOGf4gxSuh5aCydNCYm/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 18:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1bDT1NywXYBK-UAWc5WEWgFkWQmPTYLxj/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 19:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Jq3OTfgLb35fGytZrJ_1FMojtiZkVQSc/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 20:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/127nO8eTTKrqpUDHOYRCtDE9wIqgwGMGk/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 21:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1PYmd5ZqBQID-jjBWXhpqb_6hyUDmxxbt/view?usp=sharing"));
                        context.startActivity(lol);
                        break;
                    case 22:
                        lol =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1rlc4Difil042GRRKCDkmvGmUPrwX5HAt/view?usp=sharing"));
                        context.startActivity(lol);
                        break;




                }

                //context.startActivity(lol);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.ques_name_tv_ID);
            imageView = itemView.findViewById(R.id.image_ques_ID);
        }
    }
}
