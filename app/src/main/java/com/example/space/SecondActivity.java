package com.example.space;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<planet> planets = new ArrayList<planet>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();


        RecyclerView recyclerView = findViewById(R.id.list_animal);


        planetAdapter adapter = new planetAdapter(this, planets);


        recyclerView.setAdapter(adapter);
    }



    private void setInitialData() {
   planets.add( new planet("Меркурий","Меркурий — наименьшая планета Солнечной системы и самая близкая к Солнцу.",
           R.drawable.mercury));
        planets.add( new planet("Венера","Венера — вторая по удалённости от Солнца и шестая по размеру планета Солнечной системы",
                R.drawable.venus));
         planets.add(new planet("Земля","Земля — третья по удалённости от Солнца планета Солнечной системы. Самая плотная, пятая по диаметру и массе среди всех планет",
                 R.drawable.earth));
         planets.add( new planet("Марс","Марс — четвёртая по удалённости от Солнца и седьмая по размеру планета Солнечной системы",
                 R.drawable.mars));
         planets.add ( new planet("Юпитер","Юпитер — крупнейшая планета Солнечной системы, пятая по удалённости от Солнца.",
                 R.drawable.jupiter));
         planets.add(new planet("Сатурн","Сатурн — шестая планета по удалённости от Солнца и вторая по размерам планета в Солнечной системе после Юпитера",
                 R.drawable.saturn));
         planets.add(new planet("Уран","Уран — планета Солнечной системы, седьмая по удалённости от Солнца, третья по диаметру и четвёртая по массе.",
                 R.drawable.uranus));
         planets.add(new planet("Нептун","Нептун — восьмая и самая дальняя от Солнца планета Солнечной системы.",
                 R.drawable.neptune));




    }

}