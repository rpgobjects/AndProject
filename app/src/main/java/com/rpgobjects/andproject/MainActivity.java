package com.rpgobjects.andproject;

import android.content.Intent;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.List;

import butterknife.Bind;
import butterknife.BindColor;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind({R.id.icon1,R.id.icon2,R.id.icon3}) List<ImageView> imageViewList;
    @Bind({R.id.svg1,R.id.svg2,R.id.svg3}) List<ImageView> svgViewList;
    @BindColor(R.color.red) int red;
    @BindColor(R.color.blue) int blue;
    @BindColor(R.color.green) int green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // using drawable compat
        DrawableCompat.setTint(imageViewList.get(0).getDrawable(), red);
        DrawableCompat.setTint(imageViewList.get(1).getDrawable(), blue);
        DrawableCompat.setTint(imageViewList.get(2).getDrawable(), green);

        // same tint but svg src
        DrawableCompat.setTint(svgViewList.get(0).getDrawable(), red);
        DrawableCompat.setTint(svgViewList.get(1).getDrawable(), blue);
        DrawableCompat.setTint(svgViewList.get(2).getDrawable(), green);
    }

    @OnClick(R.id.click_me)
    public void showPhoto() {
        Intent intent = new Intent(this,PhotoActivity.class);
        startActivity(intent);
    }
}
