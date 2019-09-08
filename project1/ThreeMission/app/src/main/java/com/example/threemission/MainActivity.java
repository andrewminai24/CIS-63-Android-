package com.example.threemission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

/*
Layout is the like the storyboard in IOS the styling of the button
and the layout.
If you do not have the manifest file
Then your program can not compile.

What are the components of a Android application:
activity and fragments,Service,Broadcast receiver,Content
provider.Content provider - Is what store the data in the database.

Activity is necessary for a application.
Content provider is necessary for a application.
The manifest file is used to manage your apks.


An application consists fo one activity at teh minmum it can
consist of one activity What the activties aren depends
on the application navigation design.

Fragment-Is a portion of UI of an activity
UI transitions that characterize an app behavior
can be designed.

An app is collection of activites.


Interview question - What is the lifecycle of an activity.
Activity does not have a constructor








 */

