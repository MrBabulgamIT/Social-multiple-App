package com.babulgamit.socialmultipleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private SearchView searchView;
    private String[] appsName, description;
    private RecyclerView recyclerView;
    int images[] = {
            R.drawable.facebook, R.drawable.whatsapp, R.drawable.messenger,
            R.drawable.twitter, R.drawable.youtube, R.drawable.skype,
            R.drawable.viber, R.drawable.linkedin, R.drawable.imo, R.drawable.imo, R.drawable.instagram,
            R.drawable.tik_tok,
            R.drawable.likee, R.drawable.snapchat, R.drawable.share,
            R.drawable.messenger_lite, R.drawable.facebook_lite, R.drawable.twitter_lite, R.drawable.skype_lite, R.drawable.instagram,
            R.drawable.likee, R.drawable.tik_tok, R.drawable.gmail, R.drawable.google_drive
    };
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view_id);
        appsName = getResources().getStringArray(R.array.apps_name);
        description = getResources().getStringArray(R.array.discrip);

        customAdapter = new CustomAdapter(this, images, appsName, description);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        customAdapter.SetItemClickListener(new CustomAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                if (position == 0) {
                    //Facebook
                    Intent intent = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                    if (intent != null) {
                        startActivity(intent);

                    } else {

                        gotoUrl("https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en&gl=US");
                        Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                    }
                } else if (position == 1) {
                    //Whatsapp
                    Intent intent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                    if (intent != null) {
                        startActivity(intent);

                    } else {

                        gotoUrl("https://play.google.com/store/apps/details?id=com.whatsapp");
                        Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();

                    }
                } else if (position == 2) {
                    //messenger
                    Intent intent = getPackageManager().getLaunchIntentForPackage("com.facebook.orca");
                    if (intent != null) {
                        startActivity(intent);

                    } else {

                        gotoUrl("https://play.google.com/store/apps/details?id=com.facebook.orca");
                        Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();

                    }
                } else if (position == 3) {
                    //twitter
                    Intent intent = getPackageManager().getLaunchIntentForPackage("com.twitter.android");
                    if (intent != null) {
                        startActivity(intent);

                    } else {
                        Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                        gotoUrl("https://play.google.com/store/apps/details?id=com.twitter.android&hl=en&gl=US");
                    }
                } else if (position == 4) {
                    //youtube
                    Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");

                    if (intent != null) {
                        startActivity(intent);

                    } else {
                        Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                        gotoUrl("https://play.google.com/store/apps/details?id=com.google.android.youtube");
                    }
                } else


                    //skype
                    if (position == 5) {
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.skype.raider");
                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.skype.raider&hl=en&gl=US");
                        }
                    } else if (position == 6) {
                        //viver
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.viber.voip");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.viber.voip");
                        }
                    } else if (position == 7) {
                        //viver
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.linkedin.android");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.linkedin.android&hl=en&gl=US");
                        }
                    } else if (position == 8) {
                        //imo_bets
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.imo.android.imoimbeta");

                        if (intent != null) {
                            startActivity(intent);

                        } else {

                            gotoUrl("https://play.google.com/store/apps/details?id=com.imo.android.imoimbeta");
                        }
                    } else if (position == 9) {
                        //imo_HD
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.imo.android.imoimhd");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.imo.android.imoimhd");
                        }
                    } else if (position == 10) {
                        //imo_instagram
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.instagram.android");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.instagram.android");
                        }
                    } else if (position == 11) {
                        // TicTok
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.zhiliaoapp.musically");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.zhiliaoapp.musically");
                        }
                    } else if (position == 12) {
                        //likee
                        Intent intent = getPackageManager().getLaunchIntentForPackage("video.like");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=video.like");
                        }
                    } else if (position == 13) {
                        //snapchat
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.snapchat.android");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.snapchat.android");
                        }
                    } else if (position == 14) {
                        //sharit
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.lenovo.anyshare.gps");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.lenovo.anyshare.gps");
                        }
                    } else if (position == 15) {
                        //messenger_lite
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.facebook.mlite");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.facebook.mlite");
                        }
                    } else if (position == 16) {
                        //facebook_lite
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.facebook.lite");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.facebook.lite");
                        }
                    } else if (position == 17) {
                        //twitter_lite
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.twitter.android.lite");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.twitter.android.lite");
                        }
                    } else if (position == 18) {
                        //skype_lite
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.skype.m2");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.skype.m2");
                        }
                    } else if (position == 19) {
                        //instagram_lite
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.instagram.");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.instagram.lite");
                        }
                    } else if (position == 20) {
                        //likee_lite
                        Intent intent = getPackageManager().getLaunchIntentForPackage("video.like.lite");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=video.like.lite");
                        }
                    } else if (position == 21) {
                        //tictok_lite
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.zhiliaoapp.musically.go");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.zhiliaoapp.musically.go");
                        }
                    } else if (position == 22) {
                        //tictok_lite
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.gm");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.google.android.gm");
                        }
                    } else if (position == 23) {
                        //google_drive
                        Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                        if (intent != null) {
                            startActivity(intent);

                        } else {
                            Toast.makeText(getApplicationContext(), "Please Install This Apps", Toast.LENGTH_SHORT).show();
                            gotoUrl("https://play.google.com/store/apps/details?id=com.google.android.apps.docs&hl=en&gl=US");
                        }
                    } else {
                        Toast.makeText(MainActivity.this, "Error message", Toast.LENGTH_SHORT).show();
                    }

            }

            @Override
            public void onItemLongClick(int position, View v) {

                Toast.makeText(getApplicationContext(), "On Long Item Click  " + position, Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void gotoUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.sample_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.share_id){
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject="Share This Apps";
            String body="This is very Useful to Android Phn.This is MultipleApps.\n com.example.com.multipleapps";

            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(Intent.createChooser(intent,"Share with"));

        }
        else

        if (item.getItemId()==R.id.feedback_id)
        {

            Intent intent=new Intent(getApplicationContext(),Feedback_Activity.class);
            startActivity(intent);



        }

        else

        if (item.getItemId()==R.id.AboutUs_id)
        {

            Intent intent=new Intent(getApplicationContext(),About_activity.class);
            startActivity(intent);



        }




        return super.onOptionsItemSelected(item);


    }

}
