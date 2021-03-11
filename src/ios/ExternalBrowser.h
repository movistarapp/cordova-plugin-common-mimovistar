#import <Cordova/CDV.h>

@interface ExternalBrowser : CDVPlugin {
  // Member variables go here.
}

- (void)showExternalBrowser:(CDVInvokedUrlCommand*)command;
@end
