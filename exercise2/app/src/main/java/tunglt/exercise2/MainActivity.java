package tunglt.exercise2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);
//        String color = "#D81B60";

        Intent intent = getIntent();
        if(intent != null){
            String text = intent.getStringExtra("text");
            if(text != null){
                textView.setText(text);
            }

            int color = intent.getIntExtra("textColor", 0);
            if(color != 0){
                textView.setTextColor(color);
            }
        }

//        textView.setTextColor(Color.parseColor(color));

        Button changeTitle = findViewById(R.id.changeTitle);
        changeTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(MainActivity.this, ChangeTitleActivity.class);
                mainIntent.putExtra("textColor", textView.getTextColors().getDefaultColor());
                mainIntent.putExtra("text", textView.getText().toString());
                startActivity(mainIntent);
            }
        });
    }
}
