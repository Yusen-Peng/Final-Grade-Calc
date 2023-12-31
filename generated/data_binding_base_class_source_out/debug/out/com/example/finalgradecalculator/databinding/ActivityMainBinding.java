// Generated by view binder compiler. Do not edit!
package com.example.finalgradecalculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.finalgradecalculator.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final TextView Intro;

  @NonNull
  public final Button RunIt;

  @NonNull
  public final TextView askCurrentGrade;

  @NonNull
  public final TextView askGoal;

  @NonNull
  public final TextView askWorth;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final EditText currentGrade;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final EditText goal;

  @NonNull
  public final CoordinatorLayout prompt3;

  @NonNull
  public final TextView result;

  @NonNull
  public final EditText worth;

  private ActivityMainBinding(@NonNull CoordinatorLayout rootView, @NonNull TextView Intro,
      @NonNull Button RunIt, @NonNull TextView askCurrentGrade, @NonNull TextView askGoal,
      @NonNull TextView askWorth, @NonNull ConstraintLayout constraintLayout,
      @NonNull EditText currentGrade, @NonNull FloatingActionButton fab, @NonNull EditText goal,
      @NonNull CoordinatorLayout prompt3, @NonNull TextView result, @NonNull EditText worth) {
    this.rootView = rootView;
    this.Intro = Intro;
    this.RunIt = RunIt;
    this.askCurrentGrade = askCurrentGrade;
    this.askGoal = askGoal;
    this.askWorth = askWorth;
    this.constraintLayout = constraintLayout;
    this.currentGrade = currentGrade;
    this.fab = fab;
    this.goal = goal;
    this.prompt3 = prompt3;
    this.result = result;
    this.worth = worth;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Intro;
      TextView Intro = ViewBindings.findChildViewById(rootView, id);
      if (Intro == null) {
        break missingId;
      }

      id = R.id.RunIt;
      Button RunIt = ViewBindings.findChildViewById(rootView, id);
      if (RunIt == null) {
        break missingId;
      }

      id = R.id.askCurrentGrade;
      TextView askCurrentGrade = ViewBindings.findChildViewById(rootView, id);
      if (askCurrentGrade == null) {
        break missingId;
      }

      id = R.id.askGoal;
      TextView askGoal = ViewBindings.findChildViewById(rootView, id);
      if (askGoal == null) {
        break missingId;
      }

      id = R.id.askWorth;
      TextView askWorth = ViewBindings.findChildViewById(rootView, id);
      if (askWorth == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.currentGrade;
      EditText currentGrade = ViewBindings.findChildViewById(rootView, id);
      if (currentGrade == null) {
        break missingId;
      }

      id = R.id.fab;
      FloatingActionButton fab = ViewBindings.findChildViewById(rootView, id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.goal;
      EditText goal = ViewBindings.findChildViewById(rootView, id);
      if (goal == null) {
        break missingId;
      }

      CoordinatorLayout prompt3 = (CoordinatorLayout) rootView;

      id = R.id.result;
      TextView result = ViewBindings.findChildViewById(rootView, id);
      if (result == null) {
        break missingId;
      }

      id = R.id.worth;
      EditText worth = ViewBindings.findChildViewById(rootView, id);
      if (worth == null) {
        break missingId;
      }

      return new ActivityMainBinding((CoordinatorLayout) rootView, Intro, RunIt, askCurrentGrade,
          askGoal, askWorth, constraintLayout, currentGrade, fab, goal, prompt3, result, worth);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
