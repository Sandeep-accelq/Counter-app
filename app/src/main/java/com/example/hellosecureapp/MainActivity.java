
package com.example.hellosecureapp;

import android.os.Bundle;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                             WindowManager.LayoutParams.FLAG_SECURE);

        TextView textView = new TextView(this);
        textView.setText("FLAG_SECURE is enabled. Screenshots are blocked.");
        textView.setTextSize(20);
        textView.setPadding(40, 200, 40, 200);
        setContentView(textView);
    }
}
