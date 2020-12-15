//package com.example.myapplication
//
//import androidx.test.espresso.Espresso
//import androidx.test.espresso.assertion.ViewAssertions
//import androidx.test.espresso.matcher.ViewMatchers
//import androidx.test.ext.junit.runners.AndroidJUnit4
//import androidx.test.filters.LargeTest
//import androidx.test.rule.ActivityTestRule
//import org.junit.After
//import org.junit.Before
//import org.junit.Rule
//import org.junit.Test
//import org.junit.runner.RunWith
//
//
//@RunWith(AndroidJUnit4::class)
//@LargeTest
//class MainActivityTest {
//
//    @get:Rule
//    val activityRule = ActivityTestRule(MainActivity::class.java)
//
//    @Before
//    fun setUp() {
//    }
//
//    @Test
//    fun testToolBar(){
//        Espresso.onView(ViewMatchers.withId(R.id.toolbar)).check(
//            ViewAssertions.matches(
//                ViewMatchers.isDisplayed()))
//    }
//
//    @Test
//    fun testFloatingActionButton(){
//        Espresso.onView(ViewMatchers.withId(R.id.fab)).check(
//            ViewAssertions.matches(ViewMatchers.isDisplayed()))
//    }
//
//    @After
//    fun tearDown() {
//    }
//}