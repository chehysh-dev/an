package com.example.pract25;

import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etId, etName;
    Button btnInsert, btnView, btnUpdate, btnDelete;
    TextView txtResult;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etId = findViewById(R.id.etId);
        etName = findViewById(R.id.etName);
        btnInsert = findViewById(R.id.btnInsert);
        btnView = findViewById(R.id.btnView);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);
        txtResult = findViewById(R.id.txtResult);

        db = new DBHelper(this);

        // CREATE / INSERT
        btnInsert.setOnClickListener(v -> {
            String idStr = etId.getText().toString().trim();
            String name = etName.getText().toString().trim();
            if (idStr.isEmpty() || name.isEmpty()) {
                Toast.makeText(this, "Please enter ID and Name", Toast.LENGTH_SHORT).show();
                return;
            }
            int id = Integer.parseInt(idStr);
            if (db.insertData(id, name)) {
                Toast.makeText(this, "Inserted", Toast.LENGTH_LONG).show();
                etId.setText("");
                etName.setText("");
            } else {
                Toast.makeText(this, "Failed", Toast.LENGTH_LONG).show();
            }
        });

        // READ / VIEW
        btnView.setOnClickListener(v -> {
            Cursor c = db.getData();
            if (c.getCount() == 0) {
                txtResult.setText("No records found.");
                return;
            }
            StringBuilder sb = new StringBuilder();
            while (c.moveToNext()) {
                sb.append("ID: ").append(c.getInt(0)).append("
");
                sb.append("Name: ").append(c.getString(1)).append("

");
            }
            txtResult.setText(sb.toString());
        });

        // UPDATE
        btnUpdate.setOnClickListener(v -> {
            String idStr = etId.getText().toString().trim();
            String name = etName.getText().toString().trim();
            if (idStr.isEmpty() || name.isEmpty()) {
                Toast.makeText(this, "Please enter ID and updated Name", Toast.LENGTH_SHORT).show();
                return;
            }
            int id = Integer.parseInt(idStr);
            if (db.updateData(id, name)) {
                Toast.makeText(this, "Updated", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Record Not Found", Toast.LENGTH_LONG).show();
            }
        });

        // DELETE
        btnDelete.setOnClickListener(v -> {
            String idStr = etId.getText().toString().trim();
            if (idStr.isEmpty()) {
                Toast.makeText(this, "Please enter ID to delete", Toast.LENGTH_SHORT).show();
                return;
            }
            int id = Integer.parseInt(idStr);
            if (db.deleteData(id)) {
                Toast.makeText(this, "Deleted", Toast.LENGTH_LONG).show();
                etId.setText("");
                etName.setText("");
            } else {
                Toast.makeText(this, "Record Not Found", Toast.LENGTH_LONG).show();
            }
        });
    }
}
