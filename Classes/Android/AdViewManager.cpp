// AdViewManager.cpp
 
#include "AdViewManager.h"
#include <jni.h>
#include "platform/android/jni/JniHelper.h"
 // パッケージ名と Java クラス名
#define CLASS_NAME "com/usaya/faddtest/FAddTest"
  
void AdViewManager::showAdView()
{
    cocos2d::JniMethodInfo t;
    if (cocos2d::JniHelper::getStaticMethodInfo(t, CLASS_NAME, "showAdView", "()V")) {
        t.env->CallStaticVoidMethod(t.classID, t.methodID);
        t.env->DeleteLocalRef(t.classID);
    }
}
