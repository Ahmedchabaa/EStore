package com.example.estore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gril;
    String[] x = new String[]{"Les Ordinateurs","Les Composants","Le Stockage","Les Moniteurs","Les Accessoires"};
    int[] image = {R.drawable.ordinateur,R.drawable.composants,R.drawable.stockage,R.drawable.moniteurs,R.drawable.accessoires};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gril = findViewById(R.id.grille);
        GridAdapter s = new GridAdapter(this, x,image);
        gril.setAdapter(s);
        gril.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(i);
                switch (i){
                    case 0:
                        Intent a=new Intent(MainActivity.this,ComputersActivity.class);
                        startActivity(a);
                        break;
                    case 1:
                        Intent b=new Intent(MainActivity.this,ComposantsActivity.class);
                        startActivity(b);
                        break;
                    case 2:
                        Intent c=new Intent(MainActivity.this,StockageActivity.class);
                        startActivity(c);
                        break;
                    case 3:
                        Intent d=new Intent(MainActivity.this,MoniteursActivity.class);
                        startActivity(d);
                        break;
                    case 4:
                        Intent e=new Intent(MainActivity.this,AccessoiresActivity.class);
                        startActivity(e);
                        break;
                }
            }
        });
    }
}