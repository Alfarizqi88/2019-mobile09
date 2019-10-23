package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapters;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSuperhero;
    List<SuperHero> superHeroList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSuperhero = findViewById(R.id.rvSuperHero);
        SuperHero hero=new SuperHero("Petruk");
        superHeroList.add(hero);
        hero = new SuperHero("Gareng");
        superHeroList.add(hero);

        SuperHeroAdapters superHeroAdapters= new SuperHeroAdapters(superHeroList);

        rvSuperhero.setAdapter(superHeroAdapters);
        rvSuperhero.setLayoutManager(new LinearLayoutManager(this));
    }
}
