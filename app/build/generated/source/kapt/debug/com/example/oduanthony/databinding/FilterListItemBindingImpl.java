package com.example.oduanthony.databinding;
import com.example.oduanthony.R;
import com.example.oduanthony.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FilterListItemBindingImpl extends FilterListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.smallimage, 3);
        sViewsWithIds.put(R.id.showwhennotext, 4);
        sViewsWithIds.put(R.id.colourlayout, 5);
        sViewsWithIds.put(R.id.horizontalScrollView, 6);
        sViewsWithIds.put(R.id.button1, 7);
        sViewsWithIds.put(R.id.button2, 8);
        sViewsWithIds.put(R.id.button3, 9);
        sViewsWithIds.put(R.id.button4, 10);
        sViewsWithIds.put(R.id.button5, 11);
        sViewsWithIds.put(R.id.button6, 12);
        sViewsWithIds.put(R.id.button7, 13);
        sViewsWithIds.put(R.id.button8, 14);
        sViewsWithIds.put(R.id.button9, 15);
        sViewsWithIds.put(R.id.button10, 16);
        sViewsWithIds.put(R.id.showwhennocounry, 17);
        sViewsWithIds.put(R.id.showcountries, 18);
        sViewsWithIds.put(R.id.horizontalScrollView2, 19);
        sViewsWithIds.put(R.id.num1, 20);
        sViewsWithIds.put(R.id.first, 21);
        sViewsWithIds.put(R.id.num2, 22);
        sViewsWithIds.put(R.id.second, 23);
        sViewsWithIds.put(R.id.num3, 24);
        sViewsWithIds.put(R.id.third, 25);
        sViewsWithIds.put(R.id.num4, 26);
        sViewsWithIds.put(R.id.fourt, 27);
        sViewsWithIds.put(R.id.num5, 28);
        sViewsWithIds.put(R.id.fivth, 29);
        sViewsWithIds.put(R.id.num6, 30);
        sViewsWithIds.put(R.id.sixth, 31);
        sViewsWithIds.put(R.id.num7, 32);
        sViewsWithIds.put(R.id.seventh, 33);
        sViewsWithIds.put(R.id.num, 34);
        sViewsWithIds.put(R.id.eighth, 35);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FilterListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private FilterListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[7]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[16]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[8]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[9]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[10]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[11]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[12]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[13]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[14]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[15]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[27]
            , (android.widget.HorizontalScrollView) bindings[6]
            , (android.widget.HorizontalScrollView) bindings[19]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[33]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[31]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (android.widget.TextView) bindings[25]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
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
        if (BR.filterList == variableId) {
            setFilterList((com.example.oduanthony.model.Filter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFilterList(@Nullable com.example.oduanthony.model.Filter FilterList) {
        this.mFilterList = FilterList;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.filterList);
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
        java.lang.String filterListFullName = null;
        com.example.oduanthony.model.Filter filterList = mFilterList;
        java.lang.String filterListGender = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (filterList != null) {
                    // read filterList.fullName
                    filterListFullName = filterList.getFullName();
                    // read filterList.gender
                    filterListGender = filterList.getGender();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, filterListGender);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, filterListFullName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): filterList
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}