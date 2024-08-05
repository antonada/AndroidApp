package com.myniprojects.viruskiller.databinding;
import com.myniprojects.viruskiller.R;
import com.myniprojects.viruskiller.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentShopBindingImpl extends FragmentShopBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.butLaboratory, 2);
        sViewsWithIds.put(R.id.recycler_view, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentShopBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentShopBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.Button) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.back.setTag(null);
        this.txtMoney.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.shopViewModel == variableId) {
            setShopViewModel((com.myniprojects.viruskiller.screens.shop.ShopViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShopViewModel(@Nullable com.myniprojects.viruskiller.screens.shop.ShopViewModel ShopViewModel) {
        this.mShopViewModel = ShopViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.shopViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeShopViewModelMoney((androidx.lifecycle.LiveData<java.lang.Long>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeShopViewModelMoney(androidx.lifecycle.LiveData<java.lang.Long> ShopViewModelMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        com.myniprojects.viruskiller.screens.shop.ShopViewModel shopViewModel = mShopViewModel;
        java.lang.Long shopViewModelMoneyGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Long> shopViewModelMoney = null;
        java.lang.String txtMoneyAndroidStringMoneyFormatShopViewModelMoney = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (shopViewModel != null) {
                    // read shopViewModel.money
                    shopViewModelMoney = shopViewModel.getMoney();
                }
                updateLiveDataRegistration(0, shopViewModelMoney);


                if (shopViewModelMoney != null) {
                    // read shopViewModel.money.getValue()
                    shopViewModelMoneyGetValue = shopViewModelMoney.getValue();
                }


                // read @android:string/money_format
                txtMoneyAndroidStringMoneyFormatShopViewModelMoney = txtMoney.getResources().getString(R.string.money_format, shopViewModelMoneyGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMoney, txtMoneyAndroidStringMoneyFormatShopViewModelMoney);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): shopViewModel.money
        flag 1 (0x2L): shopViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}