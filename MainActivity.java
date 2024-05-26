package com.example.drawingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

// Import R class from your app package to access resources
import com.example.drawingapp.R;

public class MainActivity extends AppCompatActivity {
    private DrawingView drawingView; // Declare DrawingView instance variable
    private Button clearButton; // Declare Button instance variable for clearing canvas
    private Button saveButton; // Declare Button instance variable for saving canvas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the activity layout from XML

        drawingView = new DrawingView(this); // Create a new instance of DrawingView
        LinearLayout drawingLayout = findViewById(R.id.drawingLayout); // Find the LinearLayout in the layout
        drawingLayout.addView(drawingView); // Add the DrawingView to the LinearLayout

        clearButton = findViewById(R.id.clearButton); // Find the Clear Button in the layout
        saveButton = findViewById(R.id.saveButton); // Find the Save Button in the layout

        // Set click listener for the Clear Button
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawingView.clearCanvas(); // Call clearCanvas() method in DrawingView
            }
        });

        // Set click listener for the Save Button
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawingView.saveCanvas(); // Call saveCanvas() method in DrawingView
            }
        });
    }
}
