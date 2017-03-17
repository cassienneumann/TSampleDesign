package osmbonuspacktuto.example.com.sampledesign.acceuil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import osmbonuspacktuto.example.com.sampledesign.MainActivity;
import osmbonuspacktuto.example.com.sampledesign.R;

public class Acceuil extends AppCompatActivity {

    private Button btn_create;
    private Button btn_next;
    private Button btn_sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        btn_create = (Button) findViewById(R.id.btn_create);
        btn_next = (Button) findViewById(R.id.btn_next);
        btn_sign = (Button) findViewById(R.id.btn_signin);

        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                View view_dialog = LayoutInflater.from(view.getContext()).inflate(R.layout.create_account,null,false);
                builder.setView(view_dialog);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();*/

                Intent intent = new Intent(Acceuil.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Acceuil.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });





    }
}
