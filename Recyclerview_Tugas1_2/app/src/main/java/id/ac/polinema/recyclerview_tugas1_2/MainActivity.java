package id.ac.polinema.recyclerview_tugas1_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview_tugas1_2.adapters.RaketAdapters;
import id.ac.polinema.recyclerview_tugas1_2.models.RaketModels;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvraket;
    List<RaketModels> raketModelsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvraket = findViewById(R.id.rvraket);
        RaketModels raketModels = new RaketModels("ASTROX 88 S","H.M. GRAPHITE/NANOMETRIC/Tungsten","Emerald Green", R.drawable.ax88s_01);
        raketModelsList.add(raketModels);
        raketModels = new RaketModels("ASTROX 99","H.M. GRAPHITE/Namd/NANOMETRIC/Tungsten","Sunshine Orange", R.drawable.ax99);
        raketModelsList.add(raketModels);
        raketModels = new RaketModels("CARBONEX 8000 N","Graphite","Dark Red", R.drawable.carbo8000n);
        raketModelsList.add(raketModels);
        raketModels = new RaketModels("VOLTRIC Z-FORCE Ⅱ","H.M. Graphite, Sound Filter, NANOMETRIC, Tungsten","Black/Black", R.drawable.vtzf2_1);
        raketModelsList.add(raketModels);
        raketModels = new RaketModels("DUORA 55","H.M. Graphite/NANOMETRIC ß","Cyan", R.drawable.duora_55);
        raketModelsList.add(raketModels);

        RaketAdapters raketAdapters = new RaketAdapters(raketModelsList);
        rvraket.setAdapter(raketAdapters);
        rvraket.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
    }
}
