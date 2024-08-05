package com.myniprojects.viruskiller;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/myniprojects/viruskiller/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "animAd", "Landroid/view/animation/Animation;", "getAnimAd", "()Landroid/view/animation/Animation;", "animAd$delegate", "Lkotlin/Lazy;", "binding", "Lcom/myniprojects/viruskiller/databinding/ActivityMainBinding;", "isAdBannerLoaded", "", "loadAdBannerRequests", "", "loadAdInterstitialRequests", "loadFullScreenAd", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private boolean isAdBannerLoaded = false;
    private int loadAdBannerRequests = 0;
    private int loadAdInterstitialRequests = 0;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy animAd$delegate = null;
    private com.myniprojects.viruskiller.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.Nullable
    private static com.google.android.gms.ads.interstitial.InterstitialAd mInterstitialAd;
    @org.jetbrains.annotations.NotNull
    public static final com.myniprojects.viruskiller.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
    }
    
    private final android.view.animation.Animation getAnimAd() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadFullScreenAd() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJB\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/myniprojects/viruskiller/MainActivity$Companion;", "", "()V", "mInterstitialAd", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "showInterstitialAd", "", "activity", "Landroid/app/Activity;", "showSnackbar", "v", "Landroid/view/View;", "content", "", "buttonText", "onClickListener", "Landroid/view/View$OnClickListener;", "isTop", "", "duration", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void showInterstitialAd(@org.jetbrains.annotations.NotNull
        android.app.Activity activity) {
        }
        
        public final void showSnackbar(@org.jetbrains.annotations.NotNull
        android.view.View v, @org.jetbrains.annotations.NotNull
        java.lang.String content, @org.jetbrains.annotations.Nullable
        java.lang.String buttonText, @org.jetbrains.annotations.Nullable
        android.view.View.OnClickListener onClickListener, boolean isTop, int duration) {
        }
    }
}