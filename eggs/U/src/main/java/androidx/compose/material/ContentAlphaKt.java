package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import kotlin.jvm.functions.Function0;

/* compiled from: go/retraceme 56a29ddcb1e7781e96a7f0eae9764fd95150a8d849b28fe37c764d7d19c0db72 */
/* loaded from: classes.dex */
public abstract class ContentAlphaKt {
    private static final DynamicProvidableCompositionLocal LocalContentAlpha = CompositionLocalKt.compositionLocalOf$default(new Function0() { // from class: androidx.compose.material.ContentAlphaKt$LocalContentAlpha$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Float.valueOf(1.0f);
        }
    });

    public static final DynamicProvidableCompositionLocal getLocalContentAlpha() {
        return LocalContentAlpha;
    }
}
