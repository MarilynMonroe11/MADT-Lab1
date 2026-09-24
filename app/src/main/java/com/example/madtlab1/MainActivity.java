package com.example.madtlab1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView MainTextView;
    private Button ChangeTextButton;
    private Button ChangeTextColorButton;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);

        MainTextView = findViewById(R.id.main_text_view);
        ChangeTextButton = findViewById(R.id.change_text_button);
        ChangeTextColorButton = findViewById(R.id.change_text_color_button);

        ConfigureTextButton();
        ConfigureTextColorButton();
    }

    private void ConfigureTextButton() {
        ChangeTextButton.setOnClickListener(View ->
                MainTextView.setText(R.string.changed_text));
    }

    private void ConfigureTextColorButton() {
        ChangeTextColorButton.setOnClickListener(View ->
                MainTextView.setTextColor(Color.RED));
    }
}
