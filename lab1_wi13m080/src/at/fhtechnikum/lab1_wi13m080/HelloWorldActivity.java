package at.fhtechnikum.lab1_wi13m080;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {

	private TextView nameField;

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_hello_world);
		Bundle extras = this.getIntent().getExtras();
		String name = "";
		if (extras != null && extras.get("name") != null) {
			name = (String) extras.get("name");
		}
		nameField = (TextView) findViewById(R.id.textViewOutput);
		nameField.setText(String.format("Hello %s!", name));
	}

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello_world, menu);
		return true;
	}

}
