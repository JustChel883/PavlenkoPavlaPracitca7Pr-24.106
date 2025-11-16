package com.example.pavlenkopavlapracitca7pr_24106;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.main_page_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setBackgroundColor(ContextCompat.getColor(this, R.color.primary));
    }


    public void onCheckboxClicked(View view) {
        CheckBox checkBox = (CheckBox) view;

        if (checkBox.isChecked()) {

            checkBox.setBackgroundColor(ContextCompat.getColor(this, R.color.primary_light));
        } else {

            checkBox.setBackgroundColor(ContextCompat.getColor(this, R.color.primary));
        }
    }


    public void onButtonClick(View view) {
        Intent intent = new Intent(this, account_page.class);
        startActivity(intent);
    }


}