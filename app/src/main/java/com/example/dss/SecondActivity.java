package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView nameTextView = findViewById(R.id.editTextTextPersonName);
        TextView departureTextView = findViewById(R.id.editTextTextPersonName2);
        TextView arrivalTextView = findViewById(R.id.editTextTime2);
        TextView departureTimeTextView = findViewById(R.id.editTextTime3);
        TextView arrivalTimeTextView = findViewById(R.id.editTextNumber);
        TextView priceTextView = findViewById(R.id.editTextNumber2);
        Button resetButton = findViewById(R.id.button2);

// Получение данных из интента и установка их в TextView элементы
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            nameTextView.setText(extras.getString("name"));
            departureTextView.setText(extras.getString("departure"));
            arrivalTextView.setText(extras.getString("arrival"));
            departureTimeTextView.setText(extras.getString("departureTime"));
            arrivalTimeTextView.setText(extras.getString("arrivalTime"));
            priceTextView.setText(extras.getString("price"));
        }

// Обработчик нажатия на кнопку resetButton
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создание экземпляра класса Intent для перехода на MainActivity
                Intent intent = new Intent(SecondActivity.this, MaiinActivity.class);

                // Запуск MainActivity с очисткой данных
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }
}