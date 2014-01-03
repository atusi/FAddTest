// GameFeatViewManager.cpp
 
#include "GameFeatViewManager.h"
#include <jni.h>
#include "platform/android/jni/JniHelper.h"
 // パッケージ名と Java クラス名
#define CLASS_NAME "com/usaya/faddtest/FAddTest"
  
void GameFeatViewManager::showGameFeatView()
{
    cocos2d::JniMethodInfo t;
    if (cocos2d::JniHelper::getStaticMethodInfo(t, CLASS_NAME, "showGameFeatView", "()V")) {
        t.env->CallStaticVoidMethod(t.classID, t.methodID);
    }
}
