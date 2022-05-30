package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText edName, edAreal,edVid;

    private DatabaseReference fzdrg;
    private String ddd_Key = "ddd"; //ключ

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //поиск 3-ex EditText на экране
        edName = findViewById(R.id.edName);
        edAreal = findViewById(R.id.edAreal);
        edVid = findViewById(R.id.edVid);
        fzdrg = FirebaseDatabase.getInstance().getReference(ddd_Key);
    }

    //метод нажатия на кнопку СОХРАНИТЬ
    public void onClickSave(View view){
        String id = fzdrg.getKey();
        String name = edName.getText().toString();
        String Areal = edAreal.getText().toString();
        String Vid = edVid.getText().toString();

        ddd ddd = new ddd(id,name,Areal,Vid);
        fzdrg.push().setValue(ddd);
        Toast.makeText(this, "Данные добавлены!!!", Toast.LENGTH_SHORT).show();//всплывающее сообщение
    }

    //метод нажатия на кнопку ВЫВЕСТИ
    public void onClickConclusion(View view){

    }
}