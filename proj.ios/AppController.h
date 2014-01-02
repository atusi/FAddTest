#import <UIKit/UIKit.h>
#import "NADView.h" // 追加
#import <GameFeatKit/GFView.h>
#import <GameFeatKit/GFController.h> // GameFeat対応

@class RootViewController;

@interface AppController : NSObject <UIApplicationDelegate, NADViewDelegate, GFViewDelegate> {
    UIWindow *window;
    RootViewController    *viewController;
    NADView *nadView; // 追加
}

@property (nonatomic, retain) UIWindow *window;
@property (strong, nonatomic) RootViewController *viewController; // GameFeat 対応

- (void)showAdView; // 追加

@end

