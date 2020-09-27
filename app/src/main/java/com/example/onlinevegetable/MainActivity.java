package com.example.onlinevegetable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.example.onlinevegetable.adapter.DiscountedProductAdapter;
import com.example.onlinevegetable.model.DiscountedProducts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView discountRecyclerView;
    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discountRecyclerView = findViewById(R.id.discountedRecycler);

        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1, R.drawable.discountberry));
        discountedProductsList.add(new DiscountedProducts(2,R.drawable.discountbrocoli));
        discountedProductsList.add(new DiscountedProducts(3,R.drawable.discountmeat));
        discountedProductsList.add(new DiscountedProducts(4, R.drawable.discountberry));
        discountedProductsList.add(new DiscountedProducts(5,R.drawable.discountbrocoli));
        discountedProductsList.add(new DiscountedProducts(6,R.drawable.discountmeat));

        setDiscountedRecycler(discountedProductsList);
    }

    private void setDiscountedRecycler(List<DiscountedProducts> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter( this, dataList );
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }
}
