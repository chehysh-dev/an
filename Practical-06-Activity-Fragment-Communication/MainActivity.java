package com.example.pract6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MessageFragment.OnMessageListener {
    private TextView txtActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtActivity = findViewById(R.id.txtActivity);

        // Create Fragment instance and pass data using Bundle
        MessageFragment fragment = new MessageFragment();
        Bundle bundle = new Bundle();
        bundle.putString("message", "Hello Fragment! (From Activity)");
        fragment.setArguments(bundle);

        getSupportFragmentManager()
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit();
    }

    // Callback method receiving message from Fragment
    @Override
    public void onMessageReceived(String message) {
        txtActivity.setText(message);
    }
}
