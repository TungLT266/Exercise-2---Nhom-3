package tunglt.exercise2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ChangeTitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_title);

        final EditText editText = findViewById(R.id.editText);
        final View viewSample = findViewById(R.id.viewSample);
        final ImageView pinkView = findViewById(R.id.iv1);
        ImageView purpleView = findViewById(R.id.iv2);
        ImageView indigoView = findViewById(R.id.iv3);
        ImageView blueView = findViewById(R.id.iv4);
        ImageView tealView = findViewById(R.id.iv5);
        ImageView greenView = findViewById(R.id.iv6);

        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        int textColor = intent.getIntExtra("textColor", 0);
        editText.setText(text);
        viewSample.setBackgroundColor(textColor);

        pinkView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSample.setBackgroundColor(Color.parseColor("#D81B60"));
            }
        });

        purpleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSample.setBackgroundColor(Color.parseColor("#8E24AA"));
            }
        });

        indigoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSample.setBackgroundColor(Color.parseColor("#3949AB"));
            }
        });

        blueView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSample.setBackgroundColor(Color.parseColor("#1E88E5"));
            }
        });

        tealView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSample.setBackgroundColor(Color.parseColor("#00897B"));
            }
        });

        greenView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSample.setBackgroundColor(Color.parseColor("#43A047"));
            }
        });

        Button save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent changeTitleIntent = new Intent(ChangeTitleActivity.this, MainActivity.class);
            changeTitleIntent.putExtra("textColor",((ColorDrawable) viewSample.getBackground()).getColor());
            changeTitleIntent.putExtra("text", editText.getText().toString());
            startActivity(changeTitleIntent);
            }
        });
    }
}
