// Generated by view binder compiler. Do not edit!
package com.example.btik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.btik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNoresiBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView back;

  @NonNull
  public final TextView noResi;

  @NonNull
  public final TextView resi;

  @NonNull
  public final TextView tulisan1;

  private ActivityNoresiBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView back,
      @NonNull TextView noResi, @NonNull TextView resi, @NonNull TextView tulisan1) {
    this.rootView = rootView;
    this.back = back;
    this.noResi = noResi;
    this.resi = resi;
    this.tulisan1 = tulisan1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNoresiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNoresiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_noresi, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNoresiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.no_resi;
      TextView noResi = ViewBindings.findChildViewById(rootView, id);
      if (noResi == null) {
        break missingId;
      }

      id = R.id.resi;
      TextView resi = ViewBindings.findChildViewById(rootView, id);
      if (resi == null) {
        break missingId;
      }

      id = R.id.tulisan1;
      TextView tulisan1 = ViewBindings.findChildViewById(rootView, id);
      if (tulisan1 == null) {
        break missingId;
      }

      return new ActivityNoresiBinding((ConstraintLayout) rootView, back, noResi, resi, tulisan1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
