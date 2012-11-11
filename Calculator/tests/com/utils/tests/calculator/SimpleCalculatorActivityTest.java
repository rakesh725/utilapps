package com.utils.tests.calculator;

import junit.framework.Assert;
import junit.framework.TestCase;
import com.utilapps.calculator.*;

import android.app.Activity;
import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SimpleCalculatorActivityTest extends ActivityUnitTestCase<SimpleCalculator> {

	public SimpleCalculatorActivityTest(Class<SimpleCalculator> activityClass) {
		super(activityClass);
		// TODO Auto-generated constructor stub
	}
/*
	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}
*/
	protected void setUp() throws Exception {
		startActivity(new Intent(getInstrumentation().getTargetContext(),
		        SimpleCalculator.class), null, null);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testLayout(){
		
		//Verify disp label
		SimpleCalculator testActivity = getActivity();
		TextView dispLabel = (TextView) testActivity.findViewById(com.utilapps.calculator.R.id.textView1);
		//Verify teh dispLabel is set to 0
		Assert.assertEquals("Expected default value for dispLabel not found", dispLabel.getText().equals("0"));
		
		//Verify the buttons
		Button ButtonOne = (Button) testActivity.findViewById(com.utilapps.calculator.R.id.button1);
		Assert.assertEquals("Expected Button One not found", ButtonOne.getText(), "1");
		assertTrue(ButtonOne.isEnabled());
		
		
		
		
	}
	
}
