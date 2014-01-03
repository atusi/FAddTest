/****************************************************************************
Copyright (c) 2010-2011 cocos2d-x.org

http://www.cocos2d-x.org

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
****************************************************************************/
package com.usaya.faddtest;

import org.cocos2dx.lib.Cocos2dxActivity;
import org.cocos2dx.lib.Cocos2dxGLSurfaceView;

import android.os.Bundle;

//Nand�L���Ή��ǉ�
import net.nend.android.NendAdView;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

//GameFeat�L���Ή��ǉ�
import jp.basicinc.gamefeat.android.sdk.controller.GameFeatAppController;

public class FAddTest extends Cocos2dxActivity{
	
    private static Activity activity = null; // Nand�L���Ή��ǉ�
    private static NendAdView adView = null; // Nand�L���Ή��ǉ�
	
    GameFeatAppController gfAppController; // GameFeat�L���Ή��ǉ�
    
    protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);	
		activity = this;
		
		// GF�R���g���[��
		gfAppController = new GameFeatAppController();
	}
    
    @Override
    public void onStart() {
    	super.onStart();
    	// �L���ݒ菉����
    	gfAppController.activateGF(activity, false, false, true);
    }

    public Cocos2dxGLSurfaceView onCreateView() {
    	Cocos2dxGLSurfaceView glSurfaceView = new Cocos2dxGLSurfaceView(this);
    	// FAddTest should create stencil buffer
    	glSurfaceView.setEGLConfigChooser(5, 6, 5, 0, 16, 8);
    	
    	return glSurfaceView;
    }

    static {
        System.loadLibrary("cocos2dcpp");
    }     
    
    // Nand�L���Ή��ǉ�
    public static void showAdView()
    {
    	activity.runOnUiThread(new Runnable(){
    		public void run()
    		{
    			if (adView == null) {
        			adView = new NendAdView(activity, 3174, "c5cb8bc474345961c6e7a9778c947957ed8e1e4f");
 
        			RelativeLayout relativeLayout = new RelativeLayout(activity);
        			activity.addContentView(relativeLayout, new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
    				ViewGroup.LayoutParams.WRAP_CONTENT));
        			relativeLayout.addView(adView);
 
        			adView.loadAd();
        		}
    		}
    	});
    }
    
    public static void showGameFeatView(){
    	// GameFeatAppController.show(activity);
    	// �T���v���R�[�h�Ƃ���L�̋L�q���������A�܂�show��static����Ȃ����_�ŃA�z����Ȃ����Ǝv�����������̂��낤���H
    	GameFeatAppController gf = GameFeatAppController.getIncetance(activity);
    	gf.show(activity);
   }
}
