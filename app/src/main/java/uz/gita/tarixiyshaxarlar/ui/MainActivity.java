package uz.gita.tarixiyshaxarlar.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import uz.gita.tarixiyshaxarlar.R;
import uz.gita.tarixiyshaxarlar.model.Model;
import uz.gita.tarixiyshaxarlar.ui.dialogs.CustomExitDialog;

public class MainActivity extends AppCompatActivity {
    View viewTashkent,viewSamarqand,viewBuxoro,viewXiva,viewShaxrisabz,viewNavoiy,viewZomin,viewTermiz,viewGuliston,viewQoqon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadViews();
    }

    private void loadViews(){
        viewTashkent = findViewById(R.id.view_tashkent);
        viewSamarqand = findViewById(R.id.view_samarqand);
        viewBuxoro = findViewById(R.id.view_buxoro);
        viewXiva = findViewById(R.id.view_xiva);
        viewShaxrisabz = findViewById(R.id.view_shaxrisabz);
        viewNavoiy = findViewById(R.id.view_navoiy);
        viewZomin = findViewById(R.id.view_zomin);
        viewGuliston = findViewById(R.id.view_guliston);
        viewTermiz = findViewById(R.id.view_termiz);
        viewQoqon = findViewById(R.id.view_qoqon);

        Intent intent = new Intent(MainActivity.this,DescriptionActivity.class);

        viewTashkent.setOnClickListener(v->{
            intent.putExtra("Model",getModelTashkent());
            startActivity(intent);
        });

        viewSamarqand.setOnClickListener(v->{
            intent.putExtra("Model",getModelSamarqand());
            startActivity(intent);
        });

        viewBuxoro.setOnClickListener(v->{
            intent.putExtra("Model",getModelBuxoro());
            startActivity(intent);
        });

        viewXiva.setOnClickListener(v->{
            intent.putExtra("Model",getModelXiva());
            startActivity(intent);
        });

        viewShaxrisabz.setOnClickListener(v->{
            intent.putExtra("Model",getModelShaxrisabz());
            startActivity(intent);
        });

        viewNavoiy.setOnClickListener(v->{
            intent.putExtra("Model",getModelNavoiy());
            startActivity(intent);
        });

        viewZomin.setOnClickListener(v->{
            intent.putExtra("Model",getModelZomin());
            startActivity(intent);
        });

        viewTermiz.setOnClickListener(v->{
            intent.putExtra("Model",getModelTermiz());
            startActivity(intent);
        });

        viewGuliston.setOnClickListener(v->{
            intent.putExtra("Model",getModelGuliston());
            startActivity(intent);
        });

        viewQoqon.setOnClickListener(v->{
            intent.putExtra("Model",getModelQoqon());
            startActivity(intent);
        });

    }

    private Model getModelTashkent(){
        return new Model.Builder().setApp_bar("Toshkent")
                .setDesc1(R.string.tashkent_1)
                .setImage1(R.drawable.tashkent_1)
                .setDesc2(R.string.tashkent_2)
                .setImage2(R.drawable.tashkent_2)
                .setImage3(R.drawable.tashkent_3)
                . build();
    }

    private Model getModelSamarqand(){
        return new Model.Builder().setApp_bar("Samarqand")
                .setDesc1(R.string.samarkand_1)
                .setImage1(R.drawable.samarqand_1)
                .setDesc2(R.string.samarkand_2)
                .setImage2(R.drawable.samarqand_2)
                .setImage3(R.drawable.samarqand_3)
                . build();
    }

    private Model getModelBuxoro(){
        return new Model.Builder().setApp_bar("Buxoro")
                .setDesc1(R.string.bukhara_1)
                .setImage1(R.drawable.buxoro_1)
                .setDesc2(R.string.bukhara_2)
                .setImage2(R.drawable.buxoro_2)
                .setImage3(R.drawable.buxoro_3)
                . build();
    }

    private Model getModelXiva(){
        return new Model.Builder().setApp_bar("Xiva")
                .setDesc1(R.string.xiva_1)
                .setImage1(R.drawable.xiva_1)
                .setDesc2(R.string.xiva_2)
                .setImage2(R.drawable.xiva_2)
                .setImage3(R.drawable.xiva_3)
                . build();
    }

    private Model getModelShaxrisabz(){
        return new Model.Builder().setApp_bar("Shaxrisabz")
                .setDesc1(R.string.shaxrisabz_1)
                .setImage1(R.drawable.shaxrisabz_1)
                .setDesc2(R.string.shaxrisabz_2)
                .setImage2(R.drawable.shaxrisabz_2)
                .setImage3(R.drawable.shaxrisabz)
                . build();
    }

    private Model getModelNavoiy(){
        return new Model.Builder().setApp_bar("Navoiy")
                .setDesc1(R.string.navoiy_1)
                .setImage1(R.drawable.navoiy_1)
                .setDesc2(R.string.navoiy_2)
                .setImage2(R.drawable.navoiy_2)
                .setImage3(R.drawable.navoiy_3)
                . build();
    }

    private Model getModelZomin(){
        return new Model.Builder().setApp_bar("Zomin")
                .setDesc1(R.string.zomin_1)
                .setImage1(R.drawable.zomin_1)
                .setDesc2(R.string.zomin_2)
                .setImage2(R.drawable.zomin_2)
                .setImage3(R.drawable.zomin_3)
                . build();
    }

    private Model getModelTermiz(){
        return new Model.Builder().setApp_bar("Termiz")
                .setDesc1(R.string.termiz_1)
                .setImage1(R.drawable.termiz_1)
                .setDesc2(R.string.termiz_2)
                .setImage2(R.drawable.termiz_2)
                .setImage3(R.drawable.termiz_3)
                . build();
    }


    private Model getModelGuliston(){
        return new Model.Builder().setApp_bar("Guliston")
                .setDesc1(R.string.guliston_1)
                .setImage1(R.drawable.guliston_1)
                .setDesc2(R.string.guliston_2)
                .setImage2(R.drawable.guliston_2)
                .setImage3(R.drawable.guliston_3)
                . build();
    }

    private Model getModelQoqon(){
        return new Model.Builder().setApp_bar("Qo'qon")
                .setDesc1(R.string.kokand_1)
                .setImage1(R.drawable.qoqon_1)
                .setDesc2(R.string.kokand_2)
                .setImage2(R.drawable.qoqon_2)
                .setImage3(R.drawable.qoqon_3)
                . build();
    }

    @Override
    public void onBackPressed() {
        CustomExitDialog dialog = new CustomExitDialog(this);
        dialog.setOnDialogButtonClickListener(()->{
            finish();
        });
        dialog.create();
        dialog.show();

    }
}