// Generated by data binding compiler. Do not edit!
package com.example.oduanthony.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.oduanthony.R;
import com.example.oduanthony.screens.filter.FilterViewModel;
import java.lang.Deprecated;
import java.lang.Object;
import me.ibrahimsn.lib.CirclesLoadingView;

public abstract class FragmentFilterBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView allFilter;

  @NonNull
  public final CirclesLoadingView progressbar;

  @Bindable
  protected FilterViewModel mMyFirstView;

  protected FragmentFilterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView allFilter, CirclesLoadingView progressbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.allFilter = allFilter;
    this.progressbar = progressbar;
  }

  public abstract void setMyFirstView(@Nullable FilterViewModel myFirstView);

  @Nullable
  public FilterViewModel getMyFirstView() {
    return mMyFirstView;
  }

  @NonNull
  public static FragmentFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_filter, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFilterBinding>inflateInternal(inflater, R.layout.fragment_filter, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFilterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_filter, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFilterBinding>inflateInternal(inflater, R.layout.fragment_filter, null, false, component);
  }

  public static FragmentFilterBinding bind(@NonNull View view) {
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
  public static FragmentFilterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFilterBinding)bind(component, view, R.layout.fragment_filter);
  }
}