#import <Cordova/CDV.h>

@interface OpenBrowser : CDVPlugin {
  // Member variables go here.
}

- (void)showExternalBrowser:(CDVInvokedUrlCommand*)command;
@end
