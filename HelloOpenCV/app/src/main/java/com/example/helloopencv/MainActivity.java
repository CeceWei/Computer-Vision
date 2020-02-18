package com.example.helloopencv;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;


import org.opencv.android.Utils;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView mImageView = findViewById(R.id.imageView);
        mImageView.setImageBitmap(hivePic());
    }

    private Bitmap hivePic() {
        Log.e(TAG, "hivePic: HHHA:0====>");
        Mat des = new Mat();
        Mat src = new Mat();
        Bitmap srcBit = BitmapFactory.decodeResource(getResources(), R.drawable.test);
        Utils.bitmapToMat(srcBit, src);
        Bitmap grayBit = Bitmap.createBitmap(src.cols(), src.rows(), Bitmap.Config.ARGB_8888);
        Imgproc.cvtColor(src, des, Imgproc.COLOR_BGR2GRAY);
        Utils.matToBitmap(des, grayBit);
        return grayBit;
    }

    static {
        System.loadLibrary("opencv_java3");
    }
}
