package com.example.pract6;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class MessageFragment extends Fragment {
    private TextView txtFragment;
    private Button btnSend;
    private OnMessageListener listener;

    // Interface for Fragment-to-Activity callback
    public interface OnMessageListener {
        void onMessageReceived(String message);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnMessageListener) {
            listener = (OnMessageListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnMessageListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        txtFragment = view.findViewById(R.id.txtFragment);
        btnSend = view.findViewById(R.id.btnSend);

        // Receive data passed from Activity via Bundle
        Bundle bundle = getArguments();
        if (bundle != null) {
            String receivedMsg = bundle.getString("message", "");
            txtFragment.setText(receivedMsg);
        }

        // Send data back to Activity via interface callback
        btnSend.setOnClickListener(v -> {
            if (listener != null) {
                listener.onMessageReceived("Hello Activity! Message received from Fragment.");
            }
        });

        return view;
    }
}
