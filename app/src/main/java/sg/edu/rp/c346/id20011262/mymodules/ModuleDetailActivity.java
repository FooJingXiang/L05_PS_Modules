package sg.edu.rp.c346.id20011262.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvAns;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        Intent intentReceive = getIntent();
        String selected = intentReceive.getStringExtra("option");

        tvAns = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        if(selected.equalsIgnoreCase("c346")) {
            tvAns.setText("Module Code: " + selected + "\n Module Name: Android Programming " +
                    "\n Academic Year: 2020 \n Semester: 1 \n Module Credit: 4 \n Venue: W66M" );
        } else if (selected.equalsIgnoreCase("c349")) {
            tvAns.setText("Module Code: " + selected + "\n Module Name: iPad Programming " +
                    "\n Academic Year: 2021 \n Semester: 1 \n Module Credit: 4 \n Venue: W66C" );
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}