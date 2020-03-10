package com.example.screen_stream;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button lastImage;
    private Button nextImage;
    private TextView imagetext;
    private ImageView imagesource;
    private String[] titles;
    private int[] images;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();




    }

    private void initData() {
        titles = new String[]{"第一张图片","第二张图片","第三张图片","第四张图片","第五张图片","第六张图片","第七张图片"};
        images = new int[]{R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7};
        Glide.with(this).load(images[0]).into(imagesource);
        imagetext.setText(titles[0]);
        index = 0;
    }

    private void initView() {
        lastImage = findViewById(R.id.lastimage);
        nextImage = findViewById(R.id.nextimage);

        imagetext = findViewById(R.id.imagetext);
        imagesource = findViewById(R.id.imagesource);

        lastImage.setOnClickListener(this);
        nextImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lastimage:
                if(index <= 0){
                    Toast.makeText(getApplicationContext(),"已经是第一张图片了",Toast.LENGTH_SHORT).show();
                }else {
                    index--;
                }
                break;

            case R.id.nextimage:
                if(index >= images.length - 1){
                    Toast.makeText(getApplicationContext(),"已经是最后一张图片了",Toast.LENGTH_SHORT).show();
                }else{
                    index ++;
                }
                break;
        }
        updateImageAndTitle();
    }

    private void updateImageAndTitle() {
        Glide.with(this).load(images[index]).into(imagesource);
        imagetext.setText(titles[index]);

    }
}
