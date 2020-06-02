package com.example.ustglobalbecarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class segunda extends AppCompatActivity {
    Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        atras = findViewById(R.id.atras);

    }
    public void funcionKubera(View v){
        Intent intent4 = new Intent(Intent.ACTION_VIEW);
        intent4.setData(Uri.parse("https://idp.ust-global.com/adfs/ls/?client-request-id=4833569f-c00f-0000-52ff-ac67b066e653&username=&wa=wsignin1.0&wtrealm=urn%3afederation%3aMicrosoftOnline&wctx=estsredirect%3d2%26estsrequest%3drQIIAZ1Ru24TQRTdsZ0ltgKJIgo6UrhCGnvuzOw8LFHY3l0ilIiXwVKaaJ-xFcdrdteCpKSioEhNE4kihYUQokKIAlGmSos_AFlUiIoObEFBGXGKo_s4xbnn3ihCDRpV8gcMLxiTOAYcRIvqH6TrlbWTR2xz9ZNh3P_1eu9t_PXBS3RlnOV4b5D43qAWJAcTxHt5Psoa9fp88Xee9bw0GiX9Yb6Q1HfjJD3I6mEUe-NBXvOy0dP3CJ0jNENoUnhMqKYAYBGwddPmRGjLccCmrnDBYQ6bk2QKqG1bSrRAYEfYRLVbUtqCKgtcxYVD551uQ8vVzXbLFZy0iGRCa9exgTPp6LaUrmUJ4Th8Wli90xznPbqgJO0fRT8K5YXH3VGS5ZPihdJ5V6x6nDOIuY8DSiTmkjGsLUYw4wFRnvapr8KzopmMomE_PC-hb6UVUmwsL1fWjGvGhvGzhF4tzTN-8_mjfHG9u33yZXbaSU-Ns6U63xY7d_cfbjlZ0L112H0SdA81Azn09m_3Oy7fbN6TkKtg66iT3GQNODbRsWnOTPTdRM8vGR_K__WTaeUqJXR-pYWp2ADa4LoBYme6ApVykPipNwz74XoVwA8VUQwrGRHMwbew70uFiR9wFihPRcp7dvlCst81#"));
        if(intent4.resolveActivity(getPackageManager())!= null){
            startActivity(intent4);
        }
    }
    public void funcionTeams(View v){
        Intent intent5 = new Intent(Intent.ACTION_VIEW);
        intent5.setData(Uri.parse("https://www.microsoft.com/es-es/microsoft-365/microsoft-teams/group-chat-software"));
        if(intent5.resolveActivity(getPackageManager())!= null){
            startActivity(intent5);
        }
    }
    public void funcionOutlook(View v){
        Intent intent5 = new Intent(Intent.ACTION_VIEW);
        intent5.setData(Uri.parse("https://login.microsoftonline.com/common/oauth2/authorize?client_id=00000002-0000-0ff1-ce00-000000000000&redirect_uri=https%3a%2f%2foutlook.office.com%2fmail%2f&resource=00000002-0000-0ff1-ce00-000000000000&response_mode=form_post&response_type=code+id_token&scope=openid&msafed=0&client-request-id=87b10068-40b6-41f7-b4e1-96e4c1966b1c&protectedtoken=true&nonce=637260941924587325.292ade88-9603-468c-adff-adb5fc88cce7&state=Dcs5DoAwDABBB0reEhKcw_ZzckpIHC3Px8VOtwYAVm3RjFeAciDMXuIhGBNTwLSjYOmD2Ur2wcbMzZY-p1LTbMytDTL6bu4u5-XOp77fDw"));
        if(intent5.resolveActivity(getPackageManager())!= null){
            startActivity(intent5);
        }
    }
//Botón que vuelve a la anterior activity
    public void accionAtras(View v) {
        Intent intent2 = new Intent(segunda.this, MainActivity.class);
        startActivity(intent2);
    }
//Boton que va al activity tercera
    public void accionSocial(View v) {
        Intent intent2 = new Intent(segunda.this, tercera.class);
        startActivity(intent2);
    }
}

