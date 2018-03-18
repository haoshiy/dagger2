package com.hao.myapplication.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hao.myapplication.R;
import com.hao.myapplication.di.component.DaggerMain3Component;
import com.hao.myapplication.di.component.Main3Component;
import com.hao.myapplication.di.module.Main3Module;

public class Main3Activity extends AppCompatActivity {

    private Main3Component main3Component;

    public Main3Component getMain3Component() {
        return main3Component;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        main3Component = DaggerMain3Component.builder().main3Module(new Main3Module(10)).build();
        main3Component.inject(this);


        getSupportFragmentManager().beginTransaction().add(R.id.frame,new Main3Fragment()).commit();

    }
}
