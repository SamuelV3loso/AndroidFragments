package br.com.ibgenesis.atmconsultoriamanhanew.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import br.com.ibgenesis.atmconsultoriamanhanew.R;
import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sobre);

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.logo)
                .setDescription("jfçlkasdjfçlkajsdçflkjasdçjfkdsfgadsfdfdfdsdasfasdfdsf")
                .addGroup("Fale conosco")
                .addEmail("atmconsultoria@gmail.com")
                .addWebsite("http://SamuelV3loso.github.io/")
                .addFacebook("samuelveloso")
                .addTwitter("samuelvelloso")
                .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
                .addPlayStore("com.ideashower.readitlater.pro")
                .addGitHub("medyo")
                .addInstagram("_samuelveloso")
                .create();

        setContentView(aboutPage);
    }

}
