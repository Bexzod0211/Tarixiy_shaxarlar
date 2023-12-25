package uz.gita.tarixiyshaxarlar.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import uz.gita.tarixiyshaxarlar.R;
import uz.gita.tarixiyshaxarlar.model.Model;

public class DescriptionActivity extends AppCompatActivity {
    TextView txt_app_bar,txt_desc1,txt_desc2;
    ImageView img1,img2,img3,imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        loadViews();

        loadDataToView();

    }

    private void loadViews(){
        txt_app_bar = findViewById(R.id.txt_app_bar);
        txt_desc1 = findViewById(R.id.txt_desc1);
        txt_desc2 = findViewById(R.id.txt_desc2);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        imgBack = findViewById(R.id.btn_back);


        imgBack.setOnClickListener(v->{
            finish();
        });
    }


    private void loadDataToView(){
        Model model = (Model) getIntent().getSerializableExtra("Model");

        txt_app_bar.setText(model.getApp_bar());
        img1.setImageResource(model.getImage1());
        txt_desc1.setText(model.getDesc1());
        img2.setImageResource(model.getImage2());
        img3.setImageResource(model.getImage3());
        txt_desc2.setText(model.getDesc2());



    }
}