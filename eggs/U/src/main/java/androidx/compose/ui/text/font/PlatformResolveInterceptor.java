package androidx.compose.ui.text.font;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: go/retraceme 56a29ddcb1e7781e96a7f0eae9764fd95150a8d849b28fe37c764d7d19c0db72 */
/* loaded from: classes.dex */
public interface PlatformResolveInterceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: go/retraceme 56a29ddcb1e7781e96a7f0eae9764fd95150a8d849b28fe37c764d7d19c0db72 */
    /* loaded from: classes.dex */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PlatformResolveInterceptor$Companion$Default$1 Default = new PlatformResolveInterceptor$Companion$Default$1();
    }

    default FontWeight interceptFontWeight(FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return fontWeight;
    }
}
