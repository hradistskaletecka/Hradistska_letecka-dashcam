package slozka;


import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import slozka.dashcam_java.R;
import slozka.dashcam_java.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {


    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//vrátít///////////////////////////////////////////////////////

        //konec
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        //založení souboru

        //File file = new File(getExternalFilesDir(null), "subin");
        File filer = new File(getExternalFilesDir(null), new SimpleDateFormat("'tlacitko1.let'").format(new Date()));
        if (filer.exists()) {} else {
        try {
            FileWriter myWriter = new FileWriter(filer);
            myWriter.write("Nehoda");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Chyba!");
            e.printStackTrace();
        }
        }//konec podmínky

        File filere = new File(getExternalFilesDir(null), new SimpleDateFormat("'tlacitko2.let'").format(new Date()));
        if (filere.exists()) {} else {
            try {
                FileWriter myWriter = new FileWriter(filere);
                myWriter.write("Přednost");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("Chyba!");
                e.printStackTrace();
            }
        }//konec podmínky
        File filerx = new File(getExternalFilesDir(null), new SimpleDateFormat("'tlacitko3.let'").format(new Date()));
        if (filerx.exists()) {} else {
            try {
                FileWriter myWriter = new FileWriter(filerx);
                myWriter.write("Směrovky");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("Chyba!");
                e.printStackTrace();
            }
        }//konec podmínky
        File filerl = new File(getExternalFilesDir(null), new SimpleDateFormat("'tlacitko4.let'").format(new Date()));
        if (filerl.exists()) {} else {
            try {
                FileWriter myWriter = new FileWriter(filerl);
                myWriter.write("Ostatní");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("Chyba!");
                e.printStackTrace();
            }
        }//konec podmínky

        //konec
//***********posunuté - změna názvu tlačítka 1
        Button button = null;
        try {
            File file = new File(getExternalFilesDir(null), "tlacitko1.let");
            String content = "";
                Scanner scanner = new Scanner(file);
                content = scanner.useDelimiter("\\Z").next();
            scanner.close();

                if (content=="") {  content = "Nehoda";
            }

            button = (Button) findViewById(R.id.buttonnehoda);
            button.setText(content);


        } catch (IOException e) {
            e.printStackTrace();
        }

        //************** konec název tlačítka
        //***********posunuté - změna názvu tlačítka 2
        Button button2 = null;
        try {
            File file = new File(getExternalFilesDir(null), "tlacitko2.let");
            String content2 = "";
            Scanner scanner = new Scanner(file);
            content2 = scanner.useDelimiter("\\Z").next();
            scanner.close();

            if (content2=="") {  content2 = "Přednost";
            }
            button2 = (Button) findViewById(R.id.button2);


            button2.setText(content2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //************** konec název tlačítka
        //***********posunuté - změna názvu tlačítka 3
        Button button3 = null;
        try {
            File file = new File(getExternalFilesDir(null), "tlacitko3.let");
            String content3 = "";
            Scanner scanner = new Scanner(file);
            content3 = scanner.useDelimiter("\\Z").next();
            scanner.close();

            if (content3=="") {  content3 = "Směrovky";
            }
            button3 = (Button) findViewById(R.id.button3);


            button3.setText(content3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //************** konec název tlačítka
        //***********posunuté - změna názvu tlačítka 4
        Button button4 = null;
        try {
            File file = new File(getExternalFilesDir(null), "tlacitko4.let");
            String content4 = "";
            Scanner scanner = new Scanner(file);
            content4 = scanner.useDelimiter("\\Z").next();
            scanner.close();

            if (content4=="") {  content4 = "Ostatní";
            }
            button4 = (Button) findViewById(R.id.button4);


            button4.setText(content4);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //************** konec název tlačítka
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   Snackbar.make(view, "Stojí to za starou belu!", Snackbar.LENGTH_LONG)
                //         .setAnchorView(R.id.fab)
                //       .setAction("Action", null).show();

                // Získejte inflater
                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                // Získejte layout, který obsahuje tlačítko
                View layout = inflater.inflate(R.layout.fragment_first, null);
                setContentView(layout);
                // Najděte tlačítko, které chcete skrýt
          //*      Button buttonnehoda = (Button) layout.findViewById(R.id.buttonnehoda);
                // Button buttonnehoda = (Button) layout.findViewById(R.id.buttonnehoda);
          //*      buttonnehoda.setVisibility(View.GONE);
          //*      Button button2 = (Button) layout.findViewById(R.id.button2);

          //*      button2.setVisibility(View.GONE);
          //*      Button button3 = (Button) layout.findViewById(R.id.button3);
           //*     button3.setVisibility(View.GONE);
          //*      Button button4 = (Button) layout.findViewById(R.id.button4);

          //*      button4.setVisibility(View.GONE);
           //*     Button button = (Button) layout.findViewById(R.id.button4);

          //*     button.setVisibility(View.GONE);


                // Najděte tlačítko, které chcete skrýt
                Button button_first = (Button) layout.findViewById(R.id.button_first);
                //  Button buttonnehoda = (Button) layout.findViewById(R.id.button_first);
               button_first.setVisibility(View.GONE);

                //pokus***************************

                View footer1 = layout.findViewById(R.id.footer1);
                //  Button buttonnehoda = (Button) layout.findViewById(R.id.button_first);
                footer1.setVisibility(View.GONE);

// změna textu editu
                EditText edit1a = null;
                try {
                    File file = new File(getExternalFilesDir(null), "tlacitko1.let");
                    String content = "";
                    Scanner scanner = new Scanner(file);
                    content = scanner.useDelimiter("\\Z").next();
                    scanner.close();

                    if (content=="") {  content = "Nehoda";
                    }
                    EditText edit1 = (EditText) findViewById(R.id.edit1);
                    edit1.setText(content);


                } catch (IOException e) {
                    e.printStackTrace();
                }
                //***********posunuté - změna názvu tlačítka 2
                EditText edit2a = null;
                try {
                    File file = new File(getExternalFilesDir(null), "tlacitko2.let");
                    String content2 = "";
                    Scanner scanner = new Scanner(file);
                    content2 = scanner.useDelimiter("\\Z").next();
                    scanner.close();

                    if (content2=="") {  content2 = "Přednost";
                    }
                    EditText edit2 = (EditText) findViewById(R.id.edit2);
                    edit2.setText(content2);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                //************** konec název tlačítka
                //***********posunuté - změna názvu tlačítka 3
                EditText edit3a = null;
                try {
                    File file = new File(getExternalFilesDir(null), "tlacitko3.let");
                    String content3 = "";
                    Scanner scanner = new Scanner(file);
                    content3 = scanner.useDelimiter("\\Z").next();
                    scanner.close();

                    if (content3=="") {  content3 = "Směrovky";
                    }
                    EditText edit3 = (EditText) findViewById(R.id.edit3);
                    edit3.setText(content3);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                //************** konec název tlačítka
                //***********posunuté - změna názvu tlačítka 4
                EditText edit4a = null;
                try {
                    File file = new File(getExternalFilesDir(null), "tlacitko4.let");
                    String content4 = "";
                    Scanner scanner = new Scanner(file);
                    content4 = scanner.useDelimiter("\\Z").next();
                    scanner.close();

                    if (content4=="") {  content4 = "Ostatní";
                    }
                    EditText edit4 = (EditText) findViewById(R.id.edit4);
                    edit4.setText(content4);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                //************** konec název tlačítka*****************************************************************************

            }  // ukončuje tllačítko tužky

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
//přidání kůvlu individuálnímu tlačítku
        Button button789 = null;
        String content789 = "";
        try {
            File file789 = new File(getExternalFilesDir(null), "tlacitko1.let");
            if (file789.exists())  {             Scanner scanner = new Scanner(file789);
                content789 = scanner.useDelimiter("\\Z").next();
                scanner.close();  }
            else { content789 = "Nehoda";  }


           // if (content789.equals("")) {  }




        } catch (IOException e) {
            e.printStackTrace();
        }
        //konec přidání
        //File file = new File(getExternalFilesDir(null), "subin");
      //  File file = new File(getExternalFilesDir(null), new SimpleDateFormat("yyyy.MM.dd HH:mm:ss' nnn'content789").format(new Date()));
        File file = new File(getExternalFilesDir(null), new SimpleDateFormat("yyyy.MM.dd HH:mm:ss' '").format(new Date())+content789);
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
//přidání kůvlu individuálnímu tlačítku
        Button button7899 = null;
        String content7899 = "";
        try {
            File file7899 = new File(getExternalFilesDir(null), "tlacitko2.let");

            if (file7899.exists())  {             Scanner scanner = new Scanner(file7899);
                content7899 = scanner.useDelimiter("\\Z").next();
                scanner.close();  }
            else { content7899 = "Přednost";  }



        } catch (IOException e) {
            e.printStackTrace();
        }
        //konec přidání
        //File file = new File(getExternalFilesDir(null), "subin");
        //  File file = new File(getExternalFilesDir(null), new SimpleDateFormat("yyyy.MM.dd HH:mm:ss' nnn'content789").format(new Date()));
        File file = new File(getExternalFilesDir(null), new SimpleDateFormat("yyyy.MM.dd HH:mm:ss' '").format(new Date())+content7899);
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
//přidání kůvlu individuálnímu tlačítku
        Button button7898 = null;
        String content7898 = "";
        try {
            File file7898 = new File(getExternalFilesDir(null), "tlacitko3.let");
            if (file7898.exists())  {             Scanner scanner = new Scanner(file7898);
                content7898 = scanner.useDelimiter("\\Z").next();
                scanner.close();  }
            else { content7898 = "Směrovky";  }



        } catch (IOException e) {
            e.printStackTrace();
        }
        //konec přidání
        //File file = new File(getExternalFilesDir(null), "subin");
        //  File file = new File(getExternalFilesDir(null), new SimpleDateFormat("yyyy.MM.dd HH:mm:ss' nnn'content789").format(new Date()));
        File file = new File(getExternalFilesDir(null), new SimpleDateFormat("yyyy.MM.dd HH:mm:ss' '").format(new Date())+content7898);
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
//přidání kůvlu individuálnímu tlačítku
        Button button7897 = null;
        String content7897 = "";
        try {
            File file7897 = new File(getExternalFilesDir(null), "tlacitko4.let");
            if (file7897.exists())  {             Scanner scanner = new Scanner(file7897);
                content7897 = scanner.useDelimiter("\\Z").next();
                scanner.close();  }
            else { content7897 = "Ostatní";  }



        } catch (IOException e) {
            e.printStackTrace();
        }
        //konec přidání
        //File file = new File(getExternalFilesDir(null), "subin");
        //  File file = new File(getExternalFilesDir(null), new SimpleDateFormat("yyyy.MM.dd HH:mm:ss' nnn'content789").format(new Date()));
        File file = new File(getExternalFilesDir(null), new SimpleDateFormat("yyyy.MM.dd HH:mm:ss' '").format(new Date())+content7897);
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
                        String content = "";
                        String content2 = "";
                        String content3 = "";
                        String content4 = "";
                        //přidáno*********************************************************************************
                        //***********posunuté - změna názvu tlačítka 1
                        Button button = null;


                        try {
                            File file = new File(getExternalFilesDir(null), "tlacitko1.let");

                            Scanner scanner = new Scanner(file);
                            content = scanner.useDelimiter("\\Z").next();
                            scanner.close();

                            if (content=="") {  content = "Nehoda";
                            }



                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        //************** konec název tlačítka
                        //***********posunuté - změna názvu tlačítka 2
                        Button button2 = null;
                        try {
                            File file = new File(getExternalFilesDir(null), "tlacitko2.let");
                           // String content2 = "";
                            Scanner scanner = new Scanner(file);
                            content2 = scanner.useDelimiter("\\Z").next();
                            scanner.close();

                            if (content2=="") {  content2 = "Přednost";
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        //************** konec název tlačítka
                        //***********posunuté - změna názvu tlačítka 3
                        Button button3 = null;
                        try {
                            File file = new File(getExternalFilesDir(null), "tlacitko3.let");
                           // String content3 = "";
                            Scanner scanner = new Scanner(file);
                            content3 = scanner.useDelimiter("\\Z").next();
                            scanner.close();

                            if (content3=="") {  content3 = "Směrovky";
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        //************** konec název tlačítka
                        //***********posunuté - změna názvu tlačítka 4
                        Button button4 = null;
                        try {
                            File file = new File(getExternalFilesDir(null), "tlacitko4.let");
                          //  String content4 = "";
                            Scanner scanner = new Scanner(file);
                            content4 = scanner.useDelimiter("\\Z").next();
                            scanner.close();

                            if (content4=="") {  content4 = "Ostatní";
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        //************** konec název tlačítka
                        //konec přidání************************************************************************
                        File directory = new File(getExternalFilesDir(null).toString());
                        File[] files = directory.listFiles();
                        for (File file : files){
                            if (!file.isDirectory()){
                                file.delete();
                            }
                        }
//obnova souborů názvů tlačítek ppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp
                        //ukládání nastavení tlačítka 1

                        //File file = new File(getExternalFilesDir(null), "subin");
                        File file = new File(getExternalFilesDir(null), new SimpleDateFormat("'tlacitko1.let'").format(new Date()));
                        try {
                            FileWriter myWriter = new FileWriter(file);

                            myWriter.write(content);
                            myWriter.close();
                        } catch (IOException e) {
                            System.out.println("Chyba!");
                            e.printStackTrace();
                        }

                        // tlačítko 1 konec
                        //ukládání nastavení tlačítka 2

                        //File file = new File(getExternalFilesDir(null), "subin");
                        File file2 = new File(getExternalFilesDir(null), new SimpleDateFormat("'tlacitko2.let'").format(new Date()));
                        try {
                            FileWriter myWriter = new FileWriter(file2);
                            myWriter.write(content2);
                            myWriter.close();
                        } catch (IOException e) {
                            System.out.println("Chyba!");
                            e.printStackTrace();
                        }
                        //ukládání nastavení tlačítka 3

                        //File file = new File(getExternalFilesDir(null), "subin");
                        File file3 = new File(getExternalFilesDir(null), new SimpleDateFormat("'tlacitko3.let'").format(new Date()));
                        try {
                            FileWriter myWriter = new FileWriter(file3);
                            myWriter.write(content3);
                            myWriter.close();
                        } catch (IOException e) {
                            System.out.println("Chyba!");
                            e.printStackTrace();
                        }
                        //ukládání nastavení tlačítka 4

                        //File file = new File(getExternalFilesDir(null), "subin");
                        File file4 = new File(getExternalFilesDir(null), new SimpleDateFormat("'tlacitko4.let'").format(new Date()));
                        try {
                            FileWriter myWriter = new FileWriter(file4);
                            myWriter.write(content4);
                            myWriter.close();
                        } catch (IOException e) {
                            System.out.println("Chyba!");
                            e.printStackTrace();
                        }

                        //konec obnovy pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp
                        Toast.makeText(MainActivity.this, "Odstraněno", Toast.LENGTH_SHORT).show();
                        Button buttonb = findViewById(R.id.button_second);
                        buttonb.performClick();

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
//obnovení individuálního značení názvů tlačítek


        // konec obnovování

    // Konec koše

}

    public void tlacitkonastaveni(View view) {
        //ukládání nastavení tlačítka 1
        EditText edit1 = (EditText)findViewById(R.id.edit1);
        String text = edit1.getText().toString();
        //File file = new File(getExternalFilesDir(null), "subin");
        File file = new File(getExternalFilesDir(null), new SimpleDateFormat("'tlacitko1.let'").format(new Date()));
       try {
           FileWriter myWriter = new FileWriter(file);
          myWriter.write(text);
         myWriter.close();
        } catch (IOException e) {
            System.out.println("Chyba!");
           e.printStackTrace();
        }

        //ukládání nastavení tlačítka 2
        EditText edit2 = (EditText)findViewById(R.id.edit2);
        String text2 = edit2.getText().toString();
        //File file = new File(getExternalFilesDir(null), "subin");
        File file2 = new File(getExternalFilesDir(null), new SimpleDateFormat("'tlacitko2.let'").format(new Date()));
        try {
            FileWriter myWriter = new FileWriter(file2);
            myWriter.write(text2);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Chyba!");
            e.printStackTrace();
        }
        //ukládání nastavení tlačítka 3
        EditText edit3 = (EditText)findViewById(R.id.edit3);
        String text3 = edit3.getText().toString();
        //File file = new File(getExternalFilesDir(null), "subin");
        File file3 = new File(getExternalFilesDir(null), new SimpleDateFormat("'tlacitko3.let'").format(new Date()));
        try {
            FileWriter myWriter = new FileWriter(file3);
            myWriter.write(text3);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Chyba!");
            e.printStackTrace();
        }
        //ukládání nastavení tlačítka 4
        EditText edit4 = (EditText)findViewById(R.id.edit4);
        String text4 = edit4.getText().toString();
        //File file = new File(getExternalFilesDir(null), "subin");
        File file4 = new File(getExternalFilesDir(null), new SimpleDateFormat("'tlacitko4.let'").format(new Date()));
        try {
            FileWriter myWriter = new FileWriter(file4);
            myWriter.write(text4);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Chyba!");
            e.printStackTrace();
        }



        // obnovení zobrazení
        // Získejte inflater
        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
        // Získejte layout, který obsahuje tlačítko
        View layout = inflater.inflate(R.layout.fragment_first, null);
        setContentView(layout);
        // Najděte tlačítko, které chcete skrýt
    //*    Button buttonnehoda = (Button) layout.findViewById(R.id.buttonnehoda);
        // Button buttonnehoda = (Button) layout.findViewById(R.id.buttonnehoda);
    //*    buttonnehoda.setVisibility(View.VISIBLE);
    //*    Button button2 = (Button) layout.findViewById(R.id.button2);

    //*    button2.setVisibility(View.VISIBLE);
    //*    Button button3 = (Button) layout.findViewById(R.id.button3);
    //*    button3.setVisibility(View.VISIBLE);
    //*    Button button4 = (Button) layout.findViewById(R.id.button4);

    //*    button4.setVisibility(View.VISIBLE);
    //*    Button button = (Button) layout.findViewById(R.id.button4);

    //*    button.setVisibility(View.VISIBLE);



        // Najděte tlačítko, které chcete skrýt
        Button button_first = (Button) layout.findViewById(R.id.button_first);
        //  Button buttonnehoda = (Button) layout.findViewById(R.id.button_first);
        button_first.setVisibility(View.VISIBLE);

        //pokus***************************

        View footer1 = layout.findViewById(R.id.footer1);
        //  Button buttonnehoda = (Button) layout.findViewById(R.id.button_first);
        footer1.setVisibility(View.VISIBLE);



        //konec****************************
        Toast.makeText(MainActivity.this, "Uloženo", Toast.LENGTH_SHORT).show();
        //doplněné
        SystemClock.sleep(100); //ms
        //***********posunuté - změna názvu tlačítka 1
        Button button00 = null;
        try {
            File file00 = new File(getExternalFilesDir(null), "tlacitko1.let");
            String content00 = "";
            Scanner scanner = new Scanner(file00);
            content00 = scanner.useDelimiter("\\Z").next();
            scanner.close();

            if (content00=="") {  content00 = "Nehoda";
            }

            button00 = (Button) findViewById(R.id.buttonnehoda);
            button00.setText(content00);


        } catch (IOException e) {
            e.printStackTrace();
        }

        //************** konec název tlačítka
        //***********posunuté - změna názvu tlačítka 2
        Button button200 = null;
        try {
            File file00 = new File(getExternalFilesDir(null), "tlacitko2.let");
            String content200 = "";
            Scanner scanner = new Scanner(file00);
            content200 = scanner.useDelimiter("\\Z").next();
            scanner.close();

            if (content200=="") {  content200 = "Přednost";
            }
            button200 = (Button) findViewById(R.id.button2);


            button200.setText(content200);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //************** konec název tlačítka
        //***********posunuté - změna názvu tlačítka 3
        Button button300 = null;
        try {
            File file00 = new File(getExternalFilesDir(null), "tlacitko3.let");
            String content300 = "";
            Scanner scanner = new Scanner(file00);
            content300 = scanner.useDelimiter("\\Z").next();
            scanner.close();

            if (content300=="") {  content300 = "Směrovky";
            }
            button300 = (Button) findViewById(R.id.button3);


            button300.setText(content300);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //************** konec název tlačítka
        //***********posunuté - změna názvu tlačítka 4
        Button button400 = null;
        try {
            File file00 = new File(getExternalFilesDir(null), "tlacitko4.let");
            String content400 = "";
            Scanner scanner = new Scanner(file00);
            content400 = scanner.useDelimiter("\\Z").next();
            scanner.close();

            if (content400=="") {  content400 = "Ostatní";
            }
            button400 = (Button) findViewById(R.id.button4);


            button400.setText(content400);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(this, "Aplikace se nyní vypne, je nutné ji znovu spustit.", Toast.LENGTH_LONG).show();
        //************** konec název tlačítka
       SystemClock.sleep(500); //ms
finish();

        //konec doplnění
    }
    // konec uložení nastavení

}