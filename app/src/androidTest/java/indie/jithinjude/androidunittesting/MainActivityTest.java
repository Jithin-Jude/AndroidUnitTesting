package indie.jithinjude.androidunittesting;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Created by JithinJude on 15,June,2023
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testButtonClick() {
        // Perform a click on the button


        ViewInteraction btn = Espresso.onView(ViewMatchers.withId(R.id.btnIncrement));
        for(int i = 0; i < 10; i++){
            btn.perform(ViewActions.click());
        }

        // Verify that the count is incremented and displayed in the TextView
        Espresso.onView(ViewMatchers.withId(R.id.tvCount))
                .check(matches(withText("10")));
    }
}
