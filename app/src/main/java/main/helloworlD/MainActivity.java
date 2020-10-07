package main.helloworlD;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buttonToast;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.viewContador);
        buttonToast = findViewById(R.id.toastButton);
        buttonToast.setOnClickListener(new onClickListener());
    }

    public void toastButton(View view) {
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(this, "hola toast", duration);
        toast.show();
    }

    public void sumaButton(View view) {
        textView.setText(Integer.toString(++contador));
    }

    public void resetContador(View view){
        contador=0;
        textView.setText(Integer.toString(contador));
    }

    private class onClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            toastButton(v);
        }
    }
}