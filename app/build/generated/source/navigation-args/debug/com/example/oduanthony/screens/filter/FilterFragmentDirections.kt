package com.example.oduanthony.screens.filter

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.oduanthony.R
import com.example.oduanthony.model.Filter
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class FilterFragmentDirections private constructor() {
  private data class ActionFilterFragmentToAllFilter(
    val Filterlist: Filter
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_filterFragment_to_allFilter

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
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
  }

  companion object {
    fun actionFilterFragmentToAllFilter(Filterlist: Filter): NavDirections =
        ActionFilterFragmentToAllFilter(Filterlist)
  }
}
