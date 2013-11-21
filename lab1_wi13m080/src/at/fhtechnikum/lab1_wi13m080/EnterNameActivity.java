package at.fhtechnikum.lab1_wi13m080;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class EnterNameActivity extends Activity implements OnClickListener {

	private EditText nameField;
	private Button okButton;

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.name_getter);
		nameField = (EditText) findViewById(R.id.editText1);
		okButton = (Button) findViewById(R.id.button1);
		okButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enter_name, menu);
		return true;
	}

	@Override
	public void onClick(final View v) {
		String text = nameField.getText().toString();
		if (text != null && !text.isEmpty()) {
			nameField.setText("");
			Intent intent = new Intent(this, HelloWorldActivity.class);
			intent.putExtra("name", text);
			this.startActivity(intent);
		}
		// TODO Auto-generated method stub

	}

}
