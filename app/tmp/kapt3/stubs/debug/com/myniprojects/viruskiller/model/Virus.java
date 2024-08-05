package com.myniprojects.viruskiller.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u0001:\u00010B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u000fJ\b\u0010/\u001a\u00020\rH\u0016R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010 \u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u001dR\u0011\u0010%\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u0019R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u001d\u00a8\u00061"}, d2 = {"Lcom/myniprojects/viruskiller/model/Virus;", "", "vD", "Lcom/myniprojects/viruskiller/model/VirusData;", "(Lcom/myniprojects/viruskiller/model/VirusData;)V", "()V", "value", "", "_hp", "set_hp", "(I)V", "_hpString", "Landroidx/lifecycle/MutableLiveData;", "", "_img", "", "_lvl", "set_lvl", "(B)V", "_lvlString", "_reward", "set_reward", "_rewardString", "hp", "getHp", "()I", "hpString", "Landroidx/lifecycle/LiveData;", "getHpString", "()Landroidx/lifecycle/LiveData;", "img", "getImg", "lvl", "getLvl", "()B", "lvlString", "getLvlString", "reward", "getReward", "rewardString", "getRewardString", "attackVirus", "", "dmg", "setNewVirus", "", "virusLvl", "toString", "Companion", "app_debug"})
public final class Virus {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.Integer[][] viruses = null;
    private static final int maxLvl = 0;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _hpString = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _rewardString = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _lvlString = null;
    private byte _lvl = (byte)0;
    private int _hp = 0;
    private int _reward = 0;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _img = null;
    @org.jetbrains.annotations.NotNull
    public static final com.myniprojects.viruskiller.model.Virus.Companion Companion = null;
    
    public Virus() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getHpString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getRewardString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getLvlString() {
        return null;
    }
    
    private final void set_lvl(byte value) {
    }
    
    public final byte getLvl() {
        return 0;
    }
    
    private final void set_hp(int value) {
    }
    
    public final int getHp() {
        return 0;
    }
    
    private final void set_reward(int value) {
    }
    
    public final int getReward() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getImg() {
        return null;
    }
    
    public Virus(@org.jetbrains.annotations.NotNull
    com.myniprojects.viruskiller.model.VirusData vD) {
        super();
    }
    
    public final void setNewVirus(byte virusLvl) {
    }
    
    public final boolean attackVirus(int dmg) {
        return false;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/myniprojects/viruskiller/model/Virus$Companion;", "", "()V", "maxLvl", "", "getMaxLvl", "()I", "viruses", "", "[[Ljava/lang/Integer;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getMaxLvl() {
            return 0;
        }
    }
}