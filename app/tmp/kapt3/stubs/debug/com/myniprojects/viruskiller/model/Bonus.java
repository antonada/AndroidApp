package com.myniprojects.viruskiller.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010-J\t\u00102\u001a\u00020\nH\u00c6\u0003J\t\u00103\u001a\u00020\nH\u00c6\u0003J\t\u00104\u001a\u00020\rH\u00c6\u0003JP\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u001e2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\rH\u00d6\u0001J\t\u0010:\u001a\u00020\nH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u001d\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0014\u0010 \u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0014\u0010#\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-\u00a8\u0006;"}, d2 = {"Lcom/myniprojects/viruskiller/model/Bonus;", "", "currLvl", "", "prices", "", "values", "", "", "name", "", "desc", "image", "", "(B[I[Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;I)V", "getCurrLvl", "()B", "setCurrLvl", "(B)V", "currPrice", "getCurrPrice", "()I", "currPriceString", "getCurrPriceString", "()Ljava/lang/String;", "currValString", "getCurrValString", "getDesc", "getImage", "isMax", "", "()Z", "maxLvl", "getMaxLvl", "getName", "nextVal", "getNextVal", "()Ljava/lang/Number;", "nextValString", "getNextValString", "getPrices", "()[I", "updateString", "getUpdateString", "getValues", "()[Ljava/lang/Number;", "[Ljava/lang/Number;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(B[I[Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;I)Lcom/myniprojects/viruskiller/model/Bonus;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Bonus {
    private byte currLvl;
    @org.jetbrains.annotations.NotNull
    private final int[] prices = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Number[] values = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String desc = null;
    private final int image = 0;
    
    public Bonus(byte currLvl, @org.jetbrains.annotations.NotNull
    int[] prices, @org.jetbrains.annotations.NotNull
    java.lang.Number[] values, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String desc, int image) {
        super();
    }
    
    public final byte getCurrLvl() {
        return 0;
    }
    
    public final void setCurrLvl(byte p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final int[] getPrices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Number[] getValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDesc() {
        return null;
    }
    
    public final int getImage() {
        return 0;
    }
    
    public final boolean isMax() {
        return false;
    }
    
    private final byte getMaxLvl() {
        return 0;
    }
    
    public final int getCurrPrice() {
        return 0;
    }
    
    private final java.lang.Number getNextVal() {
        return null;
    }
    
    private final java.lang.String getCurrValString() {
        return null;
    }
    
    private final java.lang.String getNextValString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrPriceString() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUpdateString() {
        return null;
    }
    
    public final byte component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final int[] component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Number[] component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.myniprojects.viruskiller.model.Bonus copy(byte currLvl, @org.jetbrains.annotations.NotNull
    int[] prices, @org.jetbrains.annotations.NotNull
    java.lang.Number[] values, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String desc, int image) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}