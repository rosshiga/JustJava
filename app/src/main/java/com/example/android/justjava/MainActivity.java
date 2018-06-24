package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(0);
        displayMessage("Amount due: $" + 0);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        TextView priceText = findViewById(R.id.price_text);
        String priceMessage = priceText.getText() + "\r\n" + "Thank you!";
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.qty_text);
        quantityTextView.setText("" + number);

    }



    /**
     * Increment and decrement methods for buttons
     */

    public void increment(View view) {

        int num = getQtyFromText();
        num++;
        display(num);
        displayMessage("Amount due: $" + num * 5);

    }

    public void decrement(View view) {

        int num = getQtyFromText();
        if (num > 0)
            num--;

        display(num);
        displayMessage("Amount due: $" + num * 5);

    }

    /*
     *A getter for qty variable without using globals
     */
    private int getQtyFromText() {
        TextView qtyPicker = findViewById(R.id.qty_text);
        int num;
        try {
            num = Integer.parseInt(qtyPicker.getText().toString());
        } catch (Exception e) {
            num = 0;
        }
        return num;
    }


    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = findViewById(R.id.price_text);
        priceTextView.setText(message);
    }
}