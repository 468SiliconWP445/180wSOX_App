package com.example.myprofileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method to open the first YouTube channel
    public void openYouTubeChannel1(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC1HsAi6pok0NJEf9_3KaSRA"));
        startActivity(intent);
    }

    // Method to open the Minecraft YouTube channel
    public void openYouTubeChannel2(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC6Wj7Q94-VU0TVgYM2zErrg"));
        startActivity(intent);
    }

    // Method to open the Instagram page
    public void openInstagram(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/180wsox/"));
        startActivity(intent);
    }

    // Method to open the X (formerly Twitter) account
    public void openX(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://x.com/180w_soxlamp"));
        startActivity(intent);
    }

    // Method to open the Sutton Lighting page
    public void openSuttonLighting(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://180wsox.github.io/180wsox.com/suttonlighting.html"));
        startActivity(intent);
    }
}
