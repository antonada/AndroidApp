package com.myniprojects.viruskiller.screens.shop;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/myniprojects/viruskiller/screens/shop/ShopViewModel;", "Landroidx/lifecycle/ViewModel;", "money", "", "bonuses", "Lcom/myniprojects/viruskiller/model/Bonuses;", "context", "Landroid/content/Context;", "(JLcom/myniprojects/viruskiller/model/Bonuses;Landroid/content/Context;)V", "_bonusList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/myniprojects/viruskiller/model/Bonus;", "_money", "bonusList", "Landroidx/lifecycle/LiveData;", "getBonusList", "()Landroidx/lifecycle/LiveData;", "mon", "getMon", "()J", "getMoney", "onCleared", "", "saveBonuses", "cost", "", "app_debug"})
public final class ShopViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _money = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.myniprojects.viruskiller.model.Bonus>> _bonusList;
    
    public ShopViewModel(long money, @org.jetbrains.annotations.NotNull
    com.myniprojects.viruskiller.model.Bonuses bonuses, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Long> getMoney() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.myniprojects.viruskiller.model.Bonus>> getBonusList() {
        return null;
    }
    
    public final long getMon() {
        return 0L;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void saveBonuses(int cost) {
    }
}