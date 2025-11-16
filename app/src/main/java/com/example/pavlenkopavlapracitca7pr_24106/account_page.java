package com.example.pavlenkopavlapracitca7pr_24106;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class account_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_account_page);


        setupRadioGroup();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void setupRadioGroup() {
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {

            for (int i = 0; i < group.getChildCount(); i++) {
                RadioButton radioButton = (RadioButton) group.getChildAt(i);

                radioButton.setTextColor(ContextCompat.getColor(this, R.color.secondary));


                ColorStateList colorStateList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.secondary));
                radioButton.setButtonTintList(colorStateList);
            }


            if (checkedId != -1) {
                RadioButton selectedRadioButton = findViewById(checkedId);

                selectedRadioButton.setTextColor(ContextCompat.getColor(this, R.color.primary_light));

                ColorStateList colorStateList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.primary_light));
                selectedRadioButton.setButtonTintList(colorStateList);
            }
        });
    }
}