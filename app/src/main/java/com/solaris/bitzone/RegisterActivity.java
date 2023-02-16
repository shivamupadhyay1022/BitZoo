package com.solaris.bitzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private EditText name;
    private EditText sec;
    private EditText semester;
    private EditText admyear;
    private Button register;

    TextInputLayout lay_branch;
    AutoCompleteTextView act_branch;

    ArrayList<String> arraylist_branch;
    ArrayAdapter<String> arrayAdapter_branch;

    TextInputLayout lay_sem;
    AutoCompleteTextView act_sem;

    ArrayList<String> arraylist_sem;
    ArrayAdapter<String> arrayAdapter_sem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        lay_branch =(TextInputLayout)findViewById(R.id.layout_branch);
        act_branch =(AutoCompleteTextView) findViewById(R.id.register_select_branch);

        arraylist_branch = new ArrayList<>();
        arraylist_branch.add("   ECE");
        arraylist_branch.add("   CSE");
        arraylist_branch.add("   IT");
        arraylist_branch.add("   Mechanical");
        arraylist_branch.add("   Chemistry");
        arraylist_branch.add("   QEDS");

        arrayAdapter_branch = new ArrayAdapter<>(getApplicationContext(),R.layout.dropdownlist,arraylist_branch);
        act_branch.setAdapter(arrayAdapter_branch);

        act_branch.setThreshold(1);

        lay_sem =(TextInputLayout)findViewById(R.id.layout_sem);
        act_sem =(AutoCompleteTextView) findViewById(R.id.register_select_sem);

        arraylist_sem = new ArrayList<>();
        arraylist_sem.add("  1st Semester");
        arraylist_sem.add("  2nd Semester");
        arraylist_sem.add("  3rd Semester");
        arraylist_sem.add("  4th Semester");
        arraylist_sem.add("  5th Semester");
        arraylist_sem.add("  6th Semester");
        arraylist_sem.add("  7th Semester");
        arraylist_sem.add("  8th    Semester");

        arrayAdapter_sem = new ArrayAdapter<>(getApplicationContext(),R.layout.dropdownlist,arraylist_sem);
        act_sem.setAdapter(arrayAdapter_sem);

        act_sem.setThreshold(1);
        //=== how many characters requires spinner suggestion===



        email = findViewById(R.id.register_email);
        password = findViewById(R.id.register_password);
        register = findViewById(R.id.register1);
        name = findViewById(R.id.register_name);
        sec = findViewById(R.id.register_section);
        admyear = findViewById(R.id.register_admyear);

    }
}