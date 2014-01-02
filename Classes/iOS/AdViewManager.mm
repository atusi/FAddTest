//
//  AdViewManager.mm
//  FAddTest
//
//  Created by Suto Atsushi on 2014/01/02.
//
//

#import "AdViewManager.h"
#import "AppController.h"

void AdViewManager::showAdView(){
    AppController *appController = (AppController *)[UIApplication sharedApplication].delegate;
    [appController showAdView];
}