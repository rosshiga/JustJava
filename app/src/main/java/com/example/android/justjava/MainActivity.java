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
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = 2;
        display(num);
        displayPrice(num);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(num);
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

    private void increment(View view) {
        num++;
    }

    private void decrement(View view) {
        num--;
    }
}