package com.example.dashcam_java;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.Date;

import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import java.io.File;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.dashcam_java.databinding.ActivityMainBinding;
import android.view.Menu;
import android.view.MenuItem;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.Arrays;
import androidx.appcompat.app.*;
import android.app.Dialog;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
    public void buttonnehoda(View view)  {

        //File file = new File(getExternalFilesDir(null), "subin");
        File file = new File(getExternalFilesDir(null), new SimpleDateFormat("yyyy.MM.dd HH:mm:ss' NEHODA'").format(new Date()));
        try {
            FileWriter myWriter = new FileWriter(file);
            myWriter.write("");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Chyba!");
            e.printStackTrace();
        }

        if(file.exists()){
            Toast.makeText(this, "Uloženo", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "CHYBA, neuloženo!", Toast.LENGTH_SHORT).show();
        }


    }

    public void tlacitkoprednost(View view)  {

        //File file = new File(getExternalFilesDir(null), "subin");
        File file = new File(getExternalFilesDir(null), new SimpleDateFormat("yyyy.MM.dd HH:mm:ss' PŘEDNOST'").format(new Date()));
        try {
            FileWriter myWriter = new FileWriter(file);
            myWriter.write("");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Chyba!");
            e.printStackTrace();
        }

        if(file.exists()){
            Toast.makeText(this, "Uloženo", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "CHYBA, neuloženo!", Toast.LENGTH_SHORT).show();
        }


    }

    public void tlacitkosmerovky(View view)  {

        //File file = new File(getExternalFilesDir(null), "subin");
        File file = new File(getExternalFilesDir(null), new SimpleDateFormat("yyyy.MM.dd HH:mm:ss' SMĚROVKY'").format(new Date()));
        try {
            FileWriter myWriter = new FileWriter(file);
            myWriter.write("");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Chyba!");
            e.printStackTrace();
        }

        if(file.exists()){
            Toast.makeText(this, "Uloženo", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "CHYBA, neuloženo!", Toast.LENGTH_SHORT).show();
        }


    }
    public void tlacitkoostatni(View view)  {

        //File file = new File(getExternalFilesDir(null), "subin");
        File file = new File(getExternalFilesDir(null), new SimpleDateFormat("yyyy.MM.dd HH:mm:ss' OSTATNÍ'").format(new Date()));
        try {
            FileWriter myWriter = new FileWriter(file);
            myWriter.write("");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Chyba!");
            e.printStackTrace();
        }

        if(file.exists()){
            Toast.makeText(this, "Uloženo", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "CHYBA, neuloženo!", Toast.LENGTH_SHORT).show();
        }


    }

    // Přidáno pro tlačítko koše
    public void odpadkovykos(View view)  {

        new AlertDialog.Builder(this)
                .setTitle("Opravdu smazat?")
                .setMessage("Jste si jisti, že chcete smazat všechny záznamy?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Pokud uživatel klikne na tlačítko "Ano", provede se tato akce
                        File directory = new File(getExternalFilesDir(null).toString());
                        File[] files = directory.listFiles();
                        for (File file : files){
                            if (!file.isDirectory()){
                                file.delete();
                            }
                        }

                        Toast.makeText(MainActivity.this, "Odstraněno", Toast.LENGTH_SHORT).show();
                        Button button = findViewById(R.id.button_second);
                        button.performClick();

                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Pokud uživatel klikne na tlačítko "Ne", provede se tato akce
                       // Toast.makeText(this, "Ne", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();

// přidáno



        //konec přidání





    }
    // Konec koše

}