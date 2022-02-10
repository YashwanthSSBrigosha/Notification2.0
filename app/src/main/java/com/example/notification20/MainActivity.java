package com.example.notification20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<AllNotificationModel> allNotificationModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createCard();
        buildRecyclerView();
    }

    private void buildRecyclerView() {
        recyclerView = findViewById(R.id.recv_for_all_notification);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new AllNotificationAdapter(allNotificationModels);
        recyclerView.setAdapter(adapter);
    }

    private void createCard() {

        allNotificationModels = new ArrayList<>();
        allNotificationModels.add(new AllNotificationModel("New registration request","12/04/2021","12/04/2021"));
        allNotificationModels.add(new AllNotificationModel("New registration request","12/04/2021","12/04/2021"));
        allNotificationModels.add(new AllNotificationModel("New registration request","12/04/2021","12/04/2021"));
        allNotificationModels.add(new AllNotificationModel("New registration request","12/04/2021","12/04/2021"));
        allNotificationModels.add(new AllNotificationModel("New registration request","12/04/2021","12/04/2021"));
        allNotificationModels.add(new AllNotificationModel("New registration request","12/04/2021","12/04/2021"));
        allNotificationModels.add(new AllNotificationModel("New registration request","12/04/2021","12/04/2021"));
    }


}