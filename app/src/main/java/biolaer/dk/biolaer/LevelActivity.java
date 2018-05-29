package biolaer.dk.biolaer;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        // Tvinger activityen til at være i Portrait orientation mode.
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button infoBtn = (Button) findViewById(R.id.infoBtn);
        final Button easyBtn = (Button) findViewById(R.id.easyBtn);
        final Button hardBtn = (Button) findViewById(R.id.hardBtn);
        Button returnBtn = (Button) findViewById(R.id.returnBtn);
        Button optionsBtn = (Button) findViewById(R.id.optionsBtn);

        //Metode til info-knappen, som ændret teksten på knapperne frem og tilbage.
        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (easyBtn.getText()=="Let"){
                easyBtn.setText("Direkte ELISA");
                hardBtn.setText("Indirekte Sandwich ELISA");}
                else{
                    easyBtn.setText("Let");
                    hardBtn.setText("Svær");
                }
            }

        });


        //Metode som får returnBtn til at hoppe tilbage activiten, som var før den nuværende.
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LevelActivity.super.onBackPressed();
            }
        });

        optionsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent optionsActivity = new Intent(getApplicationContext(), OptionsActivity.class);
                startActivity(optionsActivity);
            }
        });
    }
}
