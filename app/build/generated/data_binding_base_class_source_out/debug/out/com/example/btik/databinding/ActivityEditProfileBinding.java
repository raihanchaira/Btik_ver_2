// Generated by data binding compiler. Do not edit!
package com.example.btik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.btik.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityEditProfileBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backEdtProfile;

  @NonNull
  public final AppCompatButton btnSaveProfile;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etPhoneNumber;

  @NonNull
  public final EditText etUsername;

  @NonNull
  public final CircleImageView profileImage2;

  @NonNull
  public final TextView tvChangePicture;

  protected ActivityEditProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView backEdtProfile, AppCompatButton btnSaveProfile, EditText etEmail,
      EditText etPhoneNumber, EditText etUsername, CircleImageView profileImage2,
      TextView tvChangePicture) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backEdtProfile = backEdtProfile;
    this.btnSaveProfile = btnSaveProfile;
    this.etEmail = etEmail;
    this.etPhoneNumber = etPhoneNumber;
    this.etUsername = etUsername;
    this.profileImage2 = profileImage2;
    this.tvChangePicture = tvChangePicture;
  }

  @NonNull
  public static ActivityEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_edit_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityEditProfileBinding>inflateInternal(inflater, R.layout.activity_edit_profile, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityEditProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_edit_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityEditProfileBinding>inflateInternal(inflater, R.layout.activity_edit_profile, null, false, component);
  }

  public static ActivityEditProfileBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityEditProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityEditProfileBinding)bind(component, view, R.layout.activity_edit_profile);
  }
}