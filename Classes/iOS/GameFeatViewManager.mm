//
//  GameFeatViewManager.mm
//  FAddTest
//
//  Created by Suto Atsushi on 2014/01/03.
//
//

#import "GameFeatViewManager.h"
#import "AppController.h"
#import "RootViewController.h"

void GameFeatViewManager::showGameFeatView(){
    AppController *appController = (AppController *)[UIApplication sharedApplication].delegate;
    [GFController showGF:(UIViewController *)appController.viewController site_id:@"2485"];
}