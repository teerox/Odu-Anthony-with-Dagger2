package com.example.oduanthony;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.oduanthony.databinding.ActivityMainBindingImpl;
import com.example.oduanthony.databinding.CarOwnerListItemBindingImpl;
import com.example.oduanthony.databinding.FilterListItemBindingImpl;
import com.example.oduanthony.databinding.FragmentCarOwnerBindingImpl;
import com.example.oduanthony.databinding.FragmentFilterBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_CAROWNERLISTITEM = 2;

  private static final int LAYOUT_FILTERLISTITEM = 3;

  private static final int LAYOUT_FRAGMENTCAROWNER = 4;

  private static final int LAYOUT_FRAGMENTFILTER = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.oduanthony.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.oduanthony.R.layout.car_owner_list_item, LAYOUT_CAROWNERLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.oduanthony.R.layout.filter_list_item, LAYOUT_FILTERLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.oduanthony.R.layout.fragment_car_owner, LAYOUT_FRAGMENTCAROWNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.oduanthony.R.layout.fragment_filter, LAYOUT_FRAGMENTFILTER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CAROWNERLISTITEM: {
          if ("layout/car_owner_list_item_0".equals(tag)) {
            return new CarOwnerListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for car_owner_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FILTERLISTITEM: {
          if ("layout/filter_list_item_0".equals(tag)) {
            return new FilterListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for filter_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCAROWNER: {
          if ("layout/fragment_car_owner_0".equals(tag)) {
            return new FragmentCarOwnerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_car_owner is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFILTER: {
          if ("layout/fragment_filter_0".equals(tag)) {
            return new FragmentFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_filter is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "carOwnerItem");
      sKeys.put(2, "filterList");
      sKeys.put(3, "myFirstView");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", com.example.oduanthony.R.layout.activity_main);
      sKeys.put("layout/car_owner_list_item_0", com.example.oduanthony.R.layout.car_owner_list_item);
      sKeys.put("layout/filter_list_item_0", com.example.oduanthony.R.layout.filter_list_item);
      sKeys.put("layout/fragment_car_owner_0", com.example.oduanthony.R.layout.fragment_car_owner);
      sKeys.put("layout/fragment_filter_0", com.example.oduanthony.R.layout.fragment_filter);
    }
  }
}
