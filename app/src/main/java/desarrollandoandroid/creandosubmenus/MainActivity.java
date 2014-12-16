package desarrollandoandroid.creandosubmenus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        switch (item.getItemId()){
            //Submenú primeros pasos
            case R.id.subUno:
                Intent unoIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://desarrollandoandroid.wordpress.com/2014/06/23/entorno-de-desarrollo-android-studio/"));
                startActivity(unoIntent);
                return true;
            case R.id.subDos:
                Intent dosIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://desarrollandoandroid.wordpress.com/2014/06/25/familiarizandonos-con-android-studio/"));
                startActivity(dosIntent);
                return true;
            case R.id.subTres:
                Intent tresIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://desarrollandoandroid.wordpress.com/2014/06/24/estructura-de-un-proyecto-android/"));
                startActivity(tresIntent);
                return true;
            case R.id.subCuatro:
                Intent cuatroIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://desarrollandoandroid.wordpress.com/2014/06/26/entendiendo-el-funcionamiento-de-hola-mundo-en-android/"));
                startActivity(cuatroIntent);
                return true;
            case R.id.subCinco:
                Intent cincoIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://desarrollandoandroid.wordpress.com/2014/06/27/los-diferentes-tipos-de-layouts/"));
                startActivity(cincoIntent);
                return true;
            case R.id.subSeis:
                Intent seisIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://desarrollandoandroid.wordpress.com/2014/06/28/atributos-xml/"));
                startActivity(seisIntent);
                return true;
            //submenú controles
            case R.id.subSiete:
                Intent sieteIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://desarrollandoandroid.wordpress.com/2014/07/06/creando-botones/"));
                startActivity(sieteIntent);
                return true;
            case R.id.subOcho:
                Intent ochoIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://desarrollandoandroid.wordpress.com/2014/09/15/creando-cajas-de-textos/"));
                startActivity(ochoIntent);
                return true;
            case R.id.subNueve:
                Intent nueveIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://desarrollandoandroid.wordpress.com/2014/11/29/insertando-imagenes-scrollwiews-y-vistas-portrait-landscape/"));
                startActivity(nueveIntent);
                return true;
            case R.id.subDiez:
                Intent diezIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://desarrollandoandroid.wordpress.com/2014/11/30/insertando-ratingbar-seekbar-y-webview/"));
                startActivity(diezIntent);
                return true;
            //Tercera opción del menún
            case R.id.interfazGrafica:
                Intent onceIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://desarrollandoandroid.wordpress.com/2014/06/22/creando-un-menu-de-opciones/"));
                startActivity(onceIntent);

        }
        return super.onOptionsItemSelected(item);
    }
}
