// Generated by data binding compiler. Do not edit!
package com.example.oduanthony.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.oduanthony.R;
import com.example.oduanthony.model.CarOwner;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CarOwnerListItemBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout brand;

  @NonNull
  public final LinearLayout country;

  @NonNull
  public final LinearLayout gender;

  @NonNull
  public final LinearLayout job;

  @NonNull
  public final LinearLayout movieContainer;

  @NonNull
  public final CircleImageView smallimage;

  @NonNull
  public final View view1;

  @NonNull
  public final LinearLayout year;

  @Bindable
  protected CarOwner mCarOwnerItem;

  protected CarOwnerListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout brand, LinearLayout country, LinearLayout gender, LinearLayout job,
      LinearLayout movieContainer, CircleImageView smallimage, View view1, LinearLayout year) {
    super(_bindingComponent, _root, _localFieldCount);
    this.brand = brand;
    this.country = country;
    this.gender = gender;
    this.job = job;
    this.movieContainer = movieContainer;
    this.smallimage = smallimage;
    this.view1 = view1;
    this.year = year;
  }

  public abstract void setCarOwnerItem(@Nullable CarOwner carOwnerItem);

  @Nullable
  public CarOwner getCarOwnerItem() {
    return mCarOwnerItem;
  }

  @NonNull
  public static CarOwnerListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.car_owner_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CarOwnerListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CarOwnerListItemBinding>inflateInternal(inflater, R.layout.car_owner_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static CarOwnerListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.car_owner_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CarOwnerListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CarOwnerListItemBinding>inflateInternal(inflater, R.layout.car_owner_list_item, null, false, component);
  }

  public static CarOwnerListItemBinding bind(@NonNull View view) {
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
  public static CarOwnerListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (CarOwnerListItemBinding)bind(component, view, R.layout.car_owner_list_item);
  }
}