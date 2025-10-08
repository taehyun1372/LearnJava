package com.example.a2_views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CalculatorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalculatorFragment extends Fragment {

    Button addButton;
    Button minusButton;
    Button multiplyButton;
    Button divideButton;

    TextView resultText;

    EditText et1;

    EditText et2;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CalculatorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalculatorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalculatorFragment newInstance(String param1, String param2) {
        CalculatorFragment fragment = new CalculatorFragment();
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
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);

        resultText = view.findViewById(R.id.resultText);
        et1 = view.findViewById(R.id.et1);
        et2 = view.findViewById(R.id.et2);

        addButton = view.findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (isNumeric(et1.getText().toString()) && isNumeric(et2.getText().toString()))
                {
                    var result = String.valueOf(Integer.parseInt(et1.getText().toString()) + Integer.parseInt(et2.getText().toString()));
                    var message = "result : {}".format(result);
                    resultText.setText(message);
                }
                else
                {
                    Toast.makeText(getContext(), "Not numeric value!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        minusButton = view.findViewById(R.id.minusButton);
        minusButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (isNumeric(et1.getText().toString()) && isNumeric(et2.getText().toString()))
                {
                    var result = String.valueOf(Integer.parseInt(et1.getText().toString()) - Integer.parseInt(et2.getText().toString()));
                    var message = "result : {}".format(result);
                    resultText.setText(message);
                }
                else
                {
                    Toast.makeText(getContext(), "Not numeric value!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        multiplyButton = view.findViewById(R.id.multiplyButton);
        multiplyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (isNumeric(et1.getText().toString()) && isNumeric(et2.getText().toString()))
                {
                    var result = String.valueOf(Integer.parseInt(et1.getText().toString()) * Integer.parseInt(et2.getText().toString()));
                    var message = "result : {}".format(result);
                    resultText.setText(message);
                }
                else
                {
                    Toast.makeText(getContext(), "Not numeric value!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        divideButton = view.findViewById(R.id.divideButton);
        divideButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (isNumeric(et1.getText().toString()) && isNumeric(et2.getText().toString()))
                {
                    int a = Integer.parseInt(et1.getText().toString());
                    int b = Integer.parseInt(et2.getText().toString());
                    if ( b == 0)
                    {
                        Toast.makeText(getContext(), "Cannot divide by 0", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        var result = String.valueOf(a / b);
                        var message = "result : {}".format(result);
                        resultText.setText(message);
                    }

                }
                else
                {
                    Toast.makeText(getContext(), "Not numeric value!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

    public boolean isNumeric(String str){
        if(str == null) return false;
        try{
            Integer.parseInt(str);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}