package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MaiinActivity extends AppCompatActivity {

    private EditText editTextPersonName, editTextDeparture, editTextArrival, editTextDepartureTime, editTextArrivalTime, editTextTicketPrice;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maiin);

        editTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextDeparture = findViewById(R.id.editTextTextPersonName2);
        editTextArrival = findViewById(R.id.editTextTime2);
        editTextDepartureTime = findViewById(R.id.editTextTime3);
        editTextArrivalTime = findViewById(R.id.editTextNumber);
        editTextTicketPrice = findViewById(R.id.editTextNumber2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Получение значений из EditText полей
                String name = editTextPersonName.getText().toString();
                String departure = editTextDeparture.getText().toString();
                String arrival = editTextArrival.getText().toString();
                String departureTime = editTextDepartureTime.getText().toString();
                String arrivalTime = editTextArrivalTime.getText().toString();
                String price = editTextTicketPrice.getText().toString();

                // Создание экземпляра класса Intent для перехода на SecondActivity
                Intent intent = new Intent(MaiinActivity.this, SecondActivity.class);

                // Добавление данных в интент
                intent.putExtra("name", name);
                intent.putExtra("departure", departure);
                intent.putExtra("arrival", arrival);
                intent.putExtra("departureTime", departureTime);
                intent.putExtra("arrivalTime", arrivalTime);
                intent.putExtra("price", price);

                // Запуск SecondActivity с передачей данных
                startActivity(intent);
            }
        });
    }
}