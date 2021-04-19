package com.example.univercityapp.ui.about;

import android.os.Bundle;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.univercityapp.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import static java.lang.System.load;

public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_computer, "CSE","One of the most sought after courses amongst engineering students, Computer Science Engineering (CSE) is an academic programme which integrates the field of Computer Engineering and Computer Science. "));
        list.add(new BranchModel(R.drawable.ic_settings, "Mechanical","Mechanical engineering is the study, design, development, construction, and testing of mechanical and thermal sensors and devices, including tools, engines, and machines."));
        list.add(new BranchModel(R.drawable.ic_computer, "IT",
                "IT Engineers are high-level IT personnel who design, install, and maintain a company's computer systems. They are responsible for testing, configuring, and troubleshooting hardware, software, and networking systems to meet the needs of the employer. "));
        list.add(new BranchModel(R.drawable.ic_settings, "ICT","Information and Communication Technology is the Engineering Branch that recently came into existence with a mission to provide a wider perspective on the nature of technology, its use and application to the living world."));
        list.add(new BranchModel(R.drawable.ic_computer, "EEE","Introduction. “Electrical & Electronics Engineering” is a growing and one of the most sought disciplines in the field of engineering study."));
        list.add(new BranchModel(R.drawable.ic_settings, "ECE","Electronics and Communications Engineering (ECE) involves researching, designing, developing and testing of electronic equipment used in various systems."));


        adapter = new BranchAdapter(getContext(),list);

        viewPager = view.findViewById(R.id.viewPager);

        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/sastra-uni.appspot.com/o/Notice%2F%5BB%40a2b2119jpg?alt=media&token=78479fa7-fd08-4538-912b-0dd24fe96562")
                .into(imageView);


        return view;
    }
}