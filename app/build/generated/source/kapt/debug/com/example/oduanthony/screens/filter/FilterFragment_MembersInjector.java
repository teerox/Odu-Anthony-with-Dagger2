// Generated by Dagger (https://dagger.dev).
package com.example.oduanthony.screens.filter;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FilterFragment_MembersInjector implements MembersInjector<FilterFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public FilterFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<FilterFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new FilterFragment_MembersInjector(viewModelFactoryProvider);}

  @Override
  public void injectMembers(FilterFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(FilterFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}