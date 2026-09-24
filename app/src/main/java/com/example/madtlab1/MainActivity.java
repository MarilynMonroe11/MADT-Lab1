package com.example.madtlab1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView MainTextView;
    private Button ChangeTextButton;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);

        MainTextView = findViewById(R.id.main_text_view);
        ChangeTextButton = findViewById(R.id.change_text_button);

        ConfigureTextButton();
    }

    private void ConfigureTextButton() {
        ChangeTextButton.setOnClickListener(View ->
                MainTextView.setText(R.string.changed_text));
    }
}
