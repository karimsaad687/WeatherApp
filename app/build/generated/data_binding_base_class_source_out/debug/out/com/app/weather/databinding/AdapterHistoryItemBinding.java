// Generated by view binder compiler. Do not edit!
package com.app.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import app.w8r.CustomViews.BaseTextView;
import com.app.weather.R;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AdapterHistoryItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView icon;

  @NonNull
  public final RoundedImageView image;

  @NonNull
  public final BaseTextView locationTv;

  @NonNull
  public final BaseTextView tempTv;

  private AdapterHistoryItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView icon,
      @NonNull RoundedImageView image, @NonNull BaseTextView locationTv,
      @NonNull BaseTextView tempTv) {
    this.rootView = rootView;
    this.icon = icon;
    this.image = image;
    this.locationTv = locationTv;
    this.tempTv = tempTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AdapterHistoryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdapterHistoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.adapter_history_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdapterHistoryItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.icon;
      ImageView icon = ViewBindings.findChildViewById(rootView, id);
      if (icon == null) {
        break missingId;
      }

      id = R.id.image;
      RoundedImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.location_tv;
      BaseTextView locationTv = ViewBindings.findChildViewById(rootView, id);
      if (locationTv == null) {
        break missingId;
      }

      id = R.id.temp_tv;
      BaseTextView tempTv = ViewBindings.findChildViewById(rootView, id);
      if (tempTv == null) {
        break missingId;
      }

      return new AdapterHistoryItemBinding((ConstraintLayout) rootView, icon, image, locationTv,
          tempTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
