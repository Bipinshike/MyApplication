package com.pri.myapplication;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.FailureHandler;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import com.pri.myapplication.ui.login.LoginActivity;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.setFailureHandler;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Before
    public void setup(){
        Intent intent = new Intent();
        mActivityTestRule.launchActivity(intent);

    }

    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<>(LoginActivity.class);


    @Test
    public void checkIsDisplayed() {
    onView(withText("My Application"));
    onView(withText("Email"));
    onView(withText("Password"));

    }

//    @Test
//    public void useAppContext() {
//        // Context of the app under test.
//        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
//        assertEquals("com.pri.myapplication", appContext.getPackageName());
//    }

    @Test
    public void clickOnLogin(){
        onView(withId(R.id.username)).perform((typeText("Hello")),closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("helloworld"),closeSoftKeyboard());
        onView(withId(R.id.login)).perform(click());

    }

    @After
    public void after(){

    }






}