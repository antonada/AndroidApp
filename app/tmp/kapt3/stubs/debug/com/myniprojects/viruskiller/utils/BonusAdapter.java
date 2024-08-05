package com.myniprojects.viruskiller.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/myniprojects/viruskiller/utils/BonusAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "binding", "Lcom/myniprojects/viruskiller/databinding/FragmentGameBinding;", "items", "", "Lcom/myniprojects/viruskiller/model/Bonus;", "shopViewModel", "Lcom/myniprojects/viruskiller/screens/shop/ShopViewModel;", "getShopViewModel", "()Lcom/myniprojects/viruskiller/screens/shop/ShopViewModel;", "setShopViewModel", "(Lcom/myniprojects/viruskiller/screens/shop/ShopViewModel;)V", "getItemCount", "", "initList", "", "bonusList", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BonusViewHolder", "app_debug"})
public final class BonusAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.myniprojects.viruskiller.model.Bonus> items;
    public com.myniprojects.viruskiller.screens.shop.ShopViewModel shopViewModel;
    private com.myniprojects.viruskiller.databinding.FragmentGameBinding binding;
    
    public BonusAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.myniprojects.viruskiller.screens.shop.ShopViewModel getShopViewModel() {
        return null;
    }
    
    public final void setShopViewModel(@org.jetbrains.annotations.NotNull
    com.myniprojects.viruskiller.screens.shop.ShopViewModel p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void initList(@org.jetbrains.annotations.NotNull
    java.util.List<com.myniprojects.viruskiller.model.Bonus> bonusList) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/myniprojects/viruskiller/utils/BonusAdapter$BonusViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/myniprojects/viruskiller/databinding/LayoutBonusListItemBinding;", "shopViewModel", "Lcom/myniprojects/viruskiller/screens/shop/ShopViewModel;", "(Lcom/myniprojects/viruskiller/databinding/LayoutBonusListItemBinding;Lcom/myniprojects/viruskiller/screens/shop/ShopViewModel;)V", "img", "Landroid/widget/ImageView;", "name", "Landroid/widget/TextView;", "price", "upgrade", "bind", "", "bonus", "Lcom/myniprojects/viruskiller/model/Bonus;", "app_debug"})
    public static final class BonusViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.myniprojects.viruskiller.screens.shop.ShopViewModel shopViewModel;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView price = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView img = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView upgrade = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView name = null;
        
        public BonusViewHolder(@org.jetbrains.annotations.NotNull
        com.myniprojects.viruskiller.databinding.LayoutBonusListItemBinding binding, @org.jetbrains.annotations.NotNull
        com.myniprojects.viruskiller.screens.shop.ShopViewModel shopViewModel) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.myniprojects.viruskiller.model.Bonus bonus) {
        }
    }
}