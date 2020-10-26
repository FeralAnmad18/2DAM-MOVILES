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
    Button buttonSuma;
    Button buttonReset;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.viewContador);
        buttonToast = findViewById(R.id.toastButton);
        buttonToast.setOnClickListener(new onClickListener());
        buttonSuma = findViewById(R.id.countButton);
        buttonSuma.setOnClickListener(new onClickListener1());
        buttonReset = findViewById(R.id.resetButtom);
        buttonReset.setOnClickListener(new onClickListener2());

    }

    public void toastButton(View view) {
        int duration = Toast.LENGTH_LONG;

        String mensaje = getString(R.string.hello_toast);
        Toast toast = Toast.makeText(this, mensaje, duration);
        toast.show();
    }

    public void sumaButton(View view) {
        textView.setText(Integer.toString(++contador));
    }

    public void resetContador(View view) {
        contador = 0;
        textView.setText(Integer.toString(contador));
        /*sffjfdf*/
    }

    private class onClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            toastButton(v);

        }
    }

    private class onClickListener1 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            sumaButton(v);
        }
    }

    private class onClickListener2 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            resetContador(v);
        }
    }
}