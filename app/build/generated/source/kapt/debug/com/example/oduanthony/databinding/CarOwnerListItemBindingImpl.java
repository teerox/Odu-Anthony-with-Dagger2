package com.example.oduanthony.databinding;
import com.example.oduanthony.R;
import com.example.oduanthony.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CarOwnerListItemBindingImpl extends CarOwnerListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.smallimage, 9);
        sViewsWithIds.put(R.id.brand, 10);
        sViewsWithIds.put(R.id.view1, 11);
        sViewsWithIds.put(R.id.year, 12);
        sViewsWithIds.put(R.id.country, 13);
        sViewsWithIds.put(R.id.gender, 14);
        sViewsWithIds.put(R.id.job, 15);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CarOwnerListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private CarOwnerListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[0]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[9]
            , (android.view.View) bindings[11]
            , (android.widget.LinearLayout) bindings[12]
            );
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.movieContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.carOwnerItem == variableId) {
            setCarOwnerItem((com.example.oduanthony.model.CarOwner) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCarOwnerItem(@Nullable com.example.oduanthony.model.CarOwner CarOwnerItem) {
        this.mCarOwnerItem = CarOwnerItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.carOwnerItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String carOwnerItemCarModel = null;
        java.lang.String carOwnerItemGender = null;
        java.lang.String carOwnerItemBio = null;
        java.lang.String carOwnerItemYear = null;
        java.lang.String carOwnerItemCountry = null;
        com.example.oduanthony.model.CarOwner carOwnerItem = mCarOwnerItem;
        java.lang.String carOwnerItemLastName = null;
        java.lang.String carOwnerItemFirstNameJavaLangStringCarOwnerItemLastName = null;
        java.lang.String carOwnerItemJobTitle = null;
        java.lang.String carOwnerItemFirstName = null;
        java.lang.String carOwnerItemFirstNameJavaLangString = null;
        java.lang.String carOwnerItemEmail = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (carOwnerItem != null) {
                    // read carOwnerItem.carModel
                    carOwnerItemCarModel = carOwnerItem.getCarModel();
                    // read carOwnerItem.gender
                    carOwnerItemGender = carOwnerItem.getGender();
                    // read carOwnerItem.bio
                    carOwnerItemBio = carOwnerItem.getBio();
                    // read carOwnerItem.year
                    carOwnerItemYear = carOwnerItem.getYear();
                    // read carOwnerItem.country
                    carOwnerItemCountry = carOwnerItem.getCountry();
                    // read carOwnerItem.lastName
                    carOwnerItemLastName = carOwnerItem.getLastName();
                    // read carOwnerItem.jobTitle
                    carOwnerItemJobTitle = carOwnerItem.getJobTitle();
                    // read carOwnerItem.firstName
                    carOwnerItemFirstName = carOwnerItem.getFirstName();
                    // read carOwnerItem.email
                    carOwnerItemEmail = carOwnerItem.getEmail();
                }


                // read (carOwnerItem.firstName) + (" ")
                carOwnerItemFirstNameJavaLangString = (carOwnerItemFirstName) + (" ");


                // read ((carOwnerItem.firstName) + (" ")) + (carOwnerItem.lastName)
                carOwnerItemFirstNameJavaLangStringCarOwnerItemLastName = (carOwnerItemFirstNameJavaLangString) + (carOwnerItemLastName);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, carOwnerItemFirstNameJavaLangStringCarOwnerItemLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, carOwnerItemGender);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, carOwnerItemCarModel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, carOwnerItemYear);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, carOwnerItemCountry);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, carOwnerItemJobTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, carOwnerItemEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, carOwnerItemBio);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): carOwnerItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}