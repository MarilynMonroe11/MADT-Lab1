package com.example.madtlab1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    //Code for revert
    private View RootLayout;
    private TextView MainTextView;
    private Button ChangeTextButton;
    private Button ChangeTextColorButton;
    private Button ChangeBackgroundButton;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);

        RootLayout = findViewById(R.id.root_layout);
        MainTextView = findViewById(R.id.main_text_view);
        ChangeTextButton = findViewById(R.id.change_text_button);
        ChangeTextColorButton = findViewById(R.id.change_text_color_button);
        ChangeBackgroundButton = findViewById(R.id.change_background_button);

        ConfigureTextButton();
        ConfigureTextColorButton();
        ConfigureBackgroundButton();
    }

    private void ConfigureTextButton() {
        ChangeTextButton.setOnClickListener(View ->
                MainTextView.setText(R.string.changed_text));
    }

    private void ConfigureTextColorButton() {
        ChangeTextColorButton.setOnClickListener(View ->
                MainTextView.setTextColor(Color.RED));
    }

    private void ConfigureBackgroundButton() {
        ChangeBackgroundButton.setOnClickListener(View ->
                RootLayout.setBackgroundColor(Color.rgb(220, 235, 255)));
    }
}
