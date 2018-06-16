package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(2);
        displayPrice(2);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        TextView qtyPicker = findViewById(R.id.qty_text);
        int num = Integer.parseInt(qtyPicker.getText().toString());
        displayPrice(num);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.qty_text);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        number *= 5;
        TextView priceTextView = findViewById(R.id.price_text);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * Increment and decrement methods for buttons
     */

    public void increment(View view) {
        TextView qtyPicker = findViewById(R.id.qty_text);
        int num = Integer.parseInt(qtyPicker.getText().toString());
        num++;
        display(num);

    }

    public void decrement(View view) {
        TextView qtyPicker = findViewById(R.id.qty_text);
        int num = Integer.parseInt(qtyPicker.getText().toString());
        if (num == 0) return;
        num--;
        display(num);

    }
}