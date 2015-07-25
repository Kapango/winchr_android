package net.winchr.winchrandroid;

import net.wincher.winchrandroid.BuildConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Esteban on 25/07/2015.
 */
@Config(constants = BuildConfig.class, emulateSdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class TestDummyTest {
    @Test
    public void test_dummy_test(){
        TestDummy unitUnderTest = new TestDummy();
        assertThat(unitUnderTest.dummyForTest(), equalTo(true));
    }
}
