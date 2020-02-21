package com.example.orb_tfeat.orb;

import android.content.Intent;
import android.os.Bundle;

public class ORBMatchingActivity extends AbstractCameraXActivity<ImageClassificationActivity.AnalysisResult> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViewById(R.id.vision_card_qmobilenet_click_area).setOnClickListener(v -> {
            final Intent intent = new Intent(ORBMatchingActivity.this, ImageClassificationActivity.class);
            intent.putExtra(ImageClassificationActivity.INTENT_MODULE_ASSET_NAME,
                    "mobilenet_quantized_scripted_925.pt");
            intent.putExtra(ImageClassificationActivity.INTENT_INFO_VIEW_TYPE,
                    InfoViewFactory.INFO_VIEW_TYPE_IMAGE_CLASSIFICATION_QMOBILENET);
            startActivity(intent);
        });
    }

    @Override
    protected int getListContentLayoutRes() {
        return R.layout.vision_list_content;
    }
}
