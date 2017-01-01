package com.orekie.pay.ali;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class Pay {

    public static void pay(String qrUrl, Context context) {
       Uri uri =
                Uri.parse("alipayqr://platformapi/startapp?saId=10000007&clientVersion=3.7.0.0718&qrcode=" + qrUrl);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setComponent(new ComponentName("com.eg.android.AlipayGphone",
                "com.alipay.mobile.quinox.LauncherActivity.alias"));
        intent.setData(uri);
        context.startActivity(intent);
    }
}
