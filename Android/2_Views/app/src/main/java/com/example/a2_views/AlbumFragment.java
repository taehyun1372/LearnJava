package com.example.a2_views;

import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AlbumFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AlbumFragment extends Fragment {
    CheckBox startCheckBox;

    TextView selectionText;

    RadioGroup selectionGroup;

    RadioButton puppyButton;
    RadioButton catButton;
    RadioButton rabbitButton;
    Button completeButton;

    ImageView resultImage;

    int selection;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AlbumFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AlbumFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AlbumFragment newInstance(String param1, String param2) {
        AlbumFragment fragment = new AlbumFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_album, container, false);

        startCheckBox = (CheckBox) view.findViewById(R.id.startCheckBox);
        selectionText = (TextView) view.findViewById(R.id.selectionText);
        selectionGroup = (RadioGroup) view.findViewById(R.id.selectionGroup);
        puppyButton = (RadioButton) view.findViewById(R.id.puppyButton);
        catButton = (RadioButton) view.findViewById(R.id.catButton);
        rabbitButton = (RadioButton) view.findViewById(R.id.rabbitButton);

        startCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    selectionText.setVisibility(View.VISIBLE);
                    selectionGroup.setVisibility(View.VISIBLE);
                }
            }
        });

        completeButton = (Button)view.findViewById(R.id.completeButton);

        selectionGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {
                completeButton.setVisibility(View.VISIBLE);
                selection = checkedId;
            }
        });

        resultImage = (ImageView) view.findViewById(R.id.resultImage);


        completeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultImage.setVisibility(View.VISIBLE);
                if (selection == puppyButton.getId())
                {
                    resultImage.setImageResource(R.drawable.puppy);
                } else if (selection == catButton.getId())
                {
                    resultImage.setImageResource(R.drawable.cat);
                } else if (selection == rabbitButton.getId())
                {
                    resultImage.setImageResource(R.drawable.rabbit);
                }

            }
        });



        return view;
    }
}