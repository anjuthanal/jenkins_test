package com.example.admin.myapplication;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ChangeText {

    public static final String STRING_TO_BE_TYPED = "Hello Jenkins";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void changeText_sameActivity() {

        onView(withId(R.id.editText))
                .perform(typeText(STRING_TO_BE_TYPED));

        onView(withId(R.id.button)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.label_text)).check(matches(withText(STRING_TO_BE_TYPED)));

    }
}
