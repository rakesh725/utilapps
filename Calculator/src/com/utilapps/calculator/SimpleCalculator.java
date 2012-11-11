package com.utilapps.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleCalculator extends Activity {

	private TextView dispLabel;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
         dispLabel = (TextView) findViewById(R.id.textView1);
       
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /** Called when the user clicks the Number button */
    public void numPressed(View view) {
        // Do something in response to button
    	
    	//Get clicked button text
    	Button clickedButton = (Button)view;
    	String clickedButtonText = clickedButton.getText().toString();
          
    	//Update display
    	//If dispLabel is set to 0 - clear and enter the number
    	if(dispLabel.getText().equals("0")){
    		dispLabel.setText(clickedButtonText);
    	}
    	
    	//If dispLabel has a number - Append display with entered number
    	 //If dispLabel size == 21 than do not append
    	if(!(dispLabel.getText().length()==21)){
    	dispLabel.setText(dispLabel.getText().toString().concat(clickedButtonText));
    	}
    	//Add number to stack when any of the following buttons are pressed:
    	//+, -, x, /, =
    	
    	//If Number - Add operation to stack if number
    	//if last char in dispLabel is a dot - append
    	//else if 
    	
    
    }
    
    
}
