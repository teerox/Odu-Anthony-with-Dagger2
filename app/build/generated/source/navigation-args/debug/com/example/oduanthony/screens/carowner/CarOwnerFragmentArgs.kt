package com.example.oduanthony.screens.carowner

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.oduanthony.model.Filter
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class CarOwnerFragmentArgs(
  val Filterlist: Filter
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Filter::class.java)) {
      result.putParcelable("Filterlist", this.Filterlist as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Filter::class.java)) {
      result.putSerializable("Filterlist", this.Filterlist as Serializable)
    } else {
      throw UnsupportedOperationException(Filter::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): CarOwnerFragmentArgs {
      bundle.setClassLoader(CarOwnerFragmentArgs::class.java.classLoader)
      val __Filterlist : Filter?
      if (bundle.containsKey("Filterlist")) {
        if (Parcelable::class.java.isAssignableFrom(Filter::class.java) ||
            Serializable::class.java.isAssignableFrom(Filter::class.java)) {
          __Filterlist = bundle.get("Filterlist") as Filter?
        } else {
          throw UnsupportedOperationException(Filter::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__Filterlist == null) {
          throw IllegalArgumentException("Argument \"Filterlist\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"Filterlist\" is missing and does not have an android:defaultValue")
      }
      return CarOwnerFragmentArgs(__Filterlist)
    }
  }
}
