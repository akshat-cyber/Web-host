package com.fatdevs.webhosting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    public Integer a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   Async_webHosting web = new Async_webHosting();
        try {
             a = web.execute("https://www.udemy.com/course/the-complete-android-oreo-developer-course/learn/lecture/8339458#content").get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int an = Integer.parseInt(String.valueOf(a));

    }
class Async_webHosting extends AsyncTask<String,Integer,Integer>{

    @Override
    protected Integer doInBackground(String... urls) {

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }
}


}
