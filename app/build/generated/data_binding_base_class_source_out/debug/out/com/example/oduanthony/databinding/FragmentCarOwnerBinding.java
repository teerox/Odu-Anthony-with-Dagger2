// Generated by data binding compiler. Do not edit!
package com.example.oduanthony.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.oduanthony.R;
import java.lang.Deprecated;
import java.lang.Object;
import me.ibrahimsn.lib.CirclesLoadingView;

public abstract class FragmentCarOwnerBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView carOwnerRecy;

  @NonNull
  public final CirclesLoadingView progressbar2;

  protected FragmentCarOwnerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView carOwnerRecy, CirclesLoadingView progressbar2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.carOwnerRecy = carOwnerRecy;
    this.progressbar2 = progressbar2;
  }

  @NonNull
  public static FragmentCarOwnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_car_owner, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCarOwnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCarOwnerBinding>inflateInternal(inflater, R.layout.fragment_car_owner, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCarOwnerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_car_owner, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCarOwnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCarOwnerBinding>inflateInternal(inflater, R.layout.fragment_car_owner, null, false, component);
  }

  public static FragmentCarOwnerBinding bind(@NonNull View view) {
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
  public static FragmentCarOwnerBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCarOwnerBinding)bind(component, view, R.layout.fragment_car_owner);
  }
}