package com.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtPopularMovies;
    private Button mBtStockHawk;
    private Button mBtBuildItBigger;
    private Button mBtMakeYourAppMaterial;
    private Button mBtGoUbiquitous;
    private Button mBtCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtPopularMovies = (Button) findViewById(R.id.bt_popular_movies);
        mBtStockHawk = (Button) findViewById(R.id.bt_stock_hawk);
        mBtBuildItBigger = (Button) findViewById(R.id.bt_build_it_bigger);
        mBtMakeYourAppMaterial = (Button) findViewById(R.id.bt_make_your_app_material);
        mBtGoUbiquitous = (Button) findViewById(R.id.bt_go_ubiquitous);
        mBtCapstone = (Button) findViewById(R.id.bt_capstone);

        mBtPopularMovies.setOnClickListener(this);
        mBtPopularMovies.setTag(R.string.popular_movies_label);

        mBtStockHawk.setOnClickListener(this);
        mBtStockHawk.setTag(R.string.stock_hawk_label);

        mBtBuildItBigger.setOnClickListener(this);
        mBtBuildItBigger.setTag(R.string.build_it_bigger_label);

        mBtMakeYourAppMaterial.setOnClickListener(this);
        mBtMakeYourAppMaterial.setTag(R.string.make_your_app_material_label);

        mBtGoUbiquitous.setOnClickListener(this);
        mBtGoUbiquitous.setTag(R.string.go_ubiquitous_label);

        mBtCapstone.setOnClickListener(this);
        mBtCapstone.setTag(R.string.capstone_label);
    }

    @Override
    public void onClick(View v) {
        String label = getString((int) v.getTag());
        Toast.makeText(this, "This button will lauch my " + label + " app", Toast.LENGTH_SHORT).show();
    }
}
