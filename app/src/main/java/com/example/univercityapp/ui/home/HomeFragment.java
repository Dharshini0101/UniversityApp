package com.example.univercityapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.univercityapp.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

import java.util.Map;


public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;
    private ImageView map;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_home, container, false);

       sliderLayout = view.findViewById(R.id.slider);
       sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
       sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
       sliderLayout.setScrollTimeInSec(1);

       setSliderViews();

       map = view.findViewById(R.id.map);
       map.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openMap();
           }
       });





       return view;
    }

    private void openMap() {

        Uri uri = Uri.parse("geo:0, 0?q=SASTRA Deemed to be University Thirumalaisamudram Thanjavur");
        Intent intent =  new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }


    private void setSliderViews(){
        for (int i =0;i<5;i++){
            DefaultSliderView sliderView = new DefaultSliderView(getContext());

            switch (i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/sastra-uni.appspot.com/o/Notice%2F%5BB%40a2b2119jpg?alt=media&token=78479fa7-fd08-4538-912b-0dd24fe96562");
                    break;
                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/sastra-uni.appspot.com/o/Notice%2F%5BB%409965182jpg?alt=media&token=e2fc3460-b410-42d1-b0b6-e40b9d5baf34");
                    break;
                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/sastra-uni.appspot.com/o/Notice%2F%5BB%409258269jpg?alt=media&token=e1ce1c08-22e1-423f-beff-fcb734181402");
                    break;
                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/sastra-uni.appspot.com/o/Notice%2F%5BB%406c43279jpg?alt=media&token=f19c95ad-729e-4c48-84a7-0f4c7c2fc875");
                    break;
                case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/sastra-uni.appspot.com/o/Notice%2F%5BB%4041aaaaejpg?alt=media&token=6ea27c78-0269-4d73-8a7c-764c2f71797c");
                    break;
            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderLayout.addSliderView(sliderView);
        }
    }
}