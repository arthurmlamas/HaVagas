package br.edu.ifsp.havagas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText nomeEt;
    private EditText emailEt;
    private CheckBox emailCb;
    private RadioGroup foneRg;
    private RadioButton comercialRb;
    private RadioButton residencialRb;
    private EditText telefoneEt;
    private Button addCelular;
    private LinearLayout celularLl;
    private EditText celularEt;
    private RadioGroup sexoRg;
    private RadioButton masculinoRb;
    private RadioButton femininoRb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}