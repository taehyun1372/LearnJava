package com.example.a4_layout;

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
 * Use the {@link CalcFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalcFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnPlus;
    Button btnMinus;
    Button btnMultiply;
    Button btnDivide;
    EditText etInput1;

    EditText etInput2;

    TextView tvResult;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CalcFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalcFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalcFragment newInstance(String param1, String param2) {
        CalcFragment fragment = new CalcFragment();
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
        View view = inflater.inflate(R.layout.fragment_calc, container, false);

        etInput1 = (EditText)view.findViewById(R.id.etInput1);
        etInput2 = (EditText)view.findViewById(R.id.etInput2);

        btn0 = (Button)view.findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (etInput1.hasFocus())
                {
                    etInput1.setText(etInput1.getText() + btn0.getText().toString());
                    etInput1.setSelection(etInput1.getText().toString().length());
                }
                if (etInput2.hasFocus())
                {
                    etInput2.setText(etInput2.getText() + btn0.getText().toString());
                    etInput2.setSelection(etInput2.getText().toString().length());
                }
            }
        });

        btn1 = (Button)view.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (etInput1.hasFocus())
                {
                    etInput1.setText(etInput1.getText() + btn1.getText().toString());
                    etInput1.setSelection(etInput1.getText().toString().length());
                }
                if (etInput2.hasFocus())
                {
                    etInput2.setText(etInput2.getText() + btn1.getText().toString());
                    etInput2.setSelection(etInput2.getText().toString().length());
                }
            }
        });

        btn2 = (Button)view.findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v)
                {
                    if (etInput1.hasFocus())
                    {
                        etInput1.setText(etInput1.getText() + btn2.getText().toString());
                        etInput1.setSelection(etInput1.getText().toString().length());
                    }
                    if (etInput2.hasFocus())
                    {
                        etInput2.setText(etInput2.getText() + btn2.getText().toString());
                        etInput2.setSelection(etInput2.getText().toString().length());
                    }
                }
        });

        btn3 = (Button)view.findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (etInput1.hasFocus())
                {
                    etInput1.setText(etInput1.getText() + btn3.getText().toString());
                    etInput1.setSelection(etInput1.getText().toString().length());
                }
                if (etInput2.hasFocus())
                {
                    etInput2.setText(etInput2.getText() + btn3.getText().toString());
                    etInput2.setSelection(etInput2.getText().toString().length());
                }
            }
        });

        btn4 = (Button)view.findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (etInput1.hasFocus())
                {
                    etInput1.setText(etInput1.getText() + btn4.getText().toString());
                    etInput1.setSelection(etInput1.getText().toString().length());
                }
                if (etInput2.hasFocus())
                {
                    etInput2.setText(etInput2.getText() + btn4.getText().toString());
                    etInput2.setSelection(etInput2.getText().toString().length());
                }
            }
        });

        btn5 = (Button)view.findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (etInput1.hasFocus())
                {
                    etInput1.setText(etInput1.getText() + btn5.getText().toString());
                    etInput1.setSelection(etInput1.getText().toString().length());
                }
                if (etInput2.hasFocus())
                {
                    etInput2.setText(etInput2.getText() + btn5.getText().toString());
                    etInput2.setSelection(etInput2.getText().toString().length());
                }
            }
        });

        btn6 = (Button)view.findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (etInput1.hasFocus())
                {
                    etInput1.setText(etInput1.getText() + btn6.getText().toString());
                    etInput1.setSelection(etInput1.getText().toString().length());
                }
                if (etInput2.hasFocus())
                {
                    etInput2.setText(etInput2.getText() + btn6.getText().toString());
                    etInput2.setSelection(etInput2.getText().toString().length());
                }
            }
        });

        btn7 = (Button)view.findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (etInput1.hasFocus())
                {
                    etInput1.setText(etInput1.getText() + btn7.getText().toString());
                    etInput1.setSelection(etInput1.getText().toString().length());
                }
                if (etInput2.hasFocus())
                {
                    etInput2.setText(etInput2.getText() + btn7.getText().toString());
                    etInput2.setSelection(etInput2.getText().toString().length());
                }
            }
        });

        btn8 = (Button)view.findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (etInput1.hasFocus())
                {
                    etInput1.setText(etInput1.getText() + btn8.getText().toString());
                    etInput1.setSelection(etInput1.getText().toString().length());
                }
                if (etInput2.hasFocus())
                {
                    etInput2.setText(etInput2.getText() + btn8.getText().toString());
                    etInput2.setSelection(etInput2.getText().toString().length());
                }
            }
        });

        btn9 = (Button)view.findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (etInput1.hasFocus())
                {
                    etInput1.setText(etInput1.getText() + btn9.getText().toString());
                    etInput1.setSelection(etInput1.getText().toString().length());
                }
                if (etInput2.hasFocus())
                {
                    etInput2.setText(etInput2.getText() + btn9.getText().toString());
                    etInput2.setSelection(etInput2.getText().toString().length());
                }
            }
        });

        tvResult = (TextView)view.findViewById(R.id.tvResult);

        btnPlus = (Button)view.findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int input1 = Integer.parseInt(etInput1.getText().toString());
                    int input2 = Integer.parseInt(etInput2.getText().toString());
                    tvResult.setText(String.valueOf(input1 + input2));
                }
                catch (Exception e)
                {
                    Toast.makeText(getContext(), "Enter valid input", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnMinus = (Button)view.findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int input1 = Integer.parseInt(etInput1.getText().toString());
                    int input2 = Integer.parseInt(etInput2.getText().toString());
                    tvResult.setText(String.valueOf(input1 - input2));
                }
                catch (Exception e)
                {
                    Toast.makeText(getContext(), "Enter valid input", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnMultiply = (Button)view.findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int input1 = Integer.parseInt(etInput1.getText().toString());
                    int input2 = Integer.parseInt(etInput2.getText().toString());
                    tvResult.setText(String.valueOf(input1 * input2));
                }
                catch (Exception e)
                {
                    Toast.makeText(getContext(), "Enter valid input", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnDivide = (Button)view.findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int input1 = Integer.parseInt(etInput1.getText().toString());
                    int input2 = Integer.parseInt(etInput2.getText().toString());
                    tvResult.setText(String.valueOf(input1 / input2));
                }
                catch (Exception e)
                {
                    Toast.makeText(getContext(), "Enter valid input", Toast.LENGTH_SHORT).show();
                }

            }
        });

        etInput1.setSelection(0);





        return view;
    }
}