// Generated by view binder compiler. Do not edit!
package com.musicapp.sonicsizzle.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.musicapp.sonicsizzle.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView categoriesRecyclerView;

  @NonNull
  public final RelativeLayout main;

  @NonNull
  public final RelativeLayout playerView;

  @NonNull
  public final RelativeLayout section1MainLayout;

  @NonNull
  public final RecyclerView section1RecyclerView;

  @NonNull
  public final TextView section1Title;

  @NonNull
  public final RelativeLayout section2MainLayout;

  @NonNull
  public final RecyclerView section2RecyclerView;

  @NonNull
  public final TextView section2Title;

  @NonNull
  public final RelativeLayout section3MainLayout;

  @NonNull
  public final RecyclerView section3RecyclerView;

  @NonNull
  public final TextView section3Title;

  @NonNull
  public final ImageView songCoverImageView;

  @NonNull
  public final TextView songTitleTextView;

  @NonNull
  public final RelativeLayout toolbar;

  private ActivityMainBinding(@NonNull RelativeLayout rootView,
      @NonNull RecyclerView categoriesRecyclerView, @NonNull RelativeLayout main,
      @NonNull RelativeLayout playerView, @NonNull RelativeLayout section1MainLayout,
      @NonNull RecyclerView section1RecyclerView, @NonNull TextView section1Title,
      @NonNull RelativeLayout section2MainLayout, @NonNull RecyclerView section2RecyclerView,
      @NonNull TextView section2Title, @NonNull RelativeLayout section3MainLayout,
      @NonNull RecyclerView section3RecyclerView, @NonNull TextView section3Title,
      @NonNull ImageView songCoverImageView, @NonNull TextView songTitleTextView,
      @NonNull RelativeLayout toolbar) {
    this.rootView = rootView;
    this.categoriesRecyclerView = categoriesRecyclerView;
    this.main = main;
    this.playerView = playerView;
    this.section1MainLayout = section1MainLayout;
    this.section1RecyclerView = section1RecyclerView;
    this.section1Title = section1Title;
    this.section2MainLayout = section2MainLayout;
    this.section2RecyclerView = section2RecyclerView;
    this.section2Title = section2Title;
    this.section3MainLayout = section3MainLayout;
    this.section3RecyclerView = section3RecyclerView;
    this.section3Title = section3Title;
    this.songCoverImageView = songCoverImageView;
    this.songTitleTextView = songTitleTextView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
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
      id = R.id.categories_recycler_view;
      RecyclerView categoriesRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (categoriesRecyclerView == null) {
        break missingId;
      }

      RelativeLayout main = (RelativeLayout) rootView;

      id = R.id.player_view;
      RelativeLayout playerView = ViewBindings.findChildViewById(rootView, id);
      if (playerView == null) {
        break missingId;
      }

      id = R.id.section_1_main_layout;
      RelativeLayout section1MainLayout = ViewBindings.findChildViewById(rootView, id);
      if (section1MainLayout == null) {
        break missingId;
      }

      id = R.id.section_1_recycler_view;
      RecyclerView section1RecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (section1RecyclerView == null) {
        break missingId;
      }

      id = R.id.section_1_title;
      TextView section1Title = ViewBindings.findChildViewById(rootView, id);
      if (section1Title == null) {
        break missingId;
      }

      id = R.id.section_2_main_layout;
      RelativeLayout section2MainLayout = ViewBindings.findChildViewById(rootView, id);
      if (section2MainLayout == null) {
        break missingId;
      }

      id = R.id.section_2_recycler_view;
      RecyclerView section2RecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (section2RecyclerView == null) {
        break missingId;
      }

      id = R.id.section_2_title;
      TextView section2Title = ViewBindings.findChildViewById(rootView, id);
      if (section2Title == null) {
        break missingId;
      }

      id = R.id.section_3_main_layout;
      RelativeLayout section3MainLayout = ViewBindings.findChildViewById(rootView, id);
      if (section3MainLayout == null) {
        break missingId;
      }

      id = R.id.section_3_recycler_view;
      RecyclerView section3RecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (section3RecyclerView == null) {
        break missingId;
      }

      id = R.id.section_3_title;
      TextView section3Title = ViewBindings.findChildViewById(rootView, id);
      if (section3Title == null) {
        break missingId;
      }

      id = R.id.song_cover_image_view;
      ImageView songCoverImageView = ViewBindings.findChildViewById(rootView, id);
      if (songCoverImageView == null) {
        break missingId;
      }

      id = R.id.song_title_text_view;
      TextView songTitleTextView = ViewBindings.findChildViewById(rootView, id);
      if (songTitleTextView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      RelativeLayout toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, categoriesRecyclerView, main,
          playerView, section1MainLayout, section1RecyclerView, section1Title, section2MainLayout,
          section2RecyclerView, section2Title, section3MainLayout, section3RecyclerView,
          section3Title, songCoverImageView, songTitleTextView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
